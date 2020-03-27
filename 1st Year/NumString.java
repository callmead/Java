import javax.swing.*;
class NumString
{
	public static void main(String[]args)
	{
		int d,n=1,rem1,res=0;
		int i=Integer.parseInt(JOptionPane.showInputDialog("Enter numbers upto three digits only."));




		for(n=1;n<=3;n++)
		{

		res=i/10;
		rem1=i%10;
		i=res;


			switch (rem1)
			{
				case (0):
				System.out.println(rem1+" ZERO");
				break;

				case (1):
				System.out.println(rem1+" ONE");
				break;

				case (2):
				System.out.println(rem1+" TWO");
				break;

				case (3):
				System.out.println(rem1+" THREE");
				break;

				case (4):
				System.out.println(rem1+" FOUR");
				break;

				case (5):
				System.out.println(rem1+" FIVE");
				break;

				case (6):
				System.out.println(rem1+" SIX");
				break;

				case (7):
				System.out.println(rem1+" SEVEN");
				break;

				case (8):
				System.out.println(rem1+" EIGHT");
				break;

				case (9):
				System.out.println(rem1+" NINE");
				break;
			}
		System.exit(0);
		}

	}
}


