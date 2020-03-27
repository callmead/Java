
import javax.swing.JOptionPane;
public class Friend3
{
	public static void main(String args[])
	{
		String str;
		int i=1;
		int n=1;
		int fact;
		str=JOptionPane.showInputDialog("Enter the value");
		n=Integer.parseInt(str);
		fact = 1;
		for (i=1;i<= n;i++);
		{
			fact = fact * i;

		}
		JOptionPane.showMessageDialog(null,"The result is" + fact);
		System.exit(0);
	}

}
