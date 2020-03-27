import javax.swing.*;
public class Maximum
{
	public static void main(String args[])
	{
		int a[]=new int[5];

		int i;
		int max;

		for(i=1;i<5;i++)
			{
			a[i]=1+ (int)(Math.random()*100);
			System.out.println(a[i]+" ");



			}
			max=a[0];

		for(i=1;i<5;i++)
			{
				if(max<a[i])
				{
					max=a[i];
				}
			}


			System.out.println(max);
			System.out.println("The Maximum number "+max);
			System.exit(0);

	}
}