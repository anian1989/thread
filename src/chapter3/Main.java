package chapter3;
/**
 * 
 * <p>
 * Description: 信号量Semaphores的学习
 * </p>
 * @author zhangjunshuai
 * @version 1.0
 * Create Date: 2014-9-25 下午8:12:37
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

public class Main {

	/**
	 * <p>
	 * </p>
	 * @author zhangjunshuai
	 * @date 2014-9-23 下午8:45:31
	 * @param args
	 */
	public static void main(String[] args) {
		PrintQueue2 printQueue = new PrintQueue2();
		Thread thread[] = new Thread[10];
		for(int i=0;i<10;i++){
			thread[i] = new Thread(new Job(printQueue),"Thread"+i);
		}

		for(int i=0;i<10;i++){
			thread[i].start();
		}
	}

}
