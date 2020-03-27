import javax.swing.JOptionPane;
public class MultipleChoice3
{
  public static void main(String args[])
   {
 	 String choice;
	 int ch;
	 String firstNumber;
	 String secondNumber;
	 int num1;
	 int num2;
	 int result;

		do {
 		    choice = JOptionPane.showInputDialog ("1) Addition. \n2) Subtraction. \n3) Multiplication. \n4) Division. \n5) Exit.");
	 	    ch = Integer.parseInt(choice);

		    if (ch==1)
		       {
				 choice = "Addition...!";
				 JOptionPane.showMessageDialog(null, "You Have Chosen " + choice);
				 firstNumber = JOptionPane.showInputDialog ("Enter 1st Value");
			   	 secondNumber = JOptionPane.showInputDialog ("Enter 2nd Value");
				 num1 = Integer.parseInt(firstNumber);
				 num2 = Integer.parseInt(secondNumber);
				 result = num1 + num2;
				 JOptionPane.showMessageDialog(null, "The Sum is " + result);
				}

			if (ch==2)
			   {
			     choice = "Subtraction...!";
			     JOptionPane.showMessageDialog(null, "You Have Chosen " + choice);
				 firstNumber = JOptionPane.showInputDialog ("Enter 1st Value");
				 secondNumber = JOptionPane.showInputDialog ("Enter 2nd Value");
				 num1 = Integer.parseInt(firstNumber);
				 num2 = Integer.parseInt(secondNumber);
				 result = num1 - num2;
				 JOptionPane.showMessageDialog(null, "The Subtraction is " + result);
			    }

		 	if (ch==3)
		 	   {
				 choice = "Multiplication...!";
				 JOptionPane.showMessageDialog(null, "You Have Chosen " + choice);
				 firstNumber = JOptionPane.showInputDialog ("Enter 1st Value");
				 secondNumber = JOptionPane.showInputDialog ("Enter 2nd Value");
				 num1 = Integer.parseInt(firstNumber);
				 num2 = Integer.parseInt(secondNumber);
				 result = num1 * num2;
				 JOptionPane.showMessageDialog(null, "The Multiplication is " + result);
			   }

		 	if (ch==4)
		 	   {
				 choice = "Division...!";
				 JOptionPane.showMessageDialog(null, "You Have Chosen " + choice);
				 firstNumber = JOptionPane.showInputDialog ("Enter 1st Value");
				 secondNumber = JOptionPane.showInputDialog ("Enter 2nd Value");
				 num1 = Integer.parseInt(firstNumber);
				 num2 = Integer.parseInt(secondNumber);
				 if (num2==0)
				 {
				 JOptionPane.showMessageDialog(null, "Infinity....!");
				 }
				 else
				 {
				 result = num1 / num2;
				 JOptionPane.showMessageDialog(null, "The Division is " + result);
			     }

			   }

		 if (ch > 5 || ch< 1)
		 	   {
			JOptionPane.showMessageDialog(null, "You Have Chosen wrong option" );
			   }

	  } while (ch!=5);

	 JOptionPane.showMessageDialog(null, "Thanks You. And Good Bye " );
	 System.exit(0);
   }
}