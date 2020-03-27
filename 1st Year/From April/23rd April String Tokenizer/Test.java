import java.util.*;
import java.io.*;

public class Test
{
	public static void main(String x[]) throws IOException
	{
		InputStreamReader is = new InputStreamReader(System.in);//ISR Required for BR
		BufferedReader Br = new BufferedReader(is);				//BR gets the value from ISR

		//String s = new String();				//String for ReadLine which will be choped into tokens
		String s[] = new String[2];
		String rec[][] = new String[2][3];			//For Storing Tokens

		System.out.println("Enter 2 Records...!");
		System.out.println("Name \tAge \tTel");

		for (int v = 0; v<=1; v++)
		{
			s[v] = Br.readLine();							//ReadLine and store into s
		}

		for (int m = 0; m<=1; m++)
		{
			StringTokenizer st = new StringTokenizer(s[m]);	//Chop String s into tokens (depends in the words in string.)

		while (st.hasMoreTokens())	//Untill the Last Tokens comes then (This Statement returns True or False)
     	{
			for (int b = 0; b<=1; b++)
			{
				for (int c = 0;c<=2;c++)
				{
					rec[b][c] = st.nextToken();
				}//end j
			}//end for i
		}//end while

		System.out.println();
		System.out.println("**************************");
		System.out.println("Name\tAge\tTel");
		for (int y =0;y<=1;y++)
		{
			for (int z = 0;z<=2;z++)
			{
				System.out.print(rec[y][z]+"\t");
			}
			System.out.println();
		}//end for
		System.out.println();
		System.out.println("**************************");
		}

	}//main
}//class