import java.awt.*;	//Make a File in C Drive Root which contains data Line by line Name Age Sex Tel
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
public class F extends JFrame implements ActionListener
{
	Container c;
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1=new JButton("Next");
	JButton b2=new JButton("Exit");
	File f;
	FileReader fr;
	BufferedReader br;
	public F()
	{
		c=getContentPane();
		c.setLayout(new FlowLayout());
		l1=new JLabel("Name");
		l2=new JLabel("Age");
		l3=new JLabel("Tel");
		t1=new JTextField(25);
		t2=new JTextField(25);
		t3=new JTextField(25);
		c.add(l1);
		c.add(t1);
		c.add(l2);
		c.add(t2);
		c.add(l3);
		c.add(t3);
		c.add(b1);
		c.add(b2);
		b1.addActionListener(this);

	try{
		f=new File("c:\\input.txt");
		fr=new FileReader(f);
		br=new BufferedReader(fr);
		t1.setText(br.readLine());
		t2.setText(br.readLine());
		t3.setText(br.readLine());

	}catch(Exception e){}

		setSize(300,200);
		setVisible(true);
	}//cons
	public static void main(String a[])
	{new F();}//main
	public void actionPerformed(ActionEvent e)
	{
		try{
		t1.setText(br.readLine());
		t2.setText(br.readLine());
		t3.setText(br.readLine());
	}catch(Exception f){}

	}//action
}// clxass