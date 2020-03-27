import java.io.*;
public class test
{
	public static void main(String a[])
	{
		int x=0;
		File f;

		try
		{
			//x=3/0;
			f=new File("c:\\test.txt");
			FileReader fr = new FileReader(f);
		}
		catch(ArithmeticException v)
		{
			System.out.println("ArithmeticException Occured....!");
		}

		catch(FileNotFoundException v)
		{
			System.out.println("FileNotFoundException Occured....!");
		}

		System.out.println(x);
		System.out.println("Program Crashed....");
	}//main
}//class
