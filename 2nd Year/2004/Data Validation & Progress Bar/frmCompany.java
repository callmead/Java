import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;

import java.text.SimpleDateFormat;

import java.io.*; 	//Buffered Reader and Writer
import java.util.*;	//Vector


public class frmCompany extends JFrame
{//Class
	Border border1;
	TitledBorder titledBorder1;

	JPanel jPanel1 = new JPanel();
	JPanel jPanel2 = new JPanel();

	JLabel jLabel1 = new JLabel();
	JLabel jLabel2 = new JLabel();
	JLabel jLabel3 = new JLabel();
	JLabel jLabel4 = new JLabel();
	JLabel jLabel5 = new JLabel();
	JLabel jLabel7 = new JLabel();

	JTextFields txtCompanyID = new JTextFields(10,'s');
	JTextFields txtCompanyName = new JTextFields(15,'a');
	JTextFields txtCompanyAddress = new JTextFields(25,'s');
	JTextFields txtPhone = new JTextFields(7,'i');
	JTextFields txtEmail = new JTextFields(20,'e');
	JTextFields txtRemarks = new JTextFields(5,'f');
	//Validation for text fields 2 parameters 1st one for Size 2nd one for data type...
	// i for integer
	// f for Float
	// s for String
	// e for Email
	// a for Alphanumeric


	TitledBorder titledBorder2;
	JToggleButton btnLast = new JToggleButton();
	JToggleButton btnPrevious = new JToggleButton();
	JToggleButton btnNext = new JToggleButton();
	JToggleButton btnFirst = new JToggleButton();
	JButton btnDelete = new JButton();
	JButton btnClose = new JButton();
	JButton btnSave = new JButton();
	JButton btnCancel = new JButton();
	JButton btnEdit = new JButton();
	JButton btnAdd = new JButton();
	JLabel jLabel8 = new JLabel();


	//Decleare boolean variable
	boolean isAdd = false;
	//To Search Record and Delete...
	String n = new String();

	//Log File Declerations...
	File f;
	String readFileText = new String();;
	String newText = new String();

	//Search Delcerations
	String searchType1 = new String();
	String searchType2 = new String();

	JLabel jLabel9 = new JLabel();
	JTextField txtFax = new JTextField();
	JPanel jPanel4 = new JPanel();
	JComboBox jComboBox1 = new JComboBox();
	JButton btnGo = new JButton();
	JTextField txtSearch = new JTextField();

