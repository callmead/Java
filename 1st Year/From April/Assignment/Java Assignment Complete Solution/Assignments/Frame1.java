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
				Frame2 tf = new Frame2(chkOne,chkTwo,chkThree,chkFour,chkFive);
			}
		}
	}

	class Items implements ItemListener
	{
		public void itemStateChanged(ItemEvent e)
		{
			if(e.getItem()==chk1)
				{
					if(e.getStateChange()==ItemEvent.SELECTED)
					chkOne=true;
					else
					chkOne=false;
				}

				if(e.getItem()==chk2)
				{
					if(e.getStateChange()==ItemEvent.SELECTED)
					chkTwo=true;
					else
					chkTwo=false;
				}

				if(e.getItem()==chk3)
				{
					if(e.getStateChange()==ItemEvent.SELECTED)
					chkThree=true;
					else
					chkThree=false;
				}

				if(e.getItem()==chk4)
				{
					if(e.getStateChange()==ItemEvent.SELECTED)
					chkFour=true;
					else
					chkFour=false;
				}

				if(e.getItem()==chk5)
				{
					if(e.getStateChange()==ItemEvent.SELECTED)
					chkFive=true;
					else
					chkFive=false;
				}

		}
	}

	public static void main(String a[])
	{
		Frame1 f=new Frame1();
	}//main

}