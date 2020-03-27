//17th Class 10/09/05 Adding System time

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class InputScreen extends JFrame

{
	//-------Global Variables Declaration-------

	JMenuBar mb = new JMenuBar();

	JMenu mnuFile = new JMenu();
	JMenu mnuReport = new JMenu();
	JMenu mnuHelp = new JMenu();

	JMenu mnuQuery = new JMenu();
	JMenu mnuList = new JMenu();

	JMenuItem miByID = new JMenuItem();
	JMenuItem miByName = new JMenuItem();

	JMenuItem miSupplier = new JMenuItem();
	JMenuItem miPurchase = new JMenuItem();
	JMenuItem miInvoice = new JMenuItem();
	JMenuItem miSalesman = new JMenuItem();
	JMenuItem miExit = new JMenuItem();

	JMenuItem miAbout = new JMenuItem();

	ImageIcon imgSupp = new ImageIcon("./Images/supplier.gif");
	ImageIcon imgPurc = new ImageIcon("./Images/purchase.gif");
	ImageIcon imgInvo = new ImageIcon("./Images/invoice.gif");
	ImageIcon imgSale = new ImageIcon("./Images/salesman.gif");
	ImageIcon imgExit = new ImageIcon("./Images/exit.gif");

	//ImageIcon imgQuery = new ImageIcon("./Images/query.gif");
	//ImageIcon imgList = new ImageIcon("./Images/list.gif");

	ImageIcon imgAbout = new ImageIcon("./Images/about.gif");

	JLabel lblStatus = new JLabel();

	JDesktopPane dp = new JDesktopPane();

	//-----------Tool Bar---------------
	JToolBar tb = new JToolBar ();  //type of container, items contained within

	JButton btnSupp = new JButton();
	JButton btnPurc = new JButton();
	JButton btnInvo = new JButton();
	JButton btnSale = new JButton();
	JButton btnExit = new JButton();

	JButton btnAbout = new JButton();


	public InputScreen()
	{
		this.setTitle("Stock Control Management System");
		this.setLocation(0,0);

		//----------Disable default Close Settings on MainWindow-------

		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		//this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//this.setDefaultCloseOperation(EXIT_ON_CLOSE);by default

		int sw = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		int sh = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();

		this.setSize(sw, sh-30);

		//------Adding MenuBar to Frame-------
		this.setJMenuBar(mb);

		//------Adding ToolBar to Frame-------
		this.getContentPane().add(tb, BorderLayout.NORTH);

		//-------Adding Button to Frame-------------

		this.getContentPane().add(lblStatus, BorderLayout.SOUTH);

		//-------Adding DesktopPane to Frame-------------
		this.getContentPane().add(dp, BorderLayout.CENTER);

		//-------Adding Window Listener--------

		this.addWindowListener(new WindowAdapter(){

			public void windowActivated(WindowEvent e){}
			public void windowClosed(WindowEvent e){}
			public void windowDeactivated(WindowEvent e){}
			public void windowDeiconfied(WindowEvent e){}//deiconfied means minimised
			public void windowIconified(WindowEvent e){}
			public void windowOpened(WindowEvent e){}
			public void windowClosing(WindowEvent e)
			{
				exitMsg();
			}
		});//end of WindowListener method


		//-------Adding Components to the MenuBar---------
		mb.add(mnuFile);
		mb.add(mnuReport);
		mb.add(mnuHelp);

		//-------Adding Components to the Menu---------
		mnuFile.add(miSupplier);
		mnuFile.add(miPurchase);
		mnuFile.add(miInvoice);
		mnuFile.add(miSalesman);

		mnuFile.addSeparator();
		mnuFile.add(miExit);

		mnuReport.add(mnuQuery);
		mnuReport.add(mnuList);

		mnuQuery.add(miByID);
		mnuQuery.add(miByName);

		mnuHelp.add(miAbout);

		//-------Properties of Menu---------
		mnuFile.setText("File");
		mnuFile.setMnemonic('F');

		mnuReport.setText("Report");
		mnuReport.setMnemonic('R');

		mnuHelp.setText("Help");
		mnuHelp.setMnemonic('H');

		mnuQuery.setText("Query");
		mnuQuery.setMnemonic('Q');

		//mnuQuery.setIcon(imgQuery);

		mnuQuery.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e)
			{

			}
		});

		mnuList.setText("List");
		mnuList.setMnemonic('L');

		//mnuList.setIcon(imgList);

		mnuList.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e)
			{

			}
		});

		//-------Properties of Menu Items---------
		miSupplier.setText("Supplier");
		miSupplier.setMnemonic('S');

		miSupplier.setIcon(imgSupp);

		miSupplier.addActionListener(new ActionListener(){

			public void actionPerformed (ActionEvent e)
			{
				showSupplier();
			}
		});

		miPurchase.setText("Purchase");
		miPurchase.setMnemonic('P');

		miPurchase.setIcon(imgPurc);

		miPurchase.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e)
			{

			}
		});


		miInvoice.setText("Invoice");
		miInvoice.setMnemonic('I');

		miInvoice.setIcon(imgInvo);

		miInvoice.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e)
			{

			}
		});

		miSalesman.setText("Sales Person");
		miSalesman.setMnemonic('l');

		miSalesman.setIcon(imgSale);

		miSalesman.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e)
			{

			}
		});

		miExit.setText("Exit");
		miExit.setMnemonic('E');

		miExit.setIcon(imgExit);

		miExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F10,0,true));

		miExit.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e)
			{
				exitMsg();
			}
		});

		miByID.setText("Query By ID");
		miByID.setMnemonic('D');

		miByID.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e)
			{

			}
		});

		miByName.setText("Query By Name");
		miByName.setMnemonic('N');

		miByName.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e)
			{

			}
		});

		miAbout.setText("About");
		miAbout.setMnemonic('A');

		miAbout.setIcon(imgAbout);

		miAbout.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, KeyEvent.CTRL_MASK, true));//1st para which key, 2nd any key combination, 3rd direct

		miAbout.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e)
			{
				showHelp();

			}//End of actionPerformed Method
		});//End of addActionListener Method

		//---------Properties of ToolBar------------

		tb.setFloatable(false);//toolbar stationary
		//tb.setOrientation(JToolBar.VERTICAL);

		//---------Adding Components to ToolBar-----
		tb.add(btnSupp);
		tb.add(btnPurc);
		tb.add(btnInvo);
		tb.add(btnSale);
		tb.add(btnExit);

		tb.addSeparator();
		tb.add(btnAbout);


		//---------Properties of ToolBar's Button-----
		btnSupp.setIcon(imgSupp);
		btnSupp.setToolTipText("Supplier Information");

		btnSupp.addActionListener(new ActionListener(){

		public void actionPerformed (ActionEvent e)
			{

			}

		});


		btnPurc.setIcon(imgPurc);
		btnPurc.setToolTipText("Purchase Information");

		btnPurc.addActionListener(new ActionListener(){

		public void actionPerformed (ActionEvent e)
			{

			}

		});


		btnInvo.setIcon(imgInvo);
		btnInvo.setToolTipText("Invoice Details");

		btnInvo.addActionListener(new ActionListener(){

		public void actionPerformed (ActionEvent e)
			{

			}

		});


		btnSale.setIcon(imgSale);
		btnSale.setToolTipText("Salesman Info");

		btnSale.addActionListener(new ActionListener(){

		public void actionPerformed (ActionEvent e)
			{

			}

		});


		btnExit.setIcon(imgExit);
		btnExit.setToolTipText("Exit Programe");

		btnExit.addActionListener(new ActionListener(){

		public void actionPerformed (ActionEvent e)
			{
				exitMsg();
				//System.exit(0);
			}

		});


		btnAbout.setIcon(imgAbout);
		btnAbout.setToolTipText("About Info");

		btnAbout.addActionListener(new ActionListener(){

		public void actionPerformed (ActionEvent e)
			{

				showHelp();

			}

		});

		//----------Properties of Status Bar-------

		lblStatus.setText("00:00:00 AM");
		lblStatus.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStatus.setForeground(Color.black);
		lblStatus.setFont(new Font("Arial",1,12));
		lblStatus.setBorder(BorderFactory.createEtchedBorder(0));//1 default raised line

		//----------Call the getSystemTime Method-------

		//Properties of JDesktopPane...
		dp.setBackground(new Color(120,120,120));//All the values are same to show grey color, increased value will result brighter color
		getSystemTime();


	}//End of Constructor

