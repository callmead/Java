import java.io.*;
import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.net.*;
import java.awt.event.*;
import java.text.*;

public class frmClient extends JFrame
{
	//*******Global Declarations******

	JLabel lblHead=new JLabel();
	JLabel lblID=new JLabel();
	JLabel lblName=new JLabel();
	JLabel lblAddress=new JLabel();
	JLabel lblPhone=new JLabel();
	JLabel lblMobile=new JLabel();


	JTextField txtID=new JTextField();
	JTextField txtName=new JTextField();
	JTextField txtAddress=new JTextField();
	JTextField txtPhone=new JTextField();
	JTextField txtMobile=new JTextField();

	JPanel pnlMain=new JPanel();
	JPanel pnlButton=new JPanel();

	JButton btnAdd=new JButton();
	JButton btnEdit=new JButton();
	JButton btnSave=new JButton();
	JButton btnCancel=new JButton();
	JButton btnDel=new JButton();
	JButton btnClose=new JButton();
	JButton btnFirst=new JButton();
	JButton btnPrev=new JButton();
	JButton btnNext=new JButton();
	JButton btnLast=new JButton();

	JPanel pnlTable=new JPanel();
			JScrollPane sp=new JScrollPane();
			JTable table1;
			String [] columnHead={"Client No","Name","Address","Phone","Mobile"};
			String [][] rowData={
										{"1","Ali","89057","33","34545"},
										{"2","Kuddus","449087","33","4645"},
										{"3","Tusi","844087","33","453"},
										{"1","Ali","89057","33","9734"},
										{"4","Nd","4087","33","97654"}};


    //---------- DataBase Object-----------
    Utility u=new Utility();
	ResultSet rs;

	//****Formatin Date*****
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");


