//Java class 11th Feb 04 Text Box Multiline
import java.awt.*; //BOrder
import java.awt.event.*;//ActionListener
import javax.swing.*;

public class MultiLine extends JFrame
{
	JTextArea ta = new JTextArea();
	JButton b = new JButton();
	JScrollPane sp = new JScrollPane();

	public MultiLine()
	{
		this.setTitle("Example of TextArea");
		this.setBounds(200,100,400,400);
		this.setResizable(false);
		this.setDefaultCloseOperation(3);
		this.getContentPane().setLayout(null);
		//this.getContentPane().add(ta);
		this.getContentPane().add(sp);
		this.getContentPane().add(b);


		//--------Properties of ScrollPane--------
		sp.setBounds(25,25,350,300);
		sp.setBorder(BorderFactory.createLineBorder(Color.blue));
		sp.getViewport().add(ta);//Viewpoint is the area which is between the scrollers to we just add our text area to view point thats it
		//----------------------------------------

		//--------Properties of TextArea----------
		ta.setForeground(Color.blue);
		ta.setLineWrap(true);//To Fix line horizontal limit auto goto next line
		ta.setWrapStyleWord(true);//Bringing the word to next line if its not being fit at the end
		//Locking Text Area.
		//ta.setEditable(false);//This will not let it write anything like locked in vb by default its locked.
		//ta.setText("This is a TextArea.This is a TextArea.This is a TextArea.This is a TextArea.This is a TextArea.This is a TextArea.This is a TextArea.This is a TextArea.This is a TextArea.This is a TextArea.This is a TextArea.This is a TextArea.This is a TextArea.This is a TextArea.This is a TextArea.This is a TextArea.This is a TextArea.This is a TextArea.This is a TextArea.This is a TextArea.");

		//----------------------------------------

		//--------Properties of JButton-----------
		b.setBounds(275,335,100,30);
		b.setText("Close");

		b.addActionListener(new ActionListener()
		{//Action Listener
			public void actionPerformed(ActionEvent x1)
			{
				System.exit(0);
		    }
		});//End Action Listener


		//----------------------------------------
	}

	public static void main (String a[])
	{
		MultiLine x = new MultiLine();
		x.setVisible(true);
	}
}