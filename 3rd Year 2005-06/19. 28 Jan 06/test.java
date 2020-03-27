//28/1/06
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class test extends JFrame
{
	JTextField txtName = new JTextField();
	JTextField txtPhone = new JTextField();
	JTextField txtFees = new JTextField();

	JPanel pnlFields = new JPanel();


	public test()
	{//Cons
    	pnlFields.setBounds(0,0,300,300);
		txtName.setBounds(10,10,100,20);
		txtName.addKeyListener(new KeyAdapter()
		{
			public void keyTyped(KeyEvent ke)
			{
				System.out.println("ASCII VALUE of "+ke.getKeyChar()+" is "+(int)ke.getKeyChar());
				if(txtName.getText().length()>=10 && ke.getKeyChar()!=8){ke.consume();} //Max Length is 10
				if(ke.getKeyChar()>=48 && ke.getKeyChar()<=57){ke.consume();} //Alaphabets Allowed Only
			}
		});

		txtPhone.setBounds(10,30,100,20);
		txtPhone.addKeyListener(new KeyAdapter()
		{
			public void keyTyped(KeyEvent ke)
			{
				System.out.println("ASCII VALUE of "+ke.getKeyChar()+" is "+(int)ke.getKeyChar());
				if(txtPhone.getText().length()>=7 && ke.getKeyChar()!=8){ke.consume();} //Max Length is 10
				//if!((ke.getKeyChar()>=48 && ke.getKeyChar()<=57)){ke.consume();}//Except Alphabets
			}
		});
		txtFees.setBounds(10,50,100,20);
		txtFees.addKeyListener(new KeyAdapter()
		{
			public void keyTyped(KeyEvent ke)
			{
				System.out.println("ASCII VALUE of "+ke.getKeyChar()+" is "+(int)ke.getKeyChar());
				if(txtFees.getText().length()>=7 && ke.getKeyChar()!=8){ke.consume();} //Max Length is 10
				//if(ke.getKeyChar()>=48 && ke.getKeyChar()<=57 ke.getKeyChar()!=46){ke.consume();}
			}
		});

		pnlFields.setLayout(null);
		pnlFields.add(txtName);
		pnlFields.add(txtPhone);
		pnlFields.add(txtFees);

		this.setTitle("TEST");
		this.setSize(new Dimension(400, 400));
		this.getContentPane().setLayout(null);
		this.getContentPane().add(pnlFields);
	}//Cons

	public static void main(String x[])
	{//Main
		new test().setVisible(true);
	}//Main
}