import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;


public class DateDemo2
{
	public static void main (String s[])
	{
		Date d = new Date();
		SimpleDateFormat df = SimpleDateFormat.getTimeInstance(SimpleDateFormat.SHORT);
		System.out.println("Short Date "+df.format(d));
	}
}