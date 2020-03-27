
import java.awt.*;
import javax.swing.*;


public class frmSplash extends JWindow {
  JLabel lblPicture = new JLabel();
  JLabel lblCopyright = new JLabel();


  public static void main(String[] args) {
    frmSplash frame1 = new frmSplash();

  }

  public frmSplash() {

      this.getContentPane().add(lblPicture, BorderLayout.CENTER);
      this.getContentPane().add(lblCopyright, BorderLayout.SOUTH);

      ImageIcon img = new ImageIcon("3005.gif");
      lblPicture.setIcon(img);
      lblCopyright.setText("Copyright Adeel Corporation 2000-2004");

      this.setSize(img.getIconWidth(), img.getIconHeight());

      this.setVisible(true);
      centerForm(this);

      try{  Thread.sleep(3000); } catch(InterruptedException ie){}
      dispose();

  }//End of Constructor

  public void  centerForm(JWindow f)
  {
      int x = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
      int y = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();

      int cx = (x- f.getWidth())/2;
      int cy = (y- f.getHeight())/2;
      f.setLocation(cx,cy);
  }//End of Method centerFrame

}