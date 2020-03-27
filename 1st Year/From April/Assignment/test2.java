import javax.swing.JOptionPane;
public class test2
{
	public static void main (String arg[])
	{
		String num=JOptionPane.showInputDialog("Enter I'th value :");
		int num1=Integer.parseInt(num);
		int i;
		int cnt=0;
		for(i=1;i<100000;i+=2)
		{
			cnt=cnt+1;
			if(num1==cnt)
			{
				JOptionPane.showMessageDialog(null,"The "+num1+"th number is "+i);
			}
		}
		System.exit(0);

	}
}