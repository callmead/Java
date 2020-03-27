


import java.sql.*;
import java.text.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import java.awt.geom.*;
import javax.swing.table.*;

import org.jfree.report.*;
import org.jfree.report.elementfactory.*;
import org.jfree.report.function.*;
import org.jfree.report.modules.gui.base.*;
import org.jfree.report.style.*;
import org.jfree.ui.FloatDimension;
import org.jfree.report.util.*;


public class frmFree extends JDialog {

  JLabel lblClientAddress = new JLabel();
  JProgressBar jpb = new JProgressBar();
  JLabel lblClientName = new JLabel();
  JTextField txtClientID = new JTextField();
  JButton cmdDelete = new JButton();
  JButton cmdAddNew = new JButton();
  JButton cmdSave = new JButton();
  JLabel lblClientID = new JLabel();
  JTextField txtclientName = new JTextField();
  JScrollPane jspClientAddress = new JScrollPane();
  JButton cmdClose = new JButton();

  JTextArea txtClientAddress = new JTextArea();



  JOptionPane Msg;
   // Sql variable****************
   DBUtil db =new DBUtil();
  ResultSet rs ;
  boolean jbFound=false;
   String strTable="Purchase";

//All fields of the ExportAir Table for insert update
   String[] strField ={"ID","Name","Address"};
   //All fields of the ExportAir Table for query
  String strFields ="ID,Name,Address";
  JButton cmdReport = new JButton();

  int  rCount=0, coCount=0, rinc=0, colinc=0 ;
       Object cellVal;


  public frmFree() {
    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }

public static void main(String[] args) {
   frmFree frm1 = new frmFree();
   frm1.setVisible(true);
 }

