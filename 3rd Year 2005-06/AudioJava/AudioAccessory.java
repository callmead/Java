// AudioAccessory.java
// A simple accessory for JFileChooser that lets you play .au clips.
//
import javax.swing.*;
import java.awt.*;
import java.net.*;
import java.beans.*;
import java.io.*;
import java.applet.*;
import java.awt.event.*;

// Caveat programmer: you should replace this with a JMF equivalent when that's
// ready for all of your delivery platforms.
import sun.applet.*;

public class AudioAccessory extends JPanel implements PropertyChangeListener {

  AudioClip currentClip;
  String currentName="";
  JLabel fileLabel;
  JButton playButton, stopButton;

  public AudioAccessory() {
    // Set up the accessory.  The file chooser will give us a reasonable size.
    setLayout(new BorderLayout());
    add(fileLabel = new JLabel("Clip Name"), BorderLayout.NORTH);
    JPanel p = new JPanel();
    playButton = new JButton("Play");
    stopButton = new JButton("Stop");
    playButton.setEnabled(false);
    stopButton.setEnabled(false);
    p.add(playButton);
    p.add(stopButton);
    add(p, BorderLayout.CENTER);

    playButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (currentClip != null) {
          currentClip.stop();
          currentClip.play();
        }
      }
    });
    stopButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (currentClip != null) {
          currentClip.stop();
        }
      }
    });
  }

  public void propertyChange(PropertyChangeEvent e) {
    if (e.getPropertyName()
         .equals(JFileChooser.SELECTED_FILE_CHANGED_PROPERTY)) {

      // Ok, the user selected a file in the chooser
      File f = (File)e.getNewValue();

      // Make reasonably sure it's an audio file
      if (f.getName().toLowerCase().endsWith(".au")) {
        setCurrentClip(f);
      }
      else {
        setCurrentClip(null);
      }
    }
  }

  public void setCurrentClip(File f) {
    // Make sure we have a real file, otherwise, disable the buttons
    if ((f == null) || (f.getName() == null)) {
      fileLabel.setText("no audio selected");
      playButton.setEnabled(false);
      stopButton.setEnabled(false);
      return;
    }

    // Ok, seems the audio file is real, so load it and enable the buttons
    String name = f.getName();
    if (name.equals(currentName)) {
      return;
    }
    if (currentClip != null) { currentClip.stop(); }
    currentName = name;
    try {
      URL u = new URL("file:///" + f.getAbsolutePath());
      currentClip = new AppletAudioClip(u);
    }
    catch (Exception e) {
      e.printStackTrace();
      currentClip = null;
      fileLabel.setText("Error loading clip.");
    }
    fileLabel.setText(name);
    playButton.setEnabled(true);
    stopButton.setEnabled(true);
  }
}
