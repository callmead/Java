import java.io.*;
import java.util.*;
public class FileReadWrite
{
	public static void main(String a[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader(new File("c:\\scan.bat")));
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("c:\\copy.bat")));

		String s = new String();
		System.out.println("Reading Source file...");
		while((s=br.readLine())!=null)
		//While((St
		{
			System.out.println("Writing to File...");
			bw.write(s,0,s.length());
			bw.newLine();
		}//while

		String c = new String("This File is Copied by Java® All Rights Reserved");

		bw.newLine();
		bw.write(c,0,c.length());
		bw.close();
		System.out.println();
		System.out.println("File Written Sucessfully.");
	}//main
}//class
