public void playSound(String fileName)
  	   {

  		   try
  		         {
  		             URL url = new URL ("file:" + fileName);
  		             AudioClip ac = Applet.newAudioClip (url);
  		             ac.stop();
  		             ac.play();
  		   		     //ac.loop();
  	      }catch (Exception e) { System.out.println (e); }
     }//End of playSound method