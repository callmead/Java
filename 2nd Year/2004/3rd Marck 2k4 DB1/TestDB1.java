//Java 3rd March 2004 Database Connectivity
//We will create an ODBC Connection for the connectivity. ODBC DSN Name = SMS17

import java.sql.*;//for Statement and other SQL Objects

public class TestDB1
{//Class

	//Global Objects
	Statement stmt;
	//----------------------

	public TestDB1()
	{//Constructor

    	try
		{
			//Loading ODBC/JDBC Driver...
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); // this statement does not need ant import this is loaded from Java.lang Package, default loaded

			//Specifying DNS
			Connection cn = DriverManager.getConnection("jdbc:odbc:SMS17"); //DriverManager is a class in SQL package and getConnection method of class DriverManager

			//Initialize Statement
			stmt=cn.createStatement();
			//--------------------------------------------------------------------------------------------------------------------------------------------------------

			//Initiaize objects used to get table's data
			ResultSet rs; //Rs used to store table's Data
			rs = stmt.executeQuery("SELECT * FROM Student");

			ResultSetMetaData rsmd; //rsmd used to store table's structure
			rsmd=rs.getMetaData(); //Telling rsmd to get data from which table

			//Display information...
			System.out.println("Total Fields: "+rsmd.getColumnCount());//Column Count

		}
		catch(ClassNotFoundException cnfe)
		{System.out.println("Error: Invalid Class Name...");}			//System.out.println("Error: "+cnfe);

		catch(SQLException sqle) //Catching initialize statement exception.
			{System.out.println("Error: DSN or Database not found...");}

	}//Constructor

	public static void main (String a[])
	{//Main

		TestDB1 t1 = new TestDB1();

	}//Main

}//End Class