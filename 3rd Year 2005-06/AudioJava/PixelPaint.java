import java.applet.*;
import java.awt.*;

/**
 * Listing 5-5, Java 2 Bible <http://www.JavaBible.com/>
 *
 * PixelPaint.java
 * This applet uses a Pixel object (which is an extension
 * of Point) to store x,y and color data used in the paint()
 * method to draw tiny colored rectangles on the screen.
 *
 * Notice that we don't need to deal with the start() or
 * stop() "life cycle" methods in this applet, as we no
 * longer start/stop an audio clip. This applet simply
 * draws colored pixels on the screen.
 *
 * Be sure to increase the HEIGHT and WIDTH attributes of
 * your HTML page's <APPLET> tag; otherwise, some drawing
 * will be offscreen (beyond the applet dimensions).
 *
 * See Figure 5-2 to see this applet running in Applet Viewer.
 *
 * @author Aaron E. Walsh
 * @version 1.0, 25 August 2000
 */
public class PixelPaint extends Applet
{
  private Pixel pix;  // store color pixel data

  public void init()
  {
    super.init(); // let Applet superclass paint itself first

    pix = new Pixel(); // construct default Pixel object
  }


  public void paint(Graphics g)
  {
    super.paint(g);

    // first, let's create a small blue rectangle without
    // the help of our Pixel object (hard-code values):

    g.setColor(Color.blue);     // set drawing color
    g.drawRect(10, 10, 1, 1); // draw tiny 1x1 rectangle


    // Next we'll use the Pixel object to draw a variety
    // of colored rectangles onscreen. Note that this
    // first one will be difficult to see because the
    // default color of our pixel is white (close to default
    // applet background color), but we'll draw it anyway
    // just for fun:

    g.setColor(pix.getColor());
    g.drawRect(pix.getX(), pix.getY(), 1, 1);

    // Now let's put the Pixel mutator and accessors to work
    // and really get some mileage out of the object, starting
    // with a red pixel:

    pix.setXY(100,30);       // change x,y pixel data
    pix.setColor(Color.red); // and the pixel color
    g.setColor(pix.getColor());
    g.drawRect(pix.getX(), pix.getY(), 1, 1);

    // now a yellow pixel:
    pix.setXY(315,100);
    pix.setColor(Color.yellow);
    g.setColor(pix.getColor());
    g.drawRect(pix.getX(), pix.getY(), 1, 1);

    // now a green pixel:
    pix.setXY(222,73);
    pix.setColor(Color.green);
    g.setColor(pix.getColor());
    g.drawRect(pix.getX(), pix.getY(), 1, 1);

    // To automate things, we can use a for loop (let's
    // create a few hundred randomly positioned magenta
    // pixels). Notice that this is grossly inefficient,
    // as we're setting randomly generated x and y values
    // in our Pixel object only to immediately retrieve
    // them. We do it only to illustrate the use of the
    // setX() and setY() methods inherited from Point.
    // You'll also notice that the int randomX and randomY
    // variables are created each time through the loop,
    // although you would normally declare these ints
    // before getting into the loop: there's no reason to
    // declare these int data types anew with every loop
    // iteration, although we do so here to show that data
    // type declaration and initialization can take place
    // in the same statement. We also print them out for
    // testing and debugging purposes. Normally, you'd skip
    // the new int declaration entirely and simply place
    // the randomization code directly into Pixel's setX()
    // and setY() methods like so:
    //
    // pix.setX((int)Math.round(getSize().width*Math.random()));
    // pix.setY((int)Math.round(getSize().height * Math.random()));
    //

     g.setColor(Color.magenta); // set the draw color first

     for (int i=0; i<200; i++) {

      // The java.lang package is automatically available to all Java
      // classes, so we don't have to explicitly import that package or
      // the specific java.lang.Math class in order to use Math:

      int randomX = (int)Math.round(getSize().width * Math.random());
      int randomY = (int)Math.round(getSize().height * Math.random());

      pix.setX(randomX);
      pix.setY(randomY);

      g.drawRect(pix.getX(), pix.getY(), 1, 1);

      // print data to standard output for validation and debugging:
      System.out.println("Loop Iteration Counter #:" + i);
      System.out.println("Random x,y: " + randomX + "," + randomY);
      System.out.println("Pixel x,y: " + pix.getX() + "," + pix.getY());
      System.out.println();
    }

    // DONE! Notice that the Pixel object color is still green,
    // however, since we set the draw color directly (not via Pixel),
    // so our pix variable still references a red-colored Pixel object.
    //
    // Also notice that the getSize() method defined in Component is
    // only available in Java 1.1 and higher, meaning this applet will
    // NOT RUN in Java 1.0 browsers! To support Java 1.0 browsers, you
    // can replace getSize() with the now outdated size() method like
    // so (they both report back the size of a component, which Applet
    // ultimately is):
    //
    // int randomX = (int)Math.round(size().width * Math.random());
    // int randomY = (int)Math.round(size().height * Math.random());
  }
}
