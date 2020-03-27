import javax.swing.*;
public class Fabonacci
{
	public static void main(String args[])
	{
		int a,b,c;
		a=0;
		b=1;
		while(b<1000);
		c=a+b;
		System.out.print(c);
		a=b;
		b=c;
		System.exit(0);
	}
}