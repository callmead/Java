// Audio2.java

import java.applet.*;
import java.net.*;

class Audio2
{
   public static void main (String [] args)
   {

      try
      {
          URL url = new URL ("file:" + "./Audio/Apple.wav");

          AudioClip ac = Applet.newAudioClip (url);

          //ac.loop();
          ac.play ();

          System.out.println ("Press any key to exit.");

          System.in.read ();

          ac.stop ();

          System.exit (0);
      }
      catch (Exception e)
      {
          System.out.println (e);
      }
   }
}
