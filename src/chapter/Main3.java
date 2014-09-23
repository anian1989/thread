package chapter;

public class Main3 {

	/**
	 * <p>
	 * </p>
	 * @author zhangjunshuai
	 * @date 2014-8-11 ионГ11:20:15
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread task = new PrimeGenerator();
		task.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		task.interrupt();
	}

}
