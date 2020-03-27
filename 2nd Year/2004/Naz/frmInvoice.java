//package stocksales;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import java.sql.*;
import java.text.*;

public class frmInvoice extends JFrame {

  JPanel pnlCustomer = new JPanel();
  JPanel jPanel1 = new JPanel();
  //JPanel jPanel2 = new JPanel();

  JLabel lblCustName = new JLabel();
  JLabel lblCustAddr = new JLabel();
  JLabel lblCustPhon = new JLabel();

  JLabel lblInvoice = new JLabel();
  JLabel lblInvNo = new JLabel();
  JLabel lblDate = new JLabel();
  JLabel lblSalDate = new JLabel();
  JLabel lblItemCode = new JLabel();
  JLabel lblPrice = new JLabel();
  JLabel lblQty = new JLabel();
  JLabel lblInvoiceNo = new JLabel();
  JLabel txtInvoiceNo = new JLabel();
  JLabel lblInvoiceDate = new JLabel();
  JLabel lblItemName = new JLabel();
  JLabel lblSalesPrice = new JLabel();
  JLabel lblSalesQty = new JLabel();
  JLabel lblGrandTotal = new JLabel();
  JLabel txtGrandTotal = new JLabel();
  JLabel txtGTotal = new JLabel();
  JLabel lblGTotal = new JLabel();

  JTextField txtName = new JTextField();
  JTextField txtAddr = new JTextField();
  JTextField txtPhone = new JTextField();
  JTextField txtSalesPrice = new JTextField();
  JTextField txtSalesQty = new JTextField();

  JComboBox cboItemCode = new JComboBox();

  JButton btnAdd = new JButton();
  JButton btnRemove = new JButton();
  JButton btnSave = new JButton();
  JButton btnCancel = new JButton();
  JButton btnExit = new JButton();

  JScrollPane jScrollPane1 = new JScrollPane();
  JTable jTable1;

  Vector rows = new Vector();
  Vector cols = new Vector();

  //-------------- Database Objects ------------
  DBUtil DB=new DBUtil();

  ResultSet rsStk;
  ResultSet rsInv;

  //---------------- Date Format ---------------
  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

  public frmInvoice() {
    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    frmInvoice frmInvoice = new frmInvoice();
    frmInvoice.setVisible(true);
  }

