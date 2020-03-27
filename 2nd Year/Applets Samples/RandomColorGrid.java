public class RandomColorGrid extends Applet {
      
         ColorSwatchCanvas canvas0, canvas1, canvas2, canvas3;  
             //  canvases to be displayed in applet
             // (The definition of the ColorSwatchCanvas class will be given below.)
         
         Thread runner;   // A thread that randomly changes the color of a canvas every 
                          // so often.  Note that all synchronization in this applet is 
                          // done on the Thread object.
      
         volatile int status;  // Status variable for controlling the thread.
         final static int GO = 0, SUSPEND = 1, TERMINATE = 2;  // Possible values for status.
         
      
         class Runner extends Thread {
         
              // The runner for the RandomColorGrid canvas will be an
              // object belonging to this nested class.
              
            public void run() {
                  // Run method picks a random canvas, changes it's color, waits for
                  // a random time between 30 and 3029 milliseconds, and then repeats.
               while (status != TERMINATE) {
                  synchronized(this) {
                     while (status == SUSPEND)  // wait while applet is suspended
                        try { wait(); }
                        catch (InterruptedException e) {  }
                  }
                  switch ( (int)(4*Math.random()) ) {  // change the color of a canvas
                     case 0: canvas0.randomColor(); break;
                     case 1: canvas1.randomColor(); break;
                     case 2: canvas2.randomColor(); break;
                     case 3: canvas3.randomColor(); break;
                  }
                  synchronized(this) {  // delay for a bit
                    try { wait( (int)(3000*Math.random() + 30) ); }
                    catch (InterruptedException e) { } 
                  }
               }
            } // end run()
      
         } // end nested class Runner
      
      
         public void init() {
               // Initialize the applet.  Create 4 ColorSwatchCanvasses and
               // arrange them in a horizontal grid.
            setBackground(Color.black);
            setLayout(new GridLayout(1,0,2,2));
            canvas0 = new ColorSwatchCanvas();
            canvas1 = new ColorSwatchCanvas();
            canvas2 = new ColorSwatchCanvas();
            canvas3 = new ColorSwatchCanvas();
            add(canvas0);
            add(canvas1);
            add(canvas2);
            add(canvas3);
         }
      
         public Insets getInsets() {
              // Put a 2-pixel black border around the applet.
            return new Insets(2,2,2,2);
         }
      
         public void start() {
               // Applet is being started or restarted.  Create a thread or
               // tell the existing thread to restart.
            status = GO;
            if (runner == null || ! runner.isAlive()) {
               runner = new Runner();
               runner.start();
            }
            else {
               synchronized(runner) {
                  runner.notify();
               }
            }
         }
      
         public void stop() {
               // Applet is about to be stopped.  Tell thread to suspend.
            synchronized(runner) {
               status = SUSPEND;
               runner.notify();
            }
         }
      
         public void destroy() {
               // Applet is about to be destroyed.  Tell thread to terminate.
            synchronized(runner) {
               status = TERMINATE;
               runner.notify();
            }
         }
         
      }  // end class RandomColorGridApplet

