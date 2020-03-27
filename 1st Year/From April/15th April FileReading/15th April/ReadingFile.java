import java.io.*;
public class ReadingFile
{
	public static void main (String a[]) throws IOException
	{
		File f = new File("c:\\input.txt");//See API, File
		FileReader fr = new FileReader(f); //See API, FileReader This Methods REads Cheracter one by one

		//for(int i = 1; i<=1000;i++)
		//{
int b;
			while ((b=fr.read()) != -1)
			{

				System.out.print((char)b);
			}
			System.out.println("End Of File....!");
		//}
	}
}