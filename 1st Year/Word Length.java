import javax.swing.JOptionPane;
public class test2
{
	public static void main(String args[])
	{
	String str1 = JOptionpPane.showInputDialog("Enter a Word");
	int str = Integer.parseInt(str1);
	int len = str.length ();
	int j;
	JOptionPane.showMessageDialog(null,"Length of your Word is "+len);

	for (j=len-1;j>=0;j--)
		{
			System.out.print(str1.charAt(j));
		}


	}
}