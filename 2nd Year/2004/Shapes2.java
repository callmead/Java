import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

import javax.swing.*;

public class Shapes2 extends JFrame
{
	public Shapes2()
	{
		super("Drawing 2D Shapes");
		getContentPane().setBackground(Color.yellow);
		setSize(400,400);
		setVisible(true);
	}

	public void paint(Graphics g)
	{
		super.paint(g);
		int xPoints[]={55,67,109,73,83,55,27,37,1,43};
		int yPoints[]={0,36,36,54,96,72,96,54,36,36};

		Graphics2D g2d= (Graphics2D) g;
		GeneralPath star =  new GeneralPath();
		star.moveTo(xPoints[0],yPoints[0]);

		for(int count=1; count<xPoints.length; count++)
		star.lineTo(xPoints[count],yPoints[count]);

		star.closePath();
		g2d.translate(200,200);

		for(int count=1; count<=20; count++)
		{
			g2d.rotate(Math.PI/10.0);

			g2d.setColor(new Color(
				(int) (Math.random()*256),
				(int) (Math.random()*256),
				(int) (Math.random()*256) ));

			for(int s=1; s<=1000; s++)//Just to draw slowly for animation to be seen
			g2d.fill(star);
		}
	}

	public static void main(String x[])
	{
		Shapes2 app = new Shapes2();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
