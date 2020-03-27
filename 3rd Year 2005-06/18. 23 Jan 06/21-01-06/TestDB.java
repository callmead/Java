import java.sql.*;

public class TestDB{

	DBConn db = new DBConn();

	public TestDB(){

		try{
			ResultSet rs = db.stmt.executeQuery("SELECT * FROM Supply");

			rs.next();
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
		}catch(SQLException sqle){System.out.println(sqle);}


	}

	public static void main(String[] args){
		new TestDB();
    }

}