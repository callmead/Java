import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.applet.*;
import java.io.*;

public class Task1 extends JFrame implements ActionListener
{
	int a=1,i=10;
	private int radius;
	private Color circleColor;
	JButton increseButton=new JButton("Increse");

	public void paint(Graphics g)
	{
		super.paint(g);
		int x=getWidth();
		int y=getHeight();
		int x1=(x/2)-50;
		int y1=(y/2)-50;
		g.setColor(Color.yellow);
		g.fillRect(x1,y1,100,100);

		x1=(x/2)-(radius/2);
		y1=(y/2)-(radius/2);
		g.setColor(circleColor);
		g.fillOval(x1,y1,radius,radius);
	}
	public Task1()
	{
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		Dimension size=toolkit.getScreenSize();

		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		c.add(increseButton);
		increseButton.addActionListener(this);
		drawFillCircle(i,Color.blue);
		setBounds(200,130,size.width/2,size.height/2);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}
	public void drawFillCircle(int r,Color col)
	{
		radius=r;
		circleColor=col;
		repaint();
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==increseButton)
		{
				if(a==1)
				{
					if(i>=33)
					drawFillCircle(i,Color.green);
					else
					drawFillCircle(i,Color.blue);
					i+=5;
					if(i==100)
					{
						a=0;

						increseButton.setText("Decrement");
						try
						{
							File fileobj=new File("spacemusic.au");
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
				else
				{
					if(i>10)
					{
						drawFillCircle(i,Color.blue);
						i-=5;
					}
					else
					{
						a=1;
						increseButton.setText("Increse");
						try
						{
							File fileobj=new File("2.au");
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
	public static void main(String args[])
	{
		Task1 tsk=new Task1();
	}
}