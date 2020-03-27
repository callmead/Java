// Audio2.java

import java.applet.*;
import java.net.*;

class Audio21M
{
   public static void main (String [] args)
   {

			new Audio21M().playAudioSound("./Audio/Rabbit.wav");
   }

   public void playAudioSound(String strAudio)
   {
	  try{
          	URL url = new URL("file:" + strAudio);
            AudioClip ac = Applet.newAudioClip(url);
		   	ac.play ();
      }catch (Exception e) {System.out.println (e);}
   }//End of method playAudioSound()
}
