//Java Class 24th March 2004 Database Class

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;
import java.text.SimpleDateFormat;

public class frmStudent extends JFrame {
	JPanel jPanel1 = new JPanel();
	JPanel jPanel2 = new JPanel();
	JPanel jPanel3 = new JPanel();
	TitledBorder titledBorder1;

	JLabel jLabel1 = new JLabel();
	JLabel jLabel2 = new JLabel();
	JLabel jLabel3 = new JLabel();
	JLabel jLabel4 = new JLabel();
	JLabel jLabel5 = new JLabel();
	JLabel jLabel6 = new JLabel();
	JLabel jLabel7 = new JLabel();

	JTextField txtSID = new JTextField();
	JTextField txtSName = new JTextField();
	JTextField txtAddress = new JTextField();
	JTextField txtPhone = new JTextField();
	JTextField txtDOB = new JTextField();
	JTextField txtDues = new JTextField();

	JButton btnCancel = new JButton();
	JButton btnSave = new JButton();
	JButton btnDelete = new JButton();
	JButton btnClose = new JButton();
	JButton btnAdd = new JButton();
	JButton btnEdit = new JButton();

	JButton btnPrev = new JButton();
	JButton btnFirst = new JButton();
	JButton btnLast = new JButton();
	JButton btnNext = new JButton();

	//Declare Database Objects
	DBU db = new DBU();
	ResultSet rsStu;

	//Decleare boolean variable
	boolean isAdd = false;

  public frmStudent() {
    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    frmStudent frmStudent = new frmStudent();
    frmStudent.setVisible(true);

  }

