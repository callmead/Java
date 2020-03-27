import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Frame1
{
	JFrame frm1 = new JFrame("This is Frame One");

	JCheckBox chk1 = new JCheckBox("Chk1");
	boolean chkOne = false;

	JCheckBox chk2 = new JCheckBox("Chk2");
	boolean chkTwo = false;

	JCheckBox chk3 = new JCheckBox("Chk3");
	boolean chkThree = false;

	JCheckBox chk4 = new JCheckBox("Chk4");
	boolean chkFour = false;

	JCheckBox chk5 = new JCheckBox("Chk5");
	boolean chkFive = false;

	JButton btnClickMe = new JButton("Click Me");

	Container c;
	GridLayout layout = new GridLayout(6,2);

	Frame1()
	{
		frm1.setResizable(false);
		frm1.setSize(200,200);
		frm1.setDefaultCloseOperation(frm1.EXIT_ON_CLOSE);

		c = frm1.getContentPane();
		c.setLayout(layout);

		c.add(chk1);
		chk1.addItemListener(new Items());
		c.add(chk2);
		chk2.addItemListener(new Items());
		c.add(chk3);
		chk3.addItemListener(new Items());
		c.add(chk4);
		chk4.addItemListener(new Items());
		c.add(chk5);
		chk5.addItemListener(new Items());

		c.add(btnClickMe);
		btnClickMe.addActionListener(new DoIt());
		frm1.show();
	}

	class DoIt implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if (e.getSource()==btnClickMe)
			{
				//Frame2 tf = new Frame2(chk1,chk2,chk3,chk4,chk5);
			}
		}
	}

	class Items implements ItemListener
	{
		public void itemStateChanged(ItemEvent e)
		{
			if (e.getSource()==chk1)
			{
				System.out.println("Check box has been clicked ");
				chkOne = true;
			}
			if (e.getSource()==chk2)
			{
				System.out.println("Check box2 has been clicked");
				chkTwo = true;
			}
			if (e.getSource()==chk3)
			{
				System.out.println("Check box3 has been clicked");
				chkThree = true;
			}
			if (e.getSource()==chk4)
			{
				System.out.println("Check box4 has been clicked");
				chkFour = true;
			}
			if (e.getSource()==chk5)
			{
				System.out.println("Check box5 has been clicked");
				chkFive = true;
			}

		}
	}

	public static void main(String a[])
	{
		Frame1 f=new Frame1();
	}//main

}