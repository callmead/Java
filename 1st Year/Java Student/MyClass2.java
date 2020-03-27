import javax.swing.*;
import java.awt.*;
public class MyClass2
{
	public static void main(String args [])
	{
		TestFrame form1=new TestFrame();
	}
}
class TestFrame
{
	JFrame frm1=new JFrame("Test");
	JLabel lbl1=new JLabel ("Enter ur name");


	JTextField txt1=new JTextField(12);


	JButton btn1=new JButton("Click me");
	JButton btn2=new JButton("Exit");
	Container c;
	BorderLayout layout =new BorderLayout();
	TestFrame()
	{
		frm1.setResizable(false);
		frm1.setSize(400,400);
		//frm1.setDefaultCloseOpration(frm1.EXIT_ON_CLOSE);
		c=frm1.getContentPane();
		c.setLayout(layout);
		c.add(lbl1,"West");
		c.add(txt1,"Center");
		c.add(btn1,"North");
		c.add(btn2,"South");

		frm1.show();
	}

}