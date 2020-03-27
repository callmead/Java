import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame
{
	JButton btnExit=new JButton();

	public MyFrame()
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
		this.setCursor(new Cursor(12));
		this.getContentPane().setLayout(null);
		this.getContentPane().add(btnExit);

		//Properties of JButton
		btnExit.setText("Exit");
		btnExit.setBounds(200,150,100,30);
		btnExit.setForeground(Color.blue);
		btnExit.setBackground(Color.black);
		btnExit.setMnemonic('x');
		btnExit.setFont(new Font("Verdana",3,20));


	}
	public static void main(String a[])
	{
		MyFrame obj = new MyFrame();
		obj.setVisible(true);
	}
}