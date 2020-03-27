// AppletAndApp.java

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.util.*;

public class AppletAndApp extends Applet implements ActionListener
{
   static AppletAndApp aa;
   static Stub s;

   Image im;

   public void init ()
   {
      System.out.println ("Code base = " + getCodeBase ());
      System.out.println ("Document base = " + getDocumentBase ());

      System.out.println ("\ninit () called");
      System.out.println ("isActive () returns " + isActive ());

      // Create simple GUI.

      Button b = new Button ("Visit CNN");
      b.addActionListener (this);
      add (b);

      b = new Button ("Audio");
      b.addActionListener (this);
      add (b);

      // Obtain an Image object in preparation for loading.

      String imageName = getParameter ("image");

      if (imageName != null)
          im = getImage (getCodeBase (), imageName);
   }

   public void start ()
   {
      System.out.println ("start () called");
      System.out.println ("isActive () returns " + isActive ());
   }

   public void paint (Graphics g)
   {
      // Load and draw an image.

      if (im != null)
          g.drawImage (im, 0, 0, this);
   }

   public void actionPerformed (ActionEvent e)
   {
      if (e.getActionCommand ().equals ("Audio"))
      {
          String soundName = getParameter ("audio");

          if (soundName != null)
          {
              AudioClip ac = getAudioClip (getDocumentBase (),
                                           soundName);

              ac.play ();
          }

          return;
      }

      try
      {
          URL u = new URL ("http://www.cnn.com");
          getAppletContext ().showDocument (u);
      }
      catch (MalformedURLException exc) { System.out.println (e); }
   }

   public void stop ()
   {
      System.out.println ("stop () called");
      System.out.println ("isActive () returns " + isActive ());
   }

   public void destroy ()
   {
      System.out.println ("destroy () called");
      System.out.println ("isActive () returns " + isActive ());
   }

   public static void main (String [] args)
   {
      Frame frame = new Frame ("AppletAndApp as an Application");

      aa = new AppletAndApp ();

      frame.add (new Panel ().add (aa));

      // Create the frame's peer.  Peer is not visible.

      frame.addNotify ();

      aa.setStub (s = new Stub (args));
      aa.init ();

      frame.setSize (300, 200);
      frame.setVisible (true);

      s.setActive (true);
      aa.start ();

      frame.addWindowListener (new WindowAdapter ()
                               {
                                   public void windowClosing
                                                       (WindowEvent w)
                                   {
                                      s.setActive (false);
                                      aa.stop ();
                                      aa.destroy ();
                                      System.exit (0);
                                   }
                               });
   }
}

// The Stub class provides a mechanism for obtaining information from
// the run-time environment.  Typically, this environment is maintained
// by a Web browser.  For this program, a Web browser environment is
// being simulated.

class Stub implements AppletStub
{
   private boolean active = false;

   private Hashtable ht = new Hashtable ();

   private Context c;

   // Create a new Stub object.  The application's array of command
   // arguments are passed to this constructor, where they are saved
   // in a Hashtable object, for later retrieval by the getParameter
   // method.

   Stub (String [] args)
   {
      c = new Context (); // Create an applet context.

      // Make sure an even number of arguments has been passed.

      if ((args.length & 1) != 0)
          return;

      for (int i = 0; i < args.length; i += 2)
           ht.put (args [i], args [i + 1]);
   }

   // Return the current state of an applet.  During initialization,
   // the applet is not active (and this method returns false).  The
   // applet's active state is set to true just before the start
   // method is called.

   public boolean isActive ()
   {
      return active;
   }

   // Return the complete URL of the HTML document containing the
   // applet.  This URL includes the name of the document's file.
   // NOTE: The code in this method could be improved.

   public URL getDocumentBase ()
   {
      URL u = null;

      try
      {
          u = new URL ("file:/C:./x.html"); // Use a fake document.
      }
      catch (MalformedURLException e) {}

      return u;
   }

   // Return the complete URL of the applet's .class file(s).  This
   // method is often used with the getImage and getAudioClip
   // methods to load image/audio files relative to the .class files.
   // NOTE: The code in this method could be improved.

   public URL getCodeBase ()
   {
      URL u = null;

      try
      {
          u = new URL ("file:/C:./");
      }
      catch (MalformedURLException e) {}

      return u;
   }

   // Return the value of the applet parameter, identified by the
   // name argument.  If not present, null is returned.  The Applet
   // class contains a getParameter method that calls this method.

   public String getParameter (String name)
   {
      return (String) ht.get (name);
   }

   // Return a reference to the applet's context.  The Applet class
   // contains a getAppletContext method that calls this method.

   public AppletContext getAppletContext ()
   {
      return c; // Return current applet context.
   }

   // Resize the applet.  The Applet class contains a pair of resize
   // methods that call this method. Note: Web browsers don't permit
   // applets from being resized.

   public void appletResize (int width, int height)
   {
   }

   // The following method is an extra method that is called to set
   // the value of the private active variable.

   public void setActive (boolean active)
   {
      this.active = active;
   }
}

// The Context class provides a mechanism to control the environment
// in which the program is running.  Typically, this environment is
// maintained by a Web browser.  For this program, a Web browser
// environment is being simulated.

class Context implements AppletContext
{
   // Load the file located by the url argument.  The Applet
   // class contains a pair of getAudioClip methods that call
   // this method.

   public AudioClip getAudioClip (URL url)
   {
      return Applet.newAudioClip (url);
   }

   // Prepare to load the image located by the url argument.  The
   // image is loaded when needed (by one of Graphics' drawImage
   // methods).  The Applet class contains a pair of getImage
   // methods that call this method.

   public Image getImage (URL url)
   {
      Toolkit tk = Toolkit.getDefaultToolkit ();
      return tk.getImage (url);
   }

   // Fetch the Applet (identified by name) from the current HTML
   // document.

   public Applet getApplet (String name)
   {
      return null;
   }

   // Return an enumeration to all Applets located on the current HTML
   // page.

   public Enumeration getApplets ()
   {
      return null;
   }

   // Show the HTML document, located by the url argument, in the
   // current Web browser window.

   public void showDocument (URL url)
   {
      System.out.println ("Showing document " + url);
   }

   // Show the HTML document, located by the url argument, in the
   // Web browser window, identified by the frame argument.

   public void showDocument (URL url, String frame)
   {
      try
      {
         showDocument (new URL (url.toString () + frame));
      }
      catch (MalformedURLException e) {}
   }

   // Show a status message, identified by the message argument, in
   // the Web browser's status bar.  The Applet class contains a
   // showStatus method that calls this method.

   public void showStatus (String message)
   {
      System.out.println (message);
   }
}
