package chapter2;

import java.util.Random;

public class Writer implements Runnable{
	private PricesInfo pricesInfo;
	public Writer(PricesInfo pricesInfo){
		this.pricesInfo = pricesInfo;
	}
	@Override
	public void run() {

		for(int i=0;i<3;i++){
			int p1 = new Random().nextInt(47);
			int p2 = new Random().nextInt(47)*10;
			
			System.out.println("Writer:Attempt to modify the prices."+p1+"    price2:"+p2);
			pricesInfo.setPrices(p1, p2);
			System.out.println("Writer:Prices have been modified."+p1+"    price2:"+p2);
			try {
				Thread.sleep(2);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
