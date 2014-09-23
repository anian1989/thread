package mytest;
class Thread1 extends Thread
{
	public Thread1(String threadName)
	{	
		super(threadName);
	}
	
	public void run()
	{
		System.out.println(getName() + "is running");
		try
		{
			sleep(2000);
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("thread1 is over");	
	}
}