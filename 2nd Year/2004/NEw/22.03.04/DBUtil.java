
import java.sql.*;
public class DBUtil
{

	//=================Global Variable =============================
	Statement stmt;
	public DBUtil()
	{
		try{
			//==== Loading driver===================
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			//==================Specify the Data Source=================
			//Connection con = DriverManager.getConnection("jdbc:obdc:DSN","User","Pass");
			Connection con = DriverManager.getConnection("jdbc:odbc:SMS17","","");
			//===================Creating sataemaent===========================
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
									   ResultSet.CONCUR_READ_ONLY);
		   }catch(ClassNotFoundException cnfe)
		     {System.out.println("Class not FoundError");}

		    catch(SQLException sqle)
		     {System.out.println("SQL ERROR");}
	}// End of construstor
}// End of class


