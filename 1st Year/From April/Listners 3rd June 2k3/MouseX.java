//Example 3
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


class MouseX extends JFrame implements MouseListener
{
	Container co;

	public MouseX()
	{
		co=getContentPane();
		co.addMouseListener(this);

		co.setLayout(null);
		setSize(200,200);setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main (String x[])
	{
		MouseX a = new MouseX();
	}

		//Mouse Events *************************************
		public void mouseEntered(MouseEvent e)
		{
			System.out.println("Mouse Entered.....");
		}//
		public void mouseClicked(MouseEvent e)
		{
			System.out.println("Mouse Clicked...");

		}//
		public void mouseExited(MouseEvent e)
		{
			System.out.println("Mouse Exited.....");
		}//
		public void mousePressed(MouseEvent e)
		{
			System.out.println("Mouse Pressed.....");
		}//
		public void mouseReleased(MouseEvent e)
		{
				System.out.println("Mouse Released.....");
		}//
		//Mouse Events *************************************

}