//package mymenudesign;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MainMenu extends JFrame {
  JMenuBar jMenuBar1 = new JMenuBar();
  JMenu jMenuFile = new JMenu();
  JMenuItem jMenuItemStudent = new JMenuItem();
  JMenuItem jMenuItemTution = new JMenuItem();
  JMenuItem jMenuItemExit = new JMenuItem();
  JMenu jMenuReport = new JMenu();
  JMenu jMenuAllDetails = new JMenu();
  JMenuItem jMenuItemAllStudent = new JMenuItem();
  JMenuItem jMenuItemAllTution = new JMenuItem();
  JMenu jMenuQuery = new JMenu();
  JMenuItem jMenuItemBYAddress = new JMenuItem();
  JMenuItem jMenuItemDues = new JMenuItem();
  JMenuItem jMenuItemDefaulter = new JMenuItem();
  JMenu jMenuHelp = new JMenu();
  JMenuItem jMenuItemAbout = new JMenuItem();
  JToolBar jToolBar1 = new JToolBar();
  JButton jButtonQuery = new JButton();
  JButton jButtonReport = new JButton();
  JButton jButtonTution = new JButton();
  JButton jButtonStudent = new JButton();

  public MainMenu() {
    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
  public static void main(String[] args) {
    MainMenu mainMenu = new MainMenu();
    mainMenu.setVisible(true);
  }
  private void jbInit() throws Exception {

    this.setJMenuBar(jMenuBar1);
    this.setTitle("Student Information System");
    this.setBounds(1,1,800,600);

    jMenuFile.setMnemonic('F');
    jMenuFile.setText("File");

    jMenuItemStudent.setHorizontalAlignment(SwingConstants.LEFT);
    jMenuItemStudent.setIcon(new ImageIcon(new java.net.URL("file:///C:/jdk/demo/jfc/Stylepad/resources/new.gif")));
    jMenuItemStudent.setMnemonic('S');
    jMenuItemStudent.setText("Student ");
    jMenuItemStudent.setAccelerator(javax.swing.KeyStroke.getKeyStroke('\uFFFF'));

    jMenuItemTution.setIcon(new ImageIcon(new java.net.URL("file:///C:/jdk/demo/jfc/Stylepad/resources/copy.gif")));
    jMenuItemTution.setMnemonic('T');
    jMenuItemTution.setText("Tution");

    jMenuItemTution.setAccelerator(javax.swing.KeyStroke.getKeyStroke('\uFFFF'));
    jMenuItemExit.setIcon(new ImageIcon(new java.net.URL("file:///C:/jdk/demo/jfc/Stylepad/resources/cut.gif")));
    jMenuItemExit.setMnemonic('X');
    jMenuItemExit.setText("Exit");
    jMenuItemExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke('\uFFFF'));
    jMenuItemExit.addActionListener(new MainMenu_jMenuItemExit_actionAdapter(this));

    jMenuReport.setMnemonic('R');
    jMenuReport.setText("Report");

    jMenuAllDetails.setMnemonic('L');
    jMenuAllDetails.setText("All Details");

    jMenuItemAllStudent.setMnemonic('S');
    jMenuItemAllStudent.setText("Student");
    jMenuItemAllTution.setMnemonic('T');
    jMenuItemAllTution.setText("Tution");

    jMenuQuery.setMnemonic('Q');
    jMenuQuery.setText("Query");

    jMenuItemBYAddress.setText("By Student Address");
    jMenuItemDues.setText("By Dues Left");
    jMenuItemDefaulter.setText("By Defaulter");
    jMenuHelp.setMnemonic('H');
    jMenuHelp.setText("Help");
    jMenuItemAbout.setMnemonic('A');
    jMenuItemAbout.setText("About");
    jMenuItemAbout.setAccelerator(javax.swing.KeyStroke.getKeyStroke('\uFFFF'));
    jButtonStudent.setToolTipText("Student");
    jButtonStudent.setIcon(new ImageIcon(new java.net.URL("file:///C:/jdk/demo/jfc/Stylepad/resources/new.gif")));
    jButtonStudent.setText("");
    jButtonTution.setToolTipText("Tution");
    jButtonTution.setIcon(new ImageIcon(new java.net.URL("file:///C:/jdk/demo/jfc/Stylepad/resources/copy.gif")));
    jButtonTution.setText("");
    jButtonReport.setToolTipText("Exit");
    jButtonReport.setIcon(new ImageIcon(new java.net.URL("file:///C:/jdk/demo/jfc/Stylepad/resources/fg.gif")));
    jButtonReport.setText("");
    jButtonReport.addActionListener(new MainMenu_jButtonReport_actionAdapter(this));
    jButtonQuery.setToolTipText("Help");
    jButtonQuery.setIcon(new ImageIcon(new java.net.URL("file:///C:/jdk/demo/jfc/Stylepad/resources/left.gif")));
    jButtonQuery.setText("");
    jMenuBar1.add(jMenuFile);
    jMenuBar1.add(jMenuReport);
    jMenuBar1.add(jMenuHelp);
    jMenuFile.add(jMenuItemStudent);
    jMenuFile.add(jMenuItemTution);
    jMenuFile.addSeparator();
    jMenuFile.add(jMenuItemExit);
    jMenuReport.add(jMenuAllDetails);
    jMenuReport.add(jMenuQuery);
    jMenuAllDetails.add(jMenuItemAllStudent);
    jMenuAllDetails.add(jMenuItemAllTution);
    jMenuQuery.add(jMenuItemBYAddress);
    jMenuQuery.add(jMenuItemDues);
    jMenuQuery.add(jMenuItemDefaulter);
    jMenuHelp.add(jMenuItemAbout);
    this.getContentPane().add(jToolBar1, BorderLayout.NORTH);
    jToolBar1.add(jButtonStudent, null);
    jToolBar1.add(jButtonTution, null);
    jToolBar1.add(jButtonReport, null);
    jToolBar1.add(jButtonQuery, null);
  }

  void jMenuItemExit_actionPerformed(ActionEvent e) {
    System.exit(0);
  }

  void jButtonReport_actionPerformed(ActionEvent e) {
    jMenuItemExit_actionPerformed(e);
  }
}

class MainMenu_jMenuItemExit_actionAdapter implements java.awt.event.ActionListener {
  MainMenu adaptee;

  MainMenu_jMenuItemExit_actionAdapter(MainMenu adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jMenuItemExit_actionPerformed(e);
  }
}

class MainMenu_jButtonReport_actionAdapter implements java.awt.event.ActionListener {
  MainMenu adaptee;

  MainMenu_jButtonReport_actionAdapter(MainMenu adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButtonReport_actionPerformed(e);
  }
}