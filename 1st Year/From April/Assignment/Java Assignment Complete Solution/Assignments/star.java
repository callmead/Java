public class star
{
	public static void main (String args[])
	{
		int l,i,j,k;
		l = 1;
		k = 5;

		while (k!=0)
		{
			for (i=k;i>=0;i--)
			{
				System.out.print(" ");
			}
			k = k-1;

			for(j=1;j<=l;j++)
			{
				System.out.print("*");
			}
			l = l + 2;
			System.out.println();

		}

		k=2;
		l=7;
		while (k!=7)
		{
			for (i=0;i<=k;i++)
			{
				System.out.print(" ");
			}

			k = k + 1;

			for(j=l;j>=1;j--)
			{
				System.out.print("*");
			}
			l = l - 2;
			System.out.println();
		}
	}
}
