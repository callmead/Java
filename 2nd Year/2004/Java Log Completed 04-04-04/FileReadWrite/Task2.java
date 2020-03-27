import java.util.*;
import java.io.*;
public class Task2
{
	public static void main (String a[]) throws IOException
	{//Main
		Vector v=new Vector();
		String s;
		BufferedReader br;
		FileReader fr;

		File f = new File("log.txt");

		if(f.exists())
		{
			fr = new FileReader(f); //See API, FileReader This Methods REads Cheracter one by one
			br = new BufferedReader(fr);

			System.out.print("Reading File...");

			while((s=br.readLine())!=null)
			{
				v.add(s);
			}

			System.out.println("Done.");

			int Lines = v.size();

			String x[] = new String[Lines];

			for (int i = 0;i<v.size();i++)
			{
				x[i] = v.elementAt(i).toString();
			}

			//*************************************************************
			try{
				BufferedWriter bw=new BufferedWriter(new FileWriter(new File("log.txt")));
				String currentLine = new String();

				for (int y=0; y<v.size(); y++)
				{
					currentLine=x[y];
					bw.write(currentLine);
					bw.newLine();
					bw.write("----------------");
					bw.newLine();
				}

				bw.close();

				}catch(Exception e){}


		}//End If(Exists)

		else
		{
			System.out.println("The File Does not Exists...");
			System.exit(0);
		}

	}//Main

//	public void WriteToFile()
//	{

//	}//cons

}//Class