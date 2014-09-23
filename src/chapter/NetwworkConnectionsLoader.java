package chapter;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class NetwworkConnectionsLoader implements Runnable{

	@Override
	public void run() {
		System.out.printf("Beginning Net sources loading : %s\n", new Date());
		try {
			TimeUnit.SECONDS.sleep(6);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("Net sources loading has finished :%s\n",new Date());
				
	}
}
