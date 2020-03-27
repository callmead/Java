public class Report {

  public static final int OUTPUT_TO_PRINTER = 0;
  public static final int OUTPUT_TO_WINDOW = 1;
  public static final int OUTPUT_TO_HTML = 2;

  public static boolean exec(String reportName, ConnectionSpecification connectionSpecification, boolean outputToWindow) {
    return exec(reportName, connectionSpecification, outputToWindow, "");
  }

  public static synchronized boolean exec(String reportName, String odbcName, boolean outputToWindow, String whereCondition) {
    StringBuffer cmd = new StringBuffer();
    cmd.append("Report.exe Report[" + reportName + ".rpt] datasource[" + odbcName + "]");
    if (whereCondition != null && !whereCondition.equals("")) cmd.append(" where[" + whereCondition + "]");
    if (outputToWindow) {
      cmd.append(" Output[toWindow]");
      // cmd.append" State[wsNormal]"); // choose wsNormal or wsMaximized;
      cmd.append(" State[wsMaximized]"); // choose wsNormal or wsMaximized;
      cmd.append(" PrintSetupBtn[true]");  // activate if print setup button should be visible - to choose a printer e.g.
    }
    else cmd.append(" Output[toPrinter]");
    return exec(cmd.toString());
  }

  public static synchronized boolean exec(String reportName, ConnectionSpecification connectionSpecification, boolean outputToWindow, String whereCondition) {
    return exec(reportName, connectionSpecification,  outputToWindow, whereCondition, (String[])null);
  }

  public static synchronized boolean exec(String reportName, ConnectionSpecification connectionSpecification, boolean outputToWindow, String whereCondition, String[] parameters) {
    int outputType = OUTPUT_TO_PRINTER;
    if (outputToWindow) outputType = OUTPUT_TO_WINDOW;
    return exec(reportName, connectionSpecification, outputType, whereCondition, parameters);
  }

  public static synchronized boolean exec(String reportName, ConnectionSpecification connectionSpecification, int outputType, String whereCondition, String[] parameters) {
    return exec(reportName, connectionSpecification, outputType, whereCondition, parameters, "C:\temp\report_output.html");
  }

  public static synchronized boolean exec(String reportName, ConnectionSpecification connectionSpecification, int outputType, String whereCondition, String[] parameters, String outputFileName) {
    StringBuffer cmd = new StringBuffer();
    cmd.append("Report.exe Report[" + reportName + ".rpt] datasource[" + connectionSpecification.getOdbcName() + "]");
    if (whereCondition != null && !whereCondition.equals("")) cmd.append(" where[" + whereCondition + "]");
    switch (outputType) {
    case OUTPUT_TO_WINDOW:
      cmd.append(" Output[toWindow]");
      // cmd.append" State[wsNormal]"; // choose wsNormal or wsMaximized;
      cmd.append(" WindowState[wsMaximized]"); // choose wsNormal or wsMaximized;
      cmd.append(" PrintSetupBtn[true]");  // activate if print setup button should be visible - to choose a printer e.g.
      break;
    case OUTPUT_TO_HTML:
      cmd.append(" Output[toHTML]");
      break;
    default:
      cmd.append(" Output[toPrinter]");
    }
    if (connectionSpecification.getUserName() != null) {
      cmd.append(" User[" + connectionSpecification.getUserName() + "]");
    }
    if (connectionSpecification.getPassword() != null) {
      cmd.append(" Password[" + connectionSpecification.getPassword() + "]");
    }
    if (parameters != null) for (int i = 0; i < parameters.length; i++) {
      cmd.append(" Parm" + (i+1) + "[" + parameters[i] + "]");
    }
    if (outputFileName != null) {
      cmd.append(" FileName[" + outputFileName + "]");
    }
    return exec(cmd.toString());
  }

  private static synchronized boolean exec(String cmd) {
    // System.out.println(cmd);
    try {
      Runtime.getRuntime().exec(cmd);
    }
    catch (Exception e) {
      e.printStackTrace();
      System.out.println(cmd + " could not be executed.");
      System.out.println("Please ensure that Report.exe may be found by java.exe by putting it in an appropriate directory.");
      return false;
    }
    return true;
  }

  public Report() {
  }

}
