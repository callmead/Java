import javax.swing.JFrame;

public class MyFirstProgram extends JFrame
/*
Simple Program
2 July 2005
*/
{//Class

	public MyFirstProgram()
	{//Cons
		//System.out.println("This is my first program");

	}//End Cons

	public static void main (String args[])
	{//Main
		//Creating new Object of Class
		//ClassName Object = new ClassName();
		MyFirstProgram VaR = new MyFirstProgram();
		VaR.setVisible(true);
	}//End Main

}//End Class