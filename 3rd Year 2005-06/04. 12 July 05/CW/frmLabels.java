//12 July 2005 Label Continued...

import javax.swing.*;
import java.awt.*;

public class frmLabels extends JFrame
{//Class

	//Global Objects
	JLabel lblRed = new JLabel();
	JLabel lblBlue = new JLabel();
	JLabel lblGreen = new JLabel();
	JLabel lblYellow = new JLabel();



	public frmLabels()
	{//Cons
		//Properties of JFrame...
		this.setTitle("Example of Label");
		this.setLocation(200,100);
		this.setSize(new Dimension(500,400));
		this.getContentPane().setBackground(Color.white);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		//this.getContentPane().setLayout(new BorderLayout()); //BorderLayout
		//this.getContentPane().add(lblRed,BorderLayout.SOUTH);//BorderLayout

		//this.getContentPane().setLayout(new FlowLayout()); //FlowLayout
		this.getContentPane().setLayout(null);//Null Layout
		this.getContentPane().add(lblRed);
		this.getContentPane().add(lblBlue);
		this.getContentPane().add(lblGreen);
		this.getContentPane().add(lblYellow);
		//------------------------

		//Properties of JLabel...
		lblRed.setText(" Red");
		lblRed.setOpaque(true);
		lblRed.setBackground(Color.red);
		lblRed.setForeground(Color.white);

		lblRed.setFont(new Font("Verdana", 3, 36)); //Font.BOLD have int value 1
		lblRed.setToolTipText("RED RED RED RED RED RED RED RED RED RED RED RED RED RED RED RED");
		//lblRed.setCursor(new Cursor(Cursor.HAND_CURSOR));//Check the Cursor.txt File
		lblRed.setCursor(new Cursor(12));
		lblRed.setBounds(5,5,150,50);//(Left,Top,Width,Height)

		lblBlue.setText(" Blue");
		lblBlue.setOpaque(true);
		lblBlue.setBackground(Color.blue);
		lblBlue.setForeground(Color.white);
		lblBlue.setFont(new Font("Verdana", 3, 36));
		lblBlue.setToolTipText("BLUE BLUE BLUE BLUE BLUE BLUE BLUE BLUE BLUE BLUE BLUE BLUE BLUE");
		lblBlue.setCursor(new Cursor(12));
		lblBlue.setBounds(160,5,150,50);//(Left,Top,Width,Height)

		lblGreen.setText(" Green");
		lblGreen.setOpaque(true);
		lblGreen.setBackground(Color.green);
		lblGreen.setForeground(Color.black);
		lblGreen.setFont(new Font("Verdana", 3, 36));
		lblGreen.setToolTipText("GREEN GREEN GREEN GREEN GREEN GREEN GREEN GREEN GREEN GREEN GREEN");
		lblGreen.setCursor(new Cursor(12));
		lblGreen.setBounds(5,60,150,50);//(Left,Top,Width,Height)

		lblYellow.setText(" Yellow");
		lblYellow.setOpaque(true);
		lblYellow.setBackground(Color.yellow);
		lblYellow.setForeground(Color.black);
		lblYellow.setFont(new Font("Verdana", 3, 36));
		lblYellow.setToolTipText("YELLOW YELLOW YELLOW YELLOW YELLOW YELLOW YELLOW YELLOW YELLOW YELLOW");
		lblYellow.setCursor(new Cursor(12));
		lblYellow.setBounds(160,60,150,50);//(Left,Top,Width,Height)

		//-----------------------

	}//End Cons

	public static void main(String args[])
	{//Main
		frmLabels fl = new frmLabels();
		fl.setVisible(true);
	}//End Main

}//End Class