import javax.swing.*;
public class PacfectNumber1
{
	public static void main (String args [])
	{
		String str;
		int i,j,m,x=0;
		str=JOptionPane.showInputDialog("Enter a value to check ");
		m=Integer.parseInt(str);
		for(i=1;i<=m/2;i++)
		{
			for(j=1;j<=m/2;j++)
			{
				if(m%j==0)
				{
					x=x+j;
				}
			}
			System.out.print("The Perfect numbers are =" +x);
		}

		System.exit(0);
	}
}