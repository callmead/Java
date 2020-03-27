//Last Class Continued...ActionListeners Added to buttons

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class myLogin extends JFrame
{//Class

	//Global Declerations...
	JPanel pnlMain = new JPanel();
	JPanel pnlFields = new JPanel();
	JPanel pnlButtons = new JPanel();

	JLabel lblUser = new JLabel();
	JLabel lblPass = new JLabel();

	JTextField txtUser = new JTextField();
	JTextField txtPass = new JTextField();

	JButton btnOk = new JButton();
	JButton btnCancel = new JButton();
	//----------------------

	public myLogin()
	{//Cons

		//Frame Properties...
		this.setTitle("Login");
		this.setLocation(200,100);
		this.setSize(new Dimension(325,200));
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.getContentPane().add(pnlMain);
		//--------------------

		//Properties of JPanel
		pnlMain.setLayout(null);
		pnlMain.add(pnlFields);
		pnlMain.add(pnlButtons);

		pnlFields.setLayout(null);
		pnlFields.setBounds(20,20,280,100);
		pnlFields.setBackground(new Color(128,128,128));
		pnlFields.setBorder(BorderFactory.createLineBorder(Color.black,2));
		pnlFields.add(lblUser);
		pnlFields.add(lblPass);
		pnlFields.add(txtUser);
		pnlFields.add(txtPass);

		pnlButtons.setLayout(null);
		pnlButtons.setBounds(137,130,163,27);
		//pnlButtons.setBorder(BorderFactory.createLineBorder(Color.black,2));
		pnlButtons.add(btnOk);
		pnlButtons.add(btnCancel);


		//Properties of Labels...
		lblUser.setText("User Name: ");
		lblUser.setFont(new Font("Verdana", 1, 12));
		lblUser.setBounds(10,20,100,25);
		lblUser.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUser.setBackground(Color.black);
		lblUser.setOpaque(true);
		lblUser.setForeground(Color.white);
		//lblUser.setBorder(BorderFactory.createLineBorder(Color.white));
		lblUser.setBorder(BorderFactory.createLineBorder(Color.white,2));//(Color.white,BorderThikness)

		lblPass.setText("Password: ");
		lblPass.setFont(new Font("Verdana", 1, 12));
		lblPass.setBounds(10,50,100,25);
		lblPass.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPass.setBackground(Color.black);
		lblPass.setOpaque(true);
		lblPass.setForeground(Color.white);
		lblPass.setBorder(BorderFactory.createLineBorder(Color.white,2));

		//Properties of TextFields...
		txtUser.setBounds(115,20,150,20);
		txtUser.setFont(new Font("Verdana", 1, 12));

		txtPass.setBounds(115,50,150,20);
		txtPass.setFont(new Font("Verdana", 1, 12));


		//*******************************************************************************************************
		//CRYSTAL REPORT THING TO CALL FROM HERE USING OK BUTTON

		//Properties of JButtons...
		btnOk.setBounds(1,1,80,25);
		btnOk.setText("Ok");
		btnOk.addActionListener(new ActionListener()
		{//addActionListener
			public void actionPerformed(ActionEvent e)
			{//Action Performed

				//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
				//You just need to Edit this portion to use Crystal Report by only specifying
				//DNS Name and path of Crystal Report File
				//You will see OUTPUT_TO_WINDOW in executing the report which shows a report window
				//there are some other options as well which are bellow
				//public static final int OUTPUT_TO_PRINTER = 0;
				//public static final int OUTPUT_TO_WINDOW = 1;
				//public static final int OUTPUT_TO_HTML = 2;

				try
				{
					ConnectionSpecification cs = new ConnectionSpecification("MySQL_DNS");//Having DNS Name

					//Choice 1

					//There are 2 ways Either You show the report as it is by using the code below
					//Report.exec("C:\\SHMS\\Reports\\Billing",cs,Report.OUTPUT_TO_WINDOW,"",new String[] {""});
					Report.exec("Billing",cs,Report.OUTPUT_TO_WINDOW,"",new String[] {""});


					//Choice 2
					/*
					//Or you can pass a FROM & WHERE parameter to your report like in the code below
					//Getting the parameter Suppose ServiceID in an input box first
					String id = JOptionPane.showInputDialog(null,"Enter Service ID","ID Input",JOptionPane.INFORMATION_MESSAGE);
					//Then use it in the code see below
					Report.exec("Billing",cs,Report.OUTPUT_TO_WINDOW,"{Billing.ServiceID} = \""+id+"\"",new String[] {""});
					//There is another way if the ID is fixed suppose SID02 then it will be...
					Report.exec("Billing",cs,Report.OUTPUT_TO_WINDOW,"{Billing.ServiceID} = \"SID02\"",new String[] {""});
					*/

		        }
		        catch(Exception ex)
		        {System.out.println("Report Error: "+ex);}
		        //\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

			}//End Action Performed
		});//End addActionListener
		//*******************************************************************************************************

		btnCancel.setBounds(82,1,80,25);
		btnCancel.setText("Cancel");
		btnCancel.addActionListener(new ActionListener()
		{//addActionListener
			public void actionPerformed(ActionEvent e)
			{//Action Performed

				int yn = JOptionPane.showConfirmDialog(null,"Are you Sure???");
				System.out.println(yn);

				if(yn==JOptionPane.YES_OPTION) //value 0
				{System.exit(0);}

				if(yn==JOptionPane.NO_OPTION) //Value 1
				{}

				if(yn==JOptionPane.CANCEL_OPTION) //Value 2
				{}

			}//End Action Performed
		});//End addActionListener


	}//End Cons

	public static void main (String args[])
	{//Main

		myLogin ml = new myLogin();
		ml.setVisible(true);

	}//End Main

}//End Class

/*RUN--> Parameters--> javax.swing.JOptionPane
    public static int showConfirmDialog(java.awt.Component,java.lang.Object);
       throws java/awt/HeadlessException

    public static int showConfirmDialog(java.awt.Component,java.lang.Object,java.lang.String,int);
       throws java/awt/HeadlessException

    public static int showConfirmDialog(java.awt.Component,java.lang.Object,java.lang.String,int,int);
       throws java/awt/HeadlessException
*/