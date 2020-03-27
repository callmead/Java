import java.util.Date;
import java.text.DateFormat;
public class DateDemo1
{
public static void main(String args[])
{
Date d = new Date();
//System.out.println("Current date:"+d);
//System.out.println("Milli Second:"+d.getTime());
//long x=d.getTime();
//x=x+1000*24*60*60*3;
//d.setTime(x);
//System.out.println("After Adding:"+d);

DateFormat dfs = DateFormat.getDateInstance(DateFormat.SHORT);
System.out.println("SHORT Format:"+dfs.format(d));

DateFormat dfl = DateFormat.getDateInstance(DateFormat.LONG);
System.out.println("LONG Format:"+dfl.format(d));

DateFormat dfm = DateFormat.getDateInstance(DateFormat.MEDIUM);
System.out.println("MEDIUM Format:"+dfm.format(d));

DateFormat dff = DateFormat.getDateInstance(DateFormat.FULL);
System.out.println("FULL Format:"+dff.format(d));



DateFormat tfs = DateFormat.getTimeInstance(DateFormat.SHORT);
System.out.println("SHORT Format:"+tfs.format(d));

DateFormat tfl = DateFormat.getTimeInstance(DateFormat.LONG);
System.out.println("LONG Format:"+tfl.format(d));

DateFormat tfm = DateFormat.getTimeInstance(DateFormat.MEDIUM);
System.out.println("MEDIUM Format:"+tfm.format(d));

DateFormat tff = DateFormat.getTimeInstance(DateFormat.FULL);
System.out.println("FULL Format:"+tff.format(d));



DateFormat dtfs = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);
System.out.println("SHORT Format:"+dtfs.format(d));

DateFormat dtfl = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
System.out.println("LONG Format:"+dtfl.format(d));

DateFormat dtfm = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
System.out.println("MEDIUM Format:"+dtfm.format(d));

DateFormat dtff = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL);
System.out.println("FULL Format:"+dtff.format(d));


}
}