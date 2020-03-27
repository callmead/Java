import javax.swing.*;
public class starFinal
{
	public static void main(String args[])
	{
		String star=JOptionPane.showInputDialog("Give a value to see the Diamond");

		int str; int k=0;int i,j,l,m;

		str=Integer.parseInt(star);
		str=str/2;

		while(str!=0)
		{
			for(i=0;i<str;i++)
			{
				System.out.print(" ");
			}//2nd for

			for(j=0;j<=k;j++)
			{
				System.out.print("*");
			}//3rd for

			System.out.println();
			str=str-1;
			k=k+2;
		}//while

		while(str!=11)
		{
			//k=k-2;
			for(i=0;i<=str;i++)
			{
				System.out.print(" ");

			}
			k=k-2;
			for(j=0;j<=k;j++)
			{
				System.out.print("*");

			}
			str=str+1;
			System.out.println();
			}//2nd while

			System.out.println();
			System.exit(0);
	//}//1st for
	}//main mathod
}//class