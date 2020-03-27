import javax.swing.*;
import java.awt.event.*;
public class Statements extends JFrame
{
	JTextArea txtArea = new JTextArea();
	JButton btnClose = new JButton("Close");
	JLabel lblTitle = new JLabel("-----=== Statement Report ===-----");

	public Statements ()
	{
		setInterface();
	}
	public void setInterface()
	{
		getContentPane().setLayout(null);
		lblTitle.setBounds(50,15,200,30);
		txtArea.setBounds(45,40,200,200);
		btnClose.setBounds(90,250,100,30);


		getContentPane().add(lblTitle);
		getContentPane().add(txtArea);
		getContentPane().add(btnClose);
		btnClose.setMnemonic('c');  //To Add a HotKey for Save
		setSize(500,500);
		setVisible(true);

		/*getContentPane().setLayout(null);

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
		deposit.addActionListener(this); */



	}
	public static void main(String args[])
	{

		Statements statements = new Statements();
	}
}


