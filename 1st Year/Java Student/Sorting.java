import javax.swing.*;
public class Sorting
{
	public static void main(String args[])
	{
		int a[]=new int[10];
		int temp;
		int i;
		int j;
		i=1;
		for(i=0;i<10;i++)
		{
			a[i]=1+(int)(Math.random()*100);
			System.out.print(a[i]+" ");
		}
		for (i=0;i<9;i++)
		{
			for (j=(i+1);j<10;j++)
			{

				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}

		}
		System.out.println("");
		for(i=0;i<10;i++)
			System.out.print(a[i]+" ");

		System.exit(0);
	}
}