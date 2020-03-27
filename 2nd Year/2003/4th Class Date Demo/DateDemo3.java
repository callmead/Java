import java.util.Date;
import java.text.SimpleDateFormat; //for SDF, Chosing Customizing Date Format
import javax.swing.*;

public class DateDemo3
{

	public static void main (String s[])
	{
		SimpleDateFormat sdf;
		Date d;
		String oldDate;
		String newDate;

		d = new Date();
		oldDate = d.toString();;

		System.out.println("Default Date Format: "+d);
		System.out.println("Default Date Format from String: "+oldDate);

		sdf = new SimpleDateFormat("yyyy-MM-dd");
		newDate = sdf.format(d);
		System.out.println("\nCustomized Date Format: "+newDate);

		//Date d1 = new Date(valueOf(String oldDate));

		String x = JOptionPane.showInputDialog("Enter Date: ");
		sdf = new SimpleDateFormat("dd-MMM-yy");
		newDate = sdf.format(x);
		System.out.println("\nCustomized Date Format2: "+newDate);

	}
}
/*
valueOf
public static Date valueOf(String s)Converts a string in JDBC date escape format to a Date value.
Parameters:
s - date in format "yyyy-mm-dd"
Returns:
a Date object representing the given date
*/