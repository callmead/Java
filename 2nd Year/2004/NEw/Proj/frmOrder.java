import java.io.*;
import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.net.*;
import java.awt.event.*;
import java.text.*;

public class frmOrder extends JFrame
{
	//*******Global Declarations******

	//---------- DataBase Object-----------
	Utility u=new Utility();
	ResultSet rs;


	JLabel lblHead=new JLabel();
	JLabel lblOrder=new JLabel();
	JLabel lblClient=new JLabel();
	JLabel lblPayment=new JLabel();
	JLabel lblDestination=new JLabel();
	JLabel lblCondition=new JLabel();
	JLabel lblQuality=new JLabel();
	JLabel lblOrdDate=new JLabel();

	//===== SubMain1====


	JLabel lblItem=new JLabel();
	JLabel lblQty=new JLabel();
	JLabel lblUPriceHT=new JLabel();
	JLabel lblTotalHT=new JLabel();
	JLabel lblWashDes=new JLabel();
	JLabel lblShipmentDate=new JLabel();

	JTextField txtItem=new JTextField();
	JTextField txtQty=new JTextField();
	JTextField txtUPriceHT=new JTextField();
	JTextField txtTotalHT=new JTextField();
	JTextField txtWashDes=new JTextField();
	JTextField txtShipmentDate=new JTextField();

	JTextField txtOrderNo=new JTextField();
	JTextField txtClient=new JTextField();
	JTextField txtPayment=new JTextField();
	JTextField txtDestination=new JTextField();
	JTextField txtCondition=new JTextField();
	JTextField txtQuality=new JTextField();
	JTextField txtOrdDate=new JTextField();

	JPanel pnlMain=new JPanel();
	JPanel pnlMain1=new JPanel();
	JPanel pnlButton=new JPanel();

	JButton btnNew=new JButton();
	JButton btnEdit=new JButton();
	JButton btnSave=new JButton();
	JButton btnCancel=new JButton();
	JButton btnDel=new JButton();
	JButton btnClose=new JButton();
	JButton btnFirst=new JButton();
	JButton btnPrev=new JButton();
	JButton btnNext=new JButton();
	JButton btnLast=new JButton();

	JButton btnAdd=new JButton();
	JButton btnCancel1=new JButton();


	JPanel pnlTable=new JPanel();
	JScrollPane sp=new JScrollPane();
	JTable table1;
	String [] columnHead={"Item","Quantity","Unit Price HT","Total HT USD","Wash Description","Shipment Date"};
	String [][] rowData={
							{"1","Ali","89057","33","Stone","12,2,04"},
							{"2","Kuddus","449087","33","Stone","12,2,04"},
							{"3","Tusi","844087","33","Stone","12,2,04"},
							{"1","Ali","89057","33","Stone","12,2,04"},
							{"2","Kuddus","449087","33","Stone","12,2,04"},
							{"3","Tusi","844087","33","Stone","12,2,04"},
							{"4","Nd","4087","33","Stone","12,2,04"}};


	//****Formatin Date*****
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");


