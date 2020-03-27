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
		{//Start Try
			//Loading ODBC/JDBC Driver...
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); // this statement does not need ant import this is loaded from Java.lang Package, default loaded

			//Specifying DNS
			Connection cn = DriverManager.getConnection("jdbc:odbc:SMS17"); //DriverManager is a class in SQL package and getConnection method of class DriverManager

			//Initialize Statement
			stmt=cn.createStatement();
		}//End Try

		catch(ClassNotFoundException cnfe)
		{System.out.println("Error: Invalid Class Name...");}	//System.out.println("Error: "+cnfe);

		catch(SQLException sqle) //Catching initialize statement exception.
			{System.out.println("Error: DSN or Database not found...");}

	}//Constructor
}//End Class