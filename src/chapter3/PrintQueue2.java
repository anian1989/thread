package chapter3;

import java.util.concurrent.Semaphore;

public class PrintQueue2 {
	private final Semaphore semaphore;
	public PrintQueue2(){
		semaphore = new Semaphore(1);
				
	}
	public void printJob(Object document){
		
		try {
			semaphore.acquire();
			long duration = (long)(Math.random()*10);
			System.out.println(Thread.currentThread().getName()+"  PrintQueue   "+duration
					);
		} catch (InterruptedException e) {
			e.printStackTrace();
			
		}finally{
			semaphore.release();
		}
	}
}
