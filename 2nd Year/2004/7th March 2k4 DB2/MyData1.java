//Java 2nd File 7th March 2004
import java.sql.*;

public class MyData1
{//Class

    //Global Objects...
    DBU db = new DBU();
    ResultSet rs;
    //-----------------

	public MyData1()
	{//Constructor
		try
		{//Start Try
			rs = db.stmt.executeQuery("SELECT * FROM Student");
			//rs.next();//Making it to move to  First Record By default its on BOF

			System.out.println("-----------------------------------------------------------------------------");

			while(rs.next()) //While there is any record
			{

				System.out.print("SID:     "+rs.getString(1)+"\n");
				System.out.print("Name:    "+rs.getString(2)+"\n");
				System.out.print("Address: "+rs.getString(3)+"\n");
				System.out.print("Phone:   "+rs.getString(4)+"\n");
				System.out.print("DOB:     "+rs.getString(5)+"\n");
				System.out.print("Dues:    "+rs.getString(6)+"\n");

					System.out.println("-----------------------------------------------------------------------------");
				//-----------------------------
			};

		}//End Try
		catch(SQLException sqle){System.out.println(sqle);}
	}//Constructor

	public static void main(String x[])
	{//Main
		MyData1 md1 = new MyData1();
	}//Main

}//Class