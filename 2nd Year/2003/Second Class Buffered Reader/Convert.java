//Program to take input and sum it either its having fractional part or not 27/10/2003
import java.io.*;
public class Convert
{
	public static void main (String x[])
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		try
		{
			String a = br.readLine();
			String b = br.readLine();

			//Following are three conversions available which we can use !!!

			//For Long Fractional Values
			//double c = Double.parseDouble(a);
			//double d = Double.parseDouble(b);

			//Only for Integer Values
			//int c = Integer.parseInt(a);
			//int d = Integer.parseInt(b);

			//For Fractional Values
			float c = Float.parseFloat(a);
			float d = Float.parseFloat(b);

			System.out.println("Sum is "+(c+d));
		}catch (IOException e){}

	}
}