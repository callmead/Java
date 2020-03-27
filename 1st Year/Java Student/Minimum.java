import javax.swing.*;
public class Minimum
{
	public static void main(String args[])
	{
		int a[]=new int[5];

		int i;
		int min;



		for(i=0;i<5;i++)
			{
			a[i]=1+ (int)(Math.random()*100);
			System.out.println(a[i]+" ");


			}
		min=a[0];
		for(i=1;i<5;i++)
			{
				if(min>a[i])
				{
					min=a[i];
				}
			}

			System.out.println("The Minimum number "+min);

			System.exit(0);

	}
}