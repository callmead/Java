//import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Account extends JFrame implements ActionListener
{
	//JLabel no = new JLabel("No");
	JButton save = new JButton("Save");
	JButton delete = new JButton("Delete");
	JButton statement = new JButton("Statement");
	JButton deposit = new JButton("Deposit");
	public Account()
	{
		setInterface();
	}
	public void setInterface()
	{
		getContentPane().setLayout(null);

		//no.setBounds(50,100,65,30);
		save.setBounds(50,380,65,30);
		delete.setBounds(160,380,65,30);
		statement.setBounds(270,380,65,30);
		deposit.setBounds(380,380,65,30);

		//getContentPane().add(no);
		getContentPane().add(save);
		getContentPane().add(delete);
		getContentPane().add(statement);
		getContentPane().add(deposit);

		setSize(500,500);
		setVisible(true);

		//no.setToolTipText(this);
		save.addActionListener(this);
		delete.addActionListener(this);
		statement.addActionListener(this);
		deposit.addActionListener(this);

	}
	public void actionPerformed(ActionEvent ae)
	{
		/*if(ae.getSource() == click)
		JOptionPane.showMessageDialog(null,"Click Button");
		else
		System.exit(0);*/
	}
	public static void main(String args[])
	{

		Account account = new Account();
	}
}