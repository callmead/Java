import java.io.*;
import javax.swing.*;

public class VariableCheck
{
	File f;
	File f1;
	String readFileText;
	String writeFileText;

	public VariableCheck()
	{
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
					System.out.println(readFileText);
				}
				fr.close();
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
			writeFileText="Java";
			bw.write(writeFileText,0,writeFileText.length());
			//bw.write(writeFileText);
			bw.newLine();

			bw.close();

			//End Writing Part........................
			//*************************************************************


			}catch(Exception e){}

	}//cons

	public static void main(String a[])
	{
		new VariableCheck();
	}
}//class