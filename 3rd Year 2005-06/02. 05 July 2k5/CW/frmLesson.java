import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Container;

public class frmLesson extends JFrame
{//Class

	public frmLesson()
	{//Cons
		//Properties of JFrame...
		this.setTitle("Sample Frame");//Title of Frame...

		//this.setLocation(200,100);//Location of Frame (Left,Top)...
		//this.setSize(400,300);//Size of Frame(Width,Height)...
		this.setBounds(150,70,500,500);//setLocation & setSize 2in1 setBounds(Left,Top,Width,Height)...
		this.setResizable(false);//By Default form can be resized by user using this command user cant resize the form by mouse

		//Container con = this.getContentPane();
		this.setBackground(Color.pink);//Background Color of Form but as soon as Content pane comes on form this color vanishes
		//Because there is contentPane placed on the form and its default color is lightGrey, to change color formBG change the color of contentpane
		//con.setBackground(Color.blue);//con is the defined object for container so changing the BG Color will do...
		this.getContentPane().setBackground(Color.blue);//2in1 Line18 & Line21 can be done by 1 command.

		//-----------------------
	}//End Cons

	public static void main(String args[])
	{//Main

		frmLesson abc = new frmLesson();//Firing the Constructor...
		abc.setVisible(true);

	}//End Main

}//End Class