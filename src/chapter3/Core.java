package chapter3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class Core {

	/**
	 * <p>
	 * </p>
	 * @author zhangjunshuai
	 * @date 2014-10-15 ÏÂÎç5:19:15
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> buffer1 = new ArrayList<String>();
		List<String> buffer2 = new ArrayList<String>();
		
		Exchanger<List<String>> exchanger = new Exchanger<List<String>>();
		Producer producer = new Producer(buffer1,exchanger);
		Consumer consumer = new Consumer(buffer2,exchanger);
		
		Thread threadProducer = new Thread(producer);
		Thread threadConsumer = new Thread(consumer);
		threadProducer.start();
		threadConsumer.start();
	}

}
