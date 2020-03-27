//Array
import javax.swing.*;
public class Array
{
	String b[][] = new String[2][3];
	String str= new String();

	public void table()
	{
		int i,j;
		for (i=0;i<=1;i++)
		{
			for (j=0;j<=2;j++)
			{
				str = JOptionPane.showInputDialog("Enter Values Row wise");
				b[i][j] = str;
			}
		}

		for (i=0;i<=1;i++)
		{
			for (j=0;j<=2;j++)
			{
				//str = [i][j];
				//JOptionPane.showMessageDialog(null,"Enter Values Row wise");
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}

	}

	public static void main (String a[])
	{
		Array x = new Array();
		x.table();
		System.exit(0);
	}
}