//Sourcecode 
import java.awt.*;
import java.applet.*;

public class Project15 extends Applet
{
        Color myGreen = new Color(110,220,160);
        Color myRed = new Color(255,90,100);
        Color myYellow = new Color(240,240,180);
        Color myBlue = new Color(140,190,250);

        public void paint (Graphics g)
        {
                //paint background black
                g.setColor(Color.black);
                g.fillRect(0,0,size().width,size().height);

                g.setColor(new Color(255,255,0));
                g.fillOval(10,10,50,50);

                g.setColor(myGreen);
                g.fillOval(65,10,50,50);

                g.setColor(myRed);
                g.fillOval(120,10,50,50);

                g.setColor(myYellow);
                g.fillOval(175,10,50,50);

                g.setColor(myBlue);
                g.fillOval(230,10,50,50);

                float color;
                int i;
                int WIDTH=300;

                //the three color gradients: red, green, blue
                for(i=0; i<WIDTH; i++)
                {
                        color=i*(float)255/WIDTH;

                        g.setColor(new Color((int)color,0,0));
                        g.drawLine(i,70,i,90);

                        g.setColor(new Color(0,(int)color,0));
                        g.drawLine(i,95,i,115);

                        g.setColor(new Color(0,0,(int)color));
                        g.drawLine(i,120,i,140);
                }

                //the rainbow color spectrum
                for(i=0; i<WIDTH; i++)
                {
                        color=(float)i/WIDTH;
                        g.setColor(Color.getHSBColor(color,1.0f,1.0f));
                        g.drawLine(i,150,i,220);
                }

                Color myPink = new Color(240,100,150);

                g.setColor(myPink.darker().darker());
                g.fillRect(15,240,45,40);

                g.setColor(myPink.darker());
                g.fillRect(70,240,45,40);

                g.setColor(myPink);
                g.fillRect(125,240,45,40);

                g.setColor(myPink.brighter());
                g.fillRect(180,240,45,40);

                g.setColor(myPink.brighter().brighter());
                g.fillRect(235,240,45,40);
        }
}
