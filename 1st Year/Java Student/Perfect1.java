import javax.swing.JOptionPane;

public class Perfect1
{
	public static void main(String args[])
	{
		String output=new String ("Perfect number\n---------------------");
		int i;
		int j;
		int count;
		int k;

		for (i=1;i<=1000;i++)
		{
			count=0;

			for (j=1;j<i;j++)
			{
				k = i % j;
				if (k == 0)
				{
					count = count + j;
				}
			}

			if (count == i)
			{
				output=output+"\n" +i;
			}
		}
		JOptionPane.showMessageDialog(null,output);
		System.exit(0);
	}
}


