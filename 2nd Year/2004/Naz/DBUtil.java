import javax.swing.*;
import java.sql.*;

public class DBUtil
{
	// -------- golbal declaration ----------
	Statement stmt;

	public DBUtil()
	{
		try
		{

		//-------connectin with Databese---------
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con=DriverManager.getConnection(
				"jdbc:odbc:DIIT");
		stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
								 ResultSet.CONCUR_READ_ONLY);


		}
		catch(ClassNotFoundException cnfe)
		   {System.out.println("Drive , Error");}
		catch(SQLException sqle)
		   {System.out.println("SQL , Error");}


	}//End of constructor
}//End of Class