  private void jbInit() throws Exception {

    this.setTitle("Invoice");
    this.setForeground(Color.red);
    this.setResizable(false);
    this.setSize(new Dimension(600, 381));
    this.setLocation(100,50);
    this.getContentPane().setLayout(null);
    //-------------- Adding Components to Content Pane ---------
    this.getContentPane().add(jScrollPane1, null);
    this.getContentPane().add(txtGTotal, null);
    this.getContentPane().add(lblGTotal, null);
    this.getContentPane().add(btnSave, null);
    this.getContentPane().add(btnCancel, null);
    this.getContentPane().add(btnExit, null);
    //this.getContentPane().add(jPanel2, null);
    this.getContentPane().add(pnlCustomer, null);
    this.getContentPane().add(jPanel1, null);

    //--------------- Properties of Panel----------------
    //----------- Properties of Customer Panel ---------------------
    pnlCustomer.setBorder(new TitledBorder(BorderFactory.createEtchedBorder(Color.white,
                          new Color(134, 134, 134)),"Customer Information"));
    pnlCustomer.setBounds(new Rectangle(16, 25, 300, 107));
    pnlCustomer.setLayout(null);
    //------------ Adding Compnents to Panel-------------
    pnlCustomer.add(lblCustName, null);
    pnlCustomer.add(lblCustAddr, null);
    pnlCustomer.add(txtName, null);
    pnlCustomer.add(txtAddr, null);
    pnlCustomer.add(txtPhone, null);
    pnlCustomer.add(lblCustPhon, null);

    jPanel1.setBorder(BorderFactory.createEtchedBorder());
    jPanel1.setBounds(new Rectangle(318, 33, 250, 133));
    jPanel1.setLayout(null);
	//-------------- Adding Components -------------------
    jPanel1.add(txtInvoiceNo, null);
    jPanel1.add(lblInvoiceDate, null);
    jPanel1.add(lblSalesPrice, null);
    jPanel1.add(txtSalesPrice, null);
    jPanel1.add(lblItemName, null);
    jPanel1.add(cboItemCode, null);
    jPanel1.add(lblSalesQty, null);
    jPanel1.add(txtSalesQty, null);
    jPanel1.add(lblInvoiceNo, null);
    jPanel1.add(btnRemove, null);
    jPanel1.add(btnAdd, null);

    //jPanel2.setBounds(new Rectangle(43, 134, 189, 10));

    //------------- Properties of Labels -------------------
    lblCustName.setHorizontalAlignment(SwingConstants.RIGHT);
    lblCustName.setText("Customer Name  ");
    lblCustName.setBounds(new Rectangle(15, 25, 110, 18));

    lblCustAddr.setBounds(new Rectangle(15, 47, 110, 18));
    lblCustAddr.setText("Address  ");
    lblCustAddr.setHorizontalAlignment(SwingConstants.RIGHT);

    lblCustPhon.setBounds(new Rectangle(19, 71, 110, 18));
    lblCustPhon.setText("Phone  ");
    lblCustPhon.setHorizontalAlignment(SwingConstants.RIGHT);
	//-------------------------------------------------------

    lblInvoiceNo.setBounds(new Rectangle(9, 12, 76, 18));
    lblInvoiceNo.setText("Invoice No  ");
    lblInvoiceNo.setHorizontalAlignment(SwingConstants.RIGHT);

    //------------- Write Code For It ---------------------
    //lblInvNo.setFont(new java.awt.Font("Dialog", 1, 12));
    //lblInvNo.setBorder(BorderFactory.createLoweredBevelBorder());
    //lblInvNo.setToolTipText("");
    //lblInvNo.setHorizontalAlignment(SwingConstants.CENTER);
    //lblInvNo.setBounds(new Rectangle(409, 34, 43, 18));

    lblDate.setHorizontalAlignment(SwingConstants.RIGHT);
    lblDate.setText("Date  ");
    lblDate.setBounds(new Rectangle(458, 35, 51, 18));
    lblDate.setBorder(BorderFactory.createLineBorder(Color.black));

    //------------- Write Code For It ---------------------
    lblInvoiceDate.setBounds(new Rectangle(136, 11, 102, 18));
    lblInvoiceDate.setText("00/00/0000");
    lblInvoiceDate.setBorder(BorderFactory.createRaisedBevelBorder());
    lblInvoiceDate.setHorizontalAlignment(SwingConstants.CENTER);

    lblItemName.setBounds(new Rectangle(11, 38, 120, 18));
    lblItemName.setBorder(BorderFactory.createLineBorder(Color.black));
    lblItemName.setHorizontalAlignment(SwingConstants.CENTER);
    lblItemName.setText("Item Code");

    lblSalesPrice.setBounds(new Rectangle(136, 37, 102, 18));
    lblSalesPrice.setText("Sales Price  ");
    lblSalesPrice.setBorder(BorderFactory.createLineBorder(Color.black));
    lblSalesPrice.setHorizontalAlignment(SwingConstants.CENTER);

    lblSalesQty.setHorizontalAlignment(SwingConstants.CENTER);
    lblSalesQty.setBorder(BorderFactory.createLineBorder(Color.black));
    lblSalesQty.setText("Sales Quantity");
    lblSalesQty.setBounds(new Rectangle(138, 82, 102, 18));
    //-------------------------------------------------------------------

    lblGTotal.setHorizontalAlignment(SwingConstants.RIGHT);
    lblGTotal.setText("Grand Total  ");
    lblGTotal.setBounds(new Rectangle(393, 305, 76, 18));

    //------------------- Properties of Text Fields ---------------
    //-------------- Properties of TextField -------------
    txtName.setBounds(new Rectangle(140, 29, 143, 15));
    txtAddr.setBounds(new Rectangle(140, 51, 143, 15));
    txtPhone.setBounds(new Rectangle(140, 74, 143, 15));

    txtInvoiceNo.setBounds(new Rectangle(86, 11, 44, 18));
    txtInvoiceNo.setBorder(BorderFactory.createLoweredBevelBorder());
    txtInvoiceNo.setHorizontalAlignment(SwingConstants.RIGHT);
	txtInvoiceNo.setText("000");

    txtSalesPrice.setBounds(new Rectangle(137, 59, 101, 18));
	txtSalesPrice.setText("0");

    txtSalesQty.setBounds(new Rectangle(138, 106, 101, 18));
	txtSalesQty.setText("0");

    txtGTotal.setHorizontalAlignment(SwingConstants.RIGHT);
    txtGTotal.setBorder(BorderFactory.createLoweredBevelBorder());
    txtGTotal.setBounds(new Rectangle(490, 303, 82, 18));
    txtGTotal.setText("0");

	//----------------- Properties of ComboBox ---------------
    cboItemCode.setMaximumRowCount(4);
    cboItemCode.setBounds(new Rectangle(11, 60, 121, 18));

	//----------------- Properties of Buttons---------------
    btnAdd.setBorder(BorderFactory.createRaisedBevelBorder());
    btnAdd.setMnemonic('A');
    btnAdd.setText("Add");
    btnAdd.setBounds(new Rectangle(11, 82, 119, 22));

    btnRemove.setBounds(new Rectangle(11, 106, 119, 22));
    btnRemove.setText("Remove");
    btnRemove.setMnemonic('R');
    btnRemove.setBorder(BorderFactory.createRaisedBevelBorder());


    btnSave.setMnemonic('S');
    btnSave.setText("Save");
    btnSave.setBounds(new Rectangle(17, 301, 88, 24));
    btnSave.addActionListener(new java.awt.event.ActionListener() {
	      public void actionPerformed(ActionEvent e) {
				saveData();

	      }
	    });

    btnCancel.setBounds(new Rectangle(109, 302, 88, 24));
    btnCancel.setText("Cancel");
    btnCancel.setMnemonic('C');

    btnExit.setBounds(new Rectangle(200, 303, 88, 24));
    btnExit.setText("Exit");
    btnExit.setMnemonic('X');

    //--------------- Initialize Vector ---------------
    cols.addElement("Item Code");
    cols.addElement("Item Name");
    cols.addElement("Sales Price");
    cols.addElement("Quantity");
    cols.addElement("TotalPrice");

    System.out.println(rows.size());
    //--------------- Properties of Table -------------
    jTable1 = new JTable(rows,cols);
    jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

    //---------------- Properties of JcrollPane---------------
    jScrollPane1.setBounds(new Rectangle(15, 173, 558, 119));
    jScrollPane1.getViewport().add(jTable1);

  	//--------------- Display Invoice Date -----------------
	lblInvoiceDate.setText(sdf.format(new java.util.Date()));

	//-------------- Get Stock Information ----------------
	getStockInfo();

  }///////////End of Constructor

