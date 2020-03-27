
import java.io.*;
import java.sql.*;
import javax.swing.*;
import java.util.*;

//import dori.jasper.view.*;
//import dori.jasper.engine.*;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.design.*;
import net.sf.jasperreports.view.*;



class JReportViewer extends JFrame {


     private static Connection getConnection()
         throws ClassNotFoundException, SQLException {
            //getting the database connnection
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			String url = "jdbc:odbc:ir";
			Connection con =DriverManager.getConnection(url,"","");
            return con;
    }


    //public void showReport() throws JRException, Exception {}
	public JReportViewer(String ReportName)
	{
            try
            {

				Connection con =getConnection();
				// To fill the report, first you need an instance of JRDataSource and
				//a Map (possibly empty) of any params you use. Then:
				Map parameters = new HashMap();
				// To load the .jasper file:
				JasperReport template = JasperManager.loadReport(new FileInputStream(ReportName));
				//create the report
				JasperPrint report = JasperManager.fillReport(template, parameters, con);
				//To show the reoprt, create a JRViewer and stick it in a dialog:
				JRViewer jrv = new JRViewer(report);


                //this.setMaximizable(true);	//Maximize
                //this.setIconifiable(true);	//Minimize
                //this.setClosable(true);	//Close
                //this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                //this.setFrameIcon(new ImageIcon("images/SarinaIcon.gif"));

                this.setResizable(true);
				this.setTitle("SMS Viewer");
				this.getContentPane().add(jrv);
				this.pack();
				this.setVisible(true);

            }catch(Exception ex){System.out.println(ex);ex.printStackTrace();}

	}

	public JReportViewer(String ReportName, String SQLStr)
	{
            try
            {

				Connection con = getConnection();
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

				//this.setMaximizable(true);	//Maximize
				//this.setIconifiable(true);	//Minimize
				//this.setClosable(true);	//Close
                //this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

                this.setResizable(true);
				this.setTitle("SMS Viewer");
				this.getContentPane().add(jrv);
				this.pack();
				this.setVisible(true);

            }catch(Exception ex){System.out.println(ex);ex.printStackTrace();}

	}


    public static void main(String[] args)
    {
          new JReportViewer("./Reports/Test.jasper").setVisible(true);
          //new JReportViewer("Stock.jasper");

    }//End of main
}//End of class
