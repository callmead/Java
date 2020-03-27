import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class testItemListener extends JFrame implements ItemListener

{
	JLabel lblName=new JLabel("Enter Your Name:");
	JLabel lblAdd=new JLabel("Enter Address:");
	JLabel lblTel=new JLabel("Enter Telephone:");
	JLabel lblEmail=new JLabel("Enter Email Add:");
	JLabel lblHobies=new JLabel("Chose your Hobies:");

	JTextField txtName=new JTextField(25);
	JTextField txtAdd=new JTextField(25);
	JTextField txtTel=new JTextField(25);
	JTextField txtEmail=new JTextField(25);

	JCheckBox chkMusic=new JCheckBox("Music");
	JCheckBox chkCoins=new JCheckBox("Coins");
	JCheckBox chkReading=new JCheckBox("Reading");
	JCheckBox chkSwiming=new JCheckBox("Swiming");
	JCheckBox chkStamps=new JCheckBox("Stamps");

	testItemListener()
	{
		Container c=getContentPane();

		c.setLayout(new FlowLayout());
		c.add(lblName);		c.add(txtName);
		c.add(lblAdd);		c.add(txtAdd);
		c.add(lblTel);		c.add(txtTel);
		c.add(lblEmail);	c.add(txtEmail);

		c.add(lblHobies);

		c.add(chkMusic);
		c.add(chkCoins);
		c.add(chkReading);
		c.add(chkSwiming);
		c.add(chkStamps);

		chkMusic.addItemListener(this);
		chkCoins.addItemListener(this);
		chkReading.addItemListener(this);
		chkSwiming.addItemListener(this);
		chkStamps.addItemListener(this);

		setSize(400,350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}//A

	public static void main(String a[])
	{
		new testItemListener();
	}//main

	//Function for which Checkbox Selected
	public void process(JCheckBox c)
	{
		if(c.isSelected())
			System.out.println(c.getText() + " is Checked");
		else
			System.out.println(c.getText() + " is Unchecked");

	}//End Process Function

	public void itemStateChanged(ItemEvent Matrix)
	{
		if(Matrix.getItem()==chkMusic)
			process(chkMusic);
		else if(Matrix.getItem()==chkCoins)
			process(chkCoins);
		else if(Matrix.getItem()==chkReading)
			process(chkReading);
		else if(Matrix.getItem()==chkSwiming)
			process(chkSwiming);
		else if(Matrix.getItem()==chkStamps)
			process(chkStamps);
	}//itemStateChanged
}