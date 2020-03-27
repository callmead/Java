import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class A extends JFrame implements ActionListener
{
	JButton b;
	JTextField t;
	Container co;
	public A()
	{
		co=getContentPane();
		b=new JButton("Button");
		t=new JTextField(20);
		co.setLayout(null);
		co.add(b);b.setBounds(20,20,80,20);b.addActionListener(this);//"this" means this class is ActionListener himself. This class is acting like Action Listener Means this class
		co.add(t);t.setBounds(20,50,80,20);t.addActionListener(this);
		setSize(200,200);setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent Matrix)
	{
		if (Matrix.getSource()==b)
		{
			JOptionPane.showMessageDialog(null,"Dont Click Me");
			System.out.println("Dont Press........");
		}
		if (Matrix.getSource()==t)
		{
			JOptionPane.showMessageDialog(null,"Dont Write Anything");
			System.out.println("Dont Write.........");
		}
	}
	public static void main (String x[])
	{
		A a = new A();
	}
}