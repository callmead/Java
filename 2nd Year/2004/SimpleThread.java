//Threading Java Demo Class "SimpleThread.java"
class SimpleThread implements Runnable
{
	char c;
	SimpleThread(char c)
	{
		this.c=c;
	}
	public void run()
	{
		for (int x=0;x<10000;x++)
		{
			System.out.print(c);
			try
			{
				Thread.sleep((int)(Math.random()*5));
			}
			catch(InterruptedException e)
			{
				System.out.println("Interruped Exception Caught");
			}
		}
	}
	public static void main(String[] args)
	{
		SimpleThread bt=new SimpleThread('@');
		SimpleThread bt1=new SimpleThread('*');
		new Thread(bt).start();
		new Thread(bt1).start();
	}
}