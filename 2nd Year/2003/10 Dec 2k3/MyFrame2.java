//10th December 2003
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; //ActionListener

public class MyFrame2 extends JFrame
{
	JButton btnExit=new JButton();
	JButton btnClick=new JButton();

	public MyFrame2()
	{
		this.setTitle("Example of JFrame");
		this.setSize(400,400);
		this.setLocation(200,100);
		this.setBounds(200,100,400,300);

		//this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setBackground(new Color(100,100,100));
		this.setResizable(false);

		//this.setState(Frame.ICONIFIED);
		this.setState(Frame.NORMAL);
		this.setCursor(new Cursor(0));
		this.getContentPane().setLayout(null);
		this.getContentPane().add(btnExit);
		this.getContentPane().add(btnClick);

		this.setIconImage(Toolkit.getDefaultToolkit().getImage("customers.GIF")); //Change Frame's Icon


		//Properties of JButton
		btnExit.setText("Exit");
		btnClick.setText("Click");

		btnExit.setBounds(80,100,110,50);
		btnClick.setBounds(200,100,110,50);

		btnExit.setForeground(Color.blue);
		btnClick.setForeground(Color.blue);

		btnExit.setBackground(Color.black);
		btnClick.setBackground(Color.black);

		btnExit.setMnemonic('x');
		btnClick.setMnemonic('c');

		btnExit.setFont(new Font("Verdana",3,10));
		btnClick.setFont(new Font("Verdana",3,10));

		btnExit.setToolTipText("Click Me 4 Exit"); 	//Tooltip Text
		btnClick.setToolTipText("Click");

		btnExit.setCursor(new Cursor(12));			//Setting Cursor for button
		btnClick.setCursor(new Cursor(12));

		btnExit.setIcon(new ImageIcon("customers.GIF"));
		btnClick.setIcon(new ImageIcon("customers.GIF"));


		//Adding Action to Button btnExit
		btnExit.addActionListener(new ActionListener()

		{
			public void actionPerformed (ActionEvent x)
			{
				//JOptionPane.showMessageDialog(null,"Good Bye Msg 1"); //Simple Message
				//JOptionPane.showMessageDialog(null,"Good Bye Msg 2","Title of Msg",JOptionPane.ERROR_MESSAGE); 		//Error Icon Message
				//or JOptionPane.showMessageDialog(null,"Good Bye Msg 2","Title of Msg",0); 							//Error Icon Message

				//JOptionPane.showMessageDialog(null,"Good Bye Msg 2","Title of Msg",JOptionPane.INFORMATION_MESSAGE); 	//Default Message
				//or JOptionPane.showMessageDialog(null,"Good Bye Msg 2","Title of Msg",1); 							//Default Message

				//JOptionPane.showMessageDialog(null,"Good Bye Msg 2","Title of Msg",JOptionPane.WARNING_MESSAGE); 		//WArning Message
				//or JOptionPane.showMessageDialog(null,"Good Bye Msg 2","Title of Msg",2); 							//WArning Message

				//JOptionPane.showMessageDialog(null,"Good Bye Msg 2","Title of Msg",JOptionPane.QUESTION_MESSAGE); 	//WArning Message
				//or JOptionPane.showMessageDialog(null,"Good Bye Msg 2","Title of Msg",3); 							//Question Message

				//JOptionPane.showMessageDialog(null,"Good Bye Msg 2","Title of Msg",JOptionPane.PLAIN_MESSAGE); 		//No Icon in Message
				//JOptionPane.showMessageDialog(null,"Good Bye Msg 2","Title of Msg",-1); 								//No Icon in Message

				JOptionPane.showMessageDialog(null,"Good Bye Msg 2","Title of Msg",-1, new ImageIcon("customers.GIF"));	//Adding Image with MsgBoxNo


				System.exit(0);
			}
		});

		//Adding Action to Button btnExit
		btnClick.addActionListener(new ActionListener()

		{
			public void actionPerformed (ActionEvent y)
			{
				//JOptionPane.showMessageDialog(null,"Good Bye Msg 1"); //Simple Message
				//JOptionPane.showMessageDialog(null,"Good Bye Msg 2","Title of Msg",JOptionPane.ERROR_MESSAGE); 		//Error Icon Message
				//or JOptionPane.showMessageDialog(null,"Good Bye Msg 2","Title of Msg",0); 							//Error Icon Message

				//JOptionPane.showMessageDialog(null,"Good Bye Msg 2","Title of Msg",JOptionPane.INFORMATION_MESSAGE); 	//Default Message
				//or JOptionPane.showMessageDialog(null,"Good Bye Msg 2","Title of Msg",1); 							//Default Message

				//JOptionPane.showMessageDialog(null,"Good Bye Msg 2","Title of Msg",JOptionPane.WARNING_MESSAGE); 		//WArning Message
				//or JOptionPane.showMessageDialog(null,"Good Bye Msg 2","Title of Msg",2); 							//WArning Message

				//JOptionPane.showMessageDialog(null,"Good Bye Msg 2","Title of Msg",JOptionPane.QUESTION_MESSAGE); 	//WArning Message
				//or JOptionPane.showMessageDialog(null,"Good Bye Msg 2","Title of Msg",3); 							//Question Message

				//JOptionPane.showMessageDialog(null,"Good Bye Msg 2","Title of Msg",JOptionPane.PLAIN_MESSAGE); 		//No Icon in Message
				//JOptionPane.showMessageDialog(null,"Good Bye Msg 2","Title of Msg",-1); 								//No Icon in Message

				JOptionPane.showMessageDialog(null,"Clicking BTN Click","Title of Msg",-1, new ImageIcon("customers.GIF"));	//Adding Image with MsgBoxNo


				System.exit(0);
			}
		});


	}
	public static void main(String a[])
	{
		MyFrame2 obj = new MyFrame2();
		obj.setVisible(true);
	}
}