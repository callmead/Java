import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame
{
	JButton btnExit = new JButton();
	//JPanel panel = new JPanel();

	public MyFrame()
	{
		this.setTitle("Example Of JFrame.");//setTitle
		this.setSize(400,300);//setsize(width,hight)
		this.setLocation(200,100);//setLocation(column,row)
		this.setBounds(200,100,400,300);//setBounce(col,row,wid,hig)
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBackground(Color.cyan);
		this.getContentPane().setBackground(new Color(255,180,56));
		//this.setResizable(false);
		this.setState(Frame.ICONIFIED);
		this.setCursor(new Cursor(Cursor.E_RESIZE_CURSOR));
		btnExit.setText("Exit");
		btnExit.setBounds(200,150,100,30);
		btnExit.setBackground(Color.BLACK);
		btnExit.setForeground(Color.WHITE);
		btnExit.setMnemonic('E');
		//btnExit.setFont(new Font("FontName",Font.style,size));
		btnExit.setFont(new Font("arial",Font.BOLD + Font.ITALIC,11));
		this.getContentPane().setLayout(null);
		this.getContentPane().add(btnExit);
		//panel.add(btnExit);
		//OptionaL this method disbaled the close button
		//this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

	}//end of constructor
	public static void main(String args[])
	{
		MyFrame obj=new MyFrame();
		obj.setVisible(true);
	}//end of main
}//end of class