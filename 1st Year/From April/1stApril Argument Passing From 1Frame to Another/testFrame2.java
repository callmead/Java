import javax.swing.*; // Frame 2
import java.awt.*;
import java.awt.event.*;

public class testFrame2
{
	JFrame frm1=new JFrame("Frame 2");

	JLabel lbl1;

	JButton btnExit=new JButton("Exit");

	Container c;
	GridLayout layout=new GridLayout(2,2);


	testFrame2(String s)
	{
		lbl1=new JLabel(s);
		frm1.setResizable(false);//to Disable Maximize Button
		frm1.setSize(300,150);	 // Its Just outputting the Layout as one after another Just resize and then you will see
		frm1.setDefaultCloseOperation(frm1.EXIT_ON_CLOSE);

		c=frm1.getContentPane();
		c.setLayout(layout);

		c.add(lbl1);
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
