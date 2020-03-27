import java.io.*;
import javax.swing.*;

public class readWrite
{
	File f;
	File f1;
	String readFileText = new String();;
	String writeFileText = new String();
	String temp = new String();
	String newText = new String();

	public readWrite()
	{
		newText="Java is a Programming Language";
		try{
			//Reading Part........................
			//*************************************************************
			f=new File("log.txt");
			if(f.exists())
			{
				FileReader fr=new FileReader(f);
				BufferedReader br=new BufferedReader(fr);

				while ((readFileText=br.readLine())!=null)
				{
					temp = temp+readFileText;
					System.out.println(readFileText);
					temp = temp+"\n";
				}
				//fr.close();
			}
			else
			{
				System.out.println("Log File Does not Exist !!!");
			}
			//End Reading Part........................
			//*************************************************************

			//Writing Part........................
			//*************************************************************
			f1=new File("log.txt");
			FileWriter fw=new FileWriter(f1);
			BufferedWriter bw=new BufferedWriter(fw);

			//bw.newLine();
			writeFileText = temp + " ";
			//writeFileText = writeFileText + "\n";
			writeFileText = writeFileText + newText;

			//bw.write(writeFileText,0,writeFileText.length());
			bw.write(writeFileText);

			bw.close();

			//End Writing Part........................
			//*************************************************************


			}catch(Exception e){}

	}//cons

	public static void main(String a[])
	{
		new readWrite();
	}
}//class