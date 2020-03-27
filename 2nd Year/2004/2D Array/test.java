public class test
{

	int a[][]= new int[2][2];
	int b[][]= new int[2][2];
	int c[][]= new int[2][2];

	int g,h,i,j;

	public test()
	{
		//Input the values....
		//scanf a[0][0] ....

		a[0][0] = 1;
		a[0][1] = 3;
		a[1][0] = 4;
		a[1][1] = 7;

		b[0][0] = 7;
		b[0][1] = 8;
		b[1][0] = 9;
		b[1][1] = 10;

		//scanf a[0][0] ....

		//Calculate Result
		c[0][0] = a[0][0]+b[0][0];
		c[0][1] = a[0][1]+b[0][1];
		c[1][0] = a[1][0]+b[1][0];
		c[1][1] = a[1][1]+b[1][1];
		//-----------------------


		//Start Printing....
		System.out.println("Array A");

		for (int z = 0; z<2; z++)
		{
			for (int y=0; y<2; y++)
			{
				System.out.print("\t"+a[z][y]);
			}
			System.out.println("");
		}

		//-------------------------------------
		System.out.println("");

		System.out.println("Array B");

		for (int z = 0; z<2; z++)
		{
			for (int y=0; y<2; y++)
			{
				System.out.print("\t"+b[z][y]);
			}
			System.out.println("");
		}
		//-------------------------------------

		System.out.println("");

		System.out.println("Array C");

		for (int z = 0; z<2; z++)
		{
			for (int y=0; y<2; y++)
			{
				System.out.print("\t"+c[z][y]);
			}
			System.out.println("");
		}
		//-------------------------------------

	}

	public static void main (String x[])
	{
		test t = new test();
	}
}