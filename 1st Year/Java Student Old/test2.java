
import javax.swing.JOptionPane; // Program to reverse a Word 3rd Feb 2003
public class test2
{
	public static void main(String args[])
	{
	String str1 = JOptionPane.showInputDialog("Enter a Word...");
	String output;
	int len = str1.length (); // To Findout the Length of the Word
	int j;
	System.out.print("The Length of Ur Word is "+len+" Cheracters\n");
	System.out.print("And Your Word in Oposite Direction is ... \n\t\n");
	for (j=len-1;j>=0;j--) // To Reverse the word given
		{
			output=output+str1.charAt(j);
		}
		JOptionPane.showMessageDialog(null,output);


	System.exit(0);

	}
}