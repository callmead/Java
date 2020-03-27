//*********************************************************************************
//
//Author :Pooja Mohan and Deepesh K. Srivastva
//
// Sample Code which Implementing the Crystal Reports Java Bean into an Integrated Design Environment
//
//*********************************************************************************


package pmk.com.report;

import java.awt.*;
import java.util.*;
import java.applet.*;
import java.io.*;

public class Report extends Applet
{
		TextField TextField3 = null;
		TextField TextField2 = null;
		Button Button3 = null;
		Button Button2 = null;
		TextField TextField1 = null;
		Button Button1 = null;

		public Report() throws Exception, java.beans.PropertyVetoException {
			super();
			setLayout(null);
			//	beforeFormInitialize();

			// Constructor - Button (Label)
			Button2 = new Button ("View BookSheet Report");
			Button2.setName ("Button2");
			Button2.reshape (244, 109 , 195, 41);
			Button2.setFont (new Font ("Helvetica", 0, 12));
			Button2.setForeground (new Color (0x000000));
			Button2.setBackground (new Color (0xc6c6c6));

			// container is form
			add (Button2);

			// Constructor - TextField (Name)
			TextField1 = new TextField ("TextField1");
			TextField1.setName ("TextField1");
			TextField1.reshape (92, 71 , 147, 29);
		    TextField1.setFont (new Font ("Helvetica", 0, 12));
			TextField1.setForeground (new Color (0x000000));
			TextField1.setBackground (new Color (0xffffff));


		        // container is form
			add (TextField1);

			// Constructor - Button (Label)
			Button1 = new Button ("Export BookSheet Report");
			Button1.setName ("Button1");
			Button1.reshape (244, 69 , 190, 34);
		    Button1.setFont (new Font ("Helvetica", 0, 12));
			Button1.setForeground (new Color (0x000000));
			Button1.setBackground (new Color (0xc6c6c6));

		        // container is form
			add (Button1);

			// Constructor - Button (Label)
			Button3 = new Button ("Print Direct BookSheet Report");
			Button3.setName ("Button2");
			Button3.reshape (244, 150 , 195, 45);
			Button3.setFont (new Font ("Helvetica", 0, 12));
			Button3.setForeground (new Color (0x000000));
			Button3.setBackground (new Color (0xc6c6c6));

			// container is form
			add (Button3);


			reshape (0, 0, 579, 500);

	}

//Print Directly to Printer
void Button3_actionPerformed()
{
	try{
	ReportBeanProperties b = new ReportBeanProperties();

		b.setReportName("http://ServerName:80/reportname.rpt");//Please set the Report Name path acc. to the Virtual Folder created by you on the IIS
		b.setReportParameter("user0=username&password0=password&prompt1=12214");//Specify the Username n' Password of your Database
		//Say,you are connecting to Oracle DataBase with UserName = username,Password : password and Host String : JAVA

		b.setShowGroupTree(false);// Set Show Group Tree to False :Method defined in ListOfProperties.doc
		b.setBackground(new Color(0Xff000000));//Method defined in ListOfProperties.doc

		b.printReport();//Show the Frame
		}catch(Exception ee){
					System.out.println("Exception in main");
					ee.printStackTrace();
		}//try-catch
}

//View Report
void Button2_actionPerformed()
{
	try{
	ReportBeanProperties b = new ReportBeanProperties();

		b.setReportName("http://ServerName:80/reportname.rpt");//Please set the Report Name path acc. to the Virtual Folder created by you on the IIS
		b.setReportParameter("user0=username&password0=password&prompt1=12214");//Specify the Username n' Password of your Database
		//Say,you are connecting to Oracle DataBase with UserName = username,Password : password and Host String : JAVA

		b.setShowGroupTree(false);// Set Show Group Tree to False
		b.setForeground(new Color(0Xff00aa00 );

		b.init();//Show the Frame
		}catch(Exception ee){
					System.out.println("Exception in main");
					ee.printStackTrace();
		}//try-catch
}

//Export Report
void Button1_actionPerformed()
{
	try{
		ReportBeanProperties b = new ReportBeanProperties();
		b.setReportName("http://ServerName:80/reportname.rpt");//Please set the Report Name path acc. to the Virtual Folder created by you on the IIS
		b.setReportParameter("user0=username&password0=password&prompt1=12214");//Specify the Username n' Password of your Database
		//Say,you are connecting to Oracle DataBase with UserName = username,Password : password and Host String : JAVA

		File target = new File(TextField1.getText());
		b.exportReport(target);
		}catch(Exception ee){
			System.out.println("Exception in main");
			ee.printStackTrace();
		}//try-catch
}

	public void actionPerformed( Object obj ){
		if (obj == Button3) {
					Button3_actionPerformed();
		}
		if (obj == Button2) {
			Button2_actionPerformed();
		}

		if (obj == Button1) {
			Button1_actionPerformed();
		}
	}

	public void paint(Graphics g) {
		super.paint (g);
		Dimension d = size();
	}

	public boolean handleEvent (Event evt) {
		return super.handleEvent (evt);
	}

}
