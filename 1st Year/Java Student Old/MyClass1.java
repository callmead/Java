import javax.swing.*;
import java.awt.*;
public class MyClass1
{
	public static void main(String args [])
	{
		TestFrame form1=new TestFrame();
	}
}
class TestFrame
{
	JFrame frm1=new JFrame("Test");
	JLabel lbl1=new JLabel ("Name");
	JLabel lbl2=new JLabel ("Address");
	JLabel lbl3=new JLabel ("Phone");

	JTextField txt1=new JTextField(12);
	JTextField txt2=new JTextField(12);
	JTextField txt3=new JTextField(12);

	JButton btn1=new JButton("OK");
	JButton btn2=new JButton("Exit");
	Container c;
	FlowLayout layout =new FlowLayout();
	TestFrame()
	{
		frm1.setResizable(false);
		frm1.setSize(200,150);
		//frm1.setDefaultCloseOpration(frm1.EXIT_ON_CLOSE);
		c=frm1.getContentPane();
		c.setLayout(layout);
		layout.setAlignment(FlowLayout.LEFT);
		c.add(lbl1);
		c.add(txt1);
		c.add(lbl2);
		c.add(txt2);
		c.add(lbl3);
		c.add(txt3);
		c.add(btn1);
		c.add(btn2);

		frm1.show();
	}

}