//23rd July 2005 Text Field

import javax.swing.*;
import java.awt.Color;

public class myTextBox extends JFrame
{//Class

	//Global Declerations...
	JTextField txtField1 = new JTextField();
	JTextField txtField2 = new JTextField();
	JTextField txtField3 = new JTextField();
	JTextField txtField4 = new JTextField();
	JTextField txtField5 = new JTextField();
	//----------------------

	public myTextBox()
	{//Cons

		//Properties of JFrame...
		this.setTitle("Example of Text Field");
		this.setBounds(200,50,400,400);
		this.setResizable(false);
		//this.getContentPane().setBackground(Color.blue);
		this.setDefaultCloseOperation(3);
		this.getContentPane().setLayout(null);

		//Adding Components to Container...
		this.getContentPane().add(txtField1);
		this.getContentPane().add(txtField2);
		this.getContentPane().add(txtField3);
		this.getContentPane().add(txtField4);
		this.getContentPane().add(txtField5);
		//-----------------------

		//Properties of txtFields...
		txtField1.setBounds(30,50,330,25);//Left, Top, Width, Height 130,20,100,20
		txtField1.setText("Enter Your Name...");
		txtField1.selectAll();

		txtField2.setBounds(30,85,330,25);
		txtField2.setText("DIIT Dhanmondi Dhaka");
		txtField2.setEditable(false);

		txtField3.setBounds(30,120,330,25);
		txtField3.setText("Bangladesh");
		txtField3.setEnabled(false);
		txtField3.setDisabledTextColor(Color.blue);//Disabled Text Color

		txtField4.setBounds(30,155,330,25);
		txtField4.setText("Enter Your Email Address");
		txtField4.setForeground(Color.red);
		txtField4.requestFocus();
		txtField4.selectAll();

		txtField5.setBounds(30,190,330,25);
		txtField5.setText("I'm Blue");
		txtField5.setBackground(Color.blue);
		txtField5.setForeground(Color.cyan);

		//--------------------------

	}//Cons

	public static void main(String args[])
	{//Main

		myTextBox my = new myTextBox();
		my.setVisible(true);

	}//End Main

}//End Class
//Home Work, make a login dailog with labels and text fields no buttons

//http://www.teletalk.com.bd