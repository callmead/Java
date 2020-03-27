import javax.swing.*;
import java.util.*;	//for StringTokinizer
import java.io.*;

public class test
{
	public static void main(String agrs[]) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int a = 0;
		String s = new String();
		String rec[][] = new String[5][3];

		while (a != 5)
		{
			s=br.readLine();
			StringTokenizer st = new StringTokenizer(s);
    		while (st.hasMoreTokens())
			{
				for (int b = 0; b<=4; b++)
				{
					for (int c = 0; c<=2; c++)
					{
						rec[b][c]=st.nextToken();
					}//end for c
				}//end For b
			}//end While st
			a = a + 1;
		}//End while a

		for (int d = 0;d<=4;d++)
		{
			for (int e=0;e<=2;e++)
			{
				System.out.print(rec[d][e]);
			}//end For e
		}//end for d

	}//main
}//class