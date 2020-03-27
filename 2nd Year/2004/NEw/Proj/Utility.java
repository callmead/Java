
import java.sql.*;


public class Utility
{

   //====== Global Object ======//
   Statement stmt;

   public Utility()
   {
	   try{
		   //==== Loding driver ====//
		   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

		   //==== Specify the Data Source Name ====//
		   String url = "jdbc:odbc:ord";

		   //==== Creating Connection ====//
		   Connection con = DriverManager.getConnection(url,"Ruhul","Amin");

		   //==== Creating Statement ====//
		   stmt = con.createStatement();

          }catch(ClassNotFoundException cnfe)
                { System.out.println("Sorry, Invalid Driver!!!"); }

           catch(SQLException sqle)
                { System.out.println("SQL Error in Utility"); }

    }//End of Contructor

}//End of Class
