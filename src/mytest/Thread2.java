package mytest;
class Thread2 extends Thread
{
	private Thread1 thread1;
	
	public Thread2(String threadName, Thread1 thread1)
	{
		super(threadName);
		this.thread1 = thread1;		
	}
	
	public void run()
	{
		System.out.println(getName() +  "is running");
		thread1.start();
		//thread1.join();
		System.out.println("thread2 is over");	
	}
}
