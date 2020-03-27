
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.*;
import java.io.*;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.design.*;
import net.sf.jasperreports.view.*;


public class JViewReport extends JFrame
{

	public static void main(String[] args)
	    {

			String para = JOptionPane.showInputDialog(null,"Enter IDnumber : ");
	          new JViewReport("./Reports/SuppDetails.jasper",
	                          "Select * from supply where IDNum = '" + para + "'").setVisible(true);
	          //new JViewReport("./Reports/Test.jasper").setVisible(true);

    }//End of main

	public JViewReport(String fileName)
	{
		//super("View Report",true,true,true,true);
		try
		{


			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("jdbc:odbc:ir");
			// To fill the report, first you need an instance of JRDataSource and
			//a Map (possibly empty) of any params you use. Then:
			Map parameters = new HashMap();
			// To load the .jasper file:
			JasperReport template = JasperManager.loadReport(new FileInputStream(fileName));
			//create the report
			JasperPrint report = JasperManager.fillReport(template, parameters, con);
			//To show the reoprt, create a JRViewer and stick it in a dialog:
			JRViewer viewer = new JRViewer(report);

			//JRViewer viewer=new JRViewer(print);
			Container c=getContentPane();
			c.add(viewer);


		}catch(FileNotFoundException cnfe){cnfe.printStackTrace();}
		catch(ClassNotFoundException cnfe){cnfe.printStackTrace();}
		catch(SQLException sqle){sqle.printStackTrace();}
		catch(JRException jre){jre.printStackTrace();}

		this.setBounds(10,10,400,400);


	}


	public JViewReport(String ReportName, String SQLStr)
	{
            try
            {

			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("jdbc:odbc:ir");

			Statement stm = con.createStatement();
			String query = SQLStr;
			ResultSet rs = stm.executeQuery( query );
			/* implements interface JRDataSource DataSource ResultSet */
			JRResultSetDataSource jrRS = new JRResultSetDataSource( rs );
			Map parameters = new HashMap();

			JasperReport template = JasperManager.loadReport(new FileInputStream(ReportName));
			java.util.Map reportParameters = new HashMap();
			//create the report
			JasperPrint report = JasperManager.fillReport(template, parameters, jrRS);
			//To show the reoprt, create a JRViewer and stick it in a dialog:
			JRViewer jrv = new JRViewer(report);


			this.getContentPane().add(jrv);


            }catch(Exception ex){System.out.println(ex);ex.printStackTrace();}

            //this.setMaximizable(true);	//Maximize
			//this.setIconifiable(true);	//Minimize
			//this.setClosable(true);	//Close
			//this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);


			//this.setTitle("SMS Viewer");
			//this.pack();
			this.setBounds(10,10,780,500);

	}

}
