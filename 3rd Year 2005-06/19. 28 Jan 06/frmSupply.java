
import java.awt.*;
import javax.swing.*;

import java.sql.*;
import java.awt.event.*;

import tools.diit.*;

public class frmSupply extends JInternalFrame {
  JPanel pnlMain = new JPanel();
  JPanel pnlFields = new JPanel();
  JPanel pnlButtons = new JPanel();

  JLabel lblIDNum = new JLabel();
  JLabel lblName = new JLabel();
  JLabel lblAddress = new JLabel();
  JLabel lblPhone = new JLabel();
  JLabel lblMobile = new JLabel();
  JLabel lblEmail = new JLabel();
  JLabel lblDOJ = new JLabel();

/*
		public JTextFields(int width, char datatype)
		a	-	Alphabet
		i	-	Integer
		f	-	Float
		e	-   Email
		s	-	AplpaNumeric

*/

  JTextFields txtIDNum = new JTextFields(8,'s');
  JTextFields txtName = new JTextFields(20,'a');
  JTextField txtAddress = new JTextField();
  JTextFields txtPhone = new JTextFields(7,'i');
  JTextField txtMobile = new JTextField();
  JTextFields txtEmail = new JTextFields(10,'e');
  JTextField txtDOJ = new JTextField();

  JButton btnAdd = new JButton();
  JButton btnSave = new JButton();
  JButton btnEdit = new JButton();
  JButton btnCancel = new JButton();
  JButton btnFind = new JButton();
  JButton btnDel = new JButton();

  JLabel lblHead = new JLabel();

  //---------- Database Connection -------
  DBConn db = new DBConn();
  ResultSet rsSupp;

  //---------- Flag -----------------
  boolean isAdd = false;
  String    strID  =null;

   //------------ User Defined Class -----------
   JDate cboDate  = new JDate();

    /*
    //---------------------------------------------------------------------------
    public JDate()
    //---------------------------------------------------------------------------
    public String getDate()
    public String getDate(String strFormat)
    public void setSystemDate()
    public void setEditDate(String date)
    public void setEditDate(String s, String strFormat)
  */

