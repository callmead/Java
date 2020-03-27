import javax.swing.*;
import java.awt.event.*;

class Account extends JFrame implements ActionListener
{
	String no;
	String name;
	double balance;
	double credit;

	JLabel lblno = new JLabel("No.");
	JLabel lblname = new JLabel("Name");
	JLabel lblcredit = new JLabel("Credit Limit.");
	JLabel lblbalance = new JLabel("Balance");

	JButton btnsave = new JButton("Save");
	JButton btndelete = new JButton("Delete");
	JButton btnstatement = new JButton("Statement");
	JButton btndeposit = new JButton("Deposit");

	JTextField txtno = new JTextField();
	JTextField txtname = new JTextField();
	JTextField txtcredit = new JTextField();
	JTextField txtbalance = new JTextField();

	public Account()
	{
		setInterface();
	}
	public void setInterface()
	{
		getContentPane().setLayout(null);

		//for setting label's bounds
		lblno.setBounds(40,10,65,30);
		lblname.setBounds(40,45,65,30);
		lblcredit.setBounds(40,80,100,30);
		lblbalance.setBounds(40,120,65,30);

		//for setting commandbutton's bounds
		btnsave.setBounds(30,200,100,30);
		btnsave.setMnemonic('s');
		btndelete.setBounds(140,200,100,30);
		btndelete.setMnemonic('d');
		btnstatement.setBounds(250,200,100,30);
		btnstatement.setMnemonic('t');
		btndeposit.setBounds(360,200,100,30);
		btndeposit.setMnemonic('p');

		//for setting textbox's bounds
		txtno.setBounds(150,10,95,25);
		txtname.setBounds(150,45,165,25);
		txtcredit.setBounds(150,80,95,25);
		txtbalance.setBounds(150,120,95,25);

		//for adding commandbutton on frame
		getContentPane().add(lblno);
		getContentPane().add(lblname);
		getContentPane().add(lblcredit);
		getContentPane().add(lblbalance);

		//for adding label on frame
		getContentPane().add(btnsave);
		getContentPane().add(btndelete);
		getContentPane().add(btnstatement);
		getContentPane().add(btndeposit);

		//for adding textbox on frame
		getContentPane().add(txtno);
		getContentPane().add(txtname);
		getContentPane().add(txtcredit);
		getContentPane().add(txtbalance);


		//for set the size of frame
		setSize(500,300);
		setVisible(true);

		btnsave.addActionListener(this);
		btndelete.addActionListener(this);
		btnstatement.addActionListener(this);
		btndeposit.addActionListener(this);

		/*tno.addActionListener(this);
		tnane.addActionListener(this);
		tcredit.addActionListener(this);
		tbalance.addActionListener(this);*/

	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btnsave)
		{
		  //JOptionPane.showMessageDialog(null," Its a save button");
		}
		if(ae.getSource()==btndelete)
		{
			//JOptionPane.showMessageDialog(null," Its a Delet button");
		}
		if(ae.getSource()==btnstatement)
		{
		   //JOptionPane.showMessageDialog(null," Its a Delet button");
		   new Statements(no,name,balance,credit);
		}

	}
	public void getData()
	{
		no=txtno.getText();
		name=txtname.getText();
		credit=Double.parseDouble(txtcredit.getText());
		balance=Double.parseDouble(txtbalance.getText());


	}
	public static void main(String args[])
	{
		Account account = new Account();
	}
}