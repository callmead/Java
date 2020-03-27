import java.io.*; 	//Buffered Reader and Writer
import java.util.*;	//Vector

public class writeLogFile
{
	public writeLogFile(String SQLString)
	{//Write Log File
		write(SQLString);
  	}////End Write Log File

  	public void write(String SQLString)
  	{
		File f;
		String readFileText = new String();;
		String newText = new String();
		newText=SQLString;
		try{
				f=new File("log.txt");
				if(f.exists())
				{
					Vector v = new Vector();
					BufferedReader br = new BufferedReader(new FileReader(f));

					while ((readFileText=br.readLine())!=null)
					{
						v.add(readFileText);
					}

					int Lines = v.size();

					String x[] = new String[Lines];

					for (int i = 0;i<v.size();i++)
					{
						x[i] = v.elementAt(i).toString();
					}

					BufferedWriter bw=new BufferedWriter(new FileWriter(new File("log.txt")));

					String currentLine = new String();

					for (int y=0; y<v.size(); y++)
					{
						currentLine=x[y];
						bw.write(currentLine);
						bw.newLine();
					}
					//bw.newLine();
					bw.write(newText);
					bw.close();

				}
				else
				{
					System.out.println("Log File Does not Exist!!! new File Created");
				}
			}catch(Exception e){}

	}

  	//public static void main
}


