import javax.swing.JOptionPane;
public class PacfectNumber
{
	public static void main (String args [])
	{
		String str;
		int i,m,x=0;
		str=JOptionPane.showInputDialog("Enter a value to check ");
		m=Integer.parseInt(str);
		for(i=1;i<=m/2;i++)
		{
			if(m%i==0)
			{
				x=x+i;
			}
		}
		if(m==x)
		{
			JOptionPane.showMessageDialog(null,"This is Perfect Number");
		}else
		{
			JOptionPane.showMessageDialog(null,"This is not Perfect Number");
		}
		System.exit(0);
	}
}