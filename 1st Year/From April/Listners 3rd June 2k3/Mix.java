import java.awt.*;
import javax.swing.*;
import java.awt.event.*; //For Action Listening
class Mix extends JFrame implements ActionListener, MouseListener
{
	JButton b;
	JTextField t;
	Container co;

	public Mix()
	{
		co=getContentPane();
		b=new JButton("Button");
		t=new JTextField(20);
		co.setLayout(null);

		co.add(b);b.setBounds(20,20,80,20);
		co.add(t);t.setBounds(20,50,80,20);

		//"this" means this class is ActionListener himself. This class is acting like Action Listener Means this class
		//Action Listener
		b.addActionListener(this);
		t.addActionListener(this);

		//Mouse Listener
		co.addMouseListener(this);
		b.addMouseListener(this);
		t.addMouseListener(this);

		setSize(200,200);setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent Matrix)
	{
		if (Matrix.getSource()==b) //e.getSource Returns the Object on which the Event has been Performed
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


	public static void main (String x[])
	{
		System.out.println("Loading Frame........");
		Mix a = new Mix();
	}
}