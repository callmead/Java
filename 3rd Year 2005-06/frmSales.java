package lazpharma;

import java.awt.*;
import javax.swing.*;
import com.borland.jbcl.layout.*;
import java.sql.*;
import java.awt.event.*;//new
import java.util.Vector;//tab

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2006
 * Company:
 * @author
 * @version 1.0
 */

public class frmSales extends JFrame {
  JPanel pnlField = new JPanel();
  JPanel pnlButton = new JPanel();
  JLabel lblDiscount = new JLabel();
  JLabel lblTotal = new JLabel();
  JTextField txtTranid = new JTextField();
  JLabel lblProductid = new JLabel();
  JLabel lblSalesid = new JLabel();
  JTextField txtTotalSale = new JTextField();
  JTextField txtDiscount = new JTextField();
  JLabel lblCustomerName = new JLabel();
  JTextField txtProductId = new JTextField();
  JTextField txtTotal = new JTextField();
  JTextField txtQuantity = new JTextField();
  JLabel lblDate = new JLabel();
  JTextField txtCustomerName = new JTextField();
  JLabel lblTotalSale = new JLabel();
  JTextField txtSalesid = new JTextField();
  JLabel lblTranid = new JLabel();
  JLabel lblQuantity = new JLabel();
  JTextField txtDate = new JTextField();
  JLabel lblGrantTotal = new JLabel();
  JTextField txtGrantotal = new JTextField();
  JButton btnEdit = new JButton();
  JButton btnExit = new JButton();
  JButton btnDelete = new JButton();
  JButton btnSave = new JButton();
  JButton btnCancel = new JButton();
  JButton btnAdd = new JButton();
  JButton btnNew = new JButton();
  JLabel lblSaleId = new JLabel();
  JTextField txtSaleId = new JTextField();
  JButton btnFind = new JButton();
  JPanel pnlTab = new JPanel();
  JLabel lblSales = new JLabel();
  JButton btnAd = new JButton();
  JLabel lblSalePrice = new JLabel();
  JTextField txtsalePrice = new JTextField();

  DBConn db =new DBConn();    //New
  ResultSet rsSa;    //New
  Statement stmt;    //New
  String newId;//ahsd
  ResultSet rsT;
  //---------
  JScrollPane jScrollPane1 = new JScrollPane();
  BorderLayout borderLayout1 = new BorderLayout();
  JTable Table;
  Vector rowData = new Vector();
  Vector colData = new Vector();
  JLabel jLabel1 = new JLabel();
  JLabel lblGTotal = new JLabel();
  JLabel jLabel3 = new JLabel();
  JLabel jLabel4 = new JLabel();
  JLabel lblPaid = new JLabel();
  JTextField txtDis = new JTextField();
  JButton btnRItem = new JButton();

