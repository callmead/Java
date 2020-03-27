import java.io.*;
import java.util.*;
public class test2
{
	public static void main(String x[]) throws IOException
	{
		InputStreamReader is = new InputStreamReader(System.in);//ISR Required for BR
		BufferedReader Br = new BufferedReader(is);				//BR gets the value from ISR

		String s = new String();				//String for ReadLine which will be choped into tokens
		String rec[] = new String[3];			//For Storing Tokens

		System.out.println("Enter Your");
		System.out.println("Name \tAge \tTel");

		s = Br.readLine();								//ReadLine and store into s
		StringTokenizer st = new StringTokenizer(s);	//Chop String s into tokens (depends in the words in string.)

		while (st.hasMoreTokens())	//Untill the Last Tokens comes then (This Statement returns True or False)
     		{
			for (int i = 0; i<=2; i++)
			{
				rec[i] = st.nextToken();
			}//end for
		}//end while

		System.out.println();
		System.out.println("**************************");
		System.out.println("Name\tAge\tTel");

		for (int j =0;j<=2;j++)
		{
			System.out.print(rec[j]+"\t");
		}//end for
		System.out.println();
		System.out.println("**************************");

	}//main
}//class