  public frmSupply() {
    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
  public static void main(String[] args) {
    frmSupply frmSupply = new frmSupply();
    frmSupply.setVisible(true);
  }
  private void jbInit() throws Exception {

    this.setTitle("Supplier Information");
    this.setSize(new Dimension(505, 497));
    this.setLocation(200,60);
    this.getContentPane().add(pnlMain, BorderLayout.CENTER);
    this.setClosable(true);

    pnlMain.setLayout(null);
    pnlMain.add(lblHead, null);
    pnlMain.add(pnlButtons, null);
    pnlMain.add(pnlFields, null);

    pnlFields.setBorder(BorderFactory.createEtchedBorder());
    pnlFields.setBounds(new Rectangle(43, 75, 412, 251));
    pnlFields.setLayout(null);

    pnlButtons.setBounds(new Rectangle(53, 341, 394, 44));
    pnlButtons.setLayout(null);

    lblIDNum.setBorder(BorderFactory.createLineBorder(Color.black));
    lblIDNum.setHorizontalAlignment(SwingConstants.RIGHT);
    lblIDNum.setText("ID Number  ");
    lblIDNum.setBounds(new Rectangle(19, 20, 149, 25));

    lblName.setBounds(new Rectangle(20, 51, 149, 25));
    lblName.setText("Name  ");
    lblName.setBorder(BorderFactory.createLineBorder(Color.black));
    lblName.setHorizontalAlignment(SwingConstants.RIGHT);

    lblAddress.setBounds(new Rectangle(20, 83, 149, 25));
    lblAddress.setText("Address  ");
    lblAddress.setBorder(BorderFactory.createLineBorder(Color.black));
    lblAddress.setHorizontalAlignment(SwingConstants.RIGHT);

    lblPhone.setBounds(new Rectangle(20, 114, 149, 25));
    lblPhone.setText("Phone  ");
    lblPhone.setBorder(BorderFactory.createLineBorder(Color.black));
    lblPhone.setHorizontalAlignment(SwingConstants.RIGHT);

    lblMobile.setBounds(new Rectangle(21, 145, 149, 25));
    lblMobile.setText("Mobile  ");
    lblMobile.setBorder(BorderFactory.createLineBorder(Color.black));
    lblMobile.setHorizontalAlignment(SwingConstants.RIGHT);

    lblEmail.setBounds(new Rectangle(21, 175, 149, 25));
    lblEmail.setText("E-Mail  ");
    lblEmail.setBorder(BorderFactory.createLineBorder(Color.black));
    lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);

    lblDOJ.setBounds(new Rectangle(22, 206, 149, 25));
    lblDOJ.setText("Date of Joining  ");
    lblDOJ.setBorder(BorderFactory.createLineBorder(Color.black));
    lblDOJ.setHorizontalAlignment(SwingConstants.RIGHT);

    txtIDNum.setBounds(new Rectangle(176, 21, 213, 23));
    txtName.setBounds(new Rectangle(176, 52, 213, 23));
    txtAddress.setBounds(new Rectangle(177, 82, 213, 23));
    txtPhone.setBounds(new Rectangle(178, 113, 213, 23));
    txtMobile.setBounds(new Rectangle(178, 145, 213, 23));
    txtEmail.setBounds(new Rectangle(178, 177, 213, 23));
    txtDOJ.setBounds(new Rectangle(178, 206, 213, 23));

    btnAdd.setMnemonic('A');
    btnAdd.setText("Add");
    btnAdd.setBounds(new Rectangle(4, 5, 95, 35));
    btnAdd.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
            Add();
      }
    });

    btnSave.setBounds(new Rectangle(4, 5, 95, 35));
    btnSave.setText("Save");
    btnSave.setMnemonic('S');
    btnSave.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
            Save();
      }
    });

    btnEdit.setBounds(new Rectangle(100, 5, 95, 35));
    btnEdit.setText("Edit");
    btnEdit.setMnemonic('E');
    btnEdit.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
            Edit();
      }
    });

    btnCancel.setBounds(new Rectangle(101, 5, 95, 35));
    btnCancel.setText("Cancel");
    btnCancel.setMnemonic('C');
    btnCancel.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
            Cancel();
      }
    });

    btnFind.setBounds(new Rectangle(197, 5, 95, 35));
    btnFind.setText("Find");
    btnFind.setMnemonic('F');
    btnFind.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
            Find();
      }
    });

    btnDel.setBounds(new Rectangle(294, 5, 95, 35));
    btnDel.setText("Delete");
    btnDel.setMnemonic('D');
    btnDel.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
            Delete();
      }
    });

    lblHead.setFont(new java.awt.Font("SansSerif", 1, 16));
    lblHead.setBorder(BorderFactory.createRaisedBevelBorder());
    lblHead.setHorizontalAlignment(SwingConstants.CENTER);
    lblHead.setText("Supplier Information");
    lblHead.setBounds(new Rectangle(44, 31, 412, 33));

    //--------------------- User Defined Control -----------------
    cboDate.setLocation(178, 206);

    pnlFields.add(lblIDNum, null);
    pnlFields.add(lblName, null);
    pnlFields.add(lblAddress, null);
    pnlFields.add(lblPhone, null);
    pnlFields.add(lblMobile, null);
    pnlFields.add(lblEmail, null);
    pnlFields.add(lblDOJ, null);
    pnlFields.add(txtIDNum, null);
    pnlFields.add(txtName, null);
    pnlFields.add(txtAddress, null);
    pnlFields.add(txtPhone, null);
    pnlFields.add(txtMobile, null);
    pnlFields.add(txtEmail, null);
    pnlFields.add(txtDOJ, null);
    pnlFields.add(cboDate,null);

    pnlButtons.add(btnAdd, null);
    pnlButtons.add(btnEdit, null);
    pnlButtons.add(btnFind, null);
    pnlButtons.add(btnDel, null);
    pnlButtons.add(btnSave, null);
    pnlButtons.add(btnCancel, null);

    //----------------- Initialize -----------------------------
    //------------- Set Button State --------------
    setButtons(true);
    //------------ Set Field State ---------------
    setFields(false);

    //-------------------------------------------
      refresh(); display();

  }//End of Constructor

 //-------- U S E R   D E F I N E D   M E T H O D ------------

  public void setButtons(boolean bVal)
  {
      btnAdd.setVisible(bVal);
      btnEdit.setVisible(bVal);
      btnSave.setVisible(!bVal);
      btnCancel.setVisible(!bVal);
      btnDel.setEnabled(bVal);
      btnFind.setEnabled(bVal);
  }//End of setButtons Method

  public void setFields(boolean bVal)
  {
      txtIDNum.setEnabled(bVal);
      txtName.setEnabled(bVal);
      txtAddress.setEnabled(bVal);
      txtPhone.setEnabled(bVal);
      txtMobile.setEnabled(bVal);
      txtEmail.setEnabled(bVal);
      txtDOJ.setEnabled(bVal);

      //----------- User Control -------
      cboDate.setVisible(bVal);
      txtDOJ.setVisible(!bVal);

  }//End of setFields Method

  public void clearFields()
  {
      txtIDNum.setText("");
      txtName.setText("");
      txtAddress.setText("");
      txtPhone.setText("");
      txtMobile.setText("");
      txtEmail.setText("");
      txtDOJ.setText("");

  }//End of setFields Method

  //===============D A T A B A S E  M E T H O D S ========================
  public void refresh()
  {
  		try{
 			 rsSupp = db.stmt.executeQuery("SELECT * FROM Supply");
  			 rsSupp.next();
  		}catch(SQLException sqle){System.out.println(sqle);}

   }//End of refresh Method

  public void display()
  {

        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
  		try{

  			txtIDNum.setText(rsSupp.getString(1));
      		txtName.setText(rsSupp.getString(2));
      		txtAddress.setText(rsSupp.getString(3));
      		txtPhone.setText(rsSupp.getString(4));
      		txtMobile.setText(rsSupp.getString(5));
      		txtEmail.setText(rsSupp.getString(6));
      		txtDOJ.setText(sdf.format(rsSupp.getDate(7)));
      		//txtDOJ.setText(new java.text.SimpleDateFormat("yyyy-MM-dd").format(rsSupp.getDate(7)));

  		}catch(SQLException sqle){System.out.println(sqle);}
  }//End of display Method

  public void Add()
  {
          //------------- Get ID From Text Field ---------
          strID   = txtIDNum.getText();

          //------------- Set Button State --------------
          setButtons(false);
          //------------ Set Field State ---------------
          setFields(true);
          //----------- Clear All Text Fields ----------
          clearFields();

          //---------- Set Flag -----------------
          isAdd = true;

          //------------- User Control -----------
          cboDate.setSystemDate();

  }//End of Add Method

  public void Edit()
  {
          //------------- Set Button State --------------
          setButtons(false);
          //------------ Set Field State ---------------
          setFields(true);

          strID   = txtIDNum.getText();

          //--------------- User Control -------------------------------
          cboDate.setEditDate(txtDOJ.getText(),"yyyy-MM-dd");

  }//End of Edit Method

  public void Save()
  {
          if (isAdd)
          {
              if (!insertData()) {
				  JOptionPane.showMessageDialog(null,"Sorry, Invalid Data !!!\nTry with valid data ...","Insert Error",0);
				  return;
			  }
          }
          else
          {
              if (!updateData()) {
				  JOptionPane.showMessageDialog(null,"Sorry, Invalid Data !!!\nTry with valid data ...","Update Error",0);
				  return;
			  }
          }//End of isAdd if Statement

         //------------- Set Button State --------------
          setButtons(true);
          //------------ Set Field State ---------------
          setFields(false);

          //---------- Set Flag -----------------
          isAdd = false;

  }//End of Save Method

  public void Cancel()
  {
          //------------- Set Button State --------------
          setButtons(true);
          //------------ Set Field State ---------------
          setFields(false);

          //---------- Set Flag -----------------
          isAdd = false;

          //refresh(); display();
          searchData(" Where IDNum = '" + strID + "'");

  }//End of Cancel Method

  public void Find()
  {

        String s = JOptionPane.showInputDialog(null,"Enter Supplier ID Number : ");

        /*********************************************************************
        //public SearchDialog(String tblName, String DatabaseName, String UserName,
                                            String Password,int DriverType)
		//public String getQuery()
		*********************************************************************/
        //SearchDialog sDlg  = new SearchDialog("Supply","./Data/SIS.mdb", "","",1);
        //sDlg.setVisible(true);
        //String s = sDlg.getQuery();


        if (s==null || s.equals("")) return;

        s= " Where IDNum = '" + s + "'";
        searchData(s);

  }//End of Find Method

  public void Delete()
  {
      deleteData();
  }//End of Delete Method

  public boolean insertData()
  {
        String dt = cboDate.getDate("yyyy-MM-dd");
        txtDOJ.setText(dt);

       //-------------------- User Control --------------------
       txtDOJ.setText(cboDate.getDate("yyyy/MM/dd"));


        String strSQL = "INSERT INTO SUPPLY VALUES(" +
                             "'" + txtIDNum.getText() + "'," +
                             "'" + txtName.getText() + "'," +
                             "'" + txtAddress.getText() + "'," +
                             "'" + txtPhone.getText() + "'," +
                             "'" + txtMobile.getText() + "'," +
                             "'" + txtEmail.getText() + "'," +
                             "'" + txtDOJ.getText() + "');" ;

        try{
            db.stmt.executeUpdate(strSQL);
            return true;
          }catch(SQLException sqle){ System.out.println("Insert Error : "+sqle);}

          return false;

  }//End of insertData Method

  public boolean updateData()
  {

	  txtDOJ.setText(cboDate.getDate("yyyy/MM/dd"));

      String strSQL = "UPDATE SUPPLY SET " +
	                               //"IDNum   = " + "'" + txtIDNum.getText() + "'," +
	                               "SName     = " + "'" + txtName.getText() + "'," +
	                               "Address = " + "'" + txtAddress.getText() + "'," +
	                               "Phone     = " + "'" + txtPhone.getText() + "'," +
	                               "Mobile   = " + "'" + txtMobile.getText() + "'," +
	                               "Email     = " + "'" + txtEmail.getText() + "'," +
	                               "DOJ       = " + "'" + txtDOJ.getText() + "'"+
	                               " WHERE IDNum   = " + "'" + txtIDNum.getText() + "'";
			  //System.out.println(strSQL);
	          try{
	              db.stmt.executeUpdate(strSQL);
	              return true;
	            }catch(SQLException sqle){ System.out.println("Insert Error : "+sqle);}

          return false;
  }//End of updateData Method

  //------------------------------- For Find ---------------------------------------------
  public boolean isFound(String strFind)
  {
	  	String q = "SELECT * FROM Supply " + strFind;
	  	 try{
		          rsSupp = db.stmt.executeQuery(q);
		          if (rsSupp.next()) return true;
      }catch(SQLException e){}

	  return false;
  }//End of isFound

  public void searchData(String strFind)
  {
	  	if (!isFound(strFind))
	  	{
			JOptionPane.showMessageDialog(null,"Sorry, Record Not Found !!!\nPlease try again ...","Find Result",0);
		}
		else
		{
	  			String q = "SELECT * FROM Supply " + strFind;
	  			try{
			          rsSupp = db.stmt.executeQuery(q);
			          rsSupp.next(); display();
      			}catch(SQLException e){}
		}//End of if
  }//End of isFound

public void deleteData()
{

	  	         String s = JOptionPane.showInputDialog(null,"Enter Supplier ID Number : ");

	  	         //SearchDialog sDlg  = new SearchDialog("Supply","./Data/SIS.mdb", "","",1);
			     //sDlg.setVisible(true);
			     //String s = sDlg.getQuery();

			     if (s==null || s.equals("")) return;

			     s= " Where IDNum = '" + s + "'";
			     searchData(s);

	  			if (isFound(s))
	  			{

			          int yn = JOptionPane.showConfirmDialog(null,
			                               "Do you want to delete this record?","Delete",
			                               JOptionPane.YES_NO_OPTION);

			          if (yn==JOptionPane.YES_OPTION)
			          {
						      try{
						      db.stmt.executeQuery("DELETE FROM Supply " + s);
						      }catch(SQLException e){}
						      refresh(); display();
					  }

				}//End of if
  }//End of isFound

}


/*

	Aa5
*/
