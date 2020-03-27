import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class frmLogOn extends JFrame
{
	JPanel p1=new JPanel();
	JButton btnOk=new JButton("OK");
	JButton btnExit=new JButton("Cancel");
	JTextField txtUser=new JTextField();
	JPasswordField txtPass=new JPasswordField();
	JLabel lbluserName=new JLabel("User Name");
	JLabel lblPassWord=new JLabel("Password");
	Color bg,fg,lbg;

	public frmLogOn()
	{
		this.setTitle("PassWord");
		this.setBounds(200,200,450,280);
		this.setDefaultCloseOperation(3);
		this.setVisible(true);
		this.setResizable(false);
		this.getContentPane().setLayout(null);
		this.getContentPane().add(p1);

		//======== Label=========

		lbg=lbluserName.getBackground();

		//============panal=================
		p1.setLayout(null);
		p1.setBounds(50,30,350,180);
		p1.setBorder(BorderFactory.createTitledBorder("Enter user name & Password"));

		//============Add Component in the panel ==========

		p1.add(lbluserName);
		p1.add(lblPassWord);
		p1.add(txtUser);
		p1.add(txtPass);
		p1.add(lblPassWord);
		p1.add(btnOk);
		p1.add(btnExit);

		//============label==============
		lbluserName.setBounds(40,50,70,25);
		lbluserName.setForeground(Color.blue);
		lblPassWord.setBounds(40,80,70,25);
		lblPassWord.setForeground(Color.blue);

		//========textfield==============
		txtUser.setBounds(120,50,150,25);
		txtUser.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e)
			{
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				e.setKeyCode(KeyEvent.VK_TAB);

			}
			public void keyReleased(KeyEvent e)
			{

			}
			public void keyTyped(KeyEvent e)
			{

			}

});
		txtPass.setBounds(120,80,150,25);
		txtPass.setEchoChar('*');
		txtPass.addKeyListener(new KeyAdapter(){
					public void keyPressed(KeyEvent e)
					{
						if(e.getKeyCode()==KeyEvent.VK_ENTER)
						e.setKeyCode(KeyEvent.VK_TAB);

					}
					public void keyReleased(KeyEvent e)
					{

					}
					public void keyTyped(KeyEvent e)
					{

					}

});

		//===========Properties Of Button Cancel===============

		btnExit.setBounds(198,130,75,30);
		btnExit.setToolTipText("Close Window");
		btnExit.setBorder(BorderFactory.createRaisedBevelBorder());
		btnExit.setMnemonic('C');

		//===========Properties Of Button Ok===============
		bg=btnOk.getBackground();
		fg=btnOk.getForeground();
		btnOk.setBounds(120,130,75,30);
		btnOk.setToolTipText("Confirm P/W");
		btnOk.setBorder(BorderFactory.createRaisedBevelBorder());
		btnOk.setMnemonic('O');
		btnOk.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e)
			{
				btnOk.setBackground(Color.yellow);
			}
			public void mouseEntered(MouseEvent e)
						{
							btnOk.setBackground(Color.yellow);
							btnOk.setForeground(Color.white);

						}
			public void mouseExited(MouseEvent e)
						{
							btnOk.setBackground(bg);
							btnOk.setForeground(fg);

						}


		});

		btnOk.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ev)
			{
				if(txtUser.getText().equalsIgnoreCase("Ruhul") && String.valueOf(txtPass.getPassword()).equals("r"))
				{
					JOptionPane.showMessageDialog(null,"Thank You");
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Wrong Password","Warning",2);
				}
			}
		});

		btnExit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ev)
			{
				if(JOptionPane.showConfirmDialog(null,"Do You Want to Exit ?","Exit Information",JOptionPane.YES_NO_OPTION)==0)
				{
				System.exit(0);
			}



			}
		});


	}

	public static void main(String m[])
	{
		frmLogOn logon=new frmLogOn();
		logon.setVisible(true);
	}
}