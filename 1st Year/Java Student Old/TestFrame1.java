import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TestFrame1
{
	public static void main (String args[])
	{
		FrameClass Test=new FrameClass();

	}
}
class FrameClass
{
	JFrame form1=new JFrame ("Test");//Caption of the Frame.
	JButton btn1=new JButton("Click here");
	JLabel lbl1=new JLabel("Enter ur Name");
	JTextField txt1=new JTextField();
	Container c;
	FrameClass()
	{
		form1.setDefaultCloseOperation(form1.EXIT_ON_CLOSE);//For Standerd Exit.
		form1.setSize(200,200);//Size of Frame Width and hight
		c=form1.getContentPane();
		c.setLayout(new BorderLayout());
		c.add(btn1,"South");
		c.add(lbl1,"North");
		c.add(txt1,"Center");
		form1.show();
	}

}