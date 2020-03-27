import javax.swing.*;
public class Loop
{
	public static void main (String args[])
	{
		String s = JOptionPane.showInputDialog("Enter Termination Value");
		int a = Integer.parseInt(s);

		for (int i = 0; ;i+=2)
		{
			System.out.print(i+", ");
			if (i==a)
			break;
		}
		System.out.println();
		System.exit(0);
	}
}