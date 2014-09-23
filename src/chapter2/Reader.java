package chapter2;

public class Reader implements Runnable{

	private PricesInfo pricesInfo;
	public Reader(PricesInfo pricesInfo){
		this.pricesInfo = pricesInfo;
	}
	@Override
	public void run() {

		for(int i=0;i<10;i++){
			
			System.out.printf("%s:Price 2:%d\n", Thread.currentThread().getName(),pricesInfo.getPrice2());
			System.out.printf("%s:Price 1:%d\n", Thread.currentThread().getName(),pricesInfo.getPrice1());
		}
			
	}
}
