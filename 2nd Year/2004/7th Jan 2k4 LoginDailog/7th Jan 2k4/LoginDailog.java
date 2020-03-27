//Java 7th Jan 2004 Creating a Login Dailog.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;//for Action Listener
import javax.swing.border.*;//For Raised Bevel Border

public class LoginDailog extends JDialog

{//Class
	JPanel p1 = new JPanel();
	JLabel lblUser = new JLabel();
	JLabel lblPass = new JLabel();

	JTextField txtUser = new JTextField();
	JTextField txtPass = new JTextField();

	JButton btnOk = new JButton();
	JButton btnCancel=new JButton();

	public LoginDailog()
	{
		this.setTitle("Logon Screen");
		this.setBounds(250,200,300,200);
		this.getContentPane().setLayout(null);
		this.getContentPane().add(p1);
		//this.setDefaultCloseOperation(EXIT_ON_CLOSE); //NOt Used on Dialog
		this.setResizable(false);

		//---------Properties of Pannel----------
		p1.setLayout(null);
		p1.setBounds(10,10,272,150); //Column,Row, Width(on X Axis) Heaight on Y Axis
		p1.setBorder(BorderFactory.createTitledBorder("Enter UserName and Password"));
		p1.add(lblUser);p1.add(lblPass);
		p1.add(txtUser);p1.add(txtPass);
		p1.add(btnOk);p1.add(btnCancel);
		//---------------------------------------

		//---------Properties of Labels----------
		lblUser.setText("User Name:");
		lblUser.setBounds(20,30,100,20);

		lblPass.setText("Password:");
		lblPass.setBounds(20,60,100,20);
		//---------------------------------------

		//---------Properties of TextFields------
		txtUser.setBounds(130,30,120,20);
		txtUser.setCaretColor(Color.blue);//Blinking Cursor Color
		txtUser.setFont(new Font("Tahoma",1,12));//Font
		txtUser.setForeground(Color.blue);
		txtUser.setText("Guest");
		txtUser.setSelectionStart(0);
		txtUser.setSelectionEnd(5);

		txtPass.setBounds(130,60,120,20);
		txtPass.setCaretColor(Color.blue);//Blinking Cursor Color
		txtPass.setFont(new Font("Tahoma",1,12));//Font
		txtPass.setForeground(Color.blue);
		//---------------------------------------

		//---------Properties of Buttons---------
		btnOk.setText("Ok");
		btnOk.setBounds(40,105,80,25);
		btnOk.setMnemonic('O');
		btnOk.setBorder(BorderFactory.createRaisedBevelBorder());
		btnOk.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent x1)
			{
				JOptionPane.showMessageDialog(null,"Invalid user "+txtUser.getText(),"Title of Msg",JOptionPane.ERROR_MESSAGE);
			}
		});

		btnCancel.setText("Cancel");
		btnCancel.setBounds(150,105,80,25);
		btnCancel.setMnemonic('n');
		btnCancel.setBorder(BorderFactory.createRaisedBevelBorder());
		btnCancel.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent x2)
			{
				System.exit(0);
			}
		});

		//---------------------------------------


	}

	public static void main (String X[])
	{//Main
		LoginDailog obj = new LoginDailog();
		obj.setVisible(true);
	}//End Main
}