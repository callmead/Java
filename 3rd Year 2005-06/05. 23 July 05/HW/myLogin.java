import javax.swing.*;
import java.awt.*;

public class myLogin extends JFrame
{//Class

	//Global Declerations...
	JLabel lblUser = new JLabel();
	JLabel lblPass = new JLabel();

	JTextField txtUser = new JTextField();
	JTextField txtPass = new JTextField();

	JPanel pnl = new JPanel();
	//----------------------

	public myLogin()
	{//Cons

		//Frame Properties...
		this.setTitle("Login");
		this.setBounds(320,300,335,200);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.getContentPane().setLayout(null);
		this.getContentPane().setBackground(Color.blue);
		//--------------------

		//Adding Pannel to Container...
		this.getContentPane().add(pnl);

		//Adding Components to Pannel...
		pnl.add(lblUser);
		pnl.add(lblPass);
		pnl.add(txtUser);
		pnl.add(txtPass);

		//Properties of Pannel...
		pnl.setBounds(05,05,320,159);
		pnl.setLayout(null);
		pnl.setBackground(Color.white);

		//Properties of Labels...
		lblUser.setText(" User");
		lblUser.setOpaque(false);
		lblUser.setFont(new Font("Verdana", 1, 12));
		lblUser.setBounds(30,40,90,25);

		lblPass.setText(" Password");
		lblPass.setOpaque(false);
		lblPass.setFont(new Font("Verdana", 1, 12));
		//lblPass.setBackground(Color.blue);
		lblPass.setBounds(30,70,90,25);

		//Properties of TextFields...
		txtUser.setBounds(150,40,140,25);
		txtUser.setFont(new Font("Verdana", 1, 12));

		txtPass.setBounds(150,70,140,25);
		txtPass.setFont(new Font("Verdana", 1, 12));


	}//End Cons

	public static void main (String args[])
	{//Main

		myLogin ml = new myLogin();
		ml.setVisible(true);

	}//End Main
}//End Class