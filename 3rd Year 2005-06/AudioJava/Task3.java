import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.applet.*;

class Task3 extends JFrame
{
   JButton b1;
   ImageIcon imi=new ImageIcon("add.gif");
   JLabel limi=new JLabel(imi);
   JLabel ran=new JLabel("Random");
   int j;
   String jj;
   Random rr=new Random();
   private AudioClip sound1,sound2,sound3,sound4,sound5,sound6;


   Task3()
   {
	  super("Task 2");

      Container c=getContentPane();
      c.setLayout(null);
      c.setBackground(Color.pink);


      b1=new JButton("Play");
      b1.setForeground(Color.blue);
     b1.setBorder(BorderFactory.createRaisedBevelBorder());
      b1.setBounds(150,20,100,40);

      c.add(b1);
      JPanel ps=new JPanel();
      ps.setLayout(null);
	  ps.setBorder(BorderFactory.createEtchedBorder(Color.green,Color.white));
	  ps.setBackground(Color.black);
	  ps.setBounds(100,80,170,120);
      limi.setBounds(20,20,100,80);
      ps.add(limi);
      c.add(ps);


      ran.setBounds(150,200,100,80);
	  c.add(ran);

      setBounds(200,200,450,350);

       System.out.println("\n\n\t\t\t*** This is an assignment of java ***");
	   							  System.out.println("\t\t\t\t** Task# 2 ** ");
 							   System.out.println("--------------------------------------------------------------------------");


       b1.addActionListener(new ActionListener()
	  				   {
	  					   public void actionPerformed(ActionEvent e)
	  					   {


	  						 System.out.print("\t\t\t Start of random\n\t\t\t= ");
							 for(int p=1;p<7;p++)
								{
  								  j=Math.abs(rr.nextInt()) %6+1;
								  jj=String.valueOf(j);
								  ran.setText(jj);
								}
		   						 System.out.println(j);

							//*****************************************************

		   						 if(j==1)
		   						 {
									 imi = new ImageIcon("d1.gif");
									 limi.setIcon(imi);
									// sound1=getAudioClip("aqa.wav");
									//play("aqa.wav");
								 }

								  if(j==2)
								  {

									 imi = new ImageIcon("d2.gif");
									 limi.setIcon(imi);
								     //sound2=getAudioClip(getDocumentBase(),".wav");
								     //sound2.play();
								  }

								  if(j==3)
								  {
									  imi = new ImageIcon("d3.gif");
								 	  limi.setIcon(imi );
								 	 // sound3=getAudioClip(getDocumentBase(),".wav");
								  }
								  if(j==4)
								  {
									  imi = new ImageIcon("d4.gif");
								      limi.setIcon(imi );
								      //sound4=getAudioClip(getDocumentBase(),".wav");
								  }
								  if(j==5)
								   {
									   imi = new ImageIcon("d5.gif");
								       limi.setIcon(imi );
								       //sound5=getAudioClip(getDocumentBase(),".wav");
								   }
								  if(j==6)
							  	    {
										 imi = new ImageIcon("d6.gif");
								    	 limi.setIcon(imi );
								    	 //sound6=getAudioClip(getDocumentBase(),".wav");
								    }



	  					   }
	  					}
	  			);







      show();

   }



   public static void main(String easrsdf[])
   {

    Task3 bt=new Task3();

   }

}