//9th July 2005 Label
//Click Tools-->Run--> then in command Type C:\jdk\bin\javap.exe and in Parameters type javax.swing.JFrame or whatever you would like to know and then check Capture Output and Go

import javax.swing.*;
import java.awt.*;

public class frmLabels extends JFrame
{//Class

	//Global Objects
	JLabel lblRed = new JLabel();

	public frmLabels()
	{//Cons
		//Properties of JFrame...
		this.setTitle("Example of Label");
		this.setLocation(200,100);
		this.setSize(new Dimension(500,400));
		this.getContentPane().setBackground(Color.white);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		//this.getContentPane().add(lblRed);//Adding lblRed on Frame's Container
		//this.getContentPane().add(lblRed,BorderLayout.NORTH);
		//this.getContentPane().add(lblRed,BorderLayout.WEST); EAST,CENTER,WEST,NORTH
		this.getContentPane().add(lblRed,BorderLayout.SOUTH);
		//------------------------

		//Properties of JLabel...
		lblRed.setText("RED");
		lblRed.setOpaque(true);
		lblRed.setBackground(Color.red);
		lblRed.setForeground(Color.white);
		//lblRed.setHorizontalAlignment(SwingConstants.RIGHT); //or LEFT,RIGHT,CENTER
		lblRed.setHorizontalAlignment(SwingConstants.CENTER);
		lblRed.setVerticalAlignment(SwingConstants.TOP);//TOP,BOTTOM
		//lblRed.setFont(new Font("Verdana", Font.BOLD, 36)); //Font.BOLD have int value 1
		//lblRed.setFont(new Font("Verdana", Font.ITALIC, 36)); //have int value 2
		//lblRed.setFont(new Font("Verdana", Font.BOLD+Font.ITALIC, 36)); //have int value 1+2 or simply write 3
		//lblRed.setFont(new Font("Verdana", Font.PLAIN, 36)); //have int value 0
		lblRed.setFont(new Font("Verdana", 3, 36)); //Font.BOLD have int value 1

		//-----------------------
	}//End Cons

	public static void main(String args[])
	{//Main
		frmLabels fl = new frmLabels();
		fl.setVisible(true);
	}//End Main

}//End Class