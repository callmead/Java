import javax.swing.JOptionPane;
public class test3
{
	public static void main (String args[])
	{
		String output=new String(" ");
		String text=JOptionPane.showInputDialog("Enter a text.....");
		int lan=text.length();
		int i;
		for(i=lan-1;i>=0;i--)
		{
			output=output+text.charAt(i);
		}
		JOptionPane.showMessageDialog(null,"This is the Oposite directon What you give as Input"+output);

		System.exit(0);
	}
}
