//Sourcecode 
import java.awt.*;
import java.applet.*;

public class Project5A extends Applet
{
        int mouseX, mouseY;
        boolean clicked=false;

        public boolean mouseDown(Event evt,int x,int y)
        {
                clicked=true;

                mouseX=x;
                mouseY=y;

                repaint();

                return true;
        }

        public void paint(Graphics g)
        {
                g.setFont(new Font("Helvetica",Font.PLAIN,15));

                g.drawString("Click inside the applet!", 80,50);

                //we only draw this if the mouse has been clicked once
                if(clicked)
                {
                        if(mouseX < size().width/2)
                                g.drawString("You clicked on the left side!",60,100);

                        else
                                g.drawString("You clicked on the right side!",60,100);
                }
        }
}
