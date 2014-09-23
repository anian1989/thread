package chapter;

import java.util.Date;
import java.util.concurrent.TimeUnit;
/**
 * 
 * <p>
 * Description: 
 * </p>
 * @author zhangjunshuai
 * @version 1.0
 * Create Date: 2014-8-13 ÏÂÎç8:47:30
 * Project Name: Java7Thread
 *
 * <pre>
 * Modification History: 
  *             Date                                Author                   Version          Description 
 * -----------------------------------------------------------------------------------------------------------  
 * LastChange: $Date::             $      $Author: $          $Rev: $         
 * </pre>
 *
 */
public class FileClock implements Runnable{
	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("%s\n", new Date());
			
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				System.out.printf("The FileClock has been interrupted");
			}
		}
	}

}
