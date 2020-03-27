import java.util.*;
public class DateDemo2
{
	public static void main (String s[])
	{
		Date d = new Date();
		DateFormat dfs = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("Short Date "+dfs.format(d));
	}
}