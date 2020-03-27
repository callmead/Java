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

  //----------------- ToolBar -----------------------
  JToolBar toolbar = new JToolBar();

      ImageIcon imgNew = new ImageIcon("./Images/new.gif");
      ImageIcon imgOpen = new ImageIcon("./Images/open.gif");
      ImageIcon imgSave = new ImageIcon("./Images/Save.gif");
      ImageIcon imgCut = new ImageIcon("./Images/cut.gif");
      ImageIcon imgPrint = new ImageIcon("./Images/print.gif");
      ImageIcon imgCopy = new ImageIcon("./Images/copy.gif");
      ImageIcon imgPaste = new ImageIcon("./Images/paste.gif");
      ImageIcon imgDel = new ImageIcon("./Images/delete.gif");
      ImageIcon imgInfo = new ImageIcon("./Images/info.gif");
      ImageIcon imgHelp = new ImageIcon("./Images/help.gif");

      JButton btnOpen = new JButton();
      JButton btnSave = new JButton();
      JButton btnCut = new JButton();
      JButton btnCopy = new JButton();
      JButton btnPaste = new JButton();
      JButton btnDel = new JButton();
      JButton btnPrint = new JButton();
      JButton btnInfo = new JButton();
      JButton btnHelp = new JButton();


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
    this.getContentPane().add(toolbar, BorderLayout.NORTH);

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

    //--------------------- DESIGN TOOLBAR -----------------------------
    toolbar.setBackground(SystemColor.inactiveCaption);
	      toolbar.setForeground(Color.white);
	      toolbar.setBorder(BorderFactory.createEtchedBorder());
	      toolbar.setToolTipText("Tools Bar");
	      toolbar.setMargin(new Insets(0, 0, 0, 0));


	      btnOpen.addActionListener(new java.awt.event.ActionListener() {
	        public void actionPerformed(ActionEvent e) {

	        }
	      });

	      btnOpen.setText("");
	      btnOpen.setIcon(imgOpen);
	      btnOpen.setToolTipText("Open");
	      btnOpen.setBorder(BorderFactory.createEtchedBorder());
	      btnSave.addActionListener(new java.awt.event.ActionListener() {
	        public void actionPerformed(ActionEvent e) {

	        }
	      });

	      btnSave.setText("");
	      btnSave.setIcon(imgSave);
	      btnSave.setToolTipText("Save");
	      btnSave.setBorder(BorderFactory.createEtchedBorder());
	      btnCut.addActionListener(new java.awt.event.ActionListener() {
	        public void actionPerformed(ActionEvent e) {

	        }
	      });

	      btnCut.setText("");
	      btnCut.setIcon(imgCut);
	      btnCut.setToolTipText("Cut");
	      btnCut.setBorder(BorderFactory.createEtchedBorder());

	      btnCopy.setBorder(BorderFactory.createEtchedBorder());
	      btnCopy.setToolTipText("Copy");
	      btnCopy.setIcon(imgCopy);
	      btnCopy.setText("");
	      btnCopy.addActionListener(new java.awt.event.ActionListener() {
	        public void actionPerformed(ActionEvent e) {

	        }
	      });

	      btnPaste.setBorder(BorderFactory.createEtchedBorder());
	      btnPaste.setToolTipText("Paste");
	      btnPaste.setIcon(imgPaste);
	      btnPaste.setText("");
	      btnPaste.addActionListener(new java.awt.event.ActionListener() {
	        public void actionPerformed(ActionEvent e) {

	        }
	      });

	      btnDel.setBorder(BorderFactory.createEtchedBorder());
	      btnDel.setToolTipText("Delete");
	      btnDel.setIcon(imgDel);
	      btnDel.setText("");
	      btnDel.addActionListener(new java.awt.event.ActionListener() {
	        public void actionPerformed(ActionEvent e) {

	        }
	      });

	      btnPrint.setBorder(BorderFactory.createEtchedBorder());
	      btnPrint.setToolTipText("Print");
	      btnPrint.setIcon(imgPrint);
	      btnPrint.setText("");
	      btnPrint.addActionListener(new java.awt.event.ActionListener() {
	        public void actionPerformed(ActionEvent e) {

	        }
	      });

	      btnInfo.setBorder(BorderFactory.createEtchedBorder());
	      btnInfo.setToolTipText("About");
	      btnInfo.setIcon(imgInfo);
	      btnInfo.setText("");
	      btnInfo.addActionListener(new java.awt.event.ActionListener() {
	        public void actionPerformed(ActionEvent e) {

	        }
	      });

	      btnHelp.setBorder(BorderFactory.createEtchedBorder());
	      btnHelp.setToolTipText("Help");
	      btnHelp.setIcon(imgHelp);
	      btnHelp.setText("");
	      btnHelp.addActionListener(new java.awt.event.ActionListener() {
	        public void actionPerformed(ActionEvent e) {

	        }
	      });



		        toolbar.add(btnOpen, null);
		        toolbar.add(btnSave, null);
		        toolbar.addSeparator();
		        toolbar.addSeparator();
		        toolbar.add(btnCut, null);
		        toolbar.add(btnCopy, null);
		        toolbar.add(btnPaste, null);
		        toolbar.addSeparator();
		        toolbar.addSeparator();
		        toolbar.add(btnDel, null);
		        toolbar.add(btnPrint, null);
		        toolbar.addSeparator();
		        toolbar.addSeparator();
		        toolbar.add(btnInfo, null);
                toolbar.add(btnHelp, null);

		//------------------------------- END OF DESIGN TOOLBAR -------------------

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
    new Utils().loadBackgroundImage(this,jDesktopPane1,"Images/back.jpg",1024,768);
    this.getContentPane().add(new JStatusBar(),BorderLayout.SOUTH);
    new Utils().setLookup(2,this);//0-default,1,2
    new Utils().setFrameImage(this,"Images/back.jpg",32,32);

  }


}