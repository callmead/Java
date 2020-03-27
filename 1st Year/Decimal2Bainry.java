import javax.swing.JOptionPane;
public class test
{
	public static void main (String args[])
	{
		int n;
		int rem;
		String number;
		int num;
		String output="";

		number=JOptionPane.showInputDialog("Enter a number to convert to Binary ");

		num=Integer.parseInt(number);

		if(num==0)
		{
			System.out.print("0");
		}else{
			do{
				rem=num%2;
				num=num/2;
				output = rem + output;
			}while(num!=0);

			JOptionPane.showMessageDialog(null,"Your Binary Output is "+output);//System.out.print(output+"\n");<--U can also use this way too
			System.exit(0);
		}
	}
}