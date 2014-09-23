package chapter;

/**
 * <p>
 * Description: ���ܴ���������10���̡߳�ÿһ���߳��ܼ�������1-10���ڵĳ˷���
 * </p>
 * @author zhangjunshuai
 * @version 1.0
 * Create Date: 2014-8-7 ����11:06:06
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
public class Calculator implements Runnable{

	private int number;
	public Calculator(int number){
		this.number = number;
	}

	/**
	 * run()�����Ǵ������߳�ִ��ָ��
	 */
	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.printf("%s:%d*%d=%d\n",Thread.currentThread().getName(),number,i,i*number);
		}
	}

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			Calculator cal = new Calculator(i);
			Thread thread = new Thread(cal);
			thread.start();
			if(i==9)
				System.exit(0);
		}
	}
}