  public frmSales() {
    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
  public static void main(String[] args) {
    frmSales frmSales = new frmSales();
  }
  private void jbInit() throws Exception {
    this.getContentPane().setBackground(new Color(150, 150, 100));
    this.setTitle("Sales");
    this.getContentPane().setLayout(null);
    pnlField.setBackground(new Color(150, 200, 150));
    pnlField.setBorder(BorderFactory.createLineBorder(Color.black));
    pnlField.setBounds(new Rectangle(16, 35, 624, 199));
    pnlField.setLayout(null);
    pnlButton.setBackground(new Color(150, 200, 150));
    pnlButton.setBorder(BorderFactory.createLineBorder(Color.black));
    pnlButton.setBounds(new Rectangle(11, 611, 628, 47));
    pnlButton.setLayout(null);
    lblDiscount.setBounds(new Rectangle(8, 130, 111, 23));
    lblDiscount.setText("Discount");
    lblTotal.setBounds(new Rectangle(317, 135, 111, 23));
    lblTotal.setText("Total");
    txtTranid.setBounds(new Rectangle(422, 12, 191, 19));
    lblProductid.setText("Product Id");
    lblProductid.setBounds(new Rectangle(317, 60, 111, 23));
    lblSalesid.setText("Sales Id");
    lblSalesid.setBounds(new Rectangle(8, 0, 111, 23));
    txtTotalSale.setBounds(new Rectangle(113, 100, 191, 19));
    txtDiscount.setBounds(new Rectangle(113, 130, 191, 19));
    lblCustomerName.setText("Customer Name");
    lblCustomerName.setBounds(new Rectangle(8, 64, 111, 23));
    txtProductId.setBounds(new Rectangle(422, 61, 191, 19));
    txtTotal.setBounds(new Rectangle(422, 134, 191, 19));
    txtQuantity.setBounds(new Rectangle(422, 110, 191, 19));
    txtQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyReleased(KeyEvent e) {
        CalculateTotal();
      }
    });
    lblDate.setText("Date");
    lblDate.setBounds(new Rectangle(8, 28, 111, 23));
    txtCustomerName.setBounds(new Rectangle(113, 65, 191, 19));
    lblTotalSale.setText("Total Sale");
    lblTotalSale.setBounds(new Rectangle(8, 97, 111, 23));
    txtSalesid.setBounds(new Rectangle(113, 5, 191, 19));
    lblTranid.setText("Trannsaction Id");
    lblTranid.setBounds(new Rectangle(317, 7, 111, 23));
    lblQuantity.setText("Quantity ");
    lblQuantity.setBounds(new Rectangle(317, 110, 111, 23));
    txtDate.setBounds(new Rectangle(113, 35, 191, 19));
    lblGrantTotal.setText("GrantTotal");
    lblGrantTotal.setBounds(new Rectangle(8, 158, 111, 23));
    txtGrantotal.setBounds(new Rectangle(113, 156, 191, 19));
    btnEdit.setBackground(SystemColor.activeCaption);
    btnEdit.setText("Edit");
    btnEdit.setBounds(new Rectangle(165, 10, 67, 23));
    btnEdit.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        setFields(true);
        txtSalesid.setEnabled(false);
        txtDate.requestFocus();
        setFields2(true);
        txtTranid.setEnabled(false);
        txtSaleId.requestFocus();
      }
    });
    btnExit.setBackground(SystemColor.activeCaption);
    btnExit.setText("Exit");
    btnExit.setBounds(new Rectangle(551, 10, 67, 23));
     btnExit.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        dispose();
      }
    });
    btnDelete.setBounds(new Rectangle(319, 10, 73, 23));
    btnDelete.setBackground(SystemColor.activeCaption);
    btnDelete.setText("Delete");
    btnDelete.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        DeleteData();
        refresh();display();
          DeleteData2();
        refresh2();display2();
      }
    });
    btnSave.setBounds(new Rectangle(242, 10, 67, 23));
    btnSave.setBackground(SystemColor.activeCaption);
    btnSave.setText("Save");
    btnSave.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        EditData();
         EditData2();
      }
    });
    btnCancel.setBounds(new Rectangle(396, 10, 75, 23));
    btnCancel.setBackground(SystemColor.activeCaption);
    btnCancel.setText("Cancel");
    btnCancel.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        setFields(false);
        refresh();display();
        setFields2(false);
        refresh2();display2();
      }
    });
    btnAdd.setBounds(new Rectangle(87, 10, 67, 23));
    btnAdd.setBackground(SystemColor.activeCaption);
    btnAdd.setText("Add");
    btnAdd.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {

        AddData();
      setFields(false);
          AddData2();
        setFields2(false);

        InsertDataFromTable();
      }
    });
    btnNew.setBounds(new Rectangle(10, 10, 67, 23));
    btnNew.setBackground(SystemColor.activeCaption);
    btnNew.setText("New");
    btnNew.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        setFields(true);
        clearFields();
        setFields2(true);
        clearFields2();


        txtSalesid.setEnabled(false);
        txtDate.setEnabled(false);
        txtTranid.setEnabled(false);
        txtSaleId.setEnabled(false);



      }
    });
    lblSaleId.setText("Sales Id");
    lblSaleId.setBounds(new Rectangle(317, 42, 111, 23));
    txtSaleId.setBounds(new Rectangle(422, 39, 191, 19));
    btnFind.setBounds(new Rectangle(474, 10, 67, 23));
    btnFind.setBackground(SystemColor.activeCaption);
    btnFind.setText(" Find");
    btnFind.setText(" Find");
     btnFind.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        FindData();
        FindData2();
      }
    });
    pnlTab.setBackground(new Color(150, 200, 150));
    pnlTab.setBorder(BorderFactory.createLineBorder(Color.black));
    pnlTab.setBounds(new Rectangle(16, 244, 625, 186));
    pnlTab.setLayout(borderLayout1);
    lblSales.setBackground(new Color(150, 150, 100));
    lblSales.setFont(new java.awt.Font("Dialog", 1, 16));
    lblSales.setText("Sales Information");
    lblSales.setBounds(new Rectangle(214, 4, 242, 38));
    btnAd.setText("Add Item");
    btnAd.setBounds(new Rectangle(393, 169, 94, 24));
    btnAd.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
       InsertDataToTable();
      }
    });
    lblSalePrice.setText("Sales Price");
    lblSalePrice.setBounds(new Rectangle(317, 88, 111, 23));
    txtsalePrice.setBounds(new Rectangle(422, 84, 191, 19));
    txtsalePrice.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyReleased(KeyEvent e) {
        CalculateTotal();
      }
    });
    jLabel1.setForeground(Color.white);
    jLabel1.setHorizontalAlignment(SwingConstants.RIGHT);
    jLabel1.setText("Grand Total");
    jLabel1.setBounds(new Rectangle(323, 445, 134, 18));
    lblGTotal.setBounds(new Rectangle(502, 447, 134, 18));
    lblGTotal.setHorizontalAlignment(SwingConstants.RIGHT);
    lblGTotal.setForeground(Color.white);
    lblGTotal.setBorder(BorderFactory.createLineBorder(Color.black));
    jLabel3.setBounds(new Rectangle(327, 478, 134, 18));
    jLabel3.setText("Discount");
    jLabel3.setHorizontalAlignment(SwingConstants.RIGHT);
    jLabel3.setForeground(Color.white);
    jLabel4.setBounds(new Rectangle(333, 509, 134, 18));
    jLabel4.setText("Paid Amount");
    jLabel4.setHorizontalAlignment(SwingConstants.RIGHT);
    jLabel4.setForeground(Color.white);
    lblPaid.setBorder(BorderFactory.createLineBorder(Color.black));
    lblPaid.setForeground(Color.white);
    lblPaid.setHorizontalAlignment(SwingConstants.RIGHT);
    lblPaid.setBounds(new Rectangle(502, 508, 134, 18));
    txtDis.setBounds(new Rectangle(503, 478, 132, 17));
    txtDis.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyReleased(KeyEvent e) {
        txtDis_keyReleased(e);
      }
    });
    btnRItem.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
       RemoveDataFromTable();
      }
    });
    btnRItem.setBounds(new Rectangle(495, 169, 114, 24));
    btnRItem.setText("Remove Item");
    this.getContentPane().add(pnlTab, null);
    pnlTab.add(jScrollPane1, BorderLayout.CENTER);

    colData.addElement("Transaction ID");
    colData.addElement("Item Name");
    colData.addElement("Sales Price");
    colData.addElement("Quantity");
    colData.addElement("Total Price");


    Table = new JTable(rowData,colData);    //ahsd


    jScrollPane1.getViewport().add(Table, null);
    this.getContentPane().add(pnlField, null);
    pnlField.add(lblSalesid, null);
    pnlField.add(txtSalesid, null);
    pnlField.add(lblDate, null);
    pnlField.add(txtDate, null);
    pnlField.add(lblCustomerName, null);
    pnlField.add(txtCustomerName, null);
    pnlField.add(lblTotalSale, null);
    pnlField.add(txtTotalSale, null);
    pnlField.add(lblDiscount, null);
    pnlField.add(txtDiscount, null);
    pnlField.add(lblGrantTotal, null);
    pnlField.add(txtGrantotal, null);
    pnlField.add(txtTranid, null);
    pnlField.add(lblTranid, null);
    pnlField.add(txtSaleId, null);
    pnlField.add(lblSaleId, null);
    pnlField.add(lblProductid, null);
    pnlField.add(txtProductId, null);
    pnlField.add(lblTotal, null);
    pnlField.add(txtTotal, null);
    pnlField.add(lblSalePrice, null);
    pnlField.add(lblQuantity, null);
    pnlField.add(txtQuantity, null);
    pnlField.add(txtsalePrice, null);
    pnlField.add(btnRItem, null);
    pnlField.add(btnAd, null);
    this.getContentPane().add(lblSales, null);
    this.getContentPane().add(pnlButton, null);
    pnlButton.add(btnSave, null);
    pnlButton.add(btnEdit, null);
    pnlButton.add(btnAdd, null);
    pnlButton.add(btnNew, null);
    pnlButton.add(btnExit, null);
    pnlButton.add(btnFind, null);
    pnlButton.add(btnCancel, null);
    pnlButton.add(btnDelete, null);
    this.getContentPane().add(jLabel1, null);
    this.getContentPane().add(lblGTotal, null);
    this.getContentPane().add(jLabel3, null);
    this.getContentPane().add(jLabel4, null);
    this.getContentPane().add(lblPaid, null);
    this.getContentPane().add(txtDis, null);
    this.setSize(new Dimension(670, 705));

    //New
    refresh(); display();    //New
    refresh2(); display2();
    setFields(false);
    setFields2(false);
  }


    public void refresh()    //New
  {
  		try{
 			 rsSa = db.stmt.executeQuery("SELECT * FROM Sales");
  			 rsSa.next();
  		}catch(SQLException sqle){System.out.println(sqle);}

   }//End of refresh Method

       public void refresh2()    //New
  {
  		try{
 			 rsSa = db.stmt.executeQuery("SELECT * FROM Sales_Details");
  			 rsSa.next();
  		}catch(SQLException sqle){System.out.println(sqle);}

   }//End of refresh Method
  public void display()    //New
  {

        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
  		try{

    txtSalesid.setText(rsSa.getString(1));
    txtDate.setText(rsSa.getString(2));
    txtCustomerName.setText(rsSa.getString(3));
    txtTotalSale.setText(rsSa.getString(4));
    txtDiscount.setText(rsSa.getString(5));
   txtGrantotal.setText(rsSa.getString(6));
      		//txtDOJ.setText(new java.text.SimpleDateFormat("yyyy-MM-dd").format(rsSupp.getDate(7)));

  		}catch(SQLException sqle){System.out.println(sqle);}




  }///////End of display Method
  public void display2()    //New
  {

        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
  		try{

    txtTranid.setText(rsSa.getString(1));
    txtSaleId.setText(rsSa.getString(2));
    txtProductId.setText(rsSa.getString(3));
    txtsalePrice.setText(rsSa.getString(4));
    txtQuantity.setText(rsSa.getString(5));
    txtTotal.setText(rsSa.getString(6));
      		//txtDOJ.setText(new java.text.SimpleDateFormat("yyyy-MM-dd").format(rsSupp.getDate(7)));

  		}catch(SQLException sqle){System.out.println(sqle);}

  }

  void InsertDataToTable() {

     Vector temp = new Vector();

     temp.addElement(txtTranid.getText());
     temp.addElement( getProdName(txtProductId.getText()));
     temp.addElement(txtsalePrice.getText());
     temp.addElement(txtQuantity.getText());
     temp.addElement(txtTotal.getText());

     rowData.addElement(temp);

     Table.revalidate();

     double grand=0;


      for(int i=0; i <Table.getRowCount(); i++)
      {
          String gt = (String)Table.getValueAt(i,4);
          System.out.println(gt);
          grand = grand + Double.parseDouble(gt);
      }
      lblGTotal.setText(String.valueOf(grand));
      lblPaid.setText(String.valueOf(grand));

  }
  //

  public String getProdName(String id)
  {
        DBConn dbTemp = new DBConn();
        ResultSet rsTemp;
        try{

            rsTemp = dbTemp.stmt.executeQuery("SELECT * FROM Product Where Product_Id = '" + id + "'");
  	    if (rsTemp.next())
                 return rsTemp.getString(2);
        }catch(SQLException eee){}
        return null;
  }//

  public void RemoveDataFromTable()
       {

            rowData.removeElementAt(Table.getSelectedRow());

            //jTable1.validate();
            Table.repaint();
            Table.revalidate();

            System.out.print("Ok ");

   }//method



  void CalculateTotal() {

      double sp = Double.parseDouble(txtsalePrice.getText());
      int qty = Integer.parseInt(txtQuantity.getText());
      double t = sp*qty;

      txtTotal.setText(String.valueOf(t));

  }

  void txtDis_keyReleased(KeyEvent e) {

      double gt = Double.parseDouble(lblGTotal.getText());
      double dis = Double.parseDouble(txtDis.getText());
      double paid = gt-dis;
      lblPaid.setText(String.valueOf(paid));
  }

  //btn action
   public void AddData()//ahsd
 {//Add new record
    String Query = "INSERT INTO Sales VALUES (" +
                  "'" +     txtSalesid.getText()+ "'," +
                  "'" +     txtDate.getText()+ "'," +
                  "'" +     txtCustomerName.getText()+ "'," +
                  "'" +     txtTotalSale.getText()+ "'," +
                  "'" +     txtDiscount.getText()+ "'," +
                  "'" +     txtGrantotal.getText()+ "');";

    try
  {
      db.stmt.executeUpdate(Query);
      JOptionPane.showMessageDialog(null, "Record added in Table",
                                    "Information", 1);
      refresh();
    }
    catch (SQLException sqle) {
      System.out.println("Exception Occured: " + sqle);
      JOptionPane.showMessageDialog(null,"Exception Occured: "+ sqle,
                                    "Error", JOptionPane.ERROR_MESSAGE);
    }
  }