public static void main (String args[])

	{//Main

		new InputScreen().setVisible(true);
		System.out.println(Integer.MAX_VALUE);//Showing maximum number of layers in DesktopPane

	}//End of Main Method

//---------User Defined Functions---------

private void showHelp()

	{
		JOptionPane.showMessageDialog(null,
		"This Program is Development by Astrid Gomes \n" +
		"Batch 12 \n"+
		"Roll 18 \n" +
		"BCIS (Hons.) \n" +
		"DIIT, Dhanmondi Campus \n"+
		"Dhaka \n" +
		"E-mail: av_gomes@yahoo.com \n"+
		"Telephone: 00880 2 8802300 \n" +
		"Mobile No. 0088 015 345780 \n", "About", -1, new ImageIcon("./Images/about.gif"));

	}//end of method showHelp

private void getSystemTime()

	{
		Thread th = new Thread(new Runnable(){
		public void run(){

		SimpleDateFormat sdf = new SimpleDateFormat();
		while(true){

		Date dt = new Date();
		sdf.applyPattern("hh:mm:ss a");//a is used to display either AM or PM

		lblStatus.setText(sdf.format(dt));

		//System.out.println(sdf.format(dt));

		//-------to show date----------

		sdf.applyPattern("EEEE, MMMM dd yyyy");//EEE for date MM for month dd for day yy for year
		lblStatus.setToolTipText(sdf.format(dt));

		try	{Thread.sleep(1000);} catch(Exception e){}

		}//end of while loop

	}//end of run Method

	});//end of Runnable

	th.start();

	}//end of method getSystemTime

	//------User defined Exit Method---------

	private void exitMsg()
	{

		int yn = JOptionPane.showConfirmDialog(null,
		"Do you want to exit from Application?",
		"Exit Confirmation", JOptionPane.YES_NO_OPTION);

		if (yn == JOptionPane.YES_OPTION)
			{
					System.exit(0);
			}

	}//end of exit confirmation method

	//---------Iser defined showSupplier method----

	private void showSupplier()
	{
		//JDialog frmSupp = new JDialog();
		JInternalFrame frmSupp = new JInternalFrame();

		frmSupp.setTitle("Supplier Information");
		frmSupp.setLocation(40,40);
		frmSupp.setSize(400,400);

		//--------Properties of JDialog-------

		//frmSupp.setModal(true);//by deafult false [Used for JDailog]

		//Properties of JInternalFrame...
		frmSupp.setClosable(true);
		frmSupp.setMaximizable(true);
		frmSupp.setIconifiable(true);

		frmSupp.setFrameIcon(imgSupp);
		//-------------------------------
		dp.add(frmSupp);//Adding InternalFrame to DesktopPane
		frmSupp.setVisible(true);

	}

	//end of showSupplier method

}//End of Class


/*
Parameters:\java.awt.Toolkit
public static synchronized java.awt.Toolkit getDefaultToolkit();

Parameter:\java.awt.Dimension
public abstract java.awt.Dimension getScreenSize();
public java.awt.Dimension getScreenSize();
	public int width;
	public int height;
    public java.awt.Dimension();

Parameter:\javax.swing.JMenuItem
public void setAccelerator(javax.swing.KeyStroke);
public static javax.swing.KeyStroke getKeyStroke(int, int, boolean);

Parameter:\javax.swing.JToolBar
public void setFloatable(boolean);
public void setOrientation(int);


*/
//HW Create new class [frmSupplier extends JFrame] Design As Follows
/*
-----------------------------------------
-----------------------------------------

ID Number		|-----------|
Company Name	|-----------|
Address			|-----------|
Phone			|-----------|
Email			|-----------|
Date of Joining	|-----------|

*/