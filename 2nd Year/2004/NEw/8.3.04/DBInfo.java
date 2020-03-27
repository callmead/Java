import java.sql.*;
public class DBInfo
{

	//=================Declear class Object=============================
	DBUtil db = new DBUtil();
	ResultSet rs;
	ResultSetMetaData rsmd;

	public DBInfo()
	{
		try{
			//==== Initiallize===================
			rs = db.stmt.executeQuery("SELECT * FROM Student");
			rsmd = rs.getMetaData();

		   System.out.println("Total Field : "+ rsmd.getColumnCount());
		   System.out.println("Field\tType\tName\t\tSize");

		  // System.out.print(rsmd.getColumnLabel(1));// or System.out.print(rsmd.getColumnName(1));
		  for(int i=1; i<=rsmd.getColumnCount(); i++)
		  {
			  System.out.print(rsmd.getColumnName(i)+"\t");
			  System.out.print(rsmd.getColumnType(i)+"\t");
			  System.out.print(rsmd.getColumnTypeName(i)+" \t");
			  System.out.println(rsmd.getColumnDisplaySize(i));
	      }

		    }catch(SQLException s1){}

	}// End of construstor

	public static void main(String args[])
	{
		DBInfo ob = new DBInfo();
    }
}// End of class

