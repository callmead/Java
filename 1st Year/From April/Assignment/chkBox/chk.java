import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class chk extends JFrame implements ItemListener,ActionListener
{
	JCheckBox chk=new JCheckBox();
	JButton b=new JButton("ok");
	boolean c1=false;
	public chk()
	{
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(chk);
		chk.addItemListener(this);
		b.addActionListener(this);
		getContentPane().add(b);
		setSize(400,400);
		show();
	}//cons
	public void itemStateChanged(ItemEvent e)
	{
		if(e.getItem()==chk)
			if(e.getStateChange()==ItemEvent.SELECTED)
			c1=true;
			else
			c1=false;
	}
	public void actionPerformed(ActionEvent e)
	{
		if(c1)
		System.out.println("Checked");
		else
		System.out.println("Unchecked");
	}//
	public static void main(String a[])
	{
		new chk();

	}//main
}