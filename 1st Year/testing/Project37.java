import java.awt.*;
import java.applet.*;

public class Project37 extends Applet implements Runnable
{
    Thread runner;
    Image Buffer;
    Graphics gBuffer;
    String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    int ticker;

    public void init()
    {
        //create graphics buffer, the size of the applet
        Buffer=createImage(size().width,size().height);
        gBuffer=Buffer.getGraphics();
    }

    public void start()
    {
        if (runner == null)
        {
            runner = new Thread (this);
            runner.start();
        }
    }

    public void stop()
    {
        if (runner != null)
        {
            runner.stop();
            runner = null;
        }
    }

    public void run()
    {
        while(true)
        {
            try {runner.sleep(50);}
            catch (Exception e) { }

            repaint();
        }
    }

    public void drawStuff()
    {
        //repaint background after 20 seconds
        if(ticker==0)
        {
            gBuffer.setColor(Color.black);
            gBuffer.fillRect(0,0,size().width,size().height);
        }

        ticker++;
        if(ticker>400)
            ticker=0;

        //random font size 10..50
        int fontSize=(int)(Math.random()*40)+10;

        //random font color
        int red=(int)(Math.random()*255);
        int green=(int)(Math.random()*255);
        int blue=(int)(Math.random()*255);
        gBuffer.setColor(new Color(red, green, blue));

        //random coordinates within the applet bounderies
        int x=(int)(Math.random()*size().width);
        int y=(int)(Math.random()*size().height);

        //random substring from the alphabet string (one out of 26 characters)
        int character=(int)(Math.random()*26);
        String s=alphabet.substring(character, character+1);

        gBuffer.setFont(new Font("TimesRoman", Font.PLAIN,  fontSize));
        gBuffer.drawString(s,x,y);
    }

    public void update(Graphics g)
    {
        paint(g);
    }

    public void paint(Graphics g)
    {
        drawStuff();
        g.drawImage (Buffer,0,0, this);
    }
}
