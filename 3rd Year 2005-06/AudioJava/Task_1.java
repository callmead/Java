
import java.net.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.applet.*;


public class Task_1  extends JFrame implements ActionListener
{
	private int radius=10;
	private Color cirColor;
	boolean b=false;

	JButton cirButton;


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


		g.setColor(setCirColor());
		g.fillOval(x1,y1,radius,radius);
	}

	public Task_1()
	{
		Container c=getContentPane();

		c.setLayout(new FlowLayout());

		c.setBackground(Color.black);

		setBounds(100,100,400,400);

		cirButton=new JButton("Increase Circle");
		c.add(cirButton);
		cirButton.addActionListener(this);
		cirButton.setBackground(Color.pink);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setVisible(true);
	}

	public void drawCircle(int r,Color col)
	{
		radius=r;

		cirColor=col;

		repaint();
	}


	public int getRadius()
	{
		return radius;
	}

	public int increaseRadius()
	{
		return radius=getRadius()+5;
	}

	public int reduceRadius()
	{
		return radius=getRadius()-5;
	}


	public Color setCirColor()
	{
		if(getRadius()>32)
		{
			return cirColor=Color.green;
		}
		else
		{
			return Color.blue;
		}
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==cirButton)
		{
			if(getRadius()>=10 && b==false)
			{
				drawCircle(increaseRadius(),setCirColor());

				if(getRadius()>100)
				{
					b=true;

					try
					{
						File fileObj=new File("DRIP.au");

						URL urlObj=new URL("file:\\"+fileObj.getAbsolutePath());//throws MalformedURLException

						AudioClip audioClipObj=Applet.newAudioClip(urlObj);

						audioClipObj.play();
					}
					catch(MalformedURLException mle)
					{
						JOptionPane.showMessageDialog(this,mle);
					}
					cirButton.setText("Reduce Circle");
				}
			}


			if(getRadius()>10 && b==true)
			{
				drawCircle(reduceRadius(),setCirColor());

				if(getRadius()==10)
				{
					b=false;
					try
					{
						File fileObj=new File("DRIP.au");

						URL urlObj=new URL("file:\\"+fileObj.getAbsolutePath());//throws

						AudioClip audioClipObj=Applet.newAudioClip(urlObj);

						audioClipObj.play();
					}
					catch(MalformedURLException mle)
					{
						JOptionPane.showMessageDialog(this,mle);
					}

					cirButton.setText("Increase Circle");
				}
			}

		}
	}

	public static void main(String args[])
	{
		Task_1 t1=new Task_1();
	}
}