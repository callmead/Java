import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class FrameTest4 implements ActionListener //interface
{
		JFrame frame=new JFrame();
		JLabel firstLabel=new JLabel("First Number        ");
		JTextField firstField=new JTextField(30);
		JLabel secondLabel=new JLabel("Second Number  ");
		JTextField secondField=new JTextField(30);
		JLabel resultLabel=new JLabel("Result                     ");
		JTextField resultField=new JTextField(30);
		JButton addButton=new JButton("Add");
		JButton subtractButton=new JButton("Subtract");
		JButton multiButton=new JButton("Multi");
		JButton divideButton=new JButton("Divide");
		JButton powerButton=new JButton("Power");
		JButton clearButton=new JButton("Clear");

public FrameTest4()
{
Container c=frame.getContentPane();

		c.setLayout(new FlowLayout());
		c.add(firstLabel);
		c.add(firstField);
		c.add(secondLabel);
		c.add(secondField);
		c.add(resultLabel);
		c.add(resultField);
		c.add(clearButton);
		clearButton.addActionListener(this);
		c.add(addButton);
		addButton.addActionListener(this);
    	c.add(subtractButton);
    	subtractButton.addActionListener(this);
    	c.add(multiButton);
    	multiButton.addActionListener(this);
    	c.add(divideButton);
		divideButton.addActionListener(this);
		c.add(powerButton);
		addButton.setMnemonic ('A');
		subtractButton.setMnemonic ('S');
		multiButton.setMnemonic ('M');
		divideButton.setMnemonic ('D');
		addButton.setToolTipText ("Addition");
		subtractButton.setToolTipText ("Substraction");
		multiButton.setToolTipText ("Multiplication");
		divideButton.setToolTipText ("Division");
		resultField.setEditable (false);
		powerButton.addActionListener(this);
		frame.setSize(510,170);
		frame.setLocation(300,300);
		frame.setTitle("Calculator");

	Toolkit tk=Toolkit.getDefaultToolkit();
	System.out.println(tk);
	Dimension d=tk.getScreenSize();
		frame.setLocation((d.width-335)/2,(d.height-300)/2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent ac)
	{
		try
		{
			int n1,n2;
				n1=Integer.parseInt(firstField.getText());
				n2=Integer.parseInt(secondField.getText());
			if(ac.getSource()==addButton)
					  {resultField.setText(" "+(n1+n2));}

			else if(ac.getSource()==subtractButton)
				{resultField.setText(""+(n1-n2));}

			else if(ac.getSource()==multiButton)
				{resultField.setText(""+(n1*n2));}

			else if(ac.getSource()==divideButton)
				{resultField.setText(""+(n1/n2));}
			else if(ac.getSource()==powerButton)
				{resultField.setText(""+(Math.pow(n1,n2)));}

			else if(ac.getSource()==clearButton)
			{
				firstField.setText("");
				secondField.setText("");
				resultField.setText("");
			}
		}
	catch(NumberFormatException nfe)
	{
		resultField.setText ("wrong input");
	}


	}
	public static void main(String args[])
        {FrameTest4 ft=new FrameTest4();}
   }
