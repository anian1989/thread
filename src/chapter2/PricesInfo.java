package chapter2;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class PricesInfo {
	private int price1;
	private int price2;
	private ReadWriteLock lock;
	public PricesInfo(){
		price1 = 1;
		price2 = 1;
		lock = new ReentrantReadWriteLock();
		
	}
	public int getPrice1() {
		lock.readLock().lock();
		int value = price1;
		lock.readLock().unlock();
		return value;
	}
	public void setPrice1(int price1) {
		this.price1 = price1;
	}
	public int getPrice2() {
		lock.readLock().lock();
		int value = price2;
		lock.readLock().unlock();
		return value;
	}
	public void setPrice2(int price2) {
		this.price2 = price2;
	}
	
	public void setPrices(int price1,int price2){
		lock.writeLock().lock();
		this.price1 = price1;
		this.price2 = price2;
		lock.writeLock().unlock();
	}
}
