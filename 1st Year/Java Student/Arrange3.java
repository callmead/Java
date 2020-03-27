import javax.swing.*;
import java.awt.*;
public class Arrange3
{
	public static void main (String args[])
	{
		int i,j;
		String output=new String("Number            Cube\n------------            -----------");
		System.out.println("See in message box");
		//System.out.println("------\t-----");
		for (i=1;i<=20;i++)
		{

			j=1;
			j=i*i*i;
			//System.out.println(i+"\t"+j);
			output=output+"\n"+i+"                          "+j;
		}
		JOptionPane.showMessageDialog(null,output);
		System.exit(0);
	}
}