//Second
public void AddData2()//ahsd
 {//Add new record
    String Query = "INSERT INTO Sales_Details VALUES (" +
                  "'" +     txtTranid.getText()+ "'," +
                  "'" +     txtSaleId.getText()+ "'," +
                  "'" +     txtProductId.getText()+ "'," +
                  "'" +     txtsalePrice.getText()+ "'," +
                  "'" +     txtQuantity.getText()+ "'," +
                  "'" +     txtTotal.getText()+ "');";
    try
  {
      db.stmt.executeUpdate(Query);
      JOptionPane.showMessageDialog(null, "Record added in Table",
                                    "Information", 1);
      refresh2();
    }
    catch (SQLException sqle) {
      System.out.println("Exception Occured: " + sqle);
      JOptionPane.showMessageDialog(null,"Exception Occured: "+ sqle,
                                    "Error", JOptionPane.ERROR_MESSAGE);
    }
  }

  public boolean EditData()//ahsd
  {
    String Query = "UPDATE Sales SET " +
                  "Date='" +     txtDate.getText()+ "'," +
                  "Customer_Name='" +     txtCustomerName.getText()+ "'," +
                  "Total_Sale='" +     txtTotalSale.getText()+ "'," +
                  "Discount='" +     txtDiscount.getText()+ "'," +
                  "GrandTotal='" +     txtGrantotal.getText()+ "' "+
                  "WHERE Sale_id='" + txtSalesid.getText() + "';";

    try
   {
      db.stmt.executeUpdate(Query);
      JOptionPane.showMessageDialog(null, "Record Saved", "Information", 1);
      refresh();
      return true;
    }catch (SQLException sqle)
   {
      System.out.println("Exception Occured: " + sqle);
      JOptionPane.showMessageDialog(null,"Exception Occured: "+ sqle,
                                    "Error", JOptionPane.ERROR_MESSAGE);
      return false;
    }
  }
