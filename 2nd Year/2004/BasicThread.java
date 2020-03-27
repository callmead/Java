//Threading Java Demo Class "BasicThread.java"
class BasicThread extends Thread
{
	char c;
	BasicThread(char c)
	{
		this.c=c;
	}
	public void run()
	{
		for (int x=0;x<100;x++)
		{
			System.out.print(c);
			try
			{
				Thread.sleep((int)(Math.random()*10));
			}
			catch(InterruptedException e)
			{
				System.out.println("Interruped Exception Caught");
			}
		}
	}
	public static void main(String[] args)
	{
		BasicThread bt=new BasicThread('@');
		BasicThread bt1=new BasicThread('*');
		bt.start();
		bt1.start();
	}
}