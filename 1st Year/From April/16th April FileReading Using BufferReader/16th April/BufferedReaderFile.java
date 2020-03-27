import javax.swing.*;
import java.io.*;
public class BufferedReaderFile
{
	public static void main (String a[]) throws IOException
	{
		String path = JOptionPane.showInputDialog(null,"Specify File Path");
		//File f = new File("c:\\input.txt");//See API, File
		File f = new File(path);//See API, File
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String s;
		int counter = 0;

		//String x = new String("Official Use");
		String x = JOptionPane.showInputDialog("Enter the Word from which the Printing should stop and continue");
		while ((s=br.readLine())!=null)
		{
			if (s.equals(x))
			counter = counter +1;
			if (counter !=1)
			{
				if (counter ==2)
				{
					//System.out.println();
					counter = counter +1;
				}
				if (counter==3)
				{
					counter = 0;
				}

				else
				{
					System.out.println(s);
				}
			}
		}//While
		System.out.println("************************************************");
		System.out.println("End Of File...!");
		System.exit(0);
	}//Main
}
