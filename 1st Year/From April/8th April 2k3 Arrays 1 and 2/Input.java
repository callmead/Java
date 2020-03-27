import java.io.*;
class Input
{
	public static void main(String  a[])throws IOException
	{

		InputStreamReader isr = new InputStreamReader(System.in);

		int b = isr.read(); //Waits on CLI Untill some value is given and Returns the ASCII Value of cheracter

		char c = (char)b;	//Converts the ASCII Cheracter to Cheracter type.

		System.out.println("The Ascii Value is "+b);
		System.out.println("The Cheracter of the Ascii Value is "+ c);
	}

}