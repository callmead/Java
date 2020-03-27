import javax.swing.JOptionPane;
public class Surching
{
	public static void main(String args[])
	{
		int a[]=new int [10];
		int i;
		int n;
		String str;
		boolean flag=false;
		for(i=0;i<10;i++)
		{
			a[i]=1+(int)(Math.random()*100);
			System.out.print(a[i]+" ");
		}
		str=JOptionPane.showInputDialog("Enter a number");
		n=Integer.parseInt(str);
		for(i=0;i<10;i++)
		{
			if(a[i]==n)
			{
				flag=true;

			}
		}
			if(flag==true)
			{
					JOptionPane.showMessageDialog(null,"The number is found");
			}
			else
			{
				JOptionPane.showMessageDialog(null,"The number is not found");
			}



		System.exit(0);
	}
}