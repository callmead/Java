import javax.swing.JOptionPane;
public class Friend5
{
	public static void main(String args[])
	{
		String choice;
		int ch;
		String first;
		String second;
		int num1;
		int num2;
		int result;
		do
		{
		 choice = JOptionPane.showInputDialog("Enter a choice.\n1) Addition.\n2) Subtraction.\n3) Multiplication.\n4) Divition.\n5) Exit.");
		 ch=Integer.parseInt(choice);
		 JOptionPane.showMessageDialog(null,"Your choice is "+choice);
		 if(ch==1)
		 {

			first=JOptionPane.showInputDialog("Enter first number");
			num1=Integer.parseInt(first);
			second=JOptionPane.showInputDialog("Enter second number");
			num2=Integer.parseInt(second);
			result=num1+num2;
			JOptionPane.showMessageDialog(null,"The result is "+result);
		 }
		 if (ch==2)
		 {

			first=JOptionPane.showInputDialog("Enter first number");
			num1=Integer.parseInt(first);
			second=JOptionPane.showInputDialog("Enter second number");
			num2=Integer.parseInt(second);
			result=num1- num2;
			JOptionPane.showMessageDialog(null,"The result is "+result);
		 }
		 if (ch==3)
		 {

			first=JOptionPane.showInputDialog("Enter first number ");
			num1=Integer.parseInt(first);
			second=JOptionPane.showInputDialog("Enter second number ");
			num2=Integer.parseInt(second);
			result=num1*num2;
			JOptionPane.showMessageDialog(null,"The result is"+result);

		 }
		 if (ch==4)
		 {

			first=JOptionPane.showInputDialog("Enter first number ");
			num1=Integer.parseInt(first);
			second=JOptionPane.showInputDialog("Enter second number ");
			num2=Integer.parseInt(second);
			if (num2==0)
			{
				JOptionPane.showMessageDialog(null,"It is infinity.Please choice other value. ");
			}else
			{
			result=num1/num2;
			JOptionPane.showMessageDialog(null,"The result is"+result);
			}

		}
		if (ch>5||ch<1)
			{
				JOptionPane.showMessageDialog(null,"You are fool.  Your selection is wrong ");
			}
			if (ch==5)
			{
				JOptionPane.showMessageDialog(null,"Thank You For Use this things. See you, Good by!");

			}
		}while (ch!=5);


		System.exit(0);

	}
}
