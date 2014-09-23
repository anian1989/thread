package chapter;

import java.util.concurrent.TimeUnit;

public class Main10 {

	/**
	 * <p>
	 * </p>
	 * @author zhangjunshuai
	 * @date 2014-8-23 обнГ4:38:56
	 * @param args
	 */
	public static void main(String[] args) {

		ThreadGroup threadGroup = new ThreadGroup("Searcher");
		Result result = new Result();
		SearchTask searchTask = new SearchTask(result);
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(threadGroup,searchTask);
			thread.start();
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.printf("Number of Threads:%d\n", threadGroup.activeCount());
		System.out.printf("Information about the Thread Group\n");
		threadGroup.list();
		Thread[] threads = new Thread[threadGroup.activeCount()];
		threadGroup.enumerate(threads);
		for (int i = 0; i < threads.length; i++) {
			System.out.printf("THread %s:%s\n", threads[i].getName(),threads[i].getState());
		}
		
		waitFinish(threadGroup);
		threadGroup.interrupt();
		
	}
	private static void waitFinish(ThreadGroup threadGroup){
		while(threadGroup.activeCount()>9){
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
