import javax.swing.JOptionPane;
public class Search
{
	public static void main (String args[])
	{
		int i,x,y;
		String str;
		str = JOptionPane.showInputDialog("Enter a value to check");
		x=Integer.parseInt(str);
		y=0;
		for(i=1;i=x/2;i++)
		{
			if(x%i=o)
			{
				y=y+i;
			}
		}
		if(y=x)
		{
			JOptionPane.showMessageDialog(null,"This number is Perfect ","Perfect number");
		}
		else
		{
			JOptionPane.showMessageDialog(null,"This is not Perfect number");

		}
		System.exit(0);
	}
}