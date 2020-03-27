
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.crystaldecisions.DIBitmap.*;
import com.crystaldecisions.MetafileRenderer.*;
import com.crystaldecisions.ReportViewer.*;
import com.crystaldecisions.Utilities.*;

public class frmRptViewer extends JFrame {
  ReportViewerBean rptViewer = new ReportViewerBean();
  Dimension frameSize, screenSize ;
  public frmRptViewer() {

    try {
      jbInit();

      pack();
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }


  private void jbInit() throws Exception {
   screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    screenSize.width= screenSize.width-10;
    screenSize.height=screenSize.height-50;
   this.setBounds(new Rectangle(screenSize));

   frameSize = this.getSize();
   this.getContentPane().setLayout(null);

   rptViewer.setBounds(new Rectangle(frameSize));
   this.getContentPane().add(rptViewer, null);
 }

//Overridden so we can exit when window is closed
  protected void processWindowEvent(WindowEvent e) {
    super.processWindowEvent(e);
    if (e.getID() == WindowEvent.WINDOW_ACTIVATED){
      super.setSize(screenSize);
      super.setLocation(0,0);
      try{
        rptViewer.setShowCrystalLogo(false);
        rptViewer.setZoomFactor(rptViewer.zoomToPageWidth);
        rptViewer.setHasStatusBar(true);
        rptViewer.setShowGroupTree(false);
        rptViewer.setCanDrillDown(false);
        rptViewer.repaint();
      }catch(Exception Ex){
        Ex.printStackTrace();
      }
    }
    else if(e.getID()== WindowEvent.WINDOW_STATE_CHANGED){
     rptViewer.setSize(frameSize);
     try{
        rptViewer.setZoomFactor(rptViewer.zoomToWholePage);
        rptViewer.repaint();
      }catch(Exception Ex){
        Ex.printStackTrace();

   }
  }
  }
}

