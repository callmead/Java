import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TestFrame
{
	public static void main (String args[])
	{
		FrameClass Test=new FrameClass();

	}
}
class FrameClass
{
	JFrame form1=new JFrame ("Test");//Caption of the Frame.
	FrameClass()
	{
		form1.setDefaultCloseOperation(form1.EXIT_ON_CLOSE);//For Standerd Exit.
		form1.setSize(1000,400);//Size of Frame Width and hight
		form1.show();
	}

}