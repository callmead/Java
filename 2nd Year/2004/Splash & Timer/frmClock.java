
import java.awt.*;
import javax.swing.*;

import java.text.*; //SimpleDateFormat
import java.util.*; //SimpleDateFormat

public class frmClock extends JFrame {
  JLabel lblPicture = new JLabel();
  JLabel lblCopyright = new JLabel();

  SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");

  public static void main(String[] args) {
    frmClock frame1 = new frmClock();
    frame1.setVisible(true);

  }

  public frmClock() {

      this.getContentPane().add(lblPicture, BorderLayout.CENTER);
      this.getContentPane().add(lblCopyright, BorderLayout.SOUTH);

      lblPicture.setText("00:00:00");
      lblPicture.setFont(new Font("Arial",Font.BOLD,18));
      lblPicture.setHorizontalAlignment(SwingConstants.CENTER);

      lblCopyright.setText("Message");

      this.setSize(400,400);
      centerForm(this);


      Thread th = new Thread(new Runnable(){
		  public void run()
		  {
			  while(true)
			  {
				  Date dt = new Date();

				  lblPicture.setText(sdf.format(dt));
				  try{  Thread.sleep(100); } catch(InterruptedException ie){}

				  if (lblPicture.getText().equals("10:23:30"))
				  {

					  lblCopyright.setText("Disable All");
				  }

			  }//End of while Loop
		  }//End of Run Method
	  }); //End of Thread

	  th.start();


  }//End of Constructor

  public void  centerForm(JFrame f)
  {
      int x = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
      int y = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();

      int cx = (x- f.getWidth())/2;
      int cy = (y- f.getHeight())/2;
      f.setLocation(cx,cy);
  }//End of Method centerFrame

}