	public frmCompany()
	{
		try
		{
			jbInit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private void jbInit() throws Exception
	{//jbInit

		border1 = BorderFactory.createEtchedBorder(new Color(187, 218, 252),new Color(91, 107, 123));
		titledBorder1 = new TitledBorder(BorderFactory.createEtchedBorder(new Color(187, 218, 252),new Color(91, 107, 123)),"");

		titledBorder2 = new TitledBorder(BorderFactory.createEtchedBorder(new Color(187, 218, 252),new Color(91, 107, 123)),"Company Search");
		this.getContentPane().setLayout(null);
		//this.getContentPane().setBackground(new Color(128,128,128));
		this.getContentPane().setBackground(new Color(0,0,0));

		jPanel1.setBackground(Color.white);
		jPanel1.setFont(new java.awt.Font("Tahoma", 1, 14));
		jPanel1.setBorder(titledBorder1);
		jPanel1.setOpaque(true);
		jPanel1.setBounds(new Rectangle(13, 16, 416, 235));
		jPanel1.setLayout(null);
		jPanel2.setLayout(null);
		btnLast.setToolTipText("Last");

		btnLast.setIcon(new ImageIcon("images/last.gif"));
		btnLast.setText("");
		btnLast.setBounds(new Rectangle(377, 17, 20, 21));
		btnLast.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{

			}
		});

		btnPrevious.setToolTipText("Previous");
		btnPrevious.setIcon(new ImageIcon("images/Previous.gif"));
		btnPrevious.setText("");
		btnPrevious.setBounds(new Rectangle(38, 17, 20, 21));
		btnPrevious.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{

			}
		});

		btnNext.setToolTipText("Next");
		btnNext.setIcon(new ImageIcon("images/next.gif"));
		btnNext.setText("");
		btnNext.setBounds(new Rectangle(356, 17, 20, 21));
		btnNext.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{

			}
		});

		btnFirst.setToolTipText("First");
		btnFirst.setIcon(new ImageIcon("images/first.gif"));
		btnFirst.setText("");
		btnFirst.setBounds(new Rectangle(17, 17, 20, 21));
		btnFirst.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{

			}
		});

		btnDelete.setBorder(BorderFactory.createRaisedBevelBorder());
		btnDelete.setMnemonic('D');
		btnDelete.setText("Delete");
		btnDelete.setBounds(new Rectangle(237, 45, 76, 21));
		btnDelete.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				n = JOptionPane.showInputDialog("Enter a Company ID to Delete record\ne.g. C0004");
				if(n!=null)
				{

				}
				else
				{
					//JOptionPane.showMessageDialog(null,"Record Deletion Quited!!","",JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		btnClose.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.out.println();
				System.out.println("frmStudent Unloaded...");
				System.out.println("---------------------------------");
				System.out.println();
				dispose();
			}
		});
		btnClose.setBorder(BorderFactory.createRaisedBevelBorder());
		btnClose.setMnemonic('L');
		btnClose.setText("Close");
		btnClose.setBounds(new Rectangle(321, 45, 76, 21));
		btnClose.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.out.println();
				System.out.println("frmStudent Unloaded...");
				System.out.println("---------------------------------");
				System.out.println();
				dispose();
			}
		});

		btnSave.addActionListener(new ActionListener()
		{//Action of Save Button
			public void actionPerformed(ActionEvent e)
			{//End Action Performed

			}//End Action Performed
		});
		btnSave.setBorder(BorderFactory.createRaisedBevelBorder());
		btnSave.setMnemonic('S');
		btnSave.setText("Save");
		btnSave.setBounds(new Rectangle(17, 45, 76, 21));

		btnCancel.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{

			}
		});
		btnCancel.setBorder(BorderFactory.createRaisedBevelBorder());
		btnCancel.setBounds(new Rectangle(100, 45, 76, 21));
		btnCancel.setText("Cancel");
		btnCancel.setMnemonic('C');
		btnEdit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{

			}
		});
		btnEdit.setBorder(BorderFactory.createRaisedBevelBorder());
		btnEdit.setBounds(new Rectangle(100, 45, 76, 21));
		btnEdit.setText("Edit");
		btnEdit.setMnemonic('E');

		btnAdd.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{

			}
		});
		btnAdd.setBorder(BorderFactory.createRaisedBevelBorder());
		btnAdd.setBounds(new Rectangle(17, 46, 76, 21));
		btnAdd.setText("Add");
		btnAdd.setMnemonic('A');

		jLabel8.setBounds(new Rectangle(59, 17, 296, 21));
		jLabel8.setOpaque(true);
		jLabel8.setBackground(Color.white);
		jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12));
		jLabel9.setText("Fax");
		jLabel9.setBounds(new Rectangle(28, 146, 87, 16));
		txtFax.setFont(new Font("Tahoma",1,12));
		txtFax.setCaretColor(Color.blue);
		txtFax.setText("");
		txtFax.setBounds(new Rectangle(150, 144, 239, 20));
		jPanel4.setBackground(Color.white);
		jPanel4.setBorder(titledBorder2);
		jPanel4.setBounds(new Rectangle(13, 345, 416, 84));
		jPanel4.setLayout(null);
		jComboBox1.setBounds(new Rectangle(261, 22, 138, 20));
		jComboBox1.setMaximumRowCount(3);
		btnGo.setBounds(new Rectangle(15, 47, 383, 21));
		btnGo.setText("Go");
		btnGo.setMnemonic('G');
		btnGo.setBorder(BorderFactory.createRaisedBevelBorder());
		btnGo.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				searchType1=txtSearch.getText();
				Object obj = new Object();
				obj = jComboBox1.getSelectedItem();
				searchType2=obj.toString();
			}
		});

		txtSearch.setFont(new Font("Tahoma",1,12));
		txtSearch.setCaretColor(Color.blue);
		txtSearch.setText("");
		txtSearch.setBounds(new Rectangle(15, 22, 231, 20));
		jPanel2.setBackground(Color.white);
		jPanel1.add(txtCompanyID, null);
		jPanel1.add(txtCompanyName, null);
		jPanel1.add(txtCompanyAddress, null);
		jPanel1.add(txtPhone, null);
		jPanel1.add(jLabel4, null);
		jPanel1.add(jLabel3, null);
		jPanel1.add(jLabel2, null);
		jPanel1.add(jLabel1, null);
		jPanel1.add(txtEmail, null);
		jPanel1.add(jLabel5, null);
		jPanel1.add(txtFax, null);
		jPanel1.add(jLabel9, null);
		jPanel1.add(txtRemarks, null);
		jPanel1.add(jLabel7, null);
		jPanel4.add(txtSearch, null);
		jPanel4.add(jComboBox1, null);
		jPanel4.add(btnGo, null);
		this.getContentPane().add(jPanel2, null);

		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
		jLabel1.setText("Company ID");
		jLabel1.setBounds(new Rectangle(29, 49, 87, 16));
		jLabel2.setBounds(new Rectangle(29, 73, 113, 16));
		jLabel2.setText("Company Name");
		jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
		jLabel3.setBounds(new Rectangle(29, 97, 114, 16));
		jLabel3.setText("Company Address");
		jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12));
		jLabel4.setBounds(new Rectangle(29, 121, 87, 16));
		jLabel4.setText("Phone");
		jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12));
		jLabel5.setBounds(new Rectangle(29, 167, 87, 16));
		jLabel5.setText("Email");
		jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12));
		jLabel7.setBounds(new Rectangle(29, 192, 87, 16));
		jLabel7.setText("Remarks");
		jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12));

		txtCompanyID.setText("");
		txtCompanyID.setBounds(new Rectangle(150, 49, 239, 20));
		txtCompanyID.setCaretColor(Color.blue);
		txtCompanyID.setFont(new Font("Tahoma",1,12));

		txtCompanyName.setBounds(new Rectangle(150, 73, 239, 20));
		txtCompanyName.setText("");
		txtCompanyName.setCaretColor(Color.blue);
		txtCompanyName.setFont(new Font("Tahoma",1,12));

		txtCompanyAddress.setBounds(new Rectangle(150, 97, 239, 20));
		txtCompanyAddress.setText("");
		txtCompanyAddress.setCaretColor(Color.blue);
		txtCompanyAddress.setFont(new Font("Tahoma",1,12));

		txtPhone.setBounds(new Rectangle(150, 121, 239, 20));
		txtPhone.setText("");
		txtPhone.setCaretColor(Color.blue);
		txtPhone.setFont(new Font("Tahoma",1,12));

		txtEmail.setBounds(new Rectangle(150, 167, 239, 20));
		txtEmail.setText("");
		txtEmail.setCaretColor(Color.blue);
		txtEmail.setFont(new Font("Tahoma",1,12));


		txtRemarks.setBounds(new Rectangle(150, 192, 239, 20));
		txtRemarks.setText("");
		txtRemarks.setCaretColor(Color.blue);
		txtRemarks.setFont(new Font("Tahoma",1,12));

		jComboBox1.addItem("CompanyID");
		jComboBox1.addItem("CompanyName");


		jPanel2.setBorder(border1);
		jPanel2.setBounds(new Rectangle(13, 257, 416, 82));
		jPanel2.add(jLabel8, null);
		jPanel2.add(btnPrevious, null);
		jPanel2.add(btnFirst, null);
		jPanel2.add(btnLast, null);
		jPanel2.add(btnNext, null);
		jPanel2.add(btnClose, null);
		jPanel2.add(btnDelete, null);
		jPanel2.add(btnSave, null);
		jPanel2.add(btnCancel, null);
		jPanel2.add(btnAdd, null);
		jPanel2.add(btnEdit, null);
		this.getContentPane().add(jPanel4, null);
		this.getContentPane().add(jPanel1, null);

		this.setTitle("Company Information");
		//this.setFrameIcon(new ImageIcon("sarina.gif"));
		this.setResizable(false);
		//this.setIconifiable(true);	//Minimize
		//this.setClosable(true);	//Close
		this.setResizable(false);
		//this.setLocation(10,10);
		this.setSize(new Dimension(451, 473));
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		//this.setState(Frame.NORMAL);


	}//End jbInit

	public static void main(String x[])
	{//Main

		frmCompany fc = new frmCompany();
		fc.setVisible(true);

	}//End Main

}//End Class