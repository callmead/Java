/*
 * Public Domain Sample Code 
 */
package test;

import de.must.print.Report;
import de.must.dataobj.ConnectionSpecification;

/**
 * Sample.
 * @author Christoph Mueller
 */
public class ReportTest {

  private static final ConnectionSpecification connectionSpecification
    = new ConnectionSpecification("myODBCname", "dbUserName", "dbUserPwd");
 
  public ReportTest() {
    Report.exec("myReport", connectionSpecification, Report.OUTPUT_TO_HTML, "", new String[] {"Parameter 1", "Parameter 2"}, "c:/temp/test.html");
    System.exit(0);
  }
  
  public static void main(String[] args) {
    new ReportTest();
  }

} 