//second
public boolean EditData2()//ahsd
  {
    String Query = "UPDATE Sales_Details SET " +
                  "Sale_Id='" +     txtSaleId.getText()+ "'," +
                  "Product_Id='" +     txtProductId.getText()+ "'," +
                  "Sales_Price='" +     txtsalePrice.getText()+ "'," +
                  "Quantity='" +     txtQuantity.getText()+ "'," +
                  "Total='" +     txtTotal.getText()+ "' "+
                  "WHERE Tran_Id='" + txtTranid.getText() + "';";

    try
   {
      db.stmt.executeUpdate(Query);
      JOptionPane.showMessageDialog(null, "Record Saved", "Information", 1);
      refresh2();
      return true;
    }catch (SQLException sqle)
   {
      System.out.println("Exception Occured: " + sqle);
      JOptionPane.showMessageDialog(null,"Exception Occured: "+ sqle,
                                    "Error", JOptionPane.ERROR_MESSAGE);
      return false;
    }
  }
  public void DeleteData() {//ahsd
    int yn;
    String Query = "DELETE FROM Sales WHERE Sale_id='" + txtSalesid.getText() + "';";
    yn = JOptionPane.showConfirmDialog(null,
        "Are you sure you want to delete?", "Yes/No",
        JOptionPane.YES_NO_OPTION, 3);

      if (yn == JOptionPane.YES_OPTION)
      {
        try
        {
          db.stmt.executeUpdate(Query);
          JOptionPane.showMessageDialog(null, "Record Deleted",
                                        "Information", 1);
          refresh();
        }
      catch (SQLException sqle) {
      System.out.println("Exception Occured: " + sqle);
      JOptionPane.showMessageDialog(null,"Exception Occured: "+ sqle,
                                    "Error", JOptionPane.ERROR_MESSAGE);
        }
      }
      else {
        refresh();
      }
    }
