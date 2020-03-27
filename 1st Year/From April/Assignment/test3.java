import javax.swing.*;
public class test3
{
	public static void main(String arg[])
	{
		int cnt=0;int b = 0;
		int num =Integer.parseInt(JOptionPane.showInputDialog("Enter I'th position :"));
		b = 1;
		for(int a=0;a<100;a+=2)
		{
			cnt = cnt + 1;
			b = b + a;
			if (num == cnt)
			{
				JOptionPane.showMessageDialog(null,"The "+num+" Value is "+b);
				System.exit(0);
			}
		}//1st for
		System.exit(0);
	}
}