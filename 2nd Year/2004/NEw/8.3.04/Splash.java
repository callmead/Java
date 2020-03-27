import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Splash extends JWindow
{
	public Splash()

	{
	   JPanel p=(JPanel) this.getContentPane();
	ImageIcon icon=new ImageIcon("333.gif");

	JLabel pict=new JLabel(icon);
	pict.setBorder(BorderFactory.createRaisedBevelBorder());
    final JProgressBar pb=new JProgressBar();
	//===============Get Image Size===============

	int iw=icon.getIconWidth();
	int ih=icon.getIconHeight();
    this.setSize(iw,ih);
	p.add(pict,BorderLayout.CENTER);
	p.add(pb,BorderLayout.SOUTH);
    p.setBorder(BorderFactory.createLineBorder(Color.white,3));

   //====================Get Screen Dimantion==========

    Dimension screen =Toolkit.getDefaultToolkit().getScreenSize();
    int x=(int)screen.getWidth();
    int y=(int)screen.getHeight();
    this.setLocation((x-iw)/2,(y-ih)/2);


    setVisible(true);

//==========================properties of pBar========
pb.setStringPainted(true);
pb.setMinimum(0);
pb.setMaximum(70);

//==========================

Thread t=new Thread(new Runnable()
{
   public void run()
   {
	   for(int i=0;i<=70;i++)
       {

 		pb.setValue(i);
 		pb.setString(i+"% complite");

 		try{Thread.sleep(100);}catch(Exception jj){}
	   }

       setVisible(false);
       frmMain frmMain = new frmMain();
       frmMain.setVisible(true);
   }
});
t.start();


}


	public static void main(String arg[])
	{

     Splash s=new Splash();

    }

}