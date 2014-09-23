package chapter;
/**
 * 
 * <p>
 * Description: 线程的中断
 * </p>
 * @author zhangjunshuai
 * @version 1.0
 * Create Date: 2014-8-11 上午11:09:55
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
public class PrimeGenerator extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		long number = 1L;
		while(true){
			if(isPrime(number)){
				System.out.printf("Number %d is Prime\n",number);
			}
			if(isInterrupted()){
				System.out.printf("The Prime Generator has been Interrupted");
				return;
			}
			number++;
		}
	}
	/**
	 * <p>
	 * </p>
	 * @author zhangjunshuai
	 * @date 2014-8-11 下午2:48:31
	 * @param number
	 * @return
	 */
	private boolean isPrime(long number){
		if(number <=2){
			return true;
		}
		
		for(long i=2; i<number;i++){
			if((number%i)==0){
				return false;
			}
		}
		return true;
	}

}
