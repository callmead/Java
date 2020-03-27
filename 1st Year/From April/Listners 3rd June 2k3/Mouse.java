//Example 4
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


class Mouse extends JFrame implements MouseListener
{
	JButton b;
	JTextField t;
	Container co;

	public Mouse()
	{
		co=getContentPane();
		co.addMouseListener(this);
		b=new JButton("Button");
		t=new JTextField(20);
		b.addMouseListener(this);
		t.addMouseListener(this);

		co.setLayout(null);
		co.add(b);b.setBounds(20,20,80,20);
		co.add(t);t.setBounds(20,50,80,20);
		setSize(200,200);setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main (String x[])
	{
		Mouse a = new Mouse();
	}

		//Mouse Events *************************************
		public void mouseEntered(MouseEvent e)
		{
			System.out.println("Mouse Entered.....");

			if(e.getSource()==co)
			System.out.println("Mouse Entered..on container...");
			if(e.getSource()==b)
			System.out.println("Mouse Entered..on button...");
			if(e.getSource()==t)
			System.out.println("Mouse Entered..on textfiled...");

		}//
		public void mouseClicked(MouseEvent e)
		{
			System.out.println("Mouse Clicked.....");

			if(e.getSource()==co)
			System.out.println("Mouse Clicked..on container...");
			if(e.getSource()==b)
			System.out.println("Mouse Clicked..on button...");
			if(e.getSource()==t)
			System.out.println("Mouse Clicked..on textfiled...");
		}//
		public void mouseExited(MouseEvent e)
		{
			System.out.println("Mouse Exited.....");

			if(e.getSource()==co)
			System.out.println("Mouse Exited..from container...");
			if(e.getSource()==b)
			System.out.println("Mouse Exited..from button...");
			if(e.getSource()==t)
			System.out.println("Mouse Exited..from textfiled...");
		}//
		public void mousePressed(MouseEvent e)
		{
			System.out.println("Mouse Pressed.....");

			if(e.getSource()==co)
			System.out.println("Mouse Pressed on container...");
			if(e.getSource()==b)
			System.out.println("Mouse Pressed on button...");
			if(e.getSource()==t)
			System.out.println("Mouse Pressed on textfiled...");

		}//
		public void mouseReleased(MouseEvent e)
		{
			System.out.println("Mouse Released.....");

			if(e.getSource()==co)
			System.out.println("Mouse Released from container...");
			if(e.getSource()==b)
			System.out.println("Mouse Released from button...");
			if(e.getSource()==t)
			System.out.println("Mouse Released from textfiled...");

		}//
		//Mouse Events *************************************
}