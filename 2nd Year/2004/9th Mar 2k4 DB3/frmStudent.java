//Student Main Class
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class frmStudent extends JInternalFrame //Requires Swing Package...
{//Class

	//Global Declerations...
	JPanel pnlTxt = new JPanel();
	JPanel pnlBtn =  new JPanel();
	JPanel pnlBtm = new JPanel();

	JLabel lblSID = new JLabel();
	JLabel lblSName = new JLabel();
	JLabel lblAddress = new JLabel();
	JLabel lblPhone = new JLabel();
	JLabel lblDOB = new JLabel();
	JLabel lblDues = new JLabel();

	JTextField txtSID = new JTextField(5);
	JTextField txtSName = new JTextField();

	JTextArea txtAddress = new JTextArea();
	JScrollPane sp = new JScrollPane();//For Text Area

	JTextField txtPhone = new JTextField();
	JTextField txtDOB = new JTextField();
	JTextField txtDues = new JTextField();

	JButton btnNew = new JButton();
	JButton btnAdd = new JButton();
	JButton btnEdit = new JButton();
	JButton btnSave = new JButton();
	JButton btnDelete = new JButton();
	JButton btnClose = new JButton();

	JButton btnFirst = new JButton();
	JButton btnPrevious = new JButton();
	JButton btnNext = new JButton();
	JButton btnLast = new JButton();
	JButton btnExit = new JButton();

    DB db = new DB();
    ResultSet rs;
	//End Global Declerations...

	public frmStudent()
	{//Constructor

		super("Report",false,true,true,true);//[Title, Resize(true/false), Close(true/false), Max(true/false), Min(true/false)]
		this.setTitle("Student Records...");
		this.setFrameIcon(new ImageIcon("icon.GIF"));

		this.setBounds(50,20,580,425);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		this.getContentPane().setLayout(null);

		this.getContentPane().add(pnlTxt);
		this.getContentPane().add(pnlBtn);
		this.getContentPane().add(pnlBtm);

		//Properties of Panel...
			pnlTxt.setBounds(20,20,375,210);
			pnlTxt.setBorder(BorderFactory.createLineBorder(Color.black));
			pnlTxt.setLayout(null);

			pnlBtn.setBounds(415,20,130,210);
			pnlBtn.setBorder(BorderFactory.createLineBorder(Color.black));
			pnlBtn.setLayout(null);

			pnlBtm.setBounds(20,250,375,100);
			pnlBtm.setBorder(BorderFactory.createLineBorder(Color.black));
			pnlBtm.setLayout(null);
		//End Properties of Panel...----------------------------------

		//Adding Labels & Text Boxes & Buttons to Panel1 and defining Their Properties...
			pnlTxt.add(lblSID);pnlTxt.add(lblSName);pnlTxt.add(lblAddress);pnlTxt.add(lblPhone);pnlTxt.add(lblDOB);pnlTxt.add(lblDues);
			pnlTxt.add(txtSID);pnlTxt.add(txtSName);pnlTxt.add(txtAddress);pnlTxt.add(txtPhone);pnlTxt.add(txtDOB);pnlTxt.add(txtDues);

			pnlTxt.add(sp);

			//Properties of Labels...
				lblSID.setText("SID :");lblSName.setText("SName :");lblAddress.setText("Address :");lblPhone.setText("Phone :");lblDOB.setText("DOB :");lblDues.setText("Dues :");
				lblSID.setOpaque(true);lblSName.setOpaque(true);lblAddress.setOpaque(true);lblPhone.setOpaque(true);lblDOB.setOpaque(true);lblDues.setOpaque(true);
				lblSID.setForeground(Color.black);lblSName.setForeground(Color.black);lblAddress.setForeground(Color.black);lblPhone.setForeground(Color.black);lblDOB.setForeground(Color.black);lblDues.setForeground(Color.black);
				lblSID.setFont(new Font("Tahoma",1,12));lblSName.setFont(new Font("Tahoma",1,12));lblAddress.setFont(new Font("Tahoma",1,12));lblPhone.setFont(new Font("Tahoma",1,12));lblDOB.setFont(new Font("Tahoma",1,12));lblDues.setFont(new Font("Tahoma",1,12));
			//End Properties of Labels...----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

			//Properties of TextBoxes...
				txtSID.setText("N");
				txtSID.setForeground(Color.blue);txtSName.setForeground(Color.blue);txtAddress.setForeground(Color.blue);txtPhone.setForeground(Color.blue);txtDOB.setForeground(Color.blue);txtDues.setForeground(Color.blue);
				txtSID.setCaretColor(Color.red);txtSName.setCaretColor(Color.red);txtAddress.setCaretColor(Color.red);txtPhone.setCaretColor(Color.red);txtDOB.setCaretColor(Color.red);txtDues.setCaretColor(Color.red);
				txtSID.setFont(new Font("Tahoma",0,12));txtSName.setFont(new Font("Tahoma",0,12));txtAddress.setFont(new Font("Tahoma",0,12));txtDOB.setFont(new Font("Tahoma",0,12));txtDues.setFont(new Font("Tahoma",0,12));


			//End Properties of TextBoxes...

			//Properties of Buttons...
				btnNew.setText("New");btnAdd.setText("Add");btnEdit.setText("Edit");btnSave.setText("Save");btnDelete.setText("Delete");btnFirst.setText("First");btnPrevious.setText("Previous");btnNext.setText("Next");btnLast.setText("Last");btnClose.setText("Close");
				btnNew.setMnemonic('N');btnAdd.setMnemonic('A');btnEdit.setMnemonic('E');btnSave.setMnemonic('S');btnDelete.setMnemonic('D');btnFirst.setMnemonic('F');btnPrevious.setMnemonic('P');btnNext.setMnemonic('X');btnLast.setMnemonic('T');btnClose.setMnemonic('L');
				btnNew.setCursor(new Cursor(12));btnAdd.setCursor(new Cursor(12));btnEdit.setCursor(new Cursor(12));btnSave.setCursor(new Cursor(12));btnDelete.setCursor(new Cursor(12));btnClose.setCursor(new Cursor(12));btnFirst.setCursor(new Cursor(12));btnPrevious.setCursor(new Cursor(12));btnNext.setCursor(new Cursor(12));btnLast.setCursor(new Cursor(12));btnExit.setCursor(new Cursor(12));
				btnNew.setFont(new Font("Tahoma",1,12));btnAdd.setFont(new Font("Tahoma",1,12));btnEdit.setFont(new Font("Tahoma",1,12));btnSave.setFont(new Font("Tahoma",1,12));btnDelete.setFont(new Font("Tahoma",1,12));btnFirst.setFont(new Font("Tahoma",1,12));btnPrevious.setFont(new Font("Tahoma",1,12));btnNext.setFont(new Font("Tahoma",1,12));btnLast.setFont(new Font("Tahoma",1,12));btnClose.setFont(new Font("Tahoma",1,12));btnExit.setFont(new Font("Tahoma",1,12));

				btnExit.setText("Exit");
				btnExit.setForeground(Color.blue);
				btnExit.setBackground(Color.black);
				btnExit.setIcon(new ImageIcon("exit.GIF"));

				//Actions for the Buttons...
					btnNew.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
							ClearData();
						}
					});

					btnAdd.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
						}
					});

					btnEdit.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
						}
					});

					btnSave.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
						}
					});

					btnDelete.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
						}
					});

					btnClose.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
							dispose();
						}
					});

					btnFirst.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
						}
					});

					btnPrevious.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
						}
					});

					btnNext.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
						}
					});

					btnLast.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
						}
					});

					btnExit.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent x2)
						{
							System.exit(0);
						}
					});
				//End Actions for the Buttons...
			//End Properties of Buttons...

			//Settings on Pannel1...
				lblSID.setBounds(25,20,70,25); txtSID.setBounds(100,20,50,25);
				lblSName.setBounds(25,50,70,25); txtSName.setBounds(100,50,250,25);
				lblPhone.setBounds(25,80,70,25); txtPhone.setBounds(100,80,100,25);

				lblDOB.setBounds(210,80,40,25); txtDOB.setBounds(250,80,100,25);

				lblAddress.setBounds(25,110,70,25);

				//Properties of ScrollPane + TextArea...
					sp.setBounds(100,110,250,50);
					sp.setBorder(BorderFactory.createLineBorder(Color.black));
					sp.getViewport().add(txtAddress);//Viewpoint is the area which is between the scrollers to we just add our text area to view point thats it

					txtAddress.setLineWrap(true);
					txtAddress.setWrapStyleWord(true);
				//End Properties of ScrollPane + TextArea

				lblDues.setBounds(25,165,70,25); txtDues.setBounds(100,165,100,25);


			//End Settings on Pannel1...---------------------------------------

		//End Adding Labels & Text Boxes to Panel1 and defining Their Properties...------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

		//Adding Buttons to Bottom Pannel...
			pnlBtm.add(btnNew);pnlBtm.add(btnAdd);pnlBtm.add(btnEdit);pnlBtm.add(btnSave);pnlBtm.add(btnDelete);pnlBtm.add(btnClose);

			//Settings...
				btnNew.setBounds(20,20,100,25);btnEdit.setBounds(138,20,100,25);btnDelete.setBounds(255,20,100,25);
				btnAdd.setBounds(20,55,100,25);btnSave.setBounds(138,55,100,25);btnClose.setBounds(255,55,100,25);
			//End Settings...

		//End Adding Buttons to Bottom Pannel...

		//Adding Buttons to Right Pannel pnlBtn...
			pnlBtn.add(btnFirst);pnlBtn.add(btnPrevious);pnlBtn.add(btnNext);pnlBtn.add(btnLast);pnlBtn.add(btnExit);

			//Settings...pnlBtn.setBounds(415,20,110,210);
				btnFirst.setBounds(15,15,100,25);
				btnPrevious.setBounds(15,50,100,25);
				btnNext.setBounds(15,85,100,25);
				btnLast.setBounds(15,120,100,25);
				btnExit.setBounds(15,155,100,40);

			//End SEttings...

		//End Adding Buttons to Right Pannel pnlBtn...

		showData();

	}//End Constructor

	public static void main (String stu[])
	{//Main
		frmStudent fs = new frmStudent();
		fs.setVisible(true);
	}//End Main

		public void showData()
		{//ShowData
			try
			{//Start Try
				rs = db.stmt.executeQuery("SELECT * FROM Student");
				rs.next();

				System.out.println("-----------------------------------------------------------------------------");

					txtSID.setText(rs.getString(1));
					txtSName.setText(rs.getString(2));
					txtAddress.setText(rs.getString(3));
					txtPhone.setText(rs.getString(4));
					txtDOB.setText(rs.getString(5));
					txtDues.setText(rs.getString(6));

						System.out.println("-----------------------------------------------------------------------------");
					//-----------------------------

			}//End Try
			catch(SQLException sqle){System.out.println(sqle);}
		}//End ShowData

		public void ClearData()
		{
			txtSID.setText("N");txtSName.setText("");txtAddress.setText("");txtPhone.setText("");txtDOB.setText("");txtDues.setText("");
			txtSID.requestFocus();
		}


}//End Class

