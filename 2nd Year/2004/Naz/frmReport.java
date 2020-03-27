
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;

public class frmReport extends JFrame {
  char c='"'; // For printing " character
  String q;
  TitledBorder titledBorder1;
  TitledBorder titledBorder2;
  TitledBorder titledBorder3;
  JLabel lblHeader = new JLabel();
  JButton cmdRegister = new JButton();
  JButton cmdStatus = new JButton();

  Dimension  screenSize ;
  // for reports viewing**************************

//    String url="http://localhost/Exims/";
  //  String fYear,fMonth,fDay,tYear,tMonth,tDay;
    //String strTable="Employee";
    //String strProg="Emp.rpt";

    String url="http://localhost/Exims/";
   String fYear,fMonth,fDay,tYear,tMonth,tDay;
   String strTable="";
   String strProg="Report1.rpt";


  public frmReport() {
    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
   frmReport frm1 = new frmReport();
   frm1.setVisible(true);
 }

  private void jbInit() throws Exception {

    cmdRegister.setBounds(new Rectangle(149, 55, 118, 33));
    cmdRegister.setFont(new java.awt.Font("Dialog", 1, 12));
    cmdRegister.setMnemonic('R');
    cmdRegister.setText("Register");
    cmdRegister.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e)
      {
           frmRptViewer rv = new frmRptViewer();

           try{
             rv.rptViewer.setReportName(url + strTable+ strProg);
             rv.rptViewer.init();
             rv.rptViewer.start();
             rv.show();
           }catch(Exception ex){ ex.printStackTrace(); }
      }
    });

    cmdStatus.setBounds(new Rectangle(151, 93, 118, 33));
    cmdStatus.setFont(new java.awt.Font("Dialog", 1, 12));
    cmdStatus.setMnemonic('S');
    cmdStatus.setText("Status");
    cmdStatus.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e)
      {
           frmRptViewer rv = new frmRptViewer();
           try{
                      //String sf="{"+strTable +".JobDate} = date(" +fYear + "," + fMonth + ","+ fDay + ") to date(" + tYear + "," + tMonth + "," +tDay + ")";
                      //System.out.println(sf);
                      //rv.rptViewer.setSelectionFormula (sf);
                      rv.rptViewer.setReportName(url+ strTable+ "Report2.rpt");
                      rv.rptViewer.init();
                      rv.rptViewer.start();
                      rv.show();

          }catch(Exception ex){ ex.printStackTrace(); }
      }
   });


    lblHeader.setFont(new java.awt.Font("Dialog", 1, 18));
    lblHeader.setForeground(SystemColor.activeCaption);
    lblHeader.setBorder(BorderFactory.createLineBorder(Color.black));
    lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
    lblHeader.setText("Import Sea Reports");
    lblHeader.setBounds(new Rectangle(117, 24, 195, 28));


    this.getContentPane().setLayout(null);
    this.setTitle("Import Sea Reports");
    this.setBounds(new Rectangle(100,100,590,480));

    titledBorder1 = new TitledBorder(new EtchedBorder(EtchedBorder.RAISED,Color.white,new Color(134, 134, 134)),"Job Date");
    titledBorder2 = new TitledBorder("");
    titledBorder3 = new TitledBorder(BorderFactory.createEtchedBorder(Color.white,new Color(134, 134, 134)),"Job Date");

    this.getContentPane().add(lblHeader, null);
    this.getContentPane().add(cmdRegister, null);
    this.getContentPane().add(cmdStatus, null);
    screenSize  = Toolkit.getDefaultToolkit().getScreenSize();

  }/////End of Constructor

}
