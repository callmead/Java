import javax.swing.*;
import java.awt.*;
import java.awt.event.*; // For All Event Handling Classes


public class TestFrame
{
	public static void main (String args[])
	{
		MyFrame frm1=new MyFrame();
	}
}

class MyFrame
{
	String str1= new String(); //to get the String from the TextBox
	Icon MyIcon = new ImageIcon ("icon.gif");

	JFrame frm =new JFrame ("This is a test");
	JLabel lbl1=new JLabel ("Label with test");
	JButton btn1 = new JButton ("ok");
	JButton btnExit = new JButton ("Exit");
	JTextField txt1 = new JTextField (20); //20 Cheracters
	Container c;

	MyFrame()

	{
		frm.setSize(400,400);
		lbl1.setIcon(MyIcon);
		frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
		c=frm.getContentPane();
		c.setLayout (new FlowLayout());
		c.add(lbl1);
		c.add(txt1);
		c.add(btn1);
		c.add(btnExit);

		btn1.addActionListener(new DoIt());//to Add DoIt Event Making Button Active
		btnExit.addActionListener(new DoIt()); //to Add the Exit Button's Event on Form

		frm.show();
	}

	class DoIt implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if (e.getSource()==btn1)
				{
				JOptionPane.showMessageDialog(null,"You Checked on ok");
				str1 = txt1.getText();
				JOptionPane.showMessageDialog(null,"Your Text is \" "+str1+"\"");
				}
			if (e.getSource()==btnExit)
				{
				JOptionPane.showMessageDialog(null,"Thank You And Good Bye");
				System.exit(0);
				}
		}
	}
}