//second
public void DeleteData2() {//ahsd
    int yn;
    String Query = "DELETE FROM Sales_Details WHERE txtTranid='" + txtTranid.getText() + "';";
    yn = JOptionPane.showConfirmDialog(null,
        "Are you sure you want to delete?", "Yes/No",
        JOptionPane.YES_NO_OPTION, 3);

      if (yn == JOptionPane.YES_OPTION)
      {
        try
        {
          db.stmt.executeUpdate(Query);
          JOptionPane.showMessageDialog(null, "Record Deleted",
                                        "Information", 1);
          refresh2();
        }
      catch (SQLException sqle) {
      System.out.println("Exception Occured: " + sqle);
      JOptionPane.showMessageDialog(null,"Exception Occured: "+ sqle,
                                    "Error", JOptionPane.ERROR_MESSAGE);
        }
      }
      else {
        refresh2();
      }
    }

    public void clearFields()//ahsd
    {
    txtSalesid.setText("");
    txtDate.setText("");
    txtCustomerName.setText("");
    txtTotalSale.setText("");
    txtDiscount.setText("");
    txtGrantotal.setText("");

    //Date d = new Date();
    //SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
    //txtDate.setText(sdf.format(d));

    //Second


    generateID();
    txtSaleId.setText(newId);
    txtSalesid.setText(newId);

    txtDate.requestFocus();
  }


   public void clearFields2()//ahsd
    {
    txtTranid.setText("");
    txtProductId.setText("");
    txtsalePrice.setText("");
    txtQuantity.setText("");
    txtTotal.setText("");

    //Date d = new Date();
    //SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
    //txtDate.setText(sdf.format(d));




    generateID2();

    txtTranid.setText(newId);

    txtSaleId.requestFocus();
  }

  public void generateID()//ahsd
  {
    try{
         rsT = db.stmt.executeQuery("SELECT COUNT(*) FROM Sales");
  	 rsT.next();
  	}catch(SQLException sqle){System.out.println(sqle);}

  	try
        {
           int x = Integer.parseInt(rsT.getString(1));
           x = x+1;
           newId="SAID"+x;
           System.out.println("new Id"+newId);
        }
      catch (SQLException sqle) {
      System.out.println("Exception Occured: " + sqle);
      JOptionPane.showMessageDialog(null,"Exception Occured: "+ sqle,
                                    "Error", JOptionPane.ERROR_MESSAGE);
  }



}

