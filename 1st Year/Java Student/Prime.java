import javax.swing.*;
public class Prime
{
	public static void main (String args[])
	{
		int i;
		int j;
		int count;
		int k;
		System.out.print("1");
		for(i=1;i<=200;i++){
			count =0;
			for(j=1;j<=i;j++){
				k=i%j;
				if(k==0)
					count = count + 1;

			}
			if (count==2){
				System.out.print(" "+i);
			}
		}
	}
}