import javax.swing.*;
import java.io.*;
public class TwoDimensional
{
	public static void main(String a[]) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in); 	//For Input From Console
		BufferedReader br = new BufferedReader (isr);				//Buffer Reader is Depending on ISR, it will Buffer every Cheracter from ISR and then combine it

		String records[][] = new String[5][4]; 	//Array 5 Rows and 4 Columns

		boolean search = false; 				//For Search
		String s = new String();				//For Search
		int i,j;

		System.out.println("Input First Row First Name,Age,Sex,Tel");
		System.out.println();

		for(i=0;i<=4;i++)
		{//For Array Input
			for (j=0;j<=3;j++)
			{
				records[i][j] = br.readLine();
			}
		}//End For

		System.out.println("Name\tAge\tSex\tTel");
		for (i=0;i<=4;i++)
		{//For Printing Array
			for (j=0;j<=3;j++)
			{
				System.out.print(records[i][j]+"\t");
			}//End i
			System.out.println();
		}//End j

		System.out.println("Search Type Available Name(1), Age(2), Sex(3), Tel(4)");
		System.out.println("Enter Search Type 1-4");

		String t = br.readLine(); 	//For Search Type
		//System.out.println("Enter "+t+" to Search ");
		int t1 = Integer.parseInt(t);

		s = br.readLine();//to Read the Input

		if (t1==1)
		{
			for (i=0; i<=4;i++)
			{
				//System.out.println("Your Search Found "+s);
				if (records[i][0].equals (s))
				{
					System.out.println(records[i][0]+"\t"+records[i][1]+"\t"+records[i][2]+"\t"+records[i][3]);
					//break;
				}
				else
				{
				//	System.out.println("Search Not Found");
				}
				if(i==4)
				System.out.println("Search Not Found");
			}//For Loop
		}//End First If

		if (t1==2)
		{
			for (i=0; i<=4;i++)
			{
				//System.out.println("Your Search Found "+s);
				if (records[i][1].equals (s))
				{
					System.out.println(records[i][0]+"\t"+records[i][1]+"\t"+records[i][2]+"\t"+records[i][3]);
					//break;
				}
				else
				{
				//	System.out.println("Search Not Found");
				}
				if(i==4)
				System.out.println("Search Not Found");
			}//For Loop
		}

		if (t1==3)
		{
			for (i=0; i<=4;i++)
			{
				//System.out.println("Your Search Found "+s);
				if (records[i][2].equals (s))
				{
					System.out.println(records[i][0]+"\t"+records[i][1]+"\t"+records[i][2]+"\t"+records[i][3]);
					//break;
				}
				else
				{
				//	System.out.println("Search Not Found");
				}
				if(i==4)
				System.out.println("Search Not Found");
			}//For Loop
		}

		if (t1==4)
		{
			for (i=0; i<=4;i++)
			{
				//System.out.println("Your Search Found "+s);
				if (records[i][3].equals (s))
				{
					System.out.println(records[i][0]+"\t"+records[i][1]+"\t"+records[i][2]+"\t"+records[i][3]);
					//break;
				}
				else
				{
				}//Not Required
				if(i==4)
				System.out.println("Search Not Found");

			}//For Loop
		}//End 4th For t1=4
	}//End Main
}//End Class