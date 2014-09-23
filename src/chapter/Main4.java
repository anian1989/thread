package chapter;

import java.util.concurrent.TimeUnit;

public class Main4 {

	/**
	 * <p>
	 * </p>
	 * @author zhangjunshuai
	 * @date 2014-8-12 обнГ3:40:54
	 * @param args
	 */
	public static void main(String[] args) {
		FileSearch searcher = new FileSearch("c:\\", "unintall.log");
		Thread thread = new Thread(searcher);
		thread.start();
		
		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		thread.interrupt();

	}

}
