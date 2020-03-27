import javax.swing.*; // Frame 2
import java.awt.*;
import java.awt.event.*;

public class Frame2
{
	JFrame frm1=new JFrame("Frame 2");

	JLabel lbl1;
	JCheckBox chk1;
	JCheckBox chk2;
	JCheckBox chk3;
	JCheckBox chk4;
	JCheckBox chk5;

	JButton btnExit=new JButton("Exit");

	Container c;
	GridLayout layout=new GridLayout(6,2);

	Frame2(boolean One,boolean Two,boolean Three,boolean Four,boolean Five)
	{
		//lbl1=new JLabel(s);
		chk1 = new JCheckBox("chk1",One);
		chk2 = new JCheckBox("chk2",Two);
		chk3 = new JCheckBox("chk3",Three);
		chk4 = new JCheckBox("chk4",Four);
		chk5 = new JCheckBox("chk5",Five);

		frm1.setResizable(false);//to Disable Maximize Button
		frm1.setSize(200,200);	 // Its Just outputting the Layout as one after another Just resize and then you will see
		frm1.setDefaultCloseOperation(frm1.EXIT_ON_CLOSE);

		c=frm1.getContentPane();
		c.setLayout(layout);

		c.add(chk1);
		c.add(chk2);
		c.add(chk3);
		c.add(chk4);
		c.add(chk5);


		//c.add(txt1);
		c.add(btnExit);

		btnExit.addActionListener(new DoIt());
		frm1.show();
	}


	//Class for the Action Listner
	class DoIt implements ActionListener
	{
	  	public void actionPerformed(ActionEvent e)
	  	{
	  		if (e.getSource()==btnExit)
	    	{
				System.exit(0);
	    	}
	   	}
	}
}
