//Java Class on December 7th
import javax.swing.*;
import java.awt.*;
public class MyFrame extends JFrame
{//Class

	//Declerations
	JButton btnExit = new JButton();

	public MyFrame()
	{
		this.setTitle("Example of JFrame");
		this.setSize(400,400);
		this.setLocation(200,100);
		this.setBounds(200,100,400,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); //For not closing

		this.setResizable(false);									//not Resizeable

		//Window State below by default NORMAL
		//this.setState(Frame.ICONIFIED); 							//Minimized State
		//this.setState(Frame.NORMAL); 								//Normal State

		//Cursor on the Frame
		this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));			//Check Cursor		Value 0
		//this.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));		//CROSSHAIR Cursor	Value 1
		//this.setCursor(new Cursor(Cursor.TEXT_CURSOR));			//TEXT Cursor		Value 2
		//this.setCursor(new Cursor(Cursor.WAIT_CURSOR));			//WAIT Cursor		Value 3
		//this.setCursor(new Cursor(Cursor.SW_RESIZE_CURSOR));		//Check Cursor		Value 4
		//this.setCursor(new Cursor(Cursor.SE_RESIZE_CURSOR));		//Check Cursor		Value 5
		//this.setCursor(new Cursor(Cursor.NW_RESIZE_CURSOR));		//Check Cursor		Value 6
		//this.setCursor(new Cursor(Cursor.NE_RESIZE_CURSOR));		//Check Cursor		Value 7
		//this.setCursor(new Cursor(Cursor.N_RESIZE_CURSOR));		//Check Cursor		Value 8
		//this.setCursor(new Cursor(Cursor.S_RESIZE_CURSOR));		//Check Cursor		Value 9
		//this.setCursor(new Cursor(Cursor.W_RESIZE_CURSOR));		//Check Cursor		Value 10
		//this.setCursor(new Cursor(Cursor.E_RESIZE_CURSOR));		//Check Cursor		Value 11
		//this.setCursor(new Cursor(Cursor.HAND_CURSOR));			//Hand Cursor 		Value 12
		//this.setCursor(new Cursor(Cursor.MOVE_CURSOR));			//Move Cursor		Value 13

		//Or we can give Cursor's Value to change the Cursor like below
		//this.setCursor(new Cursor(12));							//Check Cursor		Value 9


		this.getContentPane().setBackground(new Color(255,180,56));

		//Adding BTN to ContentPane Using Border Layout
		//this.getContentPane().add(btnExit,BorderLayout.SOUTH);

		//Adding BTN to ContentPane Using Null Layout
		this.getContentPane().setLayout(null);
		this.getContentPane().add(btnExit);


		//BTN Properties
		btnExit.setText("Exit");
		btnExit.setBounds(200,150,100,30);//Only for Null Layout
		btnExit.setForeground(Color.white);
		btnExit.setBackground(Color.blue);
		btnExit.setMnemonic('x');

		btnExit.setFont(new Font("Verdana",Font.BOLD,12)); //(Font Name, Style, Size)
		//btnExit.setFont(new Font("Verdana",Font.BOLD+Font.ITALIC,10)); //Using 2 at a time
		//Font.BOLD 	Value 1
		//Font.ITALIC 	Value 2
		//Font.PLAIN	Value 0 Use like below BOLD+ITALIC Value is 3
		//btnExit.setFont(new Font("Verdana",0,10));


	}

	public static void main (String a[])
	{//Main

		MyFrame obj=new MyFrame();
		obj.setVisible(true);

	}//End Main

}//End Class