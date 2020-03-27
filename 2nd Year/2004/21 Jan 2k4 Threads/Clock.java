//Java 21st Jan 2004 Threading
import javax.swing.*;
import java.awt.*; //Font
import javax.swing.border.*;//BOrder

import java.util.Date; //Date
import java.text.*;//For Simple Date Format

public class Clock extends JFrame
{//Class
	JLabel lblTime = new JLabel();
	SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");


	public Clock()
	{//Constructor
		this.setTitle(".:: Clock ...");
		this.setBounds(260,200,250,125); //Total Screen 800x600
		this.getContentPane().setLayout(null);
		this.setDefaultCloseOperation(3);
		this.setResizable(false);
		this.getContentPane().add(lblTime);


		//----------Properties of Label-----------
		lblTime.setText("10:20:15");
		lblTime.setBounds(20,20,200,60);
		lblTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime.setFont(new Font("Times New Roman",1,40));
		lblTime.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		lblTime.setForeground(Color.yellow);
		lblTime.setBackground(Color.black);
		lblTime.setOpaque(true);

		//----------Creating Thread----------------
		Thread t = new Thread(new Runnable()
		{//Thread
			public void run()
			{//Run, which process has to run in the timer define in run
				while (true) //Infinit Loop always true
				{//While
					lblTime.setText(sdf.format(new Date()));
					System.out.println(sdf.format(new Date()));
					//System.out.print("Time\t");

					//To stop Thread for a while. If we dont stop the thread for a while then it will continuously work so we have to stop ir for a while.
					try{Thread.sleep(100);} catch(Exception e){}
				}//End While

			}//End Run
		});//End Thread, Thread is Ready but not running.

		//To Start Thread to work
		t.start();

	}//End Constructor Method


	public static void main (String x[])
	{//Main
		Clock c1 = new Clock();
		c1.setVisible(true);
	}//End Main
}//End Class