//Second
 public void generateID2()//ahsd
  {
    java.util.Date d = new java.util.Date();
    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yy");
    txtDate.setText(sdf.format(d));

    try{
         rsT = db.stmt.executeQuery("SELECT COUNT(*) FROM Sales_Details");
  	 rsT.next();
  	}catch(SQLException sqle){System.out.println(sqle);}

  	try
        {
           int x = Integer.parseInt(rsT.getString(1));
           x = x+1;
           newId="TRID"+x;
           System.out.println("new Id"+newId);
        }
      catch (SQLException sqle) {
      System.out.println("Exception Occured: " + sqle);
      JOptionPane.showMessageDialog(null,"Exception Occured: "+ sqle,
                                    "Error", JOptionPane.ERROR_MESSAGE);
  }



}
  public void setFields(boolean bVal) //ahsd
  {
    txtSalesid.setEnabled(bVal);
    txtDate.setEnabled(bVal);
    txtCustomerName.setEnabled(bVal);
    txtTotalSale.setEnabled(bVal);
    txtDiscount.setEnabled(bVal);
    txtGrantotal.setEnabled(bVal);
  }

  public void FindData()//ahsd
  {
    String x = JOptionPane.showInputDialog(null,"Enter ID");

	try{
		 rsSa = db.stmt.executeQuery("SELECT * FROM Sales WHERE txtSalesid='"+x+"';");
                 //rsSupp = db.stmt.executeQuery("SELECT * FROM Login WHERE user='"+txtUser.getText()+"' AND password ='"+txtPass.getPassword()+""+"'");
		 if(rsSa.next()) display();
                 else{JOptionPane.showMessageDialog(null,"Record not found!");}
	}catch(SQLException sqle){System.out.println(sqle);}
  }
  //second
  public void setFields2(boolean bVal) //ahsd
  {
    txtTranid.setEnabled(bVal);
    txtSaleId.setEnabled(bVal);
    txtProductId.setEnabled(bVal);
    txtsalePrice.setEnabled(bVal);
    txtQuantity.setEnabled(bVal);
    txtTotal.setEnabled(bVal);

  }

  public void FindData2()//ahsd
  {
    String x = JOptionPane.showInputDialog(null,"Enter ID");

	try{
		 rsSa = db.stmt.executeQuery("SELECT * FROM Sales_Details WHERE txtTranid='"+x+"';");
                 //rsSupp = db.stmt.executeQuery("SELECT * FROM Login WHERE user='"+txtUser.getText()+"' AND password ='"+txtPass.getPassword()+""+"'");
		 if(rsSa.next()) display();
                 else{JOptionPane.showMessageDialog(null,"Record not found!");}
	}catch(SQLException sqle){System.out.println(sqle);}
  }
  void btnRItem_actionPerformed(ActionEvent e) {

  }
  void btnSales_actionPerformed(ActionEvent e) {

  }

void InsertDataFromTable() {

        String QueryPODet="";

     for(int i=0; i<Table.getRowCount(); i++)
     {
        QueryPODet = "INSERT INTO Sales_Details VALUES (" +
        "'" + txtTranid.getText()     + "'," +
        "'" + txtSaleId.getText()     + "'," +
        "'" + txtProductId.getText()     + "'," +
        " " + (String)Table.getValueAt(i,2)   + "," +
        " " + (String)Table.getValueAt(i,3)   + "," +
        " " + (String)Table.getValueAt(i,4)   + ");";

        System.out.println("Data : " + QueryPODet);
        try
        {
            db.stmt.executeUpdate(QueryPODet);
        }catch (SQLException sqle) {
            System.out.println("Exception Occured: " + sqle);

            JOptionPane.showMessageDialog(null,"Exception Occured: "+ sqle,
                                    "Error", JOptionPane.ERROR_MESSAGE); }//

        }//End of Loop
        JOptionPane.showMessageDialog(null, "Record added in Sales Details Table",
                                    "Information", 1);

  }




}