	//******Start of Constructor*********
	public frmOrder()
	{
		this.setTitle("ORDER");
		this.setSize(900,650);
		this.setLocation(0,0);
		this.getContentPane().setLayout(null);
		this.getContentPane().add(lblHead);
		this.getContentPane().add(pnlMain);
		this.getContentPane().add(pnlMain1);
		this.getContentPane().add(pnlTable);
		this.getContentPane().add(pnlButton);


		//---- Properties of Panel Table----

		pnlTable.setBounds(20,320,740,129);
		pnlTable.setLayout(null);
		pnlTable.setBorder(BorderFactory.createLineBorder(Color.black));
		pnlTable.add(sp);

		//---- Properties of JTable----
		table1=new JTable(rowData,columnHead);
		//table1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);// Table Column Size will be Fix

		//----------- Scroll Pane----

		sp.setBounds(0,0,740,129);
		sp.getViewport().add(table1);

		// Properties of Panel////

		pnlMain.setLayout(null);
		pnlMain.setBounds(20,60,360,250);
		pnlMain.setBorder(BorderFactory.createLineBorder(Color.black,2));

		pnlMain.add(lblOrder);
		pnlMain.add(lblClient);
		pnlMain.add(lblPayment);
		pnlMain.add(lblDestination);
		pnlMain.add(lblCondition);
		pnlMain.add(lblQuality);
		pnlMain.add(lblOrdDate);

        pnlMain.add(txtOrderNo);
		pnlMain.add(txtClient);
		pnlMain.add(txtPayment);
		pnlMain.add(txtDestination);
		pnlMain.add(txtCondition);
		pnlMain.add(txtQuality);
		pnlMain.add(txtOrdDate);

		pnlMain1.setLayout(null);
		pnlMain1.setBounds(400,60,360,250);
		pnlMain1.setBorder(BorderFactory.createLineBorder(Color.black,2));

		pnlMain1.add(btnAdd);
		pnlMain1.add(btnCancel1);

		pnlMain1.add(lblItem);
		pnlMain1.add(lblQty);
		pnlMain1.add(lblWashDes);
		pnlMain1.add(lblShipmentDate);
		pnlMain1.add(lblUPriceHT);
		pnlMain1.add(lblTotalHT);

		pnlMain1.add(txtItem);
		pnlMain1.add(txtQty);
		pnlMain1.add(txtWashDes);
		pnlMain1.add(txtShipmentDate);
		pnlMain1.add(txtUPriceHT);
		pnlMain1.add(txtTotalHT);
		/*
		pnlMain.add(txtOrderNo);
		pnlMain.add(txtClient);
		pnlMain.add(txtPayment);
		pnlMain.add(txtDestination);
		pnlMain.add(txtCondition);
		pnlMain.add(txtQuality);
		pnlMain.add(txtOrdDate);
*/


		pnlButton.setLayout(null);
		pnlButton.setBounds(20,480,740,50);
		pnlButton.setBorder(BorderFactory.createLineBorder(Color.black,2));
		// Add Buttons in Panel**********
		pnlButton.add(btnFirst);
		pnlButton.add(btnPrev);
		pnlButton.add(btnNext);
		pnlButton.add(btnLast);

		pnlButton.add(btnNew);
		pnlButton.add(btnEdit);
		pnlButton.add(btnSave);
		pnlButton.add(btnCancel);
		pnlButton.add(btnDel);
		pnlButton.add(btnClose);

		// Properties of Label////
		lblOrder.setText("Order No  ");
		lblOrder.setHorizontalAlignment(SwingConstants.RIGHT);
		lblOrder.setBounds(20,20,120,25);
		lblOrder.setForeground(Color.white);
		lblOrder.setBackground(Color.black);
		lblOrder.setOpaque(true);
		lblOrder.setBorder(BorderFactory.createLineBorder(Color.white,2));

		lblClient.setText("Client  ");
		lblClient.setHorizontalAlignment(SwingConstants.RIGHT);
		lblClient.setBounds(20,50,120,25);
		lblClient.setForeground(Color.white);
		lblClient.setBackground(Color.black);
		lblClient.setOpaque(true);
		lblClient.setBorder(BorderFactory.createLineBorder(Color.white,2));

		lblPayment.setText("Payment  ");
		lblPayment.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPayment.setBounds(20,80,120,25);
		lblPayment.setForeground(Color.white);
		lblPayment.setBackground(Color.black);
		lblPayment.setOpaque(true);
		lblPayment.setBorder(BorderFactory.createLineBorder(Color.white,2));

		lblDestination.setText("Destination  ");
		lblDestination.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDestination.setBounds(20,110,120,25);
		lblDestination.setForeground(Color.white);
		lblDestination.setBackground(Color.black);
		lblDestination.setOpaque(true);
		lblDestination.setBorder(BorderFactory.createLineBorder(Color.white,2));

		lblCondition.setText("Condition  ");
		lblCondition.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCondition.setBounds(20,140,120,25);
		lblCondition.setForeground(Color.white);
		lblCondition.setBackground(Color.black);
		lblCondition.setOpaque(true);
		lblCondition.setBorder(BorderFactory.createLineBorder(Color.white,2));

		lblQuality.setText("Quality ");
		lblQuality.setHorizontalAlignment(SwingConstants.RIGHT);
		lblQuality.setBounds(20,170,120,25);
		lblQuality.setForeground(Color.white);
		lblQuality.setBackground(Color.black);
		lblQuality.setOpaque(true);
		lblQuality.setBorder(BorderFactory.createLineBorder(Color.white,2));

		lblOrdDate.setText("Date  ");
		lblOrdDate.setHorizontalAlignment(SwingConstants.RIGHT);
		lblOrdDate.setBounds(20,200,120,25);
		lblOrdDate.setForeground(Color.white);
		lblOrdDate.setBackground(Color.black);
		lblOrdDate.setOpaque(true);
		lblOrdDate.setBorder(BorderFactory.createLineBorder(Color.white,2));

		lblHead.setText("Order Information");
		lblHead.setFont(new Font("Arial",1,20));
		lblHead.setHorizontalAlignment(SwingConstants.CENTER);
		lblHead.setBounds(200,10,360,35);
		lblHead.setForeground(Color.white);
		lblHead.setBackground(Color.blue);
		lblHead.setOpaque(true);
		lblHead.setBorder(BorderFactory.createRaisedBevelBorder());



		lblItem.setText("Item  ");
		lblItem.setHorizontalAlignment(SwingConstants.RIGHT);
		lblItem.setBounds(20,50,120,25);
		lblItem.setForeground(Color.white);
		lblItem.setBackground(Color.black);
		lblItem.setOpaque(true);
		lblItem.setBorder(BorderFactory.createLineBorder(Color.white,2));

		lblQty.setText("Quantity  ");
		lblQty.setHorizontalAlignment(SwingConstants.RIGHT);
		lblQty.setBounds(20,80,120,25);
		lblQty.setForeground(Color.white);
		lblQty.setBackground(Color.black);
		lblQty.setOpaque(true);
		lblQty.setBorder(BorderFactory.createLineBorder(Color.white,2));

		lblWashDes.setText("Washing  ");
		lblWashDes.setHorizontalAlignment(SwingConstants.RIGHT);
		lblWashDes.setBounds(20,110,120,25);
		lblWashDes.setForeground(Color.white);
		lblWashDes.setBackground(Color.black);
		lblWashDes.setOpaque(true);
		lblWashDes.setBorder(BorderFactory.createLineBorder(Color.white,2));

		lblShipmentDate.setText("S. Date  ");
		lblShipmentDate.setHorizontalAlignment(SwingConstants.RIGHT);
		lblShipmentDate.setBounds(20,140,120,25);
		lblShipmentDate.setForeground(Color.white);
		lblShipmentDate.setBackground(Color.black);
		lblShipmentDate.setOpaque(true);
		lblShipmentDate.setBorder(BorderFactory.createLineBorder(Color.white,2));

		lblUPriceHT.setText("UP Total ");
		lblUPriceHT.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUPriceHT.setBounds(20,170,120,25);
		lblUPriceHT.setForeground(Color.white);
		lblUPriceHT.setBackground(Color.black);
		lblUPriceHT.setOpaque(true);
		lblUPriceHT.setBorder(BorderFactory.createLineBorder(Color.white,2));

		lblTotalHT.setText("Total HT  ");
		lblTotalHT.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotalHT.setBounds(20,200,120,25);
		lblTotalHT.setForeground(Color.white);
		lblTotalHT.setBackground(Color.black);
		lblTotalHT.setOpaque(true);
		lblTotalHT.setBorder(BorderFactory.createLineBorder(Color.white,2));

		// Properties of Text Box////////

		txtOrderNo.setBounds(150,20,100,25);
		txtClient.setBounds(150,50,100,25);
		txtPayment.setBounds(150,80,200,25);
		txtDestination.setBounds(150,110,80,25);
		txtCondition.setBounds(150,140,80,25);
		txtQuality.setBounds(150,170,80,25);
		txtOrdDate.setBounds(150,200,50,25);


		txtItem.setBounds(150,50,200,25);
		txtQty.setBounds(150,80,50,25);
		txtWashDes.setBounds(150,110,100,25);
		txtShipmentDate.setBounds(150,140,100,25);
		txtUPriceHT.setBounds(150,170,80,25);
		txtTotalHT.setBounds(150,200,80,25);

		// Properties of Button////

		btnFirst.setText("|<");
		btnFirst.setBounds(25,12,85,23);
		btnFirst.setBorder(BorderFactory.createRaisedBevelBorder());
		btnFirst.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{

			}

		});

		btnPrev.setText("<");
		btnPrev.setBounds(110,12,85,23);
		btnPrev.setBorder(BorderFactory.createRaisedBevelBorder());
		btnPrev.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				movePrev();
			}

		});

		btnNext.setText(">");
		btnNext.setBounds(195,12,85,23);
		btnNext.setBorder(BorderFactory.createRaisedBevelBorder());
		btnNext.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				moveNext();
			}

		});

		btnLast.setText(">|");
		btnLast.setBounds(280,12,85,23);
		btnLast.setBorder(BorderFactory.createRaisedBevelBorder());
		btnLast.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{

			}

		});

		btnSave.setText("Save");
		btnSave.setBounds(365,12,85,23);
		btnSave.setMnemonic('S');
		btnSave.setBorder(BorderFactory.createRaisedBevelBorder());
		btnSave.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				setButtons(true);//Button Saved
				setFields(false);//Fields Sate
			}

		});


		btnNew.setText("New");
		btnNew.setBounds(365,12,85,23);
		btnNew.setMnemonic('N');
		btnNew.setBorder(BorderFactory.createRaisedBevelBorder());
		btnNew.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				setButtons(false);//Button Add
				setFields(true);// Fields State

			}

		});

		btnCancel.setText("Cancel");
		btnCancel.setBounds(450,12,85,23);
		btnCancel.setMnemonic('C');
		btnCancel.setBorder(BorderFactory.createRaisedBevelBorder());
		btnCancel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				setButtons(true);//Button Cancel
				setFields(false);//Fields Sate
			}

		});

		btnAdd.setText("Add");
		btnAdd.setBounds(20,20,120,23);
		btnAdd.setMnemonic('A');
		btnAdd.setBorder(BorderFactory.createRaisedBevelBorder());
		btnAdd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
			setButtons(false);

			}

		});

		btnCancel1.setText("Cancel");
		btnCancel1.setBounds(150,20,120,23);
		btnCancel1.setMnemonic('C');
		btnCancel1.setBorder(BorderFactory.createRaisedBevelBorder());
		btnCancel1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{

			}

		});

		btnEdit.setText("Edit");
		btnEdit.setBounds(450,12,85,23);
		btnEdit.setMnemonic('E');
		btnEdit.setBorder(BorderFactory.createRaisedBevelBorder());
		btnEdit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				setButtons(false);
				setFields(true);//Fields State

			}

		});

		btnDel.setText("Delete");
		btnDel.setBounds(535,12,85,23);
		btnDel.setMnemonic('D');
		btnDel.setBorder(BorderFactory.createRaisedBevelBorder());
		btnDel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{

			}

		});

		btnClose.setText("Close");
		btnClose.setBounds(620,12,85,23);
		btnClose.setMnemonic('o');
		btnClose.setBorder(BorderFactory.createRaisedBevelBorder());
		btnClose.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}

		});

		btnCancel1.setEnabled(false);
		btnAdd.setEnabled(false);
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

		btnNew.setVisible(bVal);
		btnEdit.setVisible(bVal);
		btnDel.setEnabled(bVal);
		btnClose.setEnabled(bVal);
		btnCancel1.setEnabled(!bVal);
		btnAdd.setEnabled(!bVal);


		btnSave.setVisible(!bVal); // It will be false
		btnCancel.setVisible(!bVal);//It will be false

	}

	public void setFields(boolean bVal)
	{
		txtOrderNo.setEditable(bVal);
		txtClient.setEditable(bVal);
		txtPayment.setEditable(bVal);
		txtDestination.setEditable(bVal);
		txtCondition.setEditable(bVal);
		txtQuality.setEditable(bVal);
		txtOrdDate.setEditable(bVal);

		txtItem.setEditable(bVal);
		txtQty.setEditable(bVal);
		txtWashDes.setEditable(bVal);
		txtShipmentDate.setEditable(bVal);
		txtUPriceHT.setEditable(bVal);
		txtTotalHT.setEditable(bVal);


	}

	public void Refresh()
	{
	try{
		String s="SELECT * FROM Orders";
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
		txtOrderNo.setText(rs.getString(1));
		txtOrdDate.setText(sdf.format(rs.getDate(2)));
		txtClient.setText(rs.getString(3));
		txtPayment.setText(rs.getString(4));
		txtDestination.setText(rs.getString(5));
		txtCondition.setText(rs.getString(6));
		txtQuality.setText(rs.getString(7));
		int t=rs.getInt(8);
		int tt=rs.getInt(9);
		int ttt=rs.getInt(10);


		txtCondition.setText(String.valueOf(t));
		txtCondition.setText(String.valueOf(tt));
		txtCondition.setText(String.valueOf(ttt));

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
	frmOrder order=new frmOrder();
	order.setVisible(true);
}
}// End of Class