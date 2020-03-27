public class test1
{
	public static void main (String args[])
	{
		int i,j;
		String star = new String();
		String space = new String();

		space = " ";
		star = "*";

		for (i=3;i>=0;i--)
		{
			System.out.println(star);
			for (j=1;j>=5;j++)
			{
			 	System.out.print(star);

			}
		}
	}
}