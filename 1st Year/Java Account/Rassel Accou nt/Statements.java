import javax.swing.*;
import java.awt.event.*;
public class Statements extends JFrame
{
	String no;
	String name;
	String output= "No \t Name \t Credit \t Balance";
	double credit;
	double balance;

	JLabel lblTitle =new JLabel("Statements Report");
	JTextArea txtArea =new JTextArea();
	JButton btnClose = new JButton("Close");
	public Statements ()//Constructor
	{
		setInterface();
	}

public Statements (String no,String name,double balance,double credit)
{
	this.no=no;
	this.name=name;
	this.credit=credit;
	this.balance=balance;
	setInterface();
	showData();
}
public void showData()
{
	output+=no+"\t"+name+"\t"+credit+"\t"+balance;
	txtArea.append(output);
}
public void setInterface()
{
	getContentPane().setLayout(null);



	lblTitle.setBounds(125,10,200,30);
	txtArea.setBounds(10,40,450,315);
	btnClose.setBounds(130,360,100,30);

	getContentPane().add(lblTitle);
	getContentPane().add(txtArea);
	getContentPane().add(btnClose);

	setSize(500,500);
	setVisible(true);
}
public static void main(String args[])
{
	Statements statements =new Statements();
}
}