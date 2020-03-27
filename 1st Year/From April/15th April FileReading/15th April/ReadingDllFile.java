import javax.swing.*;
import java.io.*;
public class ReadingDllFile
{
	public static void main (String a[]) throws IOException
	{
		String path = JOptionPane.showInputDialog("Enter File Path with File Name e.g c:\\Autoexec.bat");
		File f = new File(path);//See API, File
		if(f.exists())
		{
			FileReader fr = new FileReader(f); //See API, FileReader This Methods REads Cheracter one by one
			int b;
			while ((b=fr.read()) != -1)
			{
				System.out.print((char)b);
			}
			System.out.println("End Of File....!");
			System.exit(0);
		}
		//System.out.println("exists");
		else
		JOptionPane.showMessageDialog(null,"The File Does not Exists on This Path "+path);
		System.exit(0);

	}//m,ain
}