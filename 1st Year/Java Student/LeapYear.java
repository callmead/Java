import javax.swing.JOptionPane;
public class LeapYear
{
	public static void main(String args[])
	{
		String str1;
		int y;
		str1=JOptionPane.showInputDialog("Entert the year");
		y=Integer.parseInt(str1);
		if  (y%4==0)
		{
			if (y%100==0)
			{ if(y%400==0)
			{
			JOptionPane.showMessageDialog(null,"This year is Leap year");
			}
			else
			{JOptionPane.showMessageDialog(null,"This year is not Leap year");
			}
			}
			else
			{
				JOptionPane.showMessageDialog(null,"This year is  Leap year");
			}
		}
			else
			{
			JOptionPane.showMessageDialog(null,"This year is not Leap year");
		}

		System.exit(0);
	}

}