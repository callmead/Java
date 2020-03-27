/*
2nd July 2005
First Java Class
Simple Program
*/

public class MyFirstProgram extends javax.swing.JFrame
{//Class
	public MyFirstProgram()
	{//Cons
		System.out.println("This is my first constructor...");
	}//End Cons

	public static void main (String args[])
	{//Main
		System.out.println("This is my first program...");

		//Shooting a constructor
		//ClassName Object = new ClassName();
		MyFirstProgram a = new MyFirstProgram();

		//Showing the JFrame
		a.setVisible(true);
	}//End Main
}//End Class