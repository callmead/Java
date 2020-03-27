//Java 25th Feb 2004
//For menu we need a menubar (JMenuBar) which will contain menu items(JMenuItems)
import javax.swing.*;
import java.awt.event.*;

public class frmMain extends JFrame
{//Class

	JMenuBar MB = new JMenuBar();	//Main Menu Bar Object

	JMenu mnuFile = new JMenu(); 	//Menu Bar Menus
	JMenu mnuHelp = new JMenu();	//Menu Bar Menus

	JMenuItem mnuFileStudent = new JMenuItem();	//Menu Bar Menu's Object
	JMenuItem mnuFileTution = new JMenuItem();	//Menu Bar Menu's Object
	//For Seperator in menu we dont need at object.
	JMenuItem mnuFileExit = new JMenuItem();	//Menu Bar Menu's Object

	JMenuItem mnuHelpAbout = new JMenuItem();	//Menu Bar Menu's Object

	public frmMain()
	{//Constructor

		//Frame Properties...
		this.setTitle("JMenu Design");
		this.setDefaultCloseOperation(3);
		this.setBounds(0,0,800,600);
		//-------------------------------

		//Menu Properties...
		mnuFile.setText("File");
		mnuFile.setMnemonic('F');

		mnuHelp.setText("Help");
		mnuHelp.setMnemonic('H');
		//-------------------------------

		//Munu Items Properties...
		mnuFileStudent.setText("Student");
		mnuFileStudent.setMnemonic('S');
		mnuFileStudent.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				TableExample te = new TableExample("Sorted list of all Students from Main"); //String s
				te.setModal(true);//Like VB Model Always on TOP
				te.setVisible(true);
			}
		});

		mnuFileTution.setText("Tution");
		mnuFileTution.setMnemonic('T');
		mnuFileTution.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent f)
			{
				TableExample te = new TableExample("UnSorted list of all Students from Main"); //String s
				te.setModal(true);//Like VB Model Always on TOP
				te.setVisible(true);
			}
		});

		mnuFileExit.setText("Exit");
		mnuFileExit.setMnemonic('X');
		mnuFileExit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent g)
			{
				System.exit(0);
			}
		});

		mnuHelpAbout.setText("About");
		mnuHelpAbout.setMnemonic('A');
		mnuHelpAbout.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent h)
			{
				JOptionPane.showMessageDialog(null,"No Help Provided...");
			}
		});
		//-------------------------------

		//Add Memu Objects...
		MB.add(mnuFile);
		MB.add(mnuHelp);

		mnuFile.add(mnuFileStudent);
		mnuFile.add(mnuFileTution);
		mnuFile.addSeparator();
		mnuFile.add(mnuFileExit);

		mnuHelp.add(mnuHelpAbout);
		//-------------------------------

		//Set Munubar on Frame...
		this.setJMenuBar(MB);
		//-------------------------------

	}//Constructor

	public static void main(String x[])
	{//Main

		frmMain MDI = new frmMain();
		MDI.setVisible(true);

	}//Main

}//Class