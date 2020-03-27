//QuerryApp.Java SQL Database Connectivity Example 2 and showing data

import java.sql.*;
public class QueryApp2
{
	public static void main(String a[])
	{
		ResultSet result;
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection cn = DriverManager.getConnection("jdbc:odbc:MyDataSource","sa","");
			Statement stat=cn.createStatement();
			result = stat.executeQuery("Select * from Publishers");

			while(result.next())
			{
				System.out.println(result.getString(2)); //2 is the Field Number
			}
		}
		catch (Exception e)
		{
			System.out.println("Error "+e);
		}
	}
}