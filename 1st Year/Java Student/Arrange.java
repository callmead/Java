import javax.swing.*;
import java.awt.*;
	public class Arrange
{
	public static void main (String args[])
	{
		JTextArea outputArea=new JTextArea(20,20);
		int i,j;
		String output=new String("Number            Cube\n------------            -----------");
		//System.out.println("number\tCube");
		//System.out.println("------\t-----");
		for (i=1;i<=20;i++)
		{

			j=1;
			j=i*i*i;
			//System.out.println(i+"\t"+j);
			output=output+"\n"+i+"                          "+j;
		}
		outputArea.setText(output);
		JOptionPane.showMessageDialog(null,outputArea);
		System.exit(0);
	}
}