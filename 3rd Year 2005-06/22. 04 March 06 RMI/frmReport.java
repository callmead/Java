//package idb.db;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

import java.sql.*;
import java.util.*;

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2006
 * Company:
 * @author
 * @version 1.0
 */

public class frmReport extends JFrame {
  JPanel pnlMain = new JPanel();
  BorderLayout borderLayout1 = new BorderLayout();
  JLabel lblHead = new JLabel();
  Border border1;
  JLabel lblStatus = new JLabel();
  JScrollPane sp = new JScrollPane();
  JTable tblReport;

  Vector colName =new  Vector();
  Vector rowData = new Vector();

  String paramSQL;
  String paramHead;

  public frmReport(String paramStr1,String paramStr2) {
        paramSQL  = paramStr1;
        paramHead = paramStr2;
    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
  public static void main(String[] args) {


   /*
   String sqlStr = "Select CustID as [Customer ID], "+
                   "CustName as [Customer Name], "+
                   "CustAddress as [Customer Address], "+
                   "CustPhone as [Customer Phone], "+
                   "CustEmail as [Customer Email] "+
                   "from Customer";

  String titleStr = "Customer Information";
  */



  String sqlStr = "Select * from Supply";
  String titleStr = "Supplier Information";


    frmReport frmReport = new frmReport(sqlStr,titleStr);
    frmReport.setVisible(true);
  }
  private void jbInit() throws Exception {
    border1 = BorderFactory.createLineBorder(Color.cyan,2);


    this.setTitle("Report");
    this.setLocation(100,50);
    this.setSize(new Dimension(500, 400));
    this.getContentPane().add(pnlMain, BorderLayout.CENTER);

    pnlMain.setLayout(borderLayout1);
    pnlMain.add(lblHead, BorderLayout.NORTH);
    pnlMain.add(lblStatus, BorderLayout.SOUTH);
    pnlMain.add(sp, BorderLayout.CENTER);

    lblHead.setBackground(new Color(0, 0, 118));
    lblHead.setFont(new java.awt.Font("SansSerif", 1, 20));
    lblHead.setForeground(Color.white);
    lblHead.setBorder(border1);
    lblHead.setOpaque(true);
    lblHead.setHorizontalAlignment(SwingConstants.CENTER);
    lblHead.setText(paramHead);

    lblStatus.setBorder(BorderFactory.createEtchedBorder());
    lblStatus.setText("Status");

    colName = getColHead(paramSQL);
    rowData = getRowData(paramSQL);

    tblReport = new JTable(rowData,colName);
    tblReport.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

    //--------------- Initialize Column Width ---------------------
    for(int i=0; i<getTotalCol(paramSQL); i++)
       tblReport.getColumnModel().getColumn(i).setPreferredWidth( 8 * getColWidth(paramSQL,i+1));


    sp.getViewport().add(tblReport, null);



  }//End if Init

  //===================== U S E R   M E T H O D =====================

  public Vector getColHead(String sqlStr)
  {
      Vector col = new Vector();
      DBConn db = new DBConn();

      ResultSet rsTemp;

      try{

          rsTemp = db.stmt.executeQuery(sqlStr);
          ResultSetMetaData rsmd = rsTemp.getMetaData();
          for(int i=1; i<= rsmd.getColumnCount(); i++)
          {
              col.addElement(rsmd.getColumnName(i));
          }//End of for loop
      }catch(SQLException sqle){
        System.out.println("Column Data Read Error : "+sqle);
         }
      return col;
  }//End of Method getColHed

  public Vector getRowData(String sqlStr)
  {
      Vector row = new Vector();
      DBConn db = new DBConn();

      ResultSet rsTemp;

      try{
          rsTemp = db.stmt.executeQuery(sqlStr);
          ResultSetMetaData rsmd = rsTemp.getMetaData();

          while(rsTemp.next())
          {
              Vector temp = new Vector();

              //-------------- Get One Single Record --------
              for(int i=1; i<= rsmd.getColumnCount(); i++)
              {
                temp.addElement(rsTemp.getString(i));
              }//End of for loop

              row.addElement(temp);
          }//End of while loop
      }catch(SQLException sqle){
        System.out.println("Column Data Read Error : "+sqle);
         }
      return row;
  }//End of Method getColHed

  public int getColWidth(String sqlStr,int colno)
  {

      DBConn db = new DBConn();
      ResultSet rsTemp;
      int w=0;

      try{

          rsTemp = db.stmt.executeQuery(sqlStr);
          ResultSetMetaData rsmd = rsTemp.getMetaData();
          w = rsmd.getColumnDisplaySize(colno);

      }catch(SQLException sqle){
        System.out.println("Column Data Read Error : "+sqle);
         }
      return w;
  }//End of Method getColHed

  public int getTotalCol(String sqlStr)
  {

      DBConn db = new DBConn();
      ResultSet rsTemp;
      int col=0;

      try{

          rsTemp = db.stmt.executeQuery(sqlStr);
          ResultSetMetaData rsmd = rsTemp.getMetaData();
          col = rsmd.getColumnCount();

      }catch(SQLException sqle){
        System.out.println("Column Data Read Error : "+sqle);
         }
      return col;
  }//End of Method getColHed

}