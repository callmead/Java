class A
{
	public static void main (String a[])
	{
		String ab[][] = new String[2][3];
		ab[0][0] = "0,0 ";
		ab[0][1] = "0,1 ";
		ab[0][2] = "0,2 ";
		ab[1][0] = "1,0 ";
		ab[1][1] = "1,1";
		ab[1][2] = "1,2";

		System.out.println(ab[1][1]);
		System.out.println(ab[1][2]);
		System.out.println(ab[0][2]);
	}
}
