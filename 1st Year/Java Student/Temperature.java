import javax.swing.JOptionPane;
public class Temperature
{
	public static void main(String args[])
	{
		String str1;
		int temp;
		str1=JOptionPane.showInputDialog("Entert the temperature");
		temp=Integer.parseInt(str1);
		if ((temp>=0) && (temp<=10))
		{
			JOptionPane.showMessageDialog(null,"It's too cold");
		}


		if ((temp>=11) && (temp<=15))
		{
			JOptionPane.showMessageDialog(null,"It's  cold");
		}
		if ((temp>=16) && (temp<=25))
		{
			JOptionPane.showMessageDialog(null,"It's Hot");
		}
		if ((temp>=26) && (temp<=35))
		{
			JOptionPane.showMessageDialog(null,"It's too Hot");
		}
		System.exit(0);
	}
	
}