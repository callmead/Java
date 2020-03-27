import javax.swing.*;
import javax.swing.event.*;

import java.awt.*;
public class MyApplet extends JApplet

{
	Image img;
	JButton applet=new JButton("Button on applet");
	public void init()
	{
		getContentPane().add(applet);
		img=getImage(getDocumentBase(),"ad11.gif");
	}
	public void paint(Graphics g)
	{
		g.drawString("Hello Applet programmer",50,50);
		g.drawImage(img,50,80,this);

	}



}
