import java.sql.*;
import tools.diit.*;

public class DBConn
{

	public Statement stmt;

	public DBConn()
	{

/*//ODBC Connection
		try{
			//------------------ Specify Driver -------------
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			//------------------ Specify ODBC Connection -------
				Connection con = DriverManager.getConnection("jdbc:odbc:sms");
			//----------------- Create a Statement -------------
				stmt = con.createStatement();

			}catch(ClassNotFoundException cnfe){
				System.out.println("Driver Not Found !!!");
				cnfe.printStackTrace();}
			 catch(SQLException sqle){
				 System.out.println("ODBC Not Found !!!");
				 sqle.printStackTrace();}
*/
//Connection Using Tools
stmt=new DBase().getStatement("./Data/SIS.mdb","","");
	}//End of Constructor

}//End of Class

//Internal Frame this.setMaximizable(true);