package chapter2;
/**
 * 
 * <p>
 * Description: ʹ��Lockͬ��������Լ��޸�Lock�Ĺ�ƽ��
 * </p>
 * @author zhangjunshuai
 * @version 1.0
 * Create Date: 2014-9-16 ����4:57:06
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
public class Main5 {

	/**
	 * <p>
	 * </p>
	 * @author zhangjunshuai
	 * @date 2014-9-16 ����4:57:00
	 * @param args
	 */
	public static void main(String[] args) {

		PrintQueue printQueue = new PrintQueue();
		Thread thread[] = new Thread[10];
		for(int i=0;i<10;i++){
			thread[i] = new Thread(new Job(printQueue),"Thread"+i);
		}
		for(int i=0;i<10;i++){
			thread[i].start();
			//�޸�Lock�Ĺ�ƽ�� ʹ��
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
