import javax.swing.JOptionPane;
public class Friend2
{
	public static void main(String arg[])
	{
		String n;
		int month;
		n=JOptionPane.showInputDialog("Please enter a number");
		month=Integer.parseInt(n);
		do
		{
			if (month>1 && month<12)
			{
				switch (month)
				{
					case 1: JOptionPane.showMessageDialog(null," It's January");break;
					case 2: JOptionPane.showMessageDialog(null," It's February");break;
					case 3: JOptionPane.showMessageDialog(null," It's Murch");break;
					case 4: JOptionPane.showMessageDialog(null," It's April");break;
					case 5: JOptionPane.showMessageDialog(null," It's May");break;
					case 6: JOptionPane.showMessageDialog(null," It's June");break;
					case 7: JOptionPane.showMessageDialog(null," It's July");break;
					case 8: JOptionPane.showMessageDialog(null," It's Augest");break;
					case 9: JOptionPane.showMessageDialog(null," It's September");break;
					case 10: JOptionPane.showMessageDialog(null," It's October");break;
					case 11: JOptionPane.showMessageDialog(null," It's November");break;
					case 12: JOptionPane.showMessageDialog(null," It's December");break;
			
				}
			}
		}while(month<=12);
	}
}
