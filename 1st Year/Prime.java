import javax.swing.JOptionPane;

	public class Prime
	{
		public static void main(String arg[])
		{
		int prime=0;
		int i;
		String stp;
		stp=JOptionPane.showInputDialog("Enter a Number");
		prime=Integer.parseInt(stp);
		for(i=1;i<=prime;){


			if(prime%2==0)

			JOptionPane.showMessageDialog(null,"Not Prime Number");


			else

			JOptionPane.showMessageDialog(null," Prime Number");
			System.exit(0);

			}

		JOptionPane.showMessageDialog(null," Please Enter 1 to 100");
		stp=JOptionPane.showInputDialog("Enter a Number");
		prime=Integer.parseInt(stp);
		for(i=1;i<=prime;){


			if(prime%2==0)

			JOptionPane.showMessageDialog(null,"Not Prime Number");

			else

			JOptionPane.showMessageDialog(null," Prime Number");
			System.exit(0);

			}


		}
	}