//Java 29th Feb 2004
//For menu we need a menubar (JMenuBar) which will contain menu items(JMenuItems)
import javax.swing.*;
import java.awt.*;
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

	//Adding Container of Child form 29th Feb 2004
	JDesktopPane jdp = new JDesktopPane();

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
				frmStudent st = new frmStudent();
				st.setVisible(true);
				jdp.add(st);
			}
		});

		mnuFileTution.setText("Tution");
		mnuFileTution.setMnemonic('T');
		mnuFileTution.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent f)
			{
				TableExample te = new TableExample("Students Tutions..."); //String s
				te.setVisible(true);
				jdp.add(te);
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

		//Adding DesktopPane to Parent Form 29th Feb 2004
		setContentPane(jdp); //this.setContentPane(jdp); this is optional
		//-----------------------------------------------

        //Properties of Desktop Pane...
		//jdp.setBackground(Color.black);//This color will be used in every child if you want to give seperate color then you have to set it in child.
        //-----------------------------


	}//Constructor

	public static void main(String x[])
	{//Main

		frmMain MDI = new frmMain();
		MDI.setVisible(true);

	}//Main

}//Class