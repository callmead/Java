
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.sql.*;
import java.text.*;


public class frmReport  extends JInternalFrame{
  //====================bariable of Heading==========
   String Head = null;

  JLabel lblHead = new JLabel();
  JPanel pnlMain = new JPanel();
  JButton btnClose = new JButton();

  public final static String[] ColumnHead =
         { "Student ID","Name","Address,","Phone","Date of Birth","Dues"};

  public final static String[][] rowData =
       {
         { "001","Md.Ali",             "Banani",	"9882322",	"10/03/1989",	"5000"},
         { "002","Nasir uddin", 	   "Gulsan",	"9883422",	"12/05/1984",	"35000"},
		 { "003","Md.Kamaluddin",      "Banani",	"9889522",	"13/03/1980",	"15000"},
		 { "004","Md.Golam Mohiuddin", "Comilla",	"9883831",	"15/01/1981",	"5000"},
		 { "005","Md.Jones",		   "New York",	"7872322",	"12/07/1984",	"0"},
		 { "006","Md.Rohim",		   "Dhanmondi",	"9112322",	"11/03/1985",	"45000"},
		 { "007","Md.Ali Hossan",	   "Mohakhali",	"9882334",	"09/05/1980",   "15000"},
		 { "008","Mohammad Ali Khan",  "Fani",		"9882322",	"11/04/1982",	"75000"},
		 { "009","Md.Hassan",          "Dhaka",		"9002322",	"10/03/1978",	"25000"}






       };


  JTable table = new JTable(rowData,ColumnHead);
  JScrollPane sp = new JScrollPane();



  DBUtil db=new DBUtil();
  ResultSet rs;

  public frmReport(String s) {
	  Head = s;
    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }


  public static void main(String[] args) {
    frmReport frmReport = new frmReport("My Data Report");
    frmReport.setVisible(true);
  }


  private void jbInit() throws Exception {

    this.setTitle("Report");
    this.setResizable(false);
    this.getContentPane().setLayout(null);
    this.setLocation(new Point(150,100));
    this.setSize(new Dimension(510, 420));

    this.getContentPane().add(lblHead, null);
    this.getContentPane().add(pnlMain, null);
    this.getContentPane().add(btnClose, null);

    lblHead.setText(Head);
	lblHead.setBounds(new Rectangle(15, 10, 470, 30));
    lblHead.setForeground(Color.white);
    lblHead.setBackground(Color.blue);
    lblHead.setFont(new java.awt.Font("Dialog", 1, 16));
    lblHead.setBorder(BorderFactory.createRaisedBevelBorder());
    lblHead.setOpaque(true);
    lblHead.setHorizontalAlignment(SwingConstants.CENTER);

    //----------------- Properties of Panel ----------------------
    pnlMain.setBounds(new Rectangle(15, 49, 470, 300));
    pnlMain.setBorder(BorderFactory.createLineBorder(Color.black));
    pnlMain.setLayout(new BorderLayout());
    pnlMain.add(sp,BorderLayout.CENTER);


    // =================properties of Scrollpane=========================
    sp.getViewport().add(table);

    // ==================Properties of Jtable===========================
    table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

    //===================properties of close button===========
    btnClose.setMnemonic('O');
    btnClose.setBorder(BorderFactory.createRaisedBevelBorder());
    btnClose.setBounds(new Rectangle(400, 360, 80, 20));
    btnClose.setText("Close");
    btnClose.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        dispose();
      }
    });



  }//=========end of constractor============

  //==========user's define function==========


}