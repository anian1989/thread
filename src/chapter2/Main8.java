package chapter2;
/**
 * 
 * <p>
 * Description: 
 * </p>
 * @author zhangjunshuai
 * @version 1.0
 * Create Date: 2014-9-22 ÏÂÎç6:15:11
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
public class Main8 {
	
	public static void main(String[] args) {
		FileMock mock = new FileMock(100,10);
		Buffer buffer = new Buffer(20);
		Producer2 producer = new Producer2(mock, buffer);
		Thread threadProducer = new Thread(producer,"Producer");
		Consumer2 consumers[] = new Consumer2[3];
		Thread threadConsumers[] = new Thread[3];
		for(int i=0;i<3;i++){
			consumers[i] = new Consumer2(buffer);
			threadConsumers[i] = new Thread(consumers[i],"Consumer"+i);
		}
		threadProducer.start();
		for(int i=0;i<3;i++){
			threadConsumers[i].start();
		}
	}
}
