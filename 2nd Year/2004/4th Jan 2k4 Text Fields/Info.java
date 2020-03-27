//Java Class 4th Jan 2004 Text Field

import javax.swing.*;
import java.awt.*;

public class Info extends JFrame
{//Class
	JPanel p1 = new JPanel();

	JLabel l1 = new JLabel();
	JLabel l2 = new JLabel();
	JLabel l3 = new JLabel();

	JTextField t1 = new JTextField();
	JTextField t2 = new JTextField();
	JTextField t3 = new JTextField();

	public Info()
	{
		this.setTitle("Example of TextField");
		this.setBounds(200,100,400,400);
		this.getContentPane().setLayout(null);
		this.getContentPane().add(p1);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		//adding textboxes on panel
		p1.add(t1);p1.add(t2);p1.add(t3);

		//adding labels on panel
		p1.add(l1);p1.add(l2);p1.add(l3);

		//-----------Properties of Panel-----------
		p1.setLayout(null);
		p1.setBounds(30,30,340,310);
		p1.setBorder(BorderFactory.createLineBorder(Color.black,2));
		//-----------------------------------------------------------


		//-----------Properties of Labels-----------
		//Label1
		l1.setText("ID Number: ");
		l1.setBounds(20,20,120,20);//setBounds(column,row,width,height)
		l1.setBorder(BorderFactory.createLineBorder(Color.white,2));
		l1.setHorizontalAlignment(SwingConstants.RIGHT);

		l1.setOpaque(true);//To make the color of Label solid by default transparent
		l1.setBackground(Color.black);
		l1.setForeground(Color.white);
		l1.setFont(new Font("Tahoma",1,12));//Font


		//Label2
		l2.setText("Name: ");
		l2.setBounds(20,50,120,20);//setBounds(column,row,width,height)
		l2.setBorder(BorderFactory.createLineBorder(Color.white,2));
		l2.setHorizontalAlignment(SwingConstants.RIGHT);

		l2.setOpaque(true);//To make the color of Label solid by default transparent
		l2.setBackground(Color.black);
		l2.setForeground(Color.white);
		l2.setFont(new Font("Tahoma",1,12));//Font


		//Label3
		l3.setText("Phone: ");
		l3.setBounds(20,80,120,20);//setBounds(column,row,width,height)
		l3.setBorder(BorderFactory.createLineBorder(Color.white,2));
		l3.setHorizontalAlignment(SwingConstants.RIGHT);

		l3.setOpaque(true);//To make the color of Label solid by default transparent
		l3.setBackground(Color.black);
		l3.setForeground(Color.white);
		l3.setFont(new Font("Tahoma",1,12));//Font
		//-----------------------------------------------------------


		//-----------Properties of TextFields-----------
		//TextField 1 Last few Properties are different of every TextField
		t1.setText("N001080");
		t1.setBounds(160,20,140,20);
		t1.setBackground(Color.pink);
		t1.setForeground(Color.red);
		t1.setCaretColor(Color.white);//Blinking Cursor Color
		t1.setFont(new Font("Tahoma",1,12));//Font

		t1.setEditable(false); //Locked but u can select & copy
		t1.setHorizontalAlignment(SwingConstants.RIGHT);



		//TextField 2
		t2.setText("Adeel Ashraf");
		t2.setBounds(160,50,140,20);
		t2.setBackground(Color.pink);
		t2.setForeground(Color.red);
		t2.setCaretColor(Color.yellow);//Blinking Cursor Color
		t2.setFont(new Font("Tahoma",1,12));//Font

		t2.setEnabled(false); //Locked + Disabled no copy possible
		t2.setDisabledTextColor(Color.white);//Text Color was red but after disable the default color is gray, by this code we set new color.



		//TextField 3
		t3.setText("011094474");
		t3.setBounds(160,80,140,20);
		t3.setBackground(Color.pink);
		t3.setForeground(Color.red);
		t3.setCaretColor(Color.green);//Blinking Cursor Color

		t3.setFont(new Font("Tahoma",1,12));//Font
		t3.setSelectedTextColor(Color.yellow); //by default the selected text is white, by this we change it to green
		t3.setSelectionColor(Color.blue);//By default the selection color was light blue we change it to blue

		t3.setSelectionStart(3); //Selection Starting Point will work only if Ending Point used, otherwise when tab pressed will start from the Starting point specified.
		t3.setSelectionEnd(9); //Selection Ending Point
		//t3.requestFocus(); //This is not working, we will see later.

		//-----------------------------------------------------------

	}

	public static void main (String X[])
	{//Main
		Info obj = new Info();
		obj.setVisible(true);
	}//End Main

}//End Class