//Showing data in text fields
import java.sql.*;
import java.awt.*;
import java.awt.event.*;

public class QueryApp4 extends Frame implements ActionListener
{//Class
	TextField pid;
	TextField pname;
	Button next;
	Panel p;

	//These variables are declared as static because they have to be accessed in a static method
	static ResultSet result;
	static Connection cn;
	static Statement stat;


	//The constructor of the QueryApp class
	public QueryApp4()
	{//Consntructor

		super ("The Querry Application");
		setLayout(new GridLayout(5,1));
		pid = new TextField(20);
		pname = new TextField(50);
		next = new Button("Next");
		p =  new Panel();

		//Adding controls to pannel
		add(new Label("Publisher ID:"));
		add(pid);
		add(new Label("Publisher Name:"));
		add(pname);
		add(p);
		p.add(next);
		next.addActionListener(this);
		pack();
		setVisible(true);

	}//End Consntructor


	//The main method creates an object of the class and displays the first record
	public static void main(String a[])
	{//Main
		QueryApp4 obj =  new QueryApp4();
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			cn = DriverManager.getConnection("jdbc:odbc:MyDataSource","sa","");
			stat = cn.createStatement();
			result = stat.executeQuery("Select pub_id,pub_name from Publishers");
			result.next();
		}
		catch(Exception e)
		{
			System.out.println("Error "+e);
		}

	}//End Main


	//Event Handling for Next Button
	public void actionPerformed(ActionEvent x)
	{//actionPerformed

		if (x.getSource()==next)
		{
			try
			{
				result.next();
			}
			catch(Exception e)
			{
			}

			showRecord(result);
		}
	}//end actionPerformed


	//ShowRecord Method to show records
	public void showRecord(ResultSet result)
	{//Show Record

		try
		{
			pid.setText(result.getString(1));
			pname.setText(result.getString(2));
		}
		catch(Exception e)
		{
		}

	}//End Show Record

}//End Class