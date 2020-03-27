//Java 1st File 7th March 2004 Database Connectivity ODBC DSN Name = SMS17

import java.sql.*; //for Statement and other SQL Objects

public class DBU
{//Class

	//Global Objects...
	Statement stmt;
	//-----------------

	public DBU()
	{//Constructor

    	try
		{
			//Loading ODBC/JDBC Driver...
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); // this statement does not need ant import this is loaded from Java.lang Package, default loaded
			System.out.println("Connecting...");

			//Specifying DNS
			Connection cn = DriverManager.getConnection("jdbc:odbc:MySQL_DSN","adeel","malik"); //DriverManager is a class in SQL package and getConnection method of class DriverManager
			//Date format not supported by MySQL so disbale DateFormat default data format is 0000-00-00 in MySQL

			//Initialize Statement

			//stmt=cn.createStatement(); //by default this statement is used to move next only

			stmt=cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,	//Value 1004, either TYPE_SCROLL_INSENSITIVE or 1004
									ResultSet.CONCUR_READ_ONLY);		//Value 1007, either CONCUR_READ_ONLY or 1007
		}

		catch(ClassNotFoundException cnfe)
		{
			System.out.println("Error: Invalid Class Name!!!");
			System.out.println("*** Exception: "+cnfe);
		}	//System.out.println("Error: "+cnfe);

		catch(SQLException sqle) //Catching initialize statement exception.
		{
			System.out.println("Error: DSN or Database not found!!!");
			System.out.println("*** Exception: "+sqle);
		}

		System.out.println("Connected to Database...\n");

	}//Constructor
}//End Class