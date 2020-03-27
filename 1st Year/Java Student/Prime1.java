import javax.swing.*;
public class Prime1
{
	public static void main (String args[])
	{
		JTextArea area=new JTextArea(20,20);
		JScrollPane scroller=new JScrollPane(area);
		String output=new String ("Prime Number\n1");
		int i;
		int j;
		int count;
		int k;
		//System.out.print("1");
		for(i=1;i<=200;i++)
		{
			count =0;
			for(j=1;j<=i;j++)
			{
				k=i%j;
				if(k==0)
					count = count + 1;

			}
			if (count==2)
			{
				output=output+"\n"+i;
			}
		}
		area.setText(output);
		JOptionPane.showMessageDialog(null,scroller);
		System.exit(0);
	}
}