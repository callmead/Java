
import java.awt.*;
import javax.swing.*;


public class Frame1 extends JWindow {
  BorderLayout borderLayout1 = new BorderLayout();
  JProgressBar pBar1 = new JProgressBar();

  public Frame1() {
    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
  public static void main(String[] args) {
    Frame1 frame1 = new Frame1();
    frame1.setVisible(true);
  }
  private void jbInit() throws Exception {
    //this.setTitle("Progress Bar Demo");
    this.setBounds(200,100,400,300);
    this.getContentPane().setLayout(borderLayout1);
    this.getContentPane().add(pBar1, BorderLayout.SOUTH);

    //------------ Properties of Progress Bar ---------------
    pBar1.setStringPainted(true); //to show the %

    MyProgressBar();

  }

  public void MyProgressBar()
  {
   Thread t = new Thread(new Runnable(){
                  public void run()
                  {
                      for(int i=0;i<=100;i++)
                      {
                          pBar1.setValue(i);
                          pBar1.setString("Completed "+i+"%");

                          try{ Thread.sleep(100); }catch(InterruptedException ie){}
                      }

                      //dispose();
                     // System.exit(0);
                     frmCompany f = new frmCompany();
                     f.setVisible(true);
                     dispose();
                  }//End of Run Method
          });
          t.start();
    }///End of Method
}