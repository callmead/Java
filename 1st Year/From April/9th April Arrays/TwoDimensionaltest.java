import javax.swing.*; //Problem when two Records having Same Age or Sex or tel then It only shows the First Record which it finds first in the Array
import java.io.*;

public class TwoDimensionaltest
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
		{//For Array Input Records from Console
			for (j=0;j<=3;j++)
			{
				records[i][j] = br.readLine();
			}
		}//End For

		System.out.println("Name\tAge\tSex\tTel");

		for (i=0;i<=4;i++)
		{//For Printing Array (Records which inputed from console)
			for (j=0;j<=3;j++)
			{
				System.out.print(records[i][j]+"\t");
			}//End i
			System.out.println();
		}//End j

		//Search Begins From Here
		System.out.println("Search Type Available Name(1), Age(2), Sex(3), Tel(4)");
		System.out.println("Enter Search Type 1-4");

		String t = br.readLine(); 		//For Search Type
		System.out.println("Enter "+t+" to Search ");
		int t1 = Integer.parseInt(t);

		s = br.readLine();//to Read the Input

		if (t1==1)
		{
			for (i=0; i<=4;i++)
			{
				if (records[i][0].equals (s))
				{
					System.out.println("Your Search Found "+s);
					System.out.println(records[i][0]+"\t"+records[i][1]+"\t"+records[i][2]+"\t"+records[i][3]);
					break;
				}
				else
				{
					if (t1==2)
					{
						for (i=0; i<=4;i++)
						{
							if (records[i][1].equals (s))
							{
								System.out.println("Your Search Found "+s);
								System.out.println(records[i][0]+"\t"+records[i][1]+"\t"+records[i][2]+"\t"+records[i][3]);
								break;
							}
						}//For Loop
					}//End 2nd For t1=2

					if (t1==3)
					{
						for (i=0; i<=4;i++)
						{
							if (records[i][2].equals (s))
							{
								System.out.println("Your Search Found "+s);
								System.out.println(records[i][0]+"\t"+records[i][1]+"\t"+records[i][2]+"\t"+records[i][3]);
								break;
							}
						}//For Loop
					}//End 3rd For t1=3

					if (t1==4)
					{
						for (i=0; i<=4;i++)
						{
							if (records[i][3].equals (s))
							{
								System.out.println("Your Search Found "+s);
								System.out.println(records[i][0]+"\t"+records[i][1]+"\t"+records[i][2]+"\t"+records[i][3]);
								break;
							}
							else
							{
								System.out.println("Search Not Found");
							}
						}//For Loop
					}//End 4th For t1=4
				}
			}//For Loop
		}//End 1st For t1=1



	}//End Main
}//End Class