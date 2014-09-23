package chapter;

import java.util.concurrent.TimeUnit;

public class Main5 {

	/**
	 * <p>
	 * </p>
	 * @author zhangjunshuai
	 * @date 2014-8-13 обнГ6:34:34
	 * @param args
	 */
	public static void main(String[] args) {

		FileClock clock = new FileClock();
		Thread thread = new Thread(clock);
		thread.start();
		
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread.interrupt();
	}

}
