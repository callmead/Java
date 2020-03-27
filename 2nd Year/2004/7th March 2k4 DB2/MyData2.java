//Java 2nd File 7th March 2004
import java.sql.*;

public class MyData2
{//Class

    //Global Objects...
    DBU db = new DBU();
    ResultSet rs;
    //-----------------

	public MyData2()
	{//Constructor

		try
		{//Start Try

			rs = db.stmt.executeQuery("SELECT * FROM Student");
			//rs.next();//Making it to move to  First Record By default its on BOF

			ResultSetMetaData rsmd; //rsmd used to store table's structure
			rsmd=rs.getMetaData(); //Telling rsmd to get data from which table

			System.out.println("Total Fields in Database: "+rsmd.getColumnCount()+"\n");
			System.out.println("=============================================================================");

			//Getting Column Heads and data Auto
			while(rs.next()) //While there is any record

			{//While

				for(int x=1;x<=rsmd.getColumnCount();x++)
				{//For
					System.out.print(rsmd.getColumnName(x)+"\t\t"+rs.getString(x)+"\n");
				}//End For

				System.out.println("-----------------------------------------------------------------------------");

			};//End While

		}//End Try

		catch(SQLException sqle){System.out.println(sqle);}

	}//Constructor

	public static void main(String x[])
	{//Main

		MyData2 md1 = new MyData2();

	}//Main

}//Class