  private void jbInit() throws Exception {
    titledBorder1 = new TitledBorder(BorderFactory.createEtchedBorder(new Color(187, 218, 252),new Color(91, 107, 123)),"Student Information");

    this.setResizable(false);
    this.setTitle("Student");
    this.getContentPane().setLayout(null);
    this.setLocation(200,100);
    this.setSize(new Dimension(385, 328));
    this.getContentPane().add(jPanel1, null);
	this.getContentPane().add(jPanel2, null);
	this.getContentPane().add(jPanel3, null);
	this.setDefaultCloseOperation(3);


    jPanel1.setBorder(titledBorder1);
    jPanel1.setBounds(new Rectangle(23, 34, 337, 181));
    jPanel1.setLayout(null);

    jPanel2.setBounds(new Rectangle(26, 220, 332, 42));
	jPanel2.setLayout(null);

    jPanel3.setBounds(new Rectangle(24, 255, 342, 40));
    jPanel3.setLayout(null);

    jLabel1.setFont(new java.awt.Font("Dialog", 1, 12));
    jLabel1.setHorizontalAlignment(SwingConstants.RIGHT);
    jLabel1.setText("ID Number  ");
    jLabel1.setBounds(new Rectangle(16, 32, 122, 16));

    jLabel2.setBounds(new Rectangle(16, 55, 122, 16));
    jLabel2.setText("Name  ");
    jLabel2.setHorizontalAlignment(SwingConstants.RIGHT);
    jLabel2.setFont(new java.awt.Font("Dialog", 1, 12));

    jLabel3.setBounds(new Rectangle(16, 80, 122, 16));
    jLabel3.setText("Address  ");
    jLabel3.setHorizontalAlignment(SwingConstants.RIGHT);
    jLabel3.setFont(new java.awt.Font("Dialog", 1, 12));

    jLabel4.setBounds(new Rectangle(16, 104, 122, 16));
    jLabel4.setText("Phone  ");
    jLabel4.setHorizontalAlignment(SwingConstants.RIGHT);
    jLabel4.setFont(new java.awt.Font("Dialog", 1, 12));

    jLabel5.setBounds(new Rectangle(16, 127, 122, 16));
    jLabel5.setText("Date of Birth  ");
    jLabel5.setHorizontalAlignment(SwingConstants.RIGHT);
    jLabel5.setFont(new java.awt.Font("Dialog", 1, 12));

    jLabel6.setBounds(new Rectangle(16, 150, 122, 16));
    jLabel6.setText("Dues  ");
    jLabel6.setHorizontalAlignment(SwingConstants.RIGHT);
    jLabel6.setFont(new java.awt.Font("Dialog", 1, 12));

    jLabel7.setBackground(Color.white);
    jLabel7.setOpaque(true);
    jLabel7.setBounds(new Rectangle(42, 9, 257, 21));

    txtSID.setBounds(new Rectangle(151, 32, 157, 16));
    txtSName.setBounds(new Rectangle(151, 55, 157, 16));
    txtAddress.setBounds(new Rectangle(150, 80, 157, 16));
    txtPhone.setBounds(new Rectangle(150, 104, 157, 16));
    txtDOB.setBounds(new Rectangle(151, 127, 157, 16));
    txtDues.setBounds(new Rectangle(151, 150, 157, 16));

    btnAdd.setMnemonic('A');
    btnAdd.setText("Add");
    btnAdd.setBounds(new Rectangle(9, 11, 76, 21));
    btnAdd.setBorder(BorderFactory.createRaisedBevelBorder());
	btnAdd.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			//Set Boolean Data True
			isAdd=true;

			//Defining Button State
			setButton(false);

			//Defining Text Fields
			setFields(true);

			//Clearing Text Fields
			clearFields();

			txtSID.requestFocus();
		}
	});

    btnEdit.setMnemonic('E');
    btnEdit.setText("Edit");
    btnEdit.setBounds(new Rectangle(89, 11, 76, 21));
    btnEdit.setBorder(BorderFactory.createRaisedBevelBorder());
    btnEdit.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			//Defining Button State
			setButton(false);
			//Defining Text Fields
			setFields(true);

			//Setting the cursor to Name field
			txtSName.requestFocus();
			//Locking the SID Name because it is not suppose to Editable
			txtSID.setEditable(false);
		}
	});

    btnSave.setBounds(new Rectangle(9, 11, 76, 21));
    btnSave.setText("Save");
    btnSave.setMnemonic('S');
    btnSave.setBorder(BorderFactory.createRaisedBevelBorder());
    btnSave.addActionListener(new ActionListener()
	{//Action of Save Button
		public void actionPerformed(ActionEvent e)
		{//End Action Performed
			if (isAdd)
			{
				if (saveData())
				{
					//Defining Button State
					setButton(true);
					//Defining Text Fields
					setFields(false);
					//Refresh Database
					refreshDB();
					//Set Boolean data to false
					isAdd=false;
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Sorry, Invalid Data!!!\nPlease try again.");

				}//End if saveDate
			}
			else
			{

				if (editData())
				{
					//Defining Button State
					setButton(true);
					//Defining Text Fields
					setFields(false);
					//Refresh Database
					refreshDB();
					//Set Boolean data to false
					isAdd=false;
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Sorry, Invalid Data!!!\nPlease try again.");

				}//End if saveDate
				JOptionPane.showMessageDialog(null,"Data Saved...");

			}//End isAdd
		}//End Action Performed
	});//Action of Save Button

    btnCancel.setMnemonic('C');
    btnCancel.setText("Cancel");
    btnCancel.setBounds(new Rectangle(89, 11, 76, 21));
    btnCancel.setBorder(BorderFactory.createRaisedBevelBorder());
    btnCancel.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			//Defining Button State
			setButton(true);
			//Defining Text Fields
			setFields(false);
			//Refresh Database
			refreshDB();
			//Set Boolean data to false
			isAdd=false;
		}
	});

    btnDelete.setBounds(new Rectangle(170, 11, 76, 21));
    btnDelete.setText("Delete");
    btnDelete.setMnemonic('D');
    btnDelete.setBorder(BorderFactory.createRaisedBevelBorder());
    btnDelete.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{}
	});

    btnClose.setBounds(new Rectangle(250, 11, 76, 21));
    btnClose.setText("Close");
    btnClose.setMnemonic('L');
    btnClose.setBorder(BorderFactory.createRaisedBevelBorder());
    btnClose.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			System.out.println();
			System.out.println("Closed...");
			System.out.println();
			System.exit(0);
		}
	});

	btnFirst.setBounds(new Rectangle(3, 9, 19, 21));
    btnFirst.setIcon(new ImageIcon("first.gif"));
    btnFirst.setMnemonic('F');
    btnFirst.setBorder(BorderFactory.createRaisedBevelBorder());
    btnFirst.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			moveFirst();
		}
	});

    btnPrev.setMnemonic('P');
    btnPrev.setIcon(new ImageIcon("prior.gif"));
    btnPrev.setBounds(new Rectangle(22, 9, 19, 21));
    btnPrev.setBorder(BorderFactory.createRaisedBevelBorder());
    btnPrev.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			movePrevious();
		}
	});

    btnNext.setBounds(new Rectangle(301, 9, 19, 21));
    btnNext.setIcon(new ImageIcon("next.gif"));
    btnNext.setMnemonic('N');
    btnNext.setBorder(BorderFactory.createRaisedBevelBorder());
    btnNext.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			moveNext();
		}
	});

    btnLast.setBounds(new Rectangle(321, 9, 19, 21));
    btnLast.setIcon(new ImageIcon("last.gif"));
    btnLast.setMnemonic('L');
    btnLast.setBorder(BorderFactory.createRaisedBevelBorder());
    btnLast.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			moveLast();
		}
	});

    jPanel1.add(jLabel1, null);
    jPanel1.add(jLabel2, null);
    jPanel1.add(jLabel3, null);
    jPanel1.add(jLabel4, null);
    jPanel1.add(jLabel5, null);
    jPanel1.add(jLabel6, null);

    jPanel1.add(txtSID, null);
    jPanel1.add(txtPhone, null);
    jPanel1.add(txtDOB, null);
    jPanel1.add(txtDues, null);
    jPanel1.add(txtAddress, null);
    jPanel1.add(txtSName, null);

    jPanel2.add(btnDelete, null);
    jPanel2.add(btnClose, null);
    jPanel2.add(btnAdd, null);
    jPanel2.add(btnSave, null);
    jPanel2.add(btnEdit, null);
    jPanel2.add(btnCancel, null);

    jPanel3.add(btnFirst, null);
    jPanel3.add(btnPrev, null);
    jPanel3.add(btnLast, null);
    jPanel3.add(btnNext, null);
    jPanel3.add(jLabel7, null);

    //Defining Button State
    setButton(true);

    //Defining Text Fields State
    setFields(false);

	//Refresh Database
    refreshDB();

  }
  //Define User's Methods...

	public void setButton(boolean btnValue)
	{//Disbale and Enable Buttons

		btnAdd.setVisible(btnValue);
		btnEdit.setVisible(btnValue);

		btnSave.setVisible(!btnValue);
		btnCancel.setVisible(!btnValue);

		btnDelete.setEnabled(btnValue);
		btnClose.setEnabled(btnValue);

		btnFirst.setEnabled(btnValue);
		btnPrev.setEnabled(btnValue);
		btnNext.setEnabled(btnValue);
		btnLast.setEnabled(btnValue);

	}//End Disbale and Enable Buttons

	public void setFields(boolean txtValue)
	{//Disable or Enable Text Fields

		txtSID.setEditable(txtValue);
		txtSName.setEditable(txtValue);
		txtAddress.setEditable(txtValue);
		txtPhone.setEditable(txtValue);
		txtDOB.setEditable(txtValue);
		txtDues.setEditable(txtValue);

	}//End Disable or Enable Text Fields

	public void refreshDB()
	{//Refreshing DB
		try
		{
			rsStu = db.stmt.executeQuery("SELECT * FROM Student");

			//If there is any record in DB then
			if (rsStu.next()) display();

		}catch(SQLException sqle)
		{
			System.out.println("Error: Refreshing Data!!!");
			System.out.println("*** Exception: "+sqle);
		}
	}//End Refreshing DB

	public void display() //throws SQLException //Like On Error ResumeNext either use Try Catch or use throws Exception Name
	{//Display Data
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try
		{
			txtSID.setText(rsStu.getString(1));
			txtSName.setText(rsStu.getString(2));
			txtAddress.setText(rsStu.getString(3));
			txtPhone.setText(rsStu.getString(4));

			txtDOB.setText(sdf.format(rsStu.getDate(5)));

			txtDues.setText(rsStu.getString(6));
			jLabel7.setText(" Record No : "+rsStu.getRow());
		}catch(SQLException sqle)
		{
			System.out.println("Error: Displaying Data!!!");
			System.out.println("*** Exception: "+sqle);
		}

	}//End Display Data

	public void moveNext()
	{//moveNext
		try
		{
			if (!rsStu.next()) rsStu.last(); //If there is no record left (its on EOF) then show last record dont go out of EOF
			display(); //


		}catch(SQLException sqle)
		{
			System.out.println("*** Error: Move Next!!!");
			System.out.println("*** Exception: "+sqle);
		}
	}//End moveNext

	public void movePrevious()
	{//movePrevious
		try
		{
			if (!rsStu.previous()) rsStu.first(); //Dont go back from BOF
			display();

		}catch(SQLException sqle)
		{
			System.out.println("*** Error: Move Previous!!!");
			System.out.println("*** Exception: "+sqle);
		}
	}//End movePrevious

	public void moveFirst()
	{//moveFirst
		try
		{
			rsStu.first();
			display();

		}catch(SQLException sqle)
		{
			System.out.println("*** Error: Move First!!!");
			System.out.println("*** Exception: "+sqle);
		}
	}//End moveFirst

	public void moveLast()
	{//moveLast
		try
		{
			rsStu.last();
			display();

		}catch(SQLException sqle)
		{
			System.out.println("*** Error: Move Last!!!");
			System.out.println("*** Exception: "+sqle);
		}
	}//End moveLast

	public void clearFields() //throws SQLException //Like On Error ResumeNext either use Try Catch or use throws Exception Name
	{//Clear Fields
			txtSID.setText("");
			txtSName.setText("");
			txtAddress.setText("");
			txtPhone.setText("");
			txtDOB.setText("");
			txtDues.setText("");

			jLabel7.setText(" Add New Record... ");

	}//End Clear Fields

	public boolean saveData()
	{//Save Data
		try
		{
			//Checking Field
			if (txtDues.getText().equals("")) txtDues.setText("0");

			String SQLString =  "INSERT INTO Student VALUES ("+
				                "'"  +txtSID.getText()     +"',"+
								"'"  +txtSName.getText()    +"',"+
								"'"  +txtAddress.getText() +"',"+
								"'"  +txtPhone.getText()   +"',"+
								"'"  +txtDOB.getText()     +"',"+
								" "  +txtDues.getText()    +");";

			System.out.println("\n"+SQLString);

			//Adding Record in Student Table by executeUpdate method we can Insert, Update and Delete as well DDL Commands
			db.stmt.executeUpdate(SQLString);
			refreshDB();

			System.out.println();
			System.out.println("Record saved sucessfully...");

			return true;

		}catch(SQLException sqle)
		{
			System.out.println("*** Error: Saving Data!!!");
			System.out.println("*** Exception: "+sqle);

            return false;
		}
	}//End Save Data

	public boolean editData()
	{//edit Data

		try
		{
			//Checking Field
			if (txtDues.getText().equals("")) txtDues.setText("0");

			String SQLString =  "UPDATE Student SET "+
				                //"SID='"  	+txtSID.getText()  		+"',"+
								"SName='"  	+txtSName.getText()   	+"',"+
								"Address='" +txtAddress.getText() 	+"',"+
								"Phone='"  	+txtPhone.getText()   	+"',"+
								"DOB='"  	+txtDOB.getText()     	+"',"+
								"Dues="  	+txtDues.getText()    	+" "+
								"WHERE SID='"+txtSID.getText()		+"';";

			System.out.println("\n"+SQLString);

			//Adding Record in Student Table by executeUpdate method we can Insert, Update and Delete as well DDL Commands
			db.stmt.executeUpdate(SQLString);
			refreshDB();

			System.out.println();
			System.out.println("Record Edited sucessfully...");

			return true;

		}catch(SQLException sqle)
		{
			System.out.println("*** Error: Editing Data!!!");
			System.out.println("*** Exception: "+sqle);

            return false;
		}
	}//End Edit Data

  //End Define User's Methods...
}