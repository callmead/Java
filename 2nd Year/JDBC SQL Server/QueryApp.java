//QuerryApp.Java SQL Database Connectivity
//First goto ODBC then select SQL Driver and give DSN NAme as MyDataSource and Server Local
//then use the SQL Server authentication and use user sa and press next
// then check Change the default database to and select pubs and press next and press finish test connection

import java.sql.*;
public class QueryApp
{
	public static void main(String a[])
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection cn;
			cn = DriverManager.getConnection("jdbc:odbc:MyDataSource","sa","");
			//cn = DriverManager.getConnection("jdbc:odbc:SMS17");
			Statement stat=cn.createStatement();
			stat.executeQuery("Select * from Publisher");
		}
		catch (Exception e)
		{
			System.out.println("Error "+e);
		}
	}
}