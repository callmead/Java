
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.sql.*;
import java.text.*;


public class frmTution extends JInternalFrame {
  JLabel lblHead = new JLabel();
  JPanel pnlMain = new JPanel();
  JLabel jLabel1 = new JLabel();
  Border border1;
  JLabel jLabel2 = new JLabel();
  JLabel jLabel3 = new JLabel();
  JLabel jLabel4 = new JLabel();
  JLabel jLabel5 = new JLabel();
  JLabel jLabel6 = new JLabel();
  JTextField txtID = new JTextField();
  JTextField txtName = new JTextField();
  JTextField txtYear = new JTextField();
  JTextField txtMonth = new JTextField();
  JTextField txtPDate = new JTextField();
  JTextField txtFees = new JTextField();
  JPanel pnlButton = new JPanel();
  JButton btnFirst = new JButton();
  JButton btnPrev = new JButton();
  JButton btnNext = new JButton();
  JButton btnLast = new JButton();
  JButton btnSave = new JButton();
  JButton btnCancel = new JButton();
  JButton btnAdd = new JButton();
  JButton btnEdit = new JButton();
  JButton btnDel = new JButton();
  JButton btnClose = new JButton();

  JButton btnSearch = new JButton();

  JComboBox cboID = new JComboBox();
  JComboBox cboYear = new JComboBox();
  JComboBox cboMonth = new JComboBox();
 boolean isAdd = false;
//===========declair object for database============
  DBUtil db=new DBUtil();
  ResultSet rsTution;


  public frmTution() {
// ================ supper class================
    //super("students",true,true,false,false);
    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }

  /*
  public static void main(String[] args) {
    frmTution frmTution = new frmTution();
    frmTution.setVisible(true);
  }
  */

