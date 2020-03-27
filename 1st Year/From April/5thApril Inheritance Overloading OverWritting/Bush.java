public class Bush
{
	public void abc (String a)
	{
		System.out.println("This is Function with A");

	}

	public void abc (int b)
	{
		System.out.println("This is Function with B");
	}

	public static void main (String x[])
	{
		Bush blare1 = new Bush();

		blare1.abc("A");
		blare1.abc("B");
	}
}
