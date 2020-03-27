import javax.swing.*;
import java.awt.*;
public class Arrange2
{
	public static void main (String args[])
	{
		int i,j;
		System.out.println("Number\tCube");
		System.out.println("------\t-----");
		for (i=1;i<=20;i++)
		{

			j=1;
			j=i*i*i;
			System.out.println(i+"\t"+j);
		}
		System.exit(0);
	}
}