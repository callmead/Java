
import javax.swing.JOptionPane;
public class Perfect
{


	public static void main(String arg[])
	{

		int i,n=0,sum;

		for(n=5;n<1000;n++)
		{
			sum=1;
			for(i=2;i<=(n/2);i++)
			{
				if(n%i==0){
			 		sum=sum+i;
	 			}
			}
			if(n==sum)
				System.out.print(""+n+"  ");


		}

	}
}