import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import tools.diit.*;
import usertools.diit.*;

public class frmMainMenu extends JFrame {

  JMenuBar jMenuBar1 = new JMenuBar();

  JMenu mnuFile = new JMenu();

  JMenuItem mnuFileSupp = new JMenuItem();
  JMenuItem mnuFilePurc = new JMenuItem();
  JMenuItem mnuFileInvo = new JMenuItem();
  JMenuItem mnuFileSper = new JMenuItem();
  JMenuItem mnuFileExit = new JMenuItem();

  JMenu mnuReport = new JMenu();

  JMenuItem mnuReportSupp = new JMenuItem();
  JMenuItem mnuReportStok = new JMenuItem();
  JMenuItem mnuReportPurc = new JMenuItem();
  JMenuItem mnuReportInvo = new JMenuItem();
  JMenuItem mnuReportSper = new JMenuItem();

  JMenu mnuHelp = new JMenu();

  JMenuItem mnuHelpAbout = new JMenuItem();

  JDesktopPane jDesktopPane1 = new JDesktopPane();

  public frmMainMenu() {
    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
  public static void main(String[] args) {


    frmMainMenu frmMainMenu = new frmMainMenu();
    frmMainMenu.setVisible(true);
  }
  private void jbInit() throws Exception {
    this.setJMenuBar(jMenuBar1);
    this.setTitle("Stock Control MAnagement System");
    this.setBounds(1,1,800,600);
    this.getContentPane().add(jDesktopPane1, BorderLayout.CENTER);

    //Adding Window Listener
    this.addWindowListener(new WindowAdapter() {
    public void windowActivated(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    public void windowDeiconfied(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowOpened(WindowEvent e) {}
    public void windowClosing(WindowEvent e) {
      new Utils().exitMsg();
      }
    });

    mnuFile.setMnemonic('F');
    mnuFile.setText("File");

    mnuFileSupp.setMnemonic('S');
    mnuFileSupp.setText("Supplier Info");
    mnuFileSupp.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
       frmSupply frms =new frmSupply( );
       frms.setVisible(true);
       jDesktopPane1.add(frms);
      }
    });

    mnuFilePurc.setMnemonic('P');
    mnuFilePurc.setText("Purchase Info");
    mnuFilePurc.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {

      }
    });

    mnuFileInvo.setMnemonic('I');
    mnuFileInvo.setText("Invoice Info");
    mnuFileInvo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {

      }
    });

    mnuFileSper.setMnemonic('A');
    mnuFileSper.setText("Sales Person Info");
    mnuFileSper.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {

      }
    });

    mnuFileExit.setMnemonic('X');
    mnuFileExit.setText("Exit");
    mnuFileExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(114, java.awt.event.KeyEvent.CTRL_MASK, false));
    mnuFileExit.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
			new Utils().exitMsg();
      }
    });

    mnuReport.setMnemonic('R');
    mnuReport.setText("Report");
    mnuReportSupp.setMnemonic('S');

    mnuReportSupp.setText("Supplier");
    mnuReportSupp.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {

      }
    });

    mnuReportStok.setMnemonic('K');
    mnuReportStok.setText("Stock");
    mnuReportStok.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {

      }
    });

    mnuReportPurc.setMnemonic('P');
    mnuReportPurc.setText("Purchase");
    mnuReportPurc.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {

      }
    });

    mnuReportInvo.setMnemonic('I');
    mnuReportInvo.setText("Invoice");
    mnuReportInvo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {

      }
    });

    mnuReportSper.setMnemonic('A');
    mnuReportSper.setText("Sales Person");
    mnuReportSper.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {

      }
    });
    mnuHelp.setMnemonic('H');
    mnuHelp.setText("Help");

    mnuHelpAbout.setMnemonic('A');
    mnuHelpAbout.setText("About");
    mnuHelpAbout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(112, 0, false));
    mnuHelpAbout.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {

      }
    });


    jMenuBar1.add(mnuFile);
    jMenuBar1.add(mnuReport);
    jMenuBar1.add(mnuHelp);

    mnuFile.add(mnuFileSupp);
    mnuFile.add(mnuFilePurc);
    mnuFile.add(mnuFileInvo);
    mnuFile.add(mnuFileSper);
    mnuFile.addSeparator();
    mnuFile.add(mnuFileExit);

    mnuReport.add(mnuReportSupp);
    mnuReport.add(mnuReportStok);
    mnuReport.add(mnuReportPurc);
    mnuReport.add(mnuReportInvo);
    mnuReport.add(mnuReportSper);

    mnuHelp.add(mnuHelpAbout);


    //--------------- Initialize From Tools -----------------------

    new Utils().setFullScreen(this);
    new Utils().loadBackgroundImage(this,jDesktopPane1,"Images/back.jpg",600,500);
    this.getContentPane().add(new JStatusBar(),BorderLayout.SOUTH);
    new Utils().setLookup(2,this);//0-default,1,2
    new Utils().setFrameImage(this,"Images/back.jpg",32,32);

  }


}