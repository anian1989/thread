package chapter;

import java.util.Date;

public class Main6 {

	/**
	 * <p>
	 * </p>
	 * @author zhangjunshuai
	 * @date 2014-8-14 ÏÂÎç4:40:58
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {

		DataSourcesLoader dsLoader = new DataSourcesLoader();
		Thread thread1 = new Thread(dsLoader,"DataSourcesLoader" +
				"");
		NetwworkConnectionsLoader ncLoader = new NetwworkConnectionsLoader();
		Thread thread2 = new Thread(ncLoader,"NetwworkConnectionsLoader");
		
		thread1.start();
		thread2.start();
		
		thread1.join();
		thread2.join();
		
		System.out.printf("Main: Configuration has been loaded: %s\n",new Date());
	}

}
