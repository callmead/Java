//Java 21st Jan 2004 Threading HW
public class HW
{//Class

	public HW()
	{//Constructor

		//----------Creating Thread----------------
		Thread t = new Thread(new Runnable()
		{//Thread
			public void run()
			{//Run, which process has to run in the timer define in run
				while (true) //Infinit Loop always true
				{//While
					System.out.print("a ");
					//To stop Thread for a while.
					try{Thread.sleep(10000);} catch(Exception e){}
				}//End While

			}//End Run
		});//End Thread, Thread is Ready but not running.

		Thread t1 = new Thread(new Runnable()
		{//Thread
			public void run()
			{//Run, which process has to run in the timer define in run
				while (true) //Infinit Loop always true
				{//While
					System.out.print("b ");
					//To stop Thread for a while.
					try{Thread.sleep(5000);} catch(Exception e){}
				}//End While

			}//End Run
		});//End Thread, Thread is Ready but not running.

		Thread t2 = new Thread(new Runnable()
		{//Thread
			public void run()
			{//Run, which process has to run in the timer define in run
				while (true) //Infinit Loop always true
				{//While
					System.out.print("c ");
					//To stop Thread for a while.
					try{Thread.sleep(1000);} catch(Exception e){}
				}//End While

			}//End Run
		});//End Thread, Thread is Ready but not running.

		//To Start Thread to work
		t.start();
		t1.start();
		t2.start();

	}//End Constructor Method


	public static void main (String x[])
	{//Main
		HW h = new HW();
	}//End Main
}//End Class