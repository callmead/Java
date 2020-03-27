/**
* import javax.swing package for using JOptionPane,JFrame getWidth-Height
  setBounds, etc.
* import java.io package for using File class etc.
* An abstract representation of file and directory pathnames.

* import java.applet package for using AudioClip class etc.
* import java.net package for using URL class etc.
* import java.awt.event package for using event handling etc.
* import java.awt package for using Color,Toolkit,Graphics,Container,Layout
  Manager etc.
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.applet.*;
import java.io.*;

/** Inherit JFrame from javax.swing package and ActionListener
 * from java.awt package
 * The listener interface for receiving action events.
 * The class that is interested in processing an action event
 * implements this interface, and the object created with that
 * class is registered with a component, using the component's
 * <code>addActionListener</code> method. When the action event
 * occurs, that object's <code>actionPerformed</code> method is
 * invoked.*/
public class TaskOne extends JFrame implements ActionListener
{
	int a=1,i=10;
	private int radius;
	private Color circleColor;
	JButton increaseButton=new JButton("Increse");
/** draw rectangle,shape,circle on graphical background */
	public void paint(Graphics g)
	{
		/**call paint method from superclass*/
		super.paint(g);
		int x=getWidth();
		int y=getHeight();
		/**set rectangle on center point(width) in the container*/
		int x1=(x/2)-50;
		/**set rectangle on center point(height) in the container*/
		int y1=(y/2)-50;
		g.setColor(Color.yellow);
		/** Measurement of rectangle*/
		g.fillRect(x1,y1,100,100);
		/** Used to display a "Tip" for a Component.*/
		increaseButton.setToolTipText("Press Nutton");
		/**set circle on center point(width) in the container*/
		x1=(x/2)-(radius/2);
		/**set circle on center point(height) in the container*/
		y1=(y/2)-(radius/2);
		g.setColor(circleColor);
		/** Measurement of Circle*/
		g.fillOval(x1,y1,radius,radius);
	}
	/** create consturctor.
	* set toolkit for showning container on centerpoint on the monitor screan*/

	public TaskOne()
	{

		Toolkit toolkit=Toolkit.getDefaultToolkit();
		Dimension size=toolkit.getScreenSize();

		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		c.add(increaseButton);
		/** Resigter button*/
		increaseButton.addActionListener(this);
		drawFillCircle(i,Color.blue);
		setBounds(200,130,size.width/2,size.height/2);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Task One Solution");
		setResizable(false);
		setVisible(true);
	}
	public void drawFillCircle(int r,Color col)
	{
		radius=r;
		circleColor=col;
		repaint();
	}
	/**
	* Invoked when an action occurs.
 	* set true false condition
	*use setText for Button
	*use try catch for playing audion and call
	*AudioClip and URL from superclass
	*use MalformedURLException when AudioClip not Found*/
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==increaseButton)
		{
				if(a==1)
				{
					i=i+5;
					if(i<=33)
					drawFillCircle(i,Color.blue);
					else
					drawFillCircle(i,Color.green);

					if(i==100)
					{
						a=0;
						increaseButton.setText("Decrement");
						try
						{
							File fileobj=new File("drip.au");
							/* The search path for classes and resources
							* Returns the absolute pathname string of this abstract pathname.*/
							URL url=new URL("file:\\"+fileobj.getAbsolutePath());
							/**The <code>AudioClip</code> interface is a simple abstraction for
 							* playing a sound clip*/
							AudioClip audio=Applet.newAudioClip(url);
							audio.play();
						}
						catch(MalformedURLException mfu)
						{
							System.out.println(mfu);

						}

					}
				}
				else
				{
					if(a==0)
					{
						i=i-5;
						if(i>=33)
						drawFillCircle(i,Color.green);
						else
						drawFillCircle(i,Color.blue);

						if(i==10)
						{
							a=1;
							increaseButton.setText("Increment");
							try
							{
								File fileobj=new File("chirp1.au");
								URL url=new URL("file:\\"+fileobj.getAbsolutePath());
								AudioClip audio=Applet.newAudioClip(url);
								audio.play();
							}
							catch(MalformedURLException mfu)
							{
								System.out.println(mfu);
							}

						}
					}
				}
			}
		}
		/** Crate object of this class */
	public static void main(String args[])
	{
		TaskOne tsk=new TaskOne();
	}
}