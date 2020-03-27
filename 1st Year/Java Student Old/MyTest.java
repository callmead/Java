import java.io.*;
public class MyTest
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		System.out.print("Enter First number");
		String s1=br.readLine();
		System.out.print("Enter Second number");
		String s2=br.readLine();
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		System.out.print("The sum is "+(n1+n2));
	}

}