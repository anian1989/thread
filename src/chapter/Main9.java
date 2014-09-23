package chapter;

import java.util.concurrent.TimeUnit;

public class Main9 {

	/**
	 * <p>
	 * </p>
	 * @author zhangjunshuai
	 * @date 2014-8-22 ÏÂÎç4:30:20
	 * @param args
	 */
	public static void main(String[] args) {

		/*UnsafeTask task = new UnsafeTask();
		for(int i = 0; i<10;i++){
			Thread thread = new Thread(task);
			thread.start();
			
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		
		SafeTask task = new SafeTask();
		for(int i = 0; i<10;i++){
			Thread thread = new Thread(task);
			thread.start();
			
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
