import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class frmMain extends JFrame {
  JMenuBar jMenuBar1 = new JMenuBar();
  JMenu jMenuFile = new JMenu();
  JMenu jMenuReport = new JMenu();

  JMenuItem jMenuItemStudent = new JMenuItem();
  JMenuItem jMenuItemTution = new JMenuItem();
  JMenuItem jMenuItemExit = new JMenuItem();
  JMenuItem jMenuItemStudentReport = new JMenuItem();



  JDesktopPane dp;

  public frmMain() {
    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }


/*  public static void main(String[] args) {
    frmMain frmMain = new frmMain();
    frmMain.setVisible(true);
  }*/



  private void jbInit() throws Exception {

    this.setTitle("Student Management System");
    this.setSize( new Dimension(800,600));
    this.setLocation(0,0);
    //------------------- Properties of Menu -----------
    jMenuFile.setMnemonic('F');
    jMenuFile.setText("File");

    jMenuItemStudent.setMnemonic('S');
    jMenuItemStudent.setText("Student Info");
    jMenuItemStudent.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
			//frmStudent frmStudent = new frmStudent();
    		//frmStudent.setVisible(true);
    		//new frmStudent().setVisible(true);
    		JInternalFrame frmStudent=new frmStudent();
			frmStudent.setVisible(true);
			dp.add(frmStudent);
      }
    });

    jMenuItemTution.setMnemonic('T');
    jMenuItemTution.setText("Tution Info");
    jMenuItemTution.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
    		JInternalFrame frmTution=new frmTution();
			frmTution.setVisible(true);
			dp.add(frmTution);

      }
    });

    jMenuItemExit.setMnemonic('X');
    jMenuItemExit.setText("Exit");
    jMenuItemExit.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.exit(0);
      }
    });

	jMenuItemStudentReport.setMnemonic('R');
    jMenuItemStudentReport.setText("Student Report");
    jMenuItemStudentReport.addActionListener(new java.awt.event.ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		        JInternalFrame rep=new frmReport("My data report");
				rep.setVisible(true);
				dp.add(rep);
		      }
    });

    jMenuBar1.add(jMenuFile);
    jMenuBar1.add(jMenuReport);

    jMenuFile.add(jMenuItemStudent);
    jMenuFile.add(jMenuItemTution);
    jMenuFile.addSeparator();
    jMenuFile.add(jMenuItemExit);

    jMenuReport.setText("Report");
    jMenuReport.add(jMenuItemStudentReport);



    this.setJMenuBar(jMenuBar1);
    //add a JDesktopPane
    dp=new JDesktopPane();
    this.setContentPane(dp);
  }


}