  private void jbInit() throws Exception {
    jspClientAddress.setBounds(new Rectangle(361, 148, 172, 105));

    txtclientName.setText("");
    txtclientName.setBorder(BorderFactory.createLineBorder(Color.black));
    txtclientName.setBounds(new Rectangle(365, 108, 169, 28));

    lblClientID.setBounds(new Rectangle(263, 71, 59, 27));
    lblClientID.setText("Consignee ID");
    lblClientID.setForeground(Color.white);
    lblClientID.setFont(new java.awt.Font("Dialog", 1, 12));


    cmdSave.setText("Save");
    cmdSave.setMnemonic('S');
    cmdSave.setNextFocusableComponent(cmdAddNew);
    cmdSave.setFont(new java.awt.Font("Dialog", 1, 12));
    cmdSave.setBounds(new Rectangle(270, 373, 112, 37));

    cmdAddNew.setText("Add New");
    cmdAddNew.setMnemonic('N');
    cmdAddNew.setNextFocusableComponent(cmdDelete);
    cmdAddNew.setFont(new java.awt.Font("Dialog", 1, 12));
    cmdAddNew.setBounds(new Rectangle(120, 374, 112, 37));

    cmdDelete.setText("Delete");
    cmdDelete.setMnemonic('D');
    cmdDelete.setNextFocusableComponent(cmdClose);
    cmdDelete.setFont(new java.awt.Font("Dialog", 1, 12));
    cmdDelete.setBounds(new Rectangle(403, 373, 112, 37));

    txtClientID.setBounds(new Rectangle(365, 71, 169, 28));
    txtClientID.setText("");
    txtClientID.setBorder(BorderFactory.createLineBorder(Color.black));

    lblClientName.setBounds(new Rectangle(429, 66, 112, 27));
    lblClientName.setText("Name");
    lblClientName.setFont(new java.awt.Font("Dialog", 1, 12));
    lblClientName.setForeground(Color.white);
    lblClientName.setBounds(new Rectangle(264, 109, 96, 27));

    jpb.setBounds(new Rectangle(120, 266, 121, 20));

    lblClientAddress.setText("Address");
    lblClientAddress.setForeground(Color.white);
    lblClientAddress.setFont(new java.awt.Font("Dialog", 1, 12));
    lblClientAddress.setBounds(new Rectangle(263, 140, 94, 27));

    this.getContentPane().setLayout(null);
    this.getContentPane().setBackground(new Color(118, 138, 144));
    this.setBounds(new Rectangle(100,100,900,550));

    cmdClose.setBounds(new Rectangle(535, 373, 112, 37));
    cmdClose.setFont(new java.awt.Font("Dialog", 1, 12));
    cmdClose.setMnemonic('C');
    cmdClose.setText("Close");


    txtClientAddress.setText("");
    txtClientAddress.setNextFocusableComponent(cmdSave);
    txtClientAddress.setBorder(BorderFactory.createLineBorder(Color.black));

    cmdReport.setBounds(new Rectangle(544, 71, 94, 28));
    cmdReport.setFont(new java.awt.Font("Dialog", 1, 12));
    cmdReport.setMnemonic('R');
    cmdReport.setText("Report");

    cmdReport.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e)
          {


             final TableModel data = createData();
             final JFreeReport report = createReportDefinition();
             report.setData(data);
             try
             {
             final PreviewFrame preview = new PreviewFrame(report);
               preview.addWindowListener(new  WindowAdapter(){
                 public void windowClosing(final WindowEvent event)
              {

                preview.dispose();

              }
     });

               preview.pack();
               preview.setVisible(true);
             }
             catch (ReportProcessingException rp)
             {
               Log.error("Failed to generate report ", rp);
             }


     }
    });

    this.setTitle("Consignees");
    this.getContentPane().add(jpb, null);
    this.getContentPane().add(cmdDelete, null);
    this.getContentPane().add(cmdAddNew, null);
    this.getContentPane().add(cmdSave, null);

    this.getContentPane().add(txtClientID, null);
    this.getContentPane().add(lblClientID, null);
    this.getContentPane().add(lblClientAddress, null);
    this.getContentPane().add(txtclientName, null);
    this.getContentPane().add(lblClientName, null);
    this.getContentPane().add(jspClientAddress, null);
    jspClientAddress.getViewport().add(txtClientAddress, null);
    this.getContentPane().add(cmdClose, null);
    this.getContentPane().add(cmdReport, null);

  }


                 /**
                 * Creates a report definition.
                 *
                 * @return a report definition.
                 */
                private JFreeReport createReportDefinition()
                {

                  final JFreeReport report = new JFreeReport();
                  report.setName("Our Valuable Consignees ");
                  TextFieldElementFactory factory = new TextFieldElementFactory();
                  factory.setName("T1");
                  factory.setAbsolutePosition(new Point2D.Float(0, 0));
                  factory.setMinimumSize(new FloatDimension(50, 20));
                  factory.setColor(Color.black);
                  factory.setHorizontalAlignment(ElementAlignment.LEFT);
                  factory.setVerticalAlignment(ElementAlignment.MIDDLE);
                  factory.setNullString("-------------");
                  factory.setFieldname("ID");
                  report.getItemBand().addElement(factory.createElement());

                  factory = new TextFieldElementFactory();
                  factory.setName("T2");
                  factory.setAbsolutePosition(new Point2D.Float(50, 0));
                  factory.setMinimumSize(new FloatDimension(100, 20));
                  factory.setColor(Color.BLACK);
                  factory.setHorizontalAlignment(ElementAlignment.LEFT);
                  factory.setVerticalAlignment(ElementAlignment.MIDDLE);
                  factory.setNullString("-------------");
                  factory.setFieldname("Name");
                  report.getItemBand().addElement(factory.createElement());

                  factory = new TextFieldElementFactory();
                   factory.setName("T3");
                   factory.setAbsolutePosition(new Point2D.Float(160, 0));
                   factory.setMinimumSize(new FloatDimension(180, 20));
                   factory.setColor(Color.BLACK);
                   factory.setHorizontalAlignment(ElementAlignment.LEFT);
                   factory.setVerticalAlignment(ElementAlignment.MIDDLE);
                   factory.setNullString("-------------");
                   factory.setFieldname("Address");
                   report.getItemBand().addElement(factory.createElement());



                          report.getItemBand().addElement(factory.createElement());
                          report.setReportFooter(createReportFooter());
                          report.setReportHeader(createReportHeader());
                          report.setPageFooter(createPageFooter());
                          report.setPageHeader(createPageHeader());
                          report.setPropertyMarked("report.date", true);
                          return report;


                }

                private PageHeader createPageHeader()
                  {
                    final PageHeader header = new PageHeader();
                    header.getStyle().setStyleProperty(ElementStyleSheet.MINIMUMSIZE, new FloatDimension(0, 18));
                    header.getBandDefaults().setFontDefinitionProperty(new FontDefinition("Serif", 10));
                    header.setDisplayOnFirstPage(true);
                    header.setDisplayOnLastPage(false);

                    // is by default true, but it is defined in the xml template, so I add it here too.
                    header.addElement(
                        StaticShapeElementFactory.createRectangleShapeElement(
                            null, Color.decode("#AFAFAF"), null,
                            new Rectangle2D.Float(0, 0, -100, -100),
                            false, true)
                    );
                    final DateFieldElementFactory factory = new DateFieldElementFactory();
                    factory.setName("date1");
                    factory.setAbsolutePosition(new Point2D.Float(0, 0));
                    factory.setMinimumSize(new FloatDimension(-100, 14));
                    factory.setHorizontalAlignment(ElementAlignment.RIGHT);
                    factory.setVerticalAlignment(ElementAlignment.MIDDLE);
                    factory.setNullString("<null>");
                    factory.setFormatString("d-MMM-yyyy");
                    factory.setFieldname("report.date");
                    header.addElement(factory.createElement());

                    header.addElement(
                        StaticShapeElementFactory.createLineShapeElement(
                            "line1", Color.decode("#CFCFCF"),
                            new BasicStroke(2), new Line2D.Float(0, 16, 0, 16))
                    );
                    return header;
                  }

                  /**
                   * Creates a page footer.
                   *
                   * @return The page footer.
                   */
                  private PageFooter createPageFooter()
                  {
                    final PageFooter pageFooter = new PageFooter();
                    pageFooter.getStyle().setStyleProperty
                        (ElementStyleSheet.MINIMUMSIZE, new FloatDimension(0, 30));
                    pageFooter.getBandDefaults().setFontDefinitionProperty(new FontDefinition("Dialog", 10));

                    pageFooter.addElement(StaticShapeElementFactory.createRectangleShapeElement
                        (null, Color.black, null, new Rectangle2D.Float(0, 0, -100, -100), true, false));

                    final LabelElementFactory factory = new LabelElementFactory();
                    factory.setName("Label 2");
                    factory.setAbsolutePosition(new Point2D.Float(0, 0));
                    factory.setMinimumSize(new FloatDimension(-100, 0));
                    factory.setHorizontalAlignment(ElementAlignment.LEFT);
                    factory.setVerticalAlignment(ElementAlignment.TOP);
                    factory.setText("Page- 1");
                    factory.setDynamicHeight(Boolean.TRUE);
                    pageFooter.addElement(factory.createElement());
                    return pageFooter;
                  }

                  /**
                   * Creates the report footer.
                   *
                   * @return the report footer.
                   */
                  private ReportFooter createReportFooter()
                  {
                    final ReportFooter footer = new ReportFooter();
                    footer.getStyle().setStyleProperty
                        (ElementStyleSheet.MINIMUMSIZE, new FloatDimension(0, 48));
                    footer.getBandDefaults().setFontDefinitionProperty
                        (new FontDefinition("Serif", 16, true, false, false, false));

                    final LabelElementFactory factory = new LabelElementFactory();
                    factory.setName("Label 2");
                    factory.setAbsolutePosition(new Point2D.Float(0, 0));
                    factory.setMinimumSize(new FloatDimension(-100, 24));
                    factory.setHorizontalAlignment(ElementAlignment.CENTER);
                    factory.setVerticalAlignment(ElementAlignment.MIDDLE);
                    factory.setText("*** END OF REPORT ***");
                    footer.addElement(factory.createElement());
                    return footer;
                  }

                  /**
                   * Creates the report header.
                   *
                   * @return the report header.
                   */
                  private ReportHeader createReportHeader()
                  {
                    final ReportHeader header = new ReportHeader();
                    header.getStyle().setStyleProperty
                        (ElementStyleSheet.MINIMUMSIZE, new FloatDimension(0, 48));
                    header.getBandDefaults().setFontDefinitionProperty
                        (new FontDefinition("Serif", 20, true, false, false, false));

                    final LabelElementFactory factory = new LabelElementFactory();
                    factory.setName("Label 1");
                    factory.setAbsolutePosition(new Point2D.Float(0, 0));
                    factory.setMinimumSize(new FloatDimension(-100, 24));
                    factory.setHorizontalAlignment(ElementAlignment.CENTER);
                    factory.setVerticalAlignment(ElementAlignment.MIDDLE);
                    factory.setText("Our Valuable Consignees");
                    header.addElement(factory.createElement());
                    return header;
                  }

  				/**
				  * Creates a small dataset to use in a report.  JFreeReport always reads data from a
				  * <code>TableModel</code> instance.
				  *
				  * @return a dataset.
				  */
				 private TableModel createData()
				 {


				   try
				   {
				   rCount = 2;//jdbTable1.getRowCount();
				   coCount = 3;//jdbTable1.getColumnCount();

				 }catch( Exception e )
				   {
				   e.printStackTrace();

				   }

				  final Object[] columnNames = new String[]{"ID", "Name" ,"Address"};
				  final DefaultTableModel result = new DefaultTableModel(columnNames,rCount+2);
				  result.setValueAt("ID",0,0);
				  result.setValueAt("Name",0,1);
				  result.setValueAt("Address",0,2);


				  for ( rinc = 2; rinc < rCount+2; rinc++)
				  {
					for(colinc= 0; colinc < coCount; colinc++ )
					 {
					 cellVal ="Abcd";//jdbTable1.getValueAt ( rinc , colinc);
						   result.setValueAt(cellVal, rinc, colinc );
					 }
				  }


				  return result;

				 }



}
