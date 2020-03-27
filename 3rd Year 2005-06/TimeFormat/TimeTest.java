import java.text.*;
import java.util.Date;

public class TimeTest
{//Class

	public TimeTest()
	{//Cons
		getSystemTime();
	}//Cons

	private void getSystemTime()
	{//getSystemTime()
		Thread th = new Thread(new Runnable()
		{
			public void run()
			{
				SimpleDateFormat sdf = new SimpleDateFormat();
				while (true)
				{
					Date dt = new Date();
					sdf.applyPattern("HH:mm:ss");

					System.out.println("24Hour Time: "+sdf.format(dt));

					try	{Thread.sleep(1000);}
					catch (Exception e) {}
				}
			}
		});

		th.start();
	}//getSystemTime()

	public static void main(String x[])
	{//Main
		new TimeTest();
	}//Main

}//Class

/*
HELP...

Time Format Syntax:

To specify the time format use a time pattern string. In this pattern, all ASCII letters are reserved as pattern letters, which are defined as the following:

 Symbol   Meaning                 Presentation        Example
 ------   -------                 ------------        -------
 G        era designator          (Text)              AD
 y        year                    (Number)            1996
 M        month in year           (Text & Number)     July & 07
 d        day in month            (Number)            10
 h        hour in am/pm (1~12)    (Number)            12
 H        hour in day (0~23)      (Number)            0
 m        minute in hour          (Number)            30
 s        second in minute        (Number)            55
 S        millisecond             (Number)            978
 E        day in week             (Text)              Tuesday
 D        day in year             (Number)            189
 F        day of week in month    (Number)            2 (2nd Wed in July)
 w        week in year            (Number)            27
 W        week in month           (Number)            2
 a        am/pm marker            (Text)              PM
 k        hour in day (1~24)      (Number)            24
 K        hour in am/pm (0~11)    (Number)            0
 z        time zone               (Text)              Pacific Standard Time
 '        escape for text         (Delimiter)
 ''       single quote            (Literal)           '

---------------------------------------------------------------------------

Examples Using the US Locale:

 Format Pattern                         Result
 --------------                         -------
 "yyyy.MM.dd G 'at' hh:mm:ss z"    ->>  1996.07.10 AD at 15:08:56 PDT
 "EEE, MMM d, ''yy"                ->>  Wed, July 10, '96
 "h:mm a"                          ->>  12:08 PM
 "hh 'o''clock' a, zzzz"           ->>  12 o'clock PM, Pacific Daylight Time
 "K:mm a, z"                       ->>  0:00 PM, PST
 "yyyyy.MMMMM.dd GGG hh:mm aaa"    ->>  1996.July.10 AD 12:08 PM


Code Sample:
 SimpleTimeZone pdt = new SimpleTimeZone(-8 * 60 * 60 * 1000, "PST");
 pdt.setStartRule(DateFields.APRIL, 1, DateFields.SUNDAY, 2*60*60*1000);
 pdt.setEndRule(DateFields.OCTOBER, -1, DateFields.SUNDAY, 2*60*60*1000);

 // Format the current time.
 SimpleDateFormat formatter
     = new SimpleDateFormat ("yyyy.MM.dd G 'at' hh:mm:ss a zzz");
 Date currentTime_1 = new Date();
 String dateString = formatter.format(currentTime_1);

 // Parse the previous string back into a Date.
 ParsePosition pos = new ParsePosition(0);
 Date currentTime_2 = formatter.parse(dateString, pos);

/*