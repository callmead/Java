import java.io.*;
import javax.swing.*;

public class VariableCheck
{
	File f;
	File f2;
	char c;
	public VariableCheck()
	{
		try{
			f=new File("input.txt");
			f2=new File("output.txt");
			FileReader fr=new FileReader(f);
			FileWriter fw=new FileWriter(f2);
			BufferedReader br=new BufferedReader(fr);
			BufferedWriter bw=new BufferedWriter(fw);

			String s=br.readLine();
			System.out.println("The variable given is: "+s);
			if(verify(s))
			{
				System.out.println("Ok");
			}
			else
			{
				System.out.println("wrong");
				s=correctIt(s);
				System.out.println("The final variable name would be : "+s);
				bw.write(s,0,s.length());
				bw.close();
			}
			/**/
		   }catch(Exception e){}

	}//cons
	public String correctIt(String s)
	{
		String s1=JOptionPane.showInputDialog("There has been an error with the word/letter "+c+" Enter the word/letter that you want to replace it with");
		System.out.println(s1);
		String finalString=s1+s.substring(1);
		return finalString;
	}
	public boolean verify(String  s)
	{
		c=s.charAt(0);
		if(Character.isDigit(c))
		return false;
		else
		return true;
	}//verify
	public static void main(String a[])
	{
		new VariableCheck();
	}
}//class