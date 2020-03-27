import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.*;
import java.io.*;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.design.*;
import net.sf.jasperreports.view.*;


public class ViewReport extends JFrame
{

	public static void main(String[] args)
	    {
	          new ViewReport("./Reports/Supplier.jasper",new HashMap().add("IDNum = '002'")).setVisible(true);
	          //new JReportViewer("Stock.jasper");

    }//End of main

	public ViewReport(String fileName)
	{
		//super("View Report",true,true,true,true);
		try
		{


			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("jdbc:odbc:ir");
//			JasperDesign jasperDesign = JasperManager.loadXmlDesign(fileName);
//			JasperReport jasperReport = JasperManager.compileReport(jasperDesign);
//			JasperPrint  print = JasperFillManager.fillReport(jasperReport, null, con);

//				Connection con =getConnection();
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


		}
		catch(FileNotFoundException cnfe)
		{
					cnfe.printStackTrace();
		}
		catch(ClassNotFoundException cnfe)
		{
			cnfe.printStackTrace();
		}
		catch(SQLException sqle)
		{
			sqle.printStackTrace();
		}
		catch(JRException jre)
		{
			jre.printStackTrace();
		}

		setBounds(10,10,400,400);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}

	public ViewReport(String fileName,HashMap parameter)
	{
		//super("View Report",true,true,true,true);
		try
		{


			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("jdbc:odbc:ir");
//			JasperDesign jasperDesign = JasperManager.loadXmlDesign(fileName);
//			JasperReport jasperReport = JasperManager.compileReport(jasperDesign);
//			JasperPrint  print = JasperFillManager.fillReport(jasperReport, null, con);

//				Connection con =getConnection();
				// To fill the report, first you need an instance of JRDataSource and
				//a Map (possibly empty) of any params you use. Then:
				//Map parameters = new HashMap();
				// To load the .jasper file:
				JasperReport template = JasperManager.loadReport(new FileInputStream(fileName));
				//create the report
				JasperPrint report = JasperManager.fillReport(template, parameters, con);
				//To show the reoprt, create a JRViewer and stick it in a dialog:
				JRViewer viewer = new JRViewer(report);



			//JRViewer viewer=new JRViewer(print);
			Container c=getContentPane();
			c.add(viewer);


		}
		catch(FileNotFoundException cnfe)
		{
					cnfe.printStackTrace();
		}
		catch(ClassNotFoundException cnfe)
		{
			cnfe.printStackTrace();
		}
		catch(SQLException sqle)
		{
			sqle.printStackTrace();
		}
		catch(JRException jre)
		{
			jre.printStackTrace();
		}

		setBounds(10,10,400,400);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}


}