  private void jbInit() throws Exception {



    border1 = BorderFactory.createLineBorder(Color.white,2);
    lblHead.setBackground(Color.black);
    lblHead.setFont(new java.awt.Font("SansSerif", 1, 16));
    lblHead.setForeground(Color.white);
    lblHead.setBorder(BorderFactory.createRaisedBevelBorder());
    lblHead.setOpaque(true);
    lblHead.setHorizontalAlignment(SwingConstants.CENTER);
    lblHead.setText("Tution Information");
    lblHead.setBounds(new Rectangle(15, 16, 350, 24));
    // ================ Properties of Internal Frame================

    this.setResizable(false);
    this.setTitle("Tution");
    this.setClosable(true);
    this.setMaximizable(true);
    this.setIconifiable(true);
    this.getContentPane().setBackground(Color.white);

    this.getContentPane().setLayout(null);
    this.setLocation(new Point(200,100));
    this.setSize(new Dimension(408, 424));
    pnlMain.setBorder(BorderFactory.createLineBorder(Color.black));
    pnlMain.setBounds(new Rectangle(15, 49, 350, 144));
    pnlMain.setLayout(null);

    jLabel1.setBackground(Color.black);
    jLabel1.setForeground(Color.white);
    jLabel1.setBorder(border1);
    jLabel1.setOpaque(true);
    jLabel1.setHorizontalAlignment(SwingConstants.RIGHT);
    jLabel1.setText("ID Number  ");
    jLabel1.setBounds(new Rectangle(12, 12, 128, 18));

    jLabel2.setBounds(new Rectangle(12, 33, 128, 18));
    jLabel2.setText("Name  ");
    jLabel2.setHorizontalAlignment(SwingConstants.RIGHT);
    jLabel2.setOpaque(true);
    jLabel2.setBorder(border1);
    jLabel2.setForeground(Color.white);
    jLabel2.setBackground(Color.black);

    jLabel3.setBounds(new Rectangle(12, 53, 128, 18));
    jLabel3.setText("Year  ");
    jLabel3.setHorizontalAlignment(SwingConstants.RIGHT);
    jLabel3.setOpaque(true);
    jLabel3.setBorder(border1);
    jLabel3.setForeground(Color.white);
    jLabel3.setBackground(Color.black);

    jLabel4.setBounds(new Rectangle(12, 74, 128, 18));
    jLabel4.setText("Month  ");
    jLabel4.setHorizontalAlignment(SwingConstants.RIGHT);
    jLabel4.setOpaque(true);
    jLabel4.setBorder(border1);
    jLabel4.setForeground(Color.white);
    jLabel4.setBackground(Color.black);

    jLabel5.setBounds(new Rectangle(12, 94, 128, 18));
    jLabel5.setText("Date of Payment  ");
    jLabel5.setHorizontalAlignment(SwingConstants.RIGHT);
    jLabel5.setOpaque(true);
    jLabel5.setBorder(border1);
    jLabel5.setForeground(Color.white);
    jLabel5.setBackground(Color.black);

    jLabel6.setBounds(new Rectangle(12, 115, 128, 18));
    jLabel6.setText("Fees  ");
    jLabel6.setHorizontalAlignment(SwingConstants.RIGHT);
    jLabel6.setOpaque(true);
    jLabel6.setBorder(border1);
    jLabel6.setForeground(Color.white);
    jLabel6.setBackground(Color.black);

    txtID.setEditable(false);
    txtID.setText("");
    txtID.setBounds(new Rectangle(148, 16, 176, 16));
    txtID.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e)
			{
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				e.setKeyCode(KeyEvent.VK_TAB);

			}
		});



    txtName.setBounds(new Rectangle(148, 36, 176, 16));
    txtName.setText("");
    txtName.setEditable(false);
    txtName.addKeyListener(new KeyAdapter(){
		public void keyPressed(KeyEvent e)
		{
			if(e.getKeyCode()==KeyEvent.VK_ENTER)
			e.setKeyCode(KeyEvent.VK_TAB);

		}
	});


    txtYear.setBounds(new Rectangle(148, 56, 176, 16));
    txtYear.setText("");
    txtYear.setEditable(false);
    txtYear.addKeyListener(new KeyAdapter(){
		public void keyPressed(KeyEvent e)
		{
			if(e.getKeyCode()==KeyEvent.VK_ENTER)
			e.setKeyCode(KeyEvent.VK_TAB);

		}
	});


    txtMonth.setBounds(new Rectangle(148, 77, 100, 16));
    txtMonth.setText("");
    txtMonth.setEditable(false);
    txtMonth.addKeyListener(new KeyAdapter(){
		public void keyPressed(KeyEvent e)
		{
			if(e.getKeyCode()==KeyEvent.VK_ENTER)
			e.setKeyCode(KeyEvent.VK_TAB);

		}
	});

    txtPDate.setBounds(new Rectangle(148, 97, 176, 16));
    txtPDate.setText("");
    txtPDate.setEditable(false);
    txtPDate.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e)
			{
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				e.setKeyCode(KeyEvent.VK_TAB);

			}
	});

    txtFees.setBounds(new Rectangle(148, 116, 176, 16));
    txtFees.setText("");
    txtFees.setEditable(false);

    //------------------ Properties of ComboBox========================
    cboID.setBounds(148,16,176,16);
    cboID.setVisible(false);
    cboID.addActionListener(new java.awt.event.ActionListener() {
	      public void actionPerformed(ActionEvent e) {
	     	DBUtil dbTemp=new DBUtil();
	     	ResultSet rsName;

	     	try{
                 rsName=dbTemp.stmt.executeQuery("Select * from Student WHERE SID='"+(String)cboID.getSelectedItem()+"'");
                 rsName.next();

				 txtName.setText(rsName.getString(2));

                 rsName=dbTemp.stmt.executeQuery("Select * from Student");
                 rsName.next();


		 	}catch(SQLException sqle){}

	      }
    });



    cboYear.setBounds(148,56,176,16);
    cboYear.setVisible(false);
    cboYear.addActionListener(new java.awt.event.ActionListener() {
	      public void actionPerformed(ActionEvent e) {


	      }
    });


    cboMonth.setBounds(new Rectangle(148, 77, 100, 16));
    cboMonth.setVisible(false);
    cboMonth.addActionListener(new java.awt.event.ActionListener() {
	      public void actionPerformed(ActionEvent e) {

                 SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");

                 if (((String)cboMonth.getSelectedItem()).equals("Select Month"))
				 	  {
				 		   //JOptionPane.showMessageDialog(null,
				 		   //   "Sorry, You must select ID and Year first !!!");
				 		   return;
	  }
                 txtPDate.setText(sdf.format(new java.util.Date()));

	      }
    });




    //-----------------------------------------------------------------
    pnlButton.setBorder(BorderFactory.createLineBorder(Color.black));
    pnlButton.setBounds(new Rectangle(17, 203, 350, 65));
    pnlButton.setLayout(null);


    btnSearch.setVisible(false);
    btnSearch.setBounds(new Rectangle(255, 77, 20, 16));
    //btnSearch.setBorder(BorderFactory.createRaisedBevelBorder());
    btnSearch.setText("...");
    btnSearch.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
	     	loadMonth();
      }
    });


    btnFirst.setBounds(new Rectangle(19, 10, 75, 19));
    btnFirst.setBorder(BorderFactory.createRaisedBevelBorder());
    btnFirst.setMnemonic('F');
    btnFirst.setText("First");
    btnFirst.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        MoveFirst();
      }
    });

    btnPrev.setBorder(BorderFactory.createRaisedBevelBorder());
    btnPrev.setBounds(new Rectangle(96, 10, 75, 19));
    btnPrev.setMnemonic('P');
    btnPrev.setText("Previous");
    btnPrev.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        MovePrevious();
      }
    });

    btnNext.setBorder(BorderFactory.createRaisedBevelBorder());
    btnNext.setBounds(new Rectangle(173, 10, 75, 19));
    btnNext.setMnemonic('N');
    btnNext.setText("Next");
    btnNext.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        MoveNext();
      }
    });

    btnLast.setBorder(BorderFactory.createRaisedBevelBorder());
    btnLast.setBounds(new Rectangle(249, 10, 75, 19));
    btnLast.setMnemonic('L');
    btnLast.setText("Last");
    btnLast.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        MoveLast();
      }
    });

    btnSave.setMnemonic('S');
    btnSave.setBorder(BorderFactory.createRaisedBevelBorder());
    btnSave.setBounds(new Rectangle(19, 34, 75, 19));
    btnSave.setText("Save");
    btnSave.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {

        if (isAdd)
        {
        	boolean isSave = saveData();
        	if (isSave)
        	{
				setFields(false);
				setButtons(true);
				setCombo(false);

				isAdd=false;
			}
		}
		else
		{

			boolean isSave = updateData();
			if (isSave)
			{
				setFields(false);
				setButtons(true);
				setCombo(false);
			}
		}


      }
    });


    btnCancel.setMnemonic('C');
    btnCancel.setBorder(BorderFactory.createRaisedBevelBorder());
    btnCancel.setBounds(new Rectangle(96, 33, 75, 19));
    btnCancel.setText("Cancel");
    btnCancel.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        setFields(false);
        setButtons(true);
        setCombo(false);
        Refresh();
      }
    });

    btnAdd.setMnemonic('A');
    btnAdd.setBorder(BorderFactory.createRaisedBevelBorder());
    btnAdd.setBounds(new Rectangle(19, 34, 75, 19));
    btnAdd.setText("Add");
    btnAdd.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
		loadId();
		loadYear();

		isAdd = true;
		setButtons(false);
        setCombo(true);
        clearFields();
        setFields(true);
        txtID.requestFocus();
      }
    });

    btnEdit.setMnemonic('E');
    btnEdit.setBorder(BorderFactory.createRaisedBevelBorder());
    btnEdit.setBounds(new Rectangle(96, 34, 75, 19));
    btnEdit.setText("Edit");
    btnEdit.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        loadId();
        setButtons(false);
		setFields(true);
		txtID.setEditable(false);
        txtID.requestFocus();
      }
    });

    btnDel.setMnemonic('D');
    btnDel.setBorder(BorderFactory.createRaisedBevelBorder());
    btnDel.setBounds(new Rectangle(173, 34, 75, 19));
    btnDel.setText("Delete");
    btnDel.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {


			delData();
      }
    });

    btnClose.setMnemonic('O');
    btnClose.setBorder(BorderFactory.createRaisedBevelBorder());
    btnClose.setBounds(new Rectangle(250, 33, 75, 19));
    btnClose.setText("Close");
    btnClose.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        hide();
      }
    });


    pnlMain.add(jLabel1, null);
    pnlMain.add(jLabel2, null);
    pnlMain.add(jLabel3, null);
    pnlMain.add(jLabel4, null);
    pnlMain.add(jLabel5, null);
    pnlMain.add(jLabel6, null);

    pnlMain.add(cboID, null);
    pnlMain.add(txtID, null);
    pnlMain.add(txtName, null);
    pnlMain.add(cboYear, null);
    pnlMain.add(txtYear, null);
    pnlMain.add(cboMonth, null);
    pnlMain.add(txtMonth, null);
    pnlMain.add(btnSearch, null);
    pnlMain.add(txtPDate, null);
    pnlMain.add(txtFees, null);


    this.getContentPane().add(pnlButton, null);
    pnlButton.add(btnPrev, null);
    pnlButton.add(btnFirst, null);
    pnlButton.add(btnNext, null);
    pnlButton.add(btnLast, null);
    pnlButton.add(btnAdd, null);
    pnlButton.add(btnSave, null);
    pnlButton.add(btnEdit, null);
    pnlButton.add(btnCancel, null);
    pnlButton.add(btnDel, null);
    pnlButton.add(btnClose, null);
    this.getContentPane().add(lblHead, null);
    this.getContentPane().add(pnlMain, null);

    //---------------------- Connect with Database -------------

    Refresh();
  }//=========end of constractor============

  //==========user's define function==========

  public void Refresh()
  {
	  try{
		  rsTution=db.stmt.executeQuery("Select * from Tution");
		  rsTution.next();
		  Display();
	     }catch(SQLException sqle)
	     {System.out.println("Refresh Error:"+sqle);
	 }
 }//===========end of Refresh method==========

 public void Display()
 {
	 SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");

	 try{
		 txtID.setText(rsTution.getString(1));
		 txtName.setText(rsTution.getString(2));
		 txtYear.setText(rsTution.getString(3));
		 txtMonth.setText(rsTution.getString(4));
		 txtPDate.setText(sdf.format(rsTution.getDate(5)));
		 txtFees.setText(rsTution.getString(6));

	     }catch(SQLException sqle)
	     {System.out.println("Display Error:"+sqle);
	 }
 }//===========end of Display method==========
  public void MoveNext()
  {

	 try{
		 if(!rsTution.next())rsTution.last();
		 Display();


	     }catch(SQLException sqle)
	     {System.out.println("Move Next Error:"+sqle);
	 }
 }//===========end of movnext method========

  public void MovePrevious()
    {

  	 try{
  		 if(!rsTution.previous())rsTution.first();
  		 Display();


  	     }catch(SQLException sqle)
  	     {System.out.println("MovePrevious Error:"+sqle);
  	 }
   }//===========end of MovePrevious method==========

