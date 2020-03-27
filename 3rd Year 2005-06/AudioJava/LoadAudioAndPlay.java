// Fig. 16.2: LoadAudioAndPlay.java
// Load an audio clip and play it.
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoadAudioAndPlay extends JApplet {
   private AudioClip sound1, sound2, currentSound;
   private JButton playSound, loopSound, stopSound;
   private JComboBox chooseSound;

   // load the image when the applet begins executing
   public void init()
   {
      Container c = getContentPane();
      c.setLayout( new FlowLayout() );

      String choices[] = { "Welcome", "Hi" };
      chooseSound = new JComboBox( choices );
      chooseSound.addItemListener(
         new ItemListener() {
            public void itemStateChanged( ItemEvent e )
            {
               currentSound.stop();

               currentSound =
                  chooseSound.getSelectedIndex() == 0 ?
                     sound1 : sound2;
            }
         }
      );
      c.add( chooseSound );

      ButtonHandler handler = new ButtonHandler();
      playSound = new JButton( "Play" );
      playSound.addActionListener( handler );
      c.add( playSound );
      loopSound = new JButton( "Loop" );
      loopSound.addActionListener( handler );
      c.add( loopSound );
      stopSound = new JButton( "Stop" );
      stopSound.addActionListener( handler );
      c.add( stopSound );

      sound1 = getAudioClip(
                 getDocumentBase(), "welcome.wav" );
      sound2 = getAudioClip(
                 getDocumentBase(), "hi.au" );
      currentSound = sound1;
   }

   // stop the sound when the user switches Web pages
   // (i.e., be polite to the user)
   public void stop()
   {
      currentSound.stop();
   }

   private class ButtonHandler implements ActionListener {
      public void actionPerformed( ActionEvent e )
      {
         if ( e.getSource() == playSound )
            currentSound.play();
         else if ( e.getSource() == loopSound )
            currentSound.loop();
         else if ( e.getSource() == stopSound )
            currentSound.stop();
      }
   }
}

/**************************************************************************
 * (C) Copyright 1999 by Deitel & Associates, Inc. and Prentice Hall.     *
 * All Rights Reserved.                                                   *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
