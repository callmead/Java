import javax.swing.*;
import java.awt.*;
public class Arrange1
{
	public static void main (String args[])
	{
		JTextArea outputArea=new JTextArea(20,20);
		JScrollPane scroller=new JScrollPane(outputArea);
		int i,j;
		String output=new String("Number            Cube");
		System.out.println("See in message box");
		//System.out.println("------\t-----");
		for (i=1;i<=1000;i++)
		{

			j=1;
			j=i*i*i;
			//System.out.println(i+"\t"+j);
			output=output+"\n"+i+"                        "+j;
		}
		outputArea.setText(output);
		JOptionPane.showMessageDialog(null,scroller);
		System.exit(0);
	}
}