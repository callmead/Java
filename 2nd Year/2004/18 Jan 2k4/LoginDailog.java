//Java 18th Jan 2004 Listeners Action Listener, KeyListener Window Listener

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;//for Action Listener
import javax.swing.border.*;//For Raised Bevel Border

//public class LoginDailog extends JDialog
public class LoginDailog extends JFrame //For WindowListener we changed it from JDialog to JFrame to see all the events

{//Class
	JPanel p1 = new JPanel();
	JLabel lblUser = new JLabel();
	JLabel lblPass = new JLabel();

	JTextField txtUser = new JTextField();
	JPasswordField txtPass = new JPasswordField();


	JButton btnOk = new JButton();
	JButton btnCancel=new JButton();

	public LoginDailog()
	{
		this.setTitle("Logon Screen");
		this.setBounds(250,200,300,200);
		this.getContentPane().setLayout(null);
		this.getContentPane().add(p1);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); //NOt Used on Dialog or we can use value this.setDefaultCloseOperation(3);
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

		//Adding Focus Listener to txtUser..
		txtUser.addFocusListener(new FocusAdapter()
		{//FosusListener
			public void focusGained(FocusEvent f)
			{//Select text
				txtUser.selectAll();
			}
			public void focusLost(FocusEvent f)
			{
			}
		});//End FocusListener

		//Adding Key Listener to txtUser..
		txtUser.addKeyListener(new KeyAdapter()
		{//Key Listener
			public void keyPressed(KeyEvent ke1)
			{
				if(ke1.getKeyCode()==KeyEvent.VK_ENTER) //If Enter is pressed then it will goto next thing working as tab keycode and ascii code is different
				   	ke1.setKeyCode(KeyEvent.VK_TAB);

				System.out.println(ke1.getKeyCode()); //Returning the Key Code, KeyCode and ASCII Code are different
			}
			public void KeyReleased(KeyEvent ke2)
			{

			}
			public void KeyTyped(KeyEvent ke3)
			{

			}
		});//End KeyListener


		txtPass.setBounds(130,60,120,20);

		txtPass.setEchoChar('@'); //Password Cheracter

		txtPass.setCaretColor(Color.blue);//Blinking Cursor Color
		txtPass.setFont(new Font("Tahoma",1,12));//Font
		txtPass.setForeground(Color.blue);

		//Adding Focus Listener..
		txtPass.addFocusListener(new FocusAdapter()
		{//FocusListener
			public void focusGained(FocusEvent f)
			{//Select text
				txtPass.selectAll();
			}
			public void focusLost(FocusEvent f)
			{
			}
		});//End FocusListener

		//Adding Key Listener to txtPass..
		txtPass.addKeyListener(new KeyAdapter()
		{//Key Listener
			public void keyPressed(KeyEvent ke1)
			{
				if(ke1.getKeyCode()==KeyEvent.VK_ENTER) //If Enter is pressed then it will goto next thing working as tab keycode and ascii code is different
				{
				   	ke1.setKeyCode(KeyEvent.VK_TAB);
				   	aaa();
				}

				System.out.println(ke1.getKeyCode()); //Returning the Key Code, KeyCode and ASCII Code are different

			}
			public void KeyReleased(KeyEvent ke1)
			{

			}
			public void KeyTyped(KeyEvent ke1)
			{

			}
		});//End KeyListener
		//---------------------------------------

		//---------Properties of Buttons---------
		btnOk.setText("Ok");
		btnOk.setBounds(40,105,80,25);
		btnOk.setMnemonic('O');
		btnOk.setBorder(BorderFactory.createRaisedBevelBorder());
		btnOk.addActionListener(new ActionListener()
		{//Action Listener
			public void actionPerformed(ActionEvent x1)
			{
				//if (!txtUser.getText().equals("adeel") && (txtPass.getText().equals("Diit")) //Comparing String Case Sensitive if not Case Sensitive then next line
		        aaa();//Method used see after main.
		    }
		});//End Action Listener

		btnCancel.setText("Cancel");
		btnCancel.setBounds(150,105,80,25);
		btnCancel.setMnemonic('n');
		btnCancel.setBorder(BorderFactory.createRaisedBevelBorder());
		btnCancel.addActionListener(new ActionListener()
		{//ActionListener
			public void actionPerformed(ActionEvent x2)
			{
				System.exit(0);
			}
		});//ActionListener

		//---------------------------------------

		this.addWindowListener(new WindowAdapter()
		{//Window Listener some events will not work with JDialog so we changed it back to JFrame
			public void windowOpened(WindowEvent e)
			{
				System.out.println("Opened");
			}
			public void windowActivated(WindowEvent e)
			{
				System.out.println("Activated");
			}
			public void windowClosed(WindowEvent e)
			{
				System.out.println("Closed");
			}
			public void windowDeactivated(WindowEvent e)
			{
				System.out.println("Deactivated");
			}
			public void windowDeiconified(WindowEvent e)
			{
				System.out.println("Deiconofied");
			}
			public void windowIconified(WindowEvent e)
			{
				System.out.println("Iconofied");
			}
			public void windowClosing(WindowEvent e)
			{
				System.out.println("Closing");
			}

		});//End Window Listener


	}//LoginDailog



	//-------------------------------------------------------------------
	public static void main (String X[])
	{//Main
		LoginDailog obj = new LoginDailog();
		obj.setVisible(true);
	}//End Main
	//-------------------------------------------------------------------


	void aaa()
	{//Method aaa
		//String comparison in below line
		if ((txtUser.getText().equalsIgnoreCase("adeel")) && (new String(txtPass.getPassword()).equals("Diit"))) //Comparing String not Case Sensitive * txtPass.getPassword is used because we used a password Field, if we use txtPass.getText() then it will show the warning Note: E:\Soft\Adeel\7th Jan 2k4\LoginDailog.java uses or overrides a deprecated API. Note: Recompile with -deprecation for details. getText returns string, and getPassword returns Cheracter array we have to convert it to String.
		{
			JOptionPane.showMessageDialog(null,"Welcome","Access Granted",1);
			txtUser.setText("");
			txtPass.setText("");

			//hide(); //Like Me.Hide, Hides current window. Hide can be shown quickly, it in just hiden not unloade from memory
			dispose(); //Like Unlaod Me, Dispose unloads it from memory
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Invalid user "+txtUser.getText(),"Title of Msg",JOptionPane.ERROR_MESSAGE);
			txtUser.requestFocus(); //like setFocus in vb
			txtUser.selectAll();//To select all text from txtUser
		}

	}//End aaa Method

}//End Class