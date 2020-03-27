import java.io.*;

class Test
{
	public static void main(String a[])throws IOException
	{
		BufferedReader br=new BufferedReader(new FileReader(new File("c:\\input.txt")));
		String s;
		String s1="Official Use";
		boolean inOfficialUse=false;
		while((s=br.readLine())!=null)
		{
			if(!s.equals(s1))
			{
				if(!inOfficialUse)
				System.out.println(s);
			}//if
			else
			{
				if(inOfficialUse)
				inOfficialUse=false;
				else
				inOfficialUse=true;
			}//else
		}//while
	}//main
}//class