import javax.swing.*;
import java.awt.event.*;

class Account extends JFrame implements ActionListener
{
	JLabel no = new JLabel("No.");
	JLabel name = new JLabel("Name");
	JLabel credit = new JLabel("Credit Limit.");
	JLabel balance = new JLabel("Balance");

	JButton save = new JButton("Save");
	JButton delete = new JButton("Delete");
	JButton statement = new JButton("Statement");
	JButton deposit = new JButton("Deposit");

	JTextField tno = new JTextField();
	JTextField tname = new JTextField();
	JTextField tcredit = new JTextField();
	JTextField tbalance = new JTextField();

	public Account()
	{
		setInterface();
	}
	public void setInterface()
	{
		getContentPane().setLayout(null);
		//for setting Label's bounds
		no.setBounds(50,100,65,30);
		name.setBounds(50,150,65,30);
		credit.setBounds(50,200,100,30);
		balance.setBounds(50,250,65,30);

		//for setting Command Buttons bounds
		save.setBounds(50,380,100,30);
		delete.setBounds(160,380,100,30);
		statement.setBounds(270,380,100,30);
		deposit.setBounds(380,380,100,30);

		//for setting textbox's bounds
		tno.setBounds(200,100,65,30);
		tname.setBounds(200,150,200,30);
		tcredit.setBounds(200,200,150,30);
		tbalance.setBounds(200,250,150,30);

		//for adding Labels on frame
		getContentPane().add(no);
		getContentPane().add(name);
		getContentPane().add(credit);
		getContentPane().add(balance);

		//for adding Command Buttons on frame
		getContentPane().add(save);
		save.setMnemonic('s');  //To Add a HotKey for Save
		getContentPane().add(delete);
		delete.setMnemonic('d');//To Add a HotKey for Save
		getContentPane().add(statement);
		statement.setMnemonic('t');//To Add a HotKey for Save
		getContentPane().add(deposit);
		deposit.setMnemonic('p');//To Add a HotKey for Save

		//for adding textbox on frame
		getContentPane().add(tno);
		getContentPane().add(tname);
		getContentPane().add(tcredit);
		getContentPane().add(tbalance);


		//for set the size of frame
		setSize(500,500);
		setVisible(true);

		save.addActionListener(this);
		delete.addActionListener(this);
		statement.addActionListener(this);
		deposit.addActionListener(this);


	}
	public void actionPerformed(ActionEvent ae)
	{
	if (ae.getSource()==statement) // if ae.getSource ()==Button Name and then Statement in next line
	new Statements ();
	if (ae.getSource()==deposit)
	setVisible(false); // to close the Form by deposit button work on it
	}
	public static void main(String args[])
	{

		Account account = new Account();
	}
}