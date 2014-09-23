package chapter2;

public class Main6 {

	/**
	 * <p>
	 * </p>
	 * @author zhangjunshuai
	 * @date 2014-9-17 ионГ11:17:50
	 * @param args
	 */
	public static void main(String[] args) {

		PricesInfo pricesInfo = new PricesInfo();
		Reader reader[] = new Reader[5];
		Thread threadsReader[] = new Thread[5];
		for (int i = 0; i < threadsReader.length; i++) {
			reader[i] = new Reader(pricesInfo);
			threadsReader[i]=new Thread(reader[i]);
		}
		Writer writer = new Writer(pricesInfo);
		Thread threadWriter = new Thread(writer);
		for (int i = 0; i < threadsReader.length; i++) {
			threadsReader[i].start();
		}
		threadWriter.start();
	}

}
