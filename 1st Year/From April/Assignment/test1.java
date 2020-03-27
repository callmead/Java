import javax.swing.*;	//Prime Number Program
public class test1
{
   public static void main(String args[])
     {
 	 int i;
	 int j;
	 int count;
	 int k;
	 int cnt=0;

	 count = 0;
	 String num=JOptionPane.showInputDialog("Enter the I'th value ");
	 int num1=Integer.parseInt(num);

	 for (i=1;i<=10000;i++)
		 {
		 count=0;
		 for (j=2;j<i;j++)
			 {
			 k = i % j;
			 if (k == 0)
			 count = 1;
			 }
			 if (count==0)
			 {
				 cnt=cnt+1;
				 if(num1==cnt)
				 {
				 	JOptionPane.showMessageDialog(null,"The "+num1+" Prime is "+i);
				}
			 }
	 	 }
	 System.exit(0);
     }
}