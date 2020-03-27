//Vector Program
import java.util.*;
import java.io.*;
public class Test5
{
	public static void main (String args[])throws IOException
	{
		BufferedReader br= new BufferedReader(new FileReader(new File("e:\\input.txt")));
		Vector v=new Vector();
		StringTokenizer st;
		String s;
		while((s=br.readLine())!=null)
		{
			//StringTokenizer st = new StringTokenizer(s);
			st = new StringTokenizer(s);
			while(st.hasMoreElements())
			{
				v.add(st.nextToken());
			}//2nd while
		}//1st while

		int words = v.size();
		System.out.println(words);
		String x[] = new String[words];
		for (int i = 0;i<words;i++)
		{
			x[i] = v.elementAt(i).toString();
		}

		for (int g = 0;g<words;g++)
		{
			for(int h=g+1;h<words;h++)
			{
				if(x[g].equals(x[h]))
				{
					x[h]="null";
				}//if
			}//for2
		}//for1
		for(int i=0;i<words;i++)
		{
			if(!(x[i]).equals("null"))
			System.out.println(x[i]);
		}//for
	}//main
}//class