	//******Start of Constructor*********
	public frmClient()
	{
		this.setTitle("Client Information");
		this.setSize(600,475);
		this.setLocation(100,30);
		this.getContentPane().setLayout(null);
		this.getContentPane().add(lblHead);
		this.getContentPane().add(pnlMain);
		//this.getContentPane().add(pnlTable);
		this.getContentPane().add(pnlButton);

		//---- Properties of Panel Table----

				pnlTable.setBounds(20,200,510,100);
				pnlTable.setLayout(null);
				pnlTable.setBorder(BorderFactory.createLineBorder(Color.black));
				pnlTable.add(sp);

				//---- Properties of JTable----
				table1=new JTable(rowData,columnHead);
				//table1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);// Table Column Size will be Fix

				//----------- Scroll Pane----

				sp.setBounds(0,0,510,100);
				sp.getViewport().add(table1);


		//==



		// Properties of Panel////

		pnlMain.setLayout(null);
		pnlMain.setBounds(20,60,550,320);
		pnlMain.setBackground(Color.yellow);
		pnlMain.setBorder(BorderFactory.createLineBorder(Color.black,2));

		pnlMain.add(lblID);
		pnlMain.add(lblName);
		pnlMain.add(lblAddress);
		pnlMain.add(lblPhone);
		pnlMain.add(lblMobile);


        pnlMain.add(txtID);
		pnlMain.add(txtName);
		pnlMain.add(txtAddress);
		pnlMain.add(txtPhone);
		pnlMain.add(txtMobile);

		pnlMain.add(pnlTable);



		pnlButton.setLayout(null);
		pnlButton.setBounds(100,390,360,50);
		pnlButton.setBorder(BorderFactory.createLineBorder(Color.black,2));
		// Add Buttons in Panel**********
		pnlButton.add(btnFirst);
		pnlButton.add(btnPrev);
		pnlButton.add(btnNext);
		pnlButton.add(btnLast);

		pnlButton.add(btnAdd);
		pnlButton.add(btnEdit);
		pnlButton.add(btnSave);
		pnlButton.add(btnCancel);
		pnlButton.add(btnDel);
		pnlButton.add(btnClose);

		// Properties of Label////
		lblID.setText("Client No  ");
		lblID.setHorizontalAlignment(SwingConstants.RIGHT);
		lblID.setBounds(20,20,120,25);
		lblID.setForeground(Color.white);
		lblID.setBackground(Color.black);
		lblID.setOpaque(true);
		lblID.setBorder(BorderFactory.createLineBorder(Color.white,2));

		lblName.setText("Name  ");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName.setBounds(20,50,120,25);
		lblName.setForeground(Color.white);
		lblName.setBackground(Color.black);
		lblName.setOpaque(true);
		lblName.setBorder(BorderFactory.createLineBorder(Color.white,2));

		lblAddress.setText("Address  ");
		lblAddress.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAddress.setBounds(20,80,120,25);
		lblAddress.setForeground(Color.white);
		lblAddress.setBackground(Color.black);
		lblAddress.setOpaque(true);
		lblAddress.setBorder(BorderFactory.createLineBorder(Color.white,2));

		lblPhone.setText("Pnone  ");
		lblPhone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPhone.setBounds(20,110,120,25);
		lblPhone.setForeground(Color.white);
		lblPhone.setBackground(Color.black);
		lblPhone.setOpaque(true);
		lblPhone.setBorder(BorderFactory.createLineBorder(Color.white,2));

		lblMobile.setText("Mobile  ");
		lblMobile.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMobile.setBounds(20,140,120,25);
		lblMobile.setForeground(Color.white);
		lblMobile.setBackground(Color.black);
		lblMobile.setOpaque(true);
		lblMobile.setBorder(BorderFactory.createLineBorder(Color.white,2));



		lblHead.setText("Client Information");
		lblHead.setFont(new Font("Arial",1,20));
		lblHead.setHorizontalAlignment(SwingConstants.CENTER);
		lblHead.setBounds(20,10,550,35);
		lblHead.setForeground(Color.white);
		lblHead.setBackground(Color.blue);
		lblHead.setOpaque(true);
		lblHead.setBorder(BorderFactory.createRaisedBevelBorder());

		// Properties of Text Box////////

		txtID.setBounds(150,20,100,25);
		txtName.setBounds(150,50,100,25);
		txtAddress.setBounds(150,80,200,25);
		txtPhone.setBounds(150,110,80,25);
		txtMobile.setBounds(150,140,80,25);

		// Properties of Button////

		btnFirst.setText("|<");
		btnFirst.setBounds(10,5,85,20);
		btnFirst.setBorder(BorderFactory.createRaisedBevelBorder());
		btnFirst.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{

			}

		});

		btnPrev.setText("<");
		btnPrev.setBounds(95,5,85,20);
		btnPrev.setBorder(BorderFactory.createRaisedBevelBorder());
		btnPrev.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				movePrev();
			}

		});

		btnNext.setText(">");
		btnNext.setBounds(180,5,85,20);
		btnNext.setBorder(BorderFactory.createRaisedBevelBorder());
		btnNext.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				moveNext();
			}

		});

		btnLast.setText(">|");
		btnLast.setBounds(265,5,85,20);
		btnLast.setBorder(BorderFactory.createRaisedBevelBorder());
		btnLast.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{

			}

		});

		btnSave.setText("Save");
		btnSave.setBounds(10,25,85,20);
		btnSave.setMnemonic('S');
		btnSave.setBorder(BorderFactory.createRaisedBevelBorder());
		btnSave.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				setButtons(true);//Button Saved
				setFields(false);//Fields Sate
			}

		});

		btnCancel.setText("Cancel");
		btnCancel.setBounds(95,25,85,20);
		btnCancel.setMnemonic('C');
		btnCancel.setBorder(BorderFactory.createRaisedBevelBorder());
		btnCancel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				setButtons(true);//Button Cancel
				setFields(false);//Fields Sate
			}

		});


		btnDel.setText("Delete");
		btnDel.setBounds(180,25,85,20);
		btnDel.setMnemonic('D');
		btnDel.setBorder(BorderFactory.createRaisedBevelBorder());
		btnDel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{

			}

		});

		btnClose.setText("Close");
		btnClose.setBounds(265,25,85,20);
		btnClose.setMnemonic('o');
		btnClose.setBorder(BorderFactory.createRaisedBevelBorder());
		btnClose.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}

		});

		btnAdd.setText("Add");
		btnAdd.setBounds(10,25,85,20);
		btnAdd.setMnemonic('A');
		btnAdd.setBorder(BorderFactory.createRaisedBevelBorder());
		btnAdd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				setButtons(false);//Button Add
				setFields(true);// Fields State

			}

		});

		btnEdit.setText("Edit");
		btnEdit.setBounds(95,25,85,20);
		btnEdit.setMnemonic('E');
		btnEdit.setBorder(BorderFactory.createRaisedBevelBorder());
		btnEdit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				setButtons(false);
				setFields(true);//Fields State

			}

		});

		setFields(false);// Fields State
		Refresh();// Display First Data
		Display();

	}//End of Constructor

	//******Method for Button False/True*******
	public void setButtons(boolean bVal)
	{

		btnFirst.setEnabled(bVal);
		btnPrev.setEnabled(bVal);
		btnNext.setEnabled(bVal);
		btnLast.setEnabled(bVal);

		btnAdd.setVisible(bVal);
		btnEdit.setVisible(bVal);
		btnDel.setEnabled(bVal);
		btnClose.setEnabled(bVal);

		btnSave.setVisible(!bVal); // It will be false
		btnCancel.setVisible(!bVal);//It will be false
	}

	public void setFields(boolean bVal)
	{
		txtID.setEditable(bVal);
		txtName.setEditable(bVal);
		txtAddress.setEditable(bVal);
		txtPhone.setEditable(bVal);
		txtMobile.setEditable(bVal);

	}

	public void Refresh()
	{
	try{
		String s="SELECT * FROM Client";
		rs = u.stmt.executeQuery(s);
		rs.next();
		}catch(SQLException sqle)
		{
			System.out.println("Refresh Error :"+sqle);
		}
	}

	public void Display()
	{
		try
		{
		txtID.setText(rs.getString(1));
		txtName.setText(rs.getString(2));
		txtAddress.setText(rs.getString(3));
		txtPhone.setText(rs.getString(4));
		txtMobile.setText(rs.getString(5));

		}catch(SQLException sqle)
		{
			System.out.println("Display Error :"+sqle);
		}
	}

	public void moveNext()
	{
	try{
		if(rs.next())//rs.last();
		Display();
		}catch(SQLException sqle)
			{
			System.out.println("Move Next Error :"+sqle);
			}
	}
	public void movePrev()
	{
	try{
		rs.previous();
		Display();
		}catch(SQLException sqle)
			{
			System.out.println("Move Previous Error :"+sqle);
			}
	}

public static void main(String args[])
{
	frmClient mem=new frmClient();
	mem.setVisible(true);
}
}// End of Class