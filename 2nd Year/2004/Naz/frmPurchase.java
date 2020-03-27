
import java.text.SimpleDateFormat;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class frmPurchase extends JFrame {

  JPanel pnlMain = new JPanel();
  JPanel jPanel1 = new JPanel();
  JPanel pnlButtons = new JPanel();

  JLabel lblID = new JLabel();
  JLabel lblName = new JLabel();
  JLabel lblPrice = new JLabel();
  JLabel lblQty = new JLabel();
  JLabel lblTPrice = new JLabel();
  JLabel lblPDate = new JLabel();

  JLabel lblHead = new JLabel();
  JLabel lblRec = new JLabel();

  JTextField txtID = new JTextField();
  JTextField txtName = new JTextField();
  JTextField txtPrice = new JTextField();
  JTextField txtQty = new JTextField();
  JTextField txtTPrice = new JTextField();
  JTextField txtPDate = new JTextField();

  JButton btnFirst = new JButton();
  JButton btnPrev = new JButton();
  JButton btnNext = new JButton();
  JButton btnLast = new JButton();

  JButton btnAdd = new JButton();
  JButton btnSave = new JButton();
  JButton btnEdit = new JButton();
  JButton btnCancel = new JButton();
  JButton btnDel = new JButton();
  JButton btnRefresh = new JButton();
  JButton btnFind = new JButton();
  JButton btnClose = new JButton();

  //-------------- Database Objects ------------
  DBUtil DB=new DBUtil();
  ResultSet rsPur;

  boolean isAdd=false;

  int purQty=0;

  public frmPurchase() {
    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    frmPurchase frmPurchase = new frmPurchase();
    frmPurchase.setVisible(true);
  }

  private void jbInit() throws Exception {


    this.setTitle("Purchase");
    this.setSize(new Dimension(403, 375));
    this.setLocation(200,50);
    this.setResizable(false);
    this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    this.getContentPane().setLayout(null);

    this.getContentPane().add(lblHead, null);
    this.getContentPane().add(pnlMain, null);
    this.getContentPane().add(pnlButtons, null);
    this.getContentPane().add(jPanel1, null);

	//------------------ Properties of Panels ----------
    pnlMain.setBorder(BorderFactory.createEtchedBorder());
    pnlMain.setBounds(new Rectangle(25, 71, 350, 186));
    pnlMain.setLayout(null);

    //--------- Adding Components ----------
    pnlMain.add(lblID, null);
    pnlMain.add(txtID, null);
    pnlMain.add(txtName, null);
    pnlMain.add(lblPrice, null);
    pnlMain.add(lblPDate, null);
    pnlMain.add(txtPDate, null);
    pnlMain.add(txtPrice, null);
    pnlMain.add(lblName, null);
    pnlMain.add(txtQty, null);
    pnlMain.add(lblQty, null);
    pnlMain.add(lblTPrice, null);
    pnlMain.add(txtTPrice, null);

    jPanel1.setBounds(new Rectangle(16, 310, 370, 32));
    jPanel1.setLayout(null);

	//--------- Adding Components ----------
    jPanel1.add(btnFirst, null);
    jPanel1.add(lblRec, null);
    jPanel1.add(btnLast, null);
    jPanel1.add(btnPrev, null);
    jPanel1.add(btnNext, null);

    pnlButtons.setBounds(new Rectangle(34, 267, 339, 42));
    pnlButtons.setLayout(null);

    //--------- Adding Components ----------
    pnlButtons.add(btnAdd, null);
    pnlButtons.add(btnSave, null);
    pnlButtons.add(btnEdit, null);
    pnlButtons.add(btnCancel, null);
    pnlButtons.add(btnDel, null);
    pnlButtons.add(btnFind, null);
    pnlButtons.add(btnRefresh, null);
    pnlButtons.add(btnClose, null);

    //------------------ Properties of Labels ----------
    lblHead.setBackground(Color.red);
    lblHead.setFont(new java.awt.Font("Dialog", 1, 16));
    lblHead.setForeground(Color.white);
    lblHead.setBorder(BorderFactory.createRaisedBevelBorder());
    lblHead.setOpaque(true);
    lblHead.setHorizontalAlignment(SwingConstants.CENTER);
    lblHead.setText("Purchase Information");
    lblHead.setBounds(new Rectangle(24, 23, 351, 35));

    lblRec.setBackground(Color.white);
    lblRec.setOpaque(true);
    lblRec.setBounds(new Rectangle(61, 5, 251, 23));

    lblID.setHorizontalAlignment(SwingConstants.RIGHT);
    lblID.setText("ID Number  ");
    lblID.setBounds(new Rectangle(23, 26, 114, 18));

    lblName.setBounds(new Rectangle(23, 50, 114, 18));
    lblName.setText("Item Name  ");
    lblName.setHorizontalAlignment(SwingConstants.RIGHT);

    lblPrice.setBounds(new Rectangle(23, 74, 114, 18));
    lblPrice.setText("Unit Price  ");
    lblPrice.setHorizontalAlignment(SwingConstants.RIGHT);

    lblQty.setBounds(new Rectangle(23, 98, 114, 18));
    lblQty.setText("Quantity  ");
    lblQty.setHorizontalAlignment(SwingConstants.RIGHT);

    lblTPrice.setBounds(new Rectangle(23, 122, 114, 18));
    lblTPrice.setText("Total Price  ");
    lblTPrice.setHorizontalAlignment(SwingConstants.RIGHT);

    lblPDate.setBounds(new Rectangle(23, 147, 114, 18));
    lblPDate.setText("Purchase Date  ");
    lblPDate.setHorizontalAlignment(SwingConstants.RIGHT);

	//------------------ Properties of Text Fields ----------
    txtID.setBounds(new Rectangle(150, 30, 117, 18));
    txtID.setDisabledTextColor(Color.blue);
    txtID.addKeyListener(new KeyAdapter(){
			   public void keyReleased(KeyEvent e)
			   {

		           displayStock();

			   }
	});

    txtName.setBounds(new Rectangle(150, 52, 179, 18));
    txtName.setDisabledTextColor(Color.blue);

    txtPrice.setBounds(new Rectangle(150, 76, 61, 18));
    txtPrice.setDisabledTextColor(Color.blue);
    txtPrice.addKeyListener(new KeyAdapter(){
		   public void keyReleased(KeyEvent e)
		   {
	           calculateTotal();


		   }
	});

    txtQty.setBounds(new Rectangle(150, 100, 46, 18));
    txtQty.setDisabledTextColor(Color.blue);
    txtQty.addKeyListener(new KeyAdapter(){
	   public void keyReleased(KeyEvent e)
	   {
           calculateTotal();

	   }
	});

    txtTPrice.setBounds(new Rectangle(150, 124, 80, 18));
    txtTPrice.setDisabledTextColor(Color.blue);
    txtTPrice.setEnabled(false);

    txtPDate.setBounds(new Rectangle(150, 149, 80, 18));
    txtPDate.setDisabledTextColor(Color.blue);
    txtPDate.setEnabled(false);

    //------------------ Properties of Buttons ----------
    btnFirst.setFont(new java.awt.Font("Dialog", 0, 10));
    btnFirst.setBorder(null);
    btnFirst.setIcon(new ImageIcon("first.gif"));
    btnFirst.setBounds(new Rectangle(5, 5, 29, 25));
    btnFirst.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {

				moveFirst();
      }
    });

    btnPrev.setBounds(new Rectangle(31, 5, 29, 25));
    btnPrev.setFont(new java.awt.Font("Dialog", 0, 10));
    btnPrev.setBorder(null);
    btnPrev.setIcon(new ImageIcon("prev.gif"));
    btnPrev.addActionListener(new java.awt.event.ActionListener() {
	      public void actionPerformed(ActionEvent e) {

				movePrev();
	      }
	    });

    btnNext.setBounds(new Rectangle(312, 5, 29, 25));
    btnNext.setFont(new java.awt.Font("Dialog", 0, 10));
    btnNext.setBorder(null);
    btnNext.setIcon(new ImageIcon("next.gif"));
    btnNext.addActionListener(new java.awt.event.ActionListener() {
	      public void actionPerformed(ActionEvent e) {

				moveNext();
	      }
	    });

    btnLast.setBounds(new Rectangle(338, 5, 29, 25));
    btnLast.setFont(new java.awt.Font("Dialog", 0, 10));
    btnLast.setBorder(null);
    btnLast.setIcon(new ImageIcon("last.gif"));
    btnLast.addActionListener(new java.awt.event.ActionListener() {
	      public void actionPerformed(ActionEvent e) {

				moveLast();
	      }
	    });


    btnAdd.setBorder(BorderFactory.createRaisedBevelBorder());
    btnAdd.setMnemonic('A');
    btnAdd.setText("Add");
    btnAdd.setBounds(new Rectangle(4, 8, 61, 28));
    btnAdd.addActionListener(new java.awt.event.ActionListener() {
		      public void actionPerformed(ActionEvent e) {

					//--------- Clear TextFields ---------
					clearFields();
					//-------- Button States -------------
					setButtons(false);
					//-------- Field State-------
					setFields(true);

					//------- Set Flag--------
					isAdd=true;

		      }
		    });


    btnSave.setBounds(new Rectangle(4, 8, 61, 28));
    btnSave.setText("Save");
    btnSave.setMnemonic('S');
    btnSave.setBorder(BorderFactory.createRaisedBevelBorder());
    btnSave.addActionListener(new java.awt.event.ActionListener() {
		      public void actionPerformed(ActionEvent e) {
                    saveData();
		      }
		    });


    btnEdit.setBounds(new Rectangle(69, 8, 61, 28));
    btnEdit.setText("Edit");
    btnEdit.setMnemonic('E');
    btnEdit.setBorder(BorderFactory.createRaisedBevelBorder());
    btnEdit.addActionListener(new java.awt.event.ActionListener() {
		      public void actionPerformed(ActionEvent e) {
					//-------- Button States -------------
					setButtons(false);
					//-------- Field State-------
					setFields(true);
		      }
		    });


    btnCancel.setBounds(new Rectangle(70, 8, 61, 28));
    btnCancel.setText("Cancel");
    btnCancel.setMnemonic('C');
    btnCancel.setBorder(BorderFactory.createRaisedBevelBorder());
    btnCancel.addActionListener(new java.awt.event.ActionListener() {
		      public void actionPerformed(ActionEvent e) {
					//-------- Button States -------------
					setButtons(true);
					//-------- Field State-------
					setFields(false);

					//---- Refresh Data ----------
        			Refresh();

					//------- Set Flag--------
					isAdd=false;

		      }
		    });


    btnDel.setBounds(new Rectangle(136, 8, 61, 28));
    btnDel.setText("Delete");
    btnDel.setMnemonic('D');
    btnDel.setBorder(BorderFactory.createRaisedBevelBorder());
    btnDel.addActionListener(new java.awt.event.ActionListener() {
		      public void actionPerformed(ActionEvent e) {
					deleteData();
		      }
		    });


    btnRefresh.setBounds(new Rectangle(202, 8, 61, 28));
    btnRefresh.setText("Refresh");
    btnRefresh.setMnemonic('R');
    btnRefresh.setBorder(BorderFactory.createRaisedBevelBorder());
    btnRefresh.addActionListener(new java.awt.event.ActionListener() {
		      public void actionPerformed(ActionEvent e) {

		      }
		    });


    btnFind.setBounds(new Rectangle(202, 8, 61, 28));
    btnFind.setText("Find");
    btnFind.setMnemonic('F');
    btnFind.setBorder(BorderFactory.createRaisedBevelBorder());
    btnFind.addActionListener(new java.awt.event.ActionListener() {
		      public void actionPerformed(ActionEvent e) {
				 searchData();
		      }
		    });


    btnClose.setBounds(new Rectangle(270, 8, 61, 28));
    btnClose.setText("Close");
    btnClose.setMnemonic('L');
    btnClose.setBorder(BorderFactory.createRaisedBevelBorder());
    btnClose.addActionListener(new java.awt.event.ActionListener() {
		      public void actionPerformed(ActionEvent e) {

					dispose();
		      }
		    });


  		//------ Execute SQL Statements ----
        Refresh();

        //-------- Field State-------
		setFields(false);


  }//End of Constructor


  //--------- User Defined Methods ----------

  public void display()
  {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        //SimpleDateFormat sdf = new SimpleDateFormat("dd MMM,yyyy");
        /*

        	dd --- day
        	MM --- Month in Digit
        	MMM -- Month in Short
        	MMMM - Month in Long
        	yy --- Year 04
        	yyyy - Year 2004

        */

        try
		{
		txtID.setText(rsPur.getString(1));
		txtName.setText(rsPur.getString(2));
		txtPrice.setText(rsPur.getString(3));
		txtQty.setText(rsPur.getString(4));
		txtTPrice.setText(rsPur.getString(5));
		txtPDate.setText(sdf.format(rsPur.getDate(6)));

		lblRec.setText(" Record No. : "+ rsPur.getRow());

		}catch(SQLException sqle)
		   {System.out.println("Display Error");}

  }//End of Display Method

  public void Refresh()
  {
        try
		{

		//---------- Execute SQL statement----------
		rsPur=DB.stmt.executeQuery("Select * from Purchase");
        if (rsPur.next()) display();
		}catch(SQLException sqle)
		   {System.out.println("Refresh, Error");}

  }//End of Refresh Method

  public void clearFields()
  {
	    SimpleDateFormat sdf
	           = new SimpleDateFormat("dd/MM/yyyy");

  		txtID.setText("");
  		txtName.setText("");
  		txtPrice.setText("");
  		txtQty.setText("");
  		txtTPrice.setText("");
  		txtPDate.setText(sdf.format(new java.util.Date()));

  		lblRec.setText(" New Record ");

  }//End of clearFields Method

  public void setFields(boolean tVal)
  {
    		txtID.setEnabled(tVal);
    		txtName.setEnabled(tVal);
    		txtPrice.setEnabled(tVal);
    		txtQty.setEnabled(tVal);
    		//txtTPrice.setEnabled(tVal);
    		//txtPDate.setEnabled(tVal);

  }//End of setFields Method

  public void setButtons(boolean bVal)
  {
  		  	btnFirst.setEnabled(bVal);
		    btnPrev.setEnabled(bVal);
		    btnNext.setEnabled(bVal);
		    btnLast.setEnabled(bVal);

		    btnAdd.setVisible(bVal);
		    btnSave.setVisible(!bVal);
		    btnEdit.setVisible(bVal);
		    btnCancel.setVisible(!bVal);
		    btnDel.setEnabled(bVal);
		    btnRefresh.setEnabled(bVal);
		    btnFind.setEnabled(bVal);
  			btnClose.setEnabled(bVal);

  }//End of setFields Method


  public void moveNext()
  {
			try{
				if (rsPur.next()) display();
			}catch(SQLException ee){}

  }//End of moveNext Method

  public void movePrev()
  {
  			try{
  				if (rsPur.previous()) display();
  			}catch(SQLException ee){}

  }//End of movePrevious Method

  public void moveFirst()
  {
    			try{
    				rsPur.first(); display();
    			}catch(SQLException ee){}

  }//End of moveFirst Method

  public void moveLast()
  {
    			try{
    				rsPur.last(); display();
    			}catch(SQLException ee){}

  }//End of moveFirst Method

  public boolean insetData()
  {
        try
		{
            String iStr = "INSERT INTO Purchase Values " +
                          "(" +
                          		"'" + txtID.getText()    + "'," +
                          		"'" + txtName.getText()  + "'," +
                          		" " + txtPrice.getText() + ", " +
                          		" " + txtQty.getText()   + ", " +
                          		" " + txtTPrice.getText()+ ", " +
                          		"'" + txtPDate.getText() + "' " +
                          ")";

            System.out.println(iStr);
			//---------- Execute SQL statement----------
			DB.stmt.executeUpdate(iStr);
			Refresh();

		}catch(SQLException sqle){
			   System.out.println("Insert Error"+sqle);
		       return false;
		 }

        return true;
  }//End of insertData Method

  public boolean updateData()
  {
        try
		{
            String iStr = "UPDATE Purchase SET " +
                           //"ItemID    = " + "'" + txtID.getText()    + "'," +
                           "ItemName   = " + "'" + txtName.getText()  + "'," +
                           "UnitPrice  = " + " " + txtPrice.getText() + ", " +
                           "Qty        = " + " " + txtQty.getText()   + ", " +
                           "TotalPrice = " + " " + txtTPrice.getText()+ ", " +
                           "PDate      = " + "'" + txtPDate.getText() + "' " +
                           "Where ItemID = " + "'" + txtID.getText()    + "'";

            System.out.println(iStr);
			//---------- Execute SQL statement----------
			DB.stmt.executeUpdate(iStr);
			Refresh();

		}catch(SQLException sqle){
			   System.out.println("Update Error"+sqle);
		       return false;
		 }

        return true;
  }//End of insertData Method

  public void saveData()
  {
					if (isAdd==true)
                    {
						if (insetData()==false)
						{
							JOptionPane.showMessageDialog(null,
						        "Sorry, Unable to Insert New Record !!!\n"+
						        "Please try with valid Data ...");

						}
						else
						{
							//-------- Stock ---------------------
							boolean found = findStockData(txtID.getText());
							if (found==true)
							{
							   //-------- Update Stock ---------
                               updateStockData();
							}
							else
							{
								//--------Insert Stock --------
								insetStockData();

							}
							//----------------------------------

							//-------- Button States -------------
							setButtons(true);
							//-------- Field State-------
							setFields(false);
						}
					}
					else
					{
						if (updateData()==false)
						{
							JOptionPane.showMessageDialog(null,
						        "Sorry, Unable to Update Record !!!\n"+
						        "Please try with valid Data ...");

						}
						else
						{
							//-------- Button States -------------
							setButtons(true);
							//-------- Field State-------
							setFields(false);
						}
					}

					//------- Set Flag--------
					isAdd=false;
  }//End of saveData Method

  public boolean findData(String strID)
  {
        ResultSet rsTemp;

        try
		{
            String iStr = "SELECT * FROM Purchase" +
                          " WHERE ItemID = " + "'" + strID + "'";

            System.out.println(iStr);
			//---------- Execute SQL statement----------
			rsTemp = DB.stmt.executeQuery(iStr);
			if (rsTemp.next()) return true;

		}catch(SQLException sqle){
			   System.out.println("Find Error"+sqle);
		       return false;
		 }

        return false;

  }//End of findData Method

  public void searchData()
  {

        String srch = JOptionPane.showInputDialog(null,
                        "Enter Purchse ID Number : ");
        boolean found = findData(srch);

        if (found==true)
        {
			try
			  {
			        String iStr = "SELECT * FROM Purchase" +
			                      " WHERE ItemID = " + "'" + srch + "'";

			        //---------- Execute SQL statement----------
					rsPur = DB.stmt.executeQuery(iStr);
					rsPur.next(); display();
			        //------------ Refresh Data ------------------------
			        rsPur=DB.stmt.executeQuery("Select * from Purchase");
					}catch(SQLException sqle){
						   System.out.println("Search Error"+sqle);}
		}
		else
		{
			JOptionPane.showMessageDialog(null,
			          "Sorry,No matching record found !!!\n"+
			          "Please try again ... ");
		}

  }//End of findData Method

  public void deleteData()
  {

        String srch = JOptionPane.showInputDialog(null,
                        "Enter Purchse ID Number : ");
        boolean found = findData(srch);

        if (found==true)
        {
			try
			  {
			        int yn = JOptionPane.showConfirmDialog(null,
			                  "Do you want to delete this record ? ",
			                  "Confirmation ",JOptionPane.YES_NO_OPTION);

			        if (yn==JOptionPane.YES_OPTION)
			        {
			        	String iStr = "DELETE FROM Purchase" +
			        	              " WHERE ItemID = " + "'" + srch + "'";

			        	//---------- Execute SQL statement----------
						DB.stmt.executeUpdate(iStr);

					}//End if

					//------------ Refresh Data ----------------
			        Refresh();

			}catch(SQLException sqle){
					System.out.println("Search Error"+sqle);}
		}
		else
		{
			JOptionPane.showMessageDialog(null,
			          "Sorry,No matching record found !!!\n"+
			          "Please try again ... ");
		}

  }//End of findData Method

  public void calculateTotal()
  {
		double t=0;
		try{
			double p = Double.parseDouble(txtPrice.getText());
			purQty = Integer.parseInt(txtQty.getText());
			t = p*purQty;
	    }catch(Exception e){}

		txtTPrice.setText(String.valueOf(t));
  }//End of Method

  //----------------------- Stock --------------------------------


  public boolean insetStockData()
  {
        try
		{
            String iStr = "INSERT INTO Stock Values " +
                          "(" +
                          		"'" + txtID.getText()    + "'," +
                          		"'" + txtName.getText()  + "'," +
                          		" " + txtPrice.getText() + ", " +
                          		" " + txtQty.getText()   + " " +

                          ")";

            System.out.println(iStr);
			//---------- Execute SQL statement----------
			DB.stmt.executeUpdate(iStr);

		}catch(SQLException sqle){
			   System.out.println("Insert Stock Error"+sqle);
		       return false;
		 }

        return true;
  }//End of insertData Method

  public boolean updateStockData()
  {
	    ResultSet rsStock;

        try
		{
            //------------- Get Previous Quantity ---------------------
            int pQty=0;
            //---------- Execute SQL statement----------
			rsStock=DB.stmt.executeQuery("Select Qty from Stock "+
			     "Where ItemID = "  + "'" + txtID.getText()  + "'");
			if (rsStock.next()) pQty= rsStock.getInt(1);
			//---------------------------------------------------------
			System.out.println("Stock Qty = " + pQty);
			System.out.println("Purchase Qty = " + purQty);
			int Qty = purQty + pQty;
			System.out.println("Update Qty = " + Qty);

			String uQty = String.valueOf(Qty);

            String iStr = "UPDATE Stock SET " +
                           "Qty        = "    + " " + uQty + " " +
                           "Where ItemID = "  + "'" + txtID.getText()  + "'";

            System.out.println(iStr);
			//---------- Execute SQL statement----------
			DB.stmt.executeUpdate(iStr);


		}catch(SQLException sqle){
			   System.out.println("Update Stock Error"+sqle);
		       return false;
		 }

        return true;
  }//End of insertData Method

  public boolean findStockData(String strID)
    {
          ResultSet rsTemp;

          try
  		{
              String iStr = "SELECT * FROM Stock" +
                            " WHERE ItemID = " + "'" + strID + "'";

              System.out.println(iStr);
  			//---------- Execute SQL statement----------
  			rsTemp = DB.stmt.executeQuery(iStr);
  			if (rsTemp.next()) return true;

  		}catch(SQLException sqle){
  			   System.out.println("Find Stock Error"+sqle);
  		       return false;
  		 }

          return false;

  }//End of findData Method

  public void displayStock()
    {
        ResultSet rsTemp;
        try
  		{

              String iStr = "SELECT * FROM Stock" +
                            " WHERE ItemID = " + "'" + txtID.getText() + "'";

              System.out.println(iStr);
  			//---------- Execute SQL statement----------
  			rsTemp = DB.stmt.executeQuery(iStr);
  			if (rsTemp.next())
  			{

  				txtName.setText (rsTemp.getString(2));
  				txtPrice.setText(rsTemp.getString(3));
		    }
  		}catch(SQLException sqle)
  		   {System.out.println("Display Error");}

  }//End of Display Method

}//End of Class