public void MoveFirst()
    {

  	 try{
  		 rsTution.first();
  		 Display();


  	     }catch(SQLException sqle)
  	     {System.out.println("MoveFirst Error:"+sqle);
  	 }
   }//===========end of MoveFirst method==========

 public void MoveLast()
     {

   	 try{
   		 rsTution.last();
   		 Display();


   	     }catch(SQLException sqle)
   	     {System.out.println("MoveLast Error:"+sqle);
   	 }
   }//===========end of MoveLast method===

   //===================Methods of clearFields =======================================
  public void clearFields()
  {
	    txtID.setText("");
	    txtName.setText("");
	    txtYear.setText("");
	    txtMonth.setText("");
	    txtPDate.setText("");
        txtFees.setText("0");
  }
public void setCombo(boolean val)
{

	    txtID.setVisible(!val);
	    cboID.setVisible(val);

	    txtYear.setVisible(!val);
	    cboYear.setVisible(val);

        txtMonth.setVisible(!val);
	    cboMonth.setVisible(val);

	    btnSearch.setVisible(val);

}





  public void setFields(boolean val)
  {

	    txtID.setEditable(val);
		txtName.setEditable(val);
		txtYear.setEditable(val);
		txtMonth.setEditable(val);
		txtPDate.setEditable(val);
        txtFees.setEditable(val);

  }
  public void setButtons(boolean val)
  {
	     btnFirst.setEnabled(val);
	     btnPrev.setEnabled(val);
		 btnNext.setEnabled(val);
		 btnLast.setEnabled(val);

		 btnAdd.setVisible(val);
		 btnEdit.setVisible(val);
		 btnSave.setVisible(!val);
		 btnCancel.setVisible(!val);

		 btnDel.setEnabled(val);
		 btnClose.setEnabled(val);


  }

  public boolean saveData()
  {

     //    cboID.getSelectedItem() ;
	 try{
			String s = "Insert into Tution Values ("+
			           "'"+(String)cboID.getSelectedItem()+"',"+
			           "'"+txtName.getText()+"',"+
			           "'"+(String)cboYear.getSelectedItem()+"',"+
			           "'"+(String)cboMonth.getSelectedItem()+"',"+
			           "'"+txtPDate.getText()+"',"+
			               txtFees.getText()+")";

	        System.out.println(s);

			//=====================data save into table ================
	         db.stmt.executeUpdate(s);

	         //======================= Refresh Data =================

	          Refresh();
	          return true;

	     }catch(SQLException sqle){
			 JOptionPane.showMessageDialog(null,"Sorry, Unable to save data !!!");
			 System.out.println(sqle);
			 return false;

		  }


  }// End of SaveData


   public boolean updateData()
    {

  	 try{
  			String s = "UPDATE Tution SET "+
  			     	   "SID="+"'"+(String)cboID.getSelectedItem()+"',"+
  			           "Name="+"'"+txtName.getText()+"',"+
  			           "SYear="+"'"+txtYear.getText()+"',"+
  			           "SMonth="+"'"+txtMonth.getText()+"',"+
  			           "PDate="+"'"+txtPDate.getText()+"',"+
  			           "Fees="+txtFees.getText()+" "+
  			           "WHERE SID="+"'"+txtID.getText()+"'";

  	        System.out.println(s);

  			//=====================data Edit into table ================


  	         db.stmt.executeUpdate(s);

  	         //======================= Refresh Data =================

  	          Refresh();
  	          return true;



  	     	}catch(SQLException sqle){
				 JOptionPane.showMessageDialog(null,"Sorry, Unable to Update data !!!");
				 System.out.println(sqle);
				 return false;

		      }
	}//End of UPDATE

   public void delData()
    {


  			String s = "Delete From Tution WHERE SID="+"'"+txtID.getText()+"'";
  	        System.out.println(s);
			try {            //=========ConfirmDialog Box================
				     int opt = JOptionPane.showConfirmDialog(null,
				                 "Do you want to detele this record ?",
				                 "Delete Confirmation",0,3);


				     if(opt == JOptionPane.YES_OPTION)
				     {

  						//=====================data Delete into table ================
  	        			 db.stmt.executeUpdate(s);

  	        			 //======================= Refresh Data =================
  	        			  Refresh();
					  }//End of if statement

  	     	}catch(SQLException sqle){
				 JOptionPane.showMessageDialog(null,"Sorry, Unable to Delete data !!!");
				 System.out.println(sqle);

		      }
	}//End of Delete


	public void loadId()
	{
    DBUtil dbTemp=new DBUtil();
	ResultSet rsID;
	  try{
		  rsID=dbTemp.stmt.executeQuery("Select * from Student");

          cboID.removeAllItems();
		  cboID.addItem("Select ID");
		  while(rsID.next())
		  {

			cboID.addItem(rsID.getString(1));
		  }

	     }catch(SQLException sqle)
	     {System.out.println("Load ID Error:"+sqle);}

	}//End of load id

	public void loadYear()
	{
    	  cboYear.removeAllItems();
    	  cboYear.addItem("Select a Year");

		  for(int i=2000;i<=2099;i++)
		  {
			cboYear.addItem(String.valueOf(i));
		  }

	}//End of load YEAR

	public void loadMonth()
	{
    DBUtil dbTemp=new DBUtil();
	ResultSet rsMonth;

	  //-----------Chack id and year==============

	  if (((String)cboID.getSelectedItem()).equals("Select ID") ||
	      ((String)cboYear.getSelectedItem()).equals("Select a Year"))
	  {
		   JOptionPane.showMessageDialog(null,
		      "Sorry, You must select ID and Year first !!!");
		   return;
	  }

	  try{
		  rsMonth=dbTemp.stmt.executeQuery("Select * from Months");

          cboMonth.removeAllItems();
		  cboMonth.addItem("Select Month");
		  while(rsMonth.next())
		  {

			cboMonth.addItem(rsMonth.getString(2));
		  }

	     }catch(SQLException sqle)
	     {System.out.println("Month Add Error:"+sqle);}

	}//End of load month

}