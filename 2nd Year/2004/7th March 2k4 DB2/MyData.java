//Java 2nd File 7th March 2004
import java.sql.*;

public class MyData
{//Class

    //Global Objects...
    DBU db = new DBU();
    ResultSet rs;
    //-----------------

	public MyData()
	{//Constructor
		try
		{//Start Try
			rs = db.stmt.executeQuery("SELECT * FROM Student");
			//rs.next();//Making it to move to  First Record By default its on BOF

			System.out.println("SID:\tName:\tAddress:\tPhone\t\tDOB\t\t    Dues");
			System.out.println("-----------------------------------------------------------------------------");


			while(rs.next()) //While there is any record
			{
				System.out.print(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+" "+rs.getString(6)+"\n");
			};

			System.out.println("-----------------------------------------------------------------------------");
		}//End Try
		catch(SQLException sqle){System.out.println(sqle);}
	}//Constructor

	public static void main(String x[])
	{//Main
		MyData md1 = new MyData();
	}//Main

}//Class