import javax.swing.JOptionPane;
public class ConvertBinary
{
	public static void main(String args[])
	{
		String str1=new String (" ");
		String output=new String(" ");
		int a;
		int b;
		int reminder;
		str1=JOptionPane.showInputDialog("Enter a number");
		a=Integer.parseInt(str1);
		if(a==0)
		{
			System.out.print("0");
		}
		else
		{
			do
			{
				reminder=a%2;
				output=reminder+output;
				a=a/2;
			}while(a!=0);

		}
		System.out.println(output);
		System.exit(0);

	}
}