//13th August 2005 Focus Listener & Message Dailogs

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class myLogin extends JFrame
{//Class

	//Global Declerations...
	JPanel pnlMain = new JPanel();
	JPanel pnlFields = new JPanel();
	JPanel pnlButtons = new JPanel();

	JLabel lblUser = new JLabel();
	JLabel lblPass = new JLabel();

	JTextField txtUser = new JTextField();
	JPasswordField txtPass = new JPasswordField();

	JButton btnOk = new JButton();
	JButton btnCancel = new JButton();
	//----------------------

	public myLogin()
	{//Cons

		//Frame Properties...
		this.setTitle("Login");
		this.setLocation(200,100);
		this.setSize(new Dimension(325,200));
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.getContentPane().add(pnlMain);
		//--------------------

		//Properties of JPanel
		pnlMain.setLayout(null);
		pnlMain.add(pnlFields);
		pnlMain.add(pnlButtons);

		pnlFields.setLayout(null);
		pnlFields.setBounds(20,20,280,100);
		pnlFields.setBackground(new Color(128,128,128));
		pnlFields.setBorder(BorderFactory.createLineBorder(Color.black,2));
		pnlFields.add(lblUser);
		pnlFields.add(lblPass);
		pnlFields.add(txtUser);
		pnlFields.add(txtPass);

		pnlButtons.setLayout(null);
		pnlButtons.setBounds(137,130,163,27);
		//pnlButtons.setBorder(BorderFactory.createLineBorder(Color.black,2));
		pnlButtons.add(btnOk);
		pnlButtons.add(btnCancel);


		//Properties of Labels...
		lblUser.setText("User Name: ");
		lblUser.setFont(new Font("Verdana", 1, 12));
		lblUser.setBounds(10,20,100,25);
		lblUser.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUser.setBackground(Color.black);
		lblUser.setOpaque(true);
		lblUser.setForeground(Color.white);
		//lblUser.setBorder(BorderFactory.createLineBorder(Color.white));
		lblUser.setBorder(BorderFactory.createLineBorder(Color.white,2));//(Color.white,BorderThikness)

		lblPass.setText("Password: ");
		lblPass.setFont(new Font("Verdana", 1, 12));
		lblPass.setBounds(10,50,100,25);
		lblPass.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPass.setBackground(Color.black);
		lblPass.setOpaque(true);
		lblPass.setForeground(Color.white);
		lblPass.setBorder(BorderFactory.createLineBorder(Color.white,2));

		//Properties of TextFields...
		txtUser.setBounds(115,20,150,20);
		txtUser.setFont(new Font("Verdana", 1, 12));
		txtUser.addFocusListener(new FocusAdapter()
		{//FocusListener
			public void focusGained(FocusEvent f)
			{
				txtUser.selectAll();
			}
			public void focusLost(FocusEvent f)
			{}
		});//FocusListener

		txtPass.setBounds(115,50,150,20);
		txtPass.setFont(new Font("Verdana", 1, 12));
		txtPass.setEchoChar('^');
		txtPass.addFocusListener(new FocusAdapter()
		{//FocusListener
			public void focusGained(FocusEvent f)
			{
				txtPass.selectAll();
			}
			public void focusLost(FocusEvent f)
			{}
		});//FocusListener

		//Properties of JButtons...
		btnOk.setBounds(1,1,80,25);
		btnOk.setText("Ok");
		btnOk.addActionListener(new ActionListener()
		{//addActionListener
			public void actionPerformed(ActionEvent e)
			{//Action Performed
				userValidate();
			}//End Action Performed
		});//End addActionListener

		btnCancel.setBounds(82,1,80,25);
		btnCancel.setText("Cancel");
		btnCancel.addActionListener(new ActionListener()
		{//addActionListener
			public void actionPerformed(ActionEvent e)
			{//Action Performed

				int yn = JOptionPane.showConfirmDialog(null,"Are you Sure???");
				System.out.println(yn);

				if(yn==JOptionPane.YES_OPTION) //value 0
				{System.exit(0);}

				if(yn==JOptionPane.NO_OPTION) //Value 1
				{}

				if(yn==JOptionPane.CANCEL_OPTION) //Value 2
				{}

			}//End Action Performed
		});//End addActionListener
	}//End Cons

	public static void main (String args[])
	{//Main

		myLogin ml = new myLogin();
		ml.setVisible(true);

	}//End Main

	//User Defined Method
	private void userValidate()
	{//userValidate()
		String user = txtUser.getText();

		//getting password from field
		char p[] = txtPass.getPassword();//Password Field returns Cheracter Array so we put it into char array
		//we will get cheracter array from txtPass and put all those cheracters in a string
		String pass = String.valueOf(p);

		String UName = "Admin";
		String Pword = "ROSE";

		if(!user.equalsIgnoreCase(UName))//Username is not case sensitive but password is casesensitive
		{//If UserName is not correct...
			//System.out.println("Sorry, Invalid User!!!");

			JOptionPane.showMessageDialog(null,
			"Sorry, Invalid User Name !!!\n"+
			"Please Try Again",
			"Check User",
			JOptionPane.ERROR_MESSAGE,
			new ImageIcon("a.gif")
			); //JOptionPane.ERROR_MESSAGE has the int value 0

			txtUser.requestFocus();
		}
		else if(!pass.equals(Pword))
		{//If Password is not correct...
			//System.out.println("Sorry, Invalid Password!!!");
			JOptionPane.showMessageDialog(null,"Sorry, Invalid Password!!!");
			txtPass.requestFocus();
		}
		else
		{//If UserName and Password Both are correct...
			//System.out.println("Thank You...");
			JOptionPane.showMessageDialog(null,"Thank You...");
			System.exit(0);
		}
	}//userValidate()

}//End Class
/*
java.awt.event.FocusListener

public abstract void focusGained(java.awt.event.FocusEvent);
public abstract void focusLost(java.awt.event.FocusEvent);

Message Dailog
 	public static final int ERROR_MESSAGE; int Value 0
    public static final int INFORMATION_MESSAGE; int value 1
    public static final int WARNING_MESSAGE; int value 2
    public static final int QUESTION_MESSAGE; int value 3
    public static final int PLAIN_MESSAGE; int value -1

	3 overloaded methods of messagedailog,
	public static void showMessageDialog(java.awt.Component,java.lang.Object);
		throws java/awt/HeadlessException

	public static void showMessageDialog(java.awt.Component,java.lang.Object,java.lang.String,int);
       throws java/awt/HeadlessException

	public static void showMessageDialog(java.awt.Component,java.lang.Object,java.lang.String,int,javax.swing.Icon);
       throws java/awt/HeadlessException
*/