 //--------- User Defined Methods ----------

  public void Refresh()
  {
        try
		{

		//---------- Execute SQL statement----------
		rsInv=DB.stmt.executeQuery("Select * from Invoice");
        //if (rsInv.next()) display();
		}catch(SQLException sqle)
		   {System.out.println("Refresh, Error");}

  }//End of Refresh Method

  public void clearFields()
  {

	  txtName.setText("");
	  txtAddr.setText("");
	  txtPhone.setText("");
	  txtSalesPrice.setText("");
	  txtSalesQty.setText("");


  }//End of clearFields Method


  public boolean insetData()
  {
        try
		{
            String iStr = "INSERT INTO Invoice Values " +
                          "(" +
                          		"'" + txtInvoiceNo.getText()    + "'," +
                          		"'" + lblInvoiceDate.getText()  + "'," +
                          		"'" + txtName.getText()  + "'," +
                          		"'" + txtAddr.getText() + "', " +
                          		"'" + txtPhone.getText()   + "', " +
                          		//" " + txtTPrice.getText()+ ", " +
                          		" " + txtGTotal.getText() + " " +
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

  public void saveData()
  {
			if (insetData()==false)
			{
				JOptionPane.showMessageDialog(null,
					"Sorry, Unable to Insert New Record !!!\n"+
					"Please try with valid Data ...");

			}
			else clearFields();

  }//End of saveData Method


  public void getStockInfo()
  {
        try
		{
            String iStr = "SELECT * FROM Stock";
            System.out.println(iStr);
			//---------- Execute SQL statement----------
			rsStk = DB.stmt.executeQuery(iStr);

		    while(rsStk.next())
		    {
				cboItemCode.addItem(rsStk.getString(1));
			}

		}catch(SQLException sqle){
			   System.out.println("Get Stock Data Error"+sqle);

		 }


  }//End of insertData Method

}//End of Class