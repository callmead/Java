
/////// *************** Opening Window ******************//////////////

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Splash extends JWindow
{

	JProgressBar pb=new JProgressBar();
	int i;
	public Splash()
		{
			JPanel con=(JPanel)this.getContentPane();// Panel will get the properties of getContent Pane
			Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
			int sw=(int)screen.getWidth();
			int sh=(int)screen.getHeight();
			this.setSize(400,400);
			ImageIcon icon=new ImageIcon("atm.gif");
			int iw=icon.getIconWidth();
			int ih=icon.getIconHeight();
			int x=(sw-iw)/2;
			int y=(sh-ih)/2;
			JLabel l1=new JLabel(icon);
			l1.setBorder(BorderFactory.createRaisedBevelBorder());
			this.setBounds(x,y,iw,ih);
			con.setBorder(BorderFactory.createLineBorder(Color.white,3));
			con.add(l1,BorderLayout.CENTER);
			con.add(pb,BorderLayout.SOUTH);
			this.setVisible(true);
			pb.setMinimum(100);
						pb.setMaximum(200);
						pb.setStringPainted(true);

						for(i=0;i<=100;i++)
							{
							final int j=i;

							try{
								SwingUtilities.invokeLater(new Runnable(){
									public void run()
									{
										pb.setValue(i);
										pb.setString("Complete  :  "+j+" %");
									}
								});

								Thread.sleep(100);

							}
								catch(Exception e){}
							}//end of loop
							this.setVisible(false);

			}

public static void main(String args[])
{
	Splash sp=new Splash();
	frmLogOn lo=new frmLogOn();

}
}