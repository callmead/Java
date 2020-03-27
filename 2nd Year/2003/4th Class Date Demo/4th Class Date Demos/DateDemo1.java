import java.util.Date;
public class DateDemo1
{
	public static void main (String s[])
	{
		Date d = new Date();
		System.out.println("Short Date "+d);
		System.out.println("Milisecond from 1970 "+d.getTime());

		//To calculate next 5 days time
		long x = d.getTime();
		x = x+1000*24*60*60*5;
		//x+milisecond * one day hours * Minutes * Seconds * 5 days (Maximum 24)

		d.setTime(x);
	}
}