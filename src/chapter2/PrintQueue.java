package chapter2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * ��ӡ����
 */
public class PrintQueue {
	//private final Lock queueLock = new ReentrantLock();
	private final Lock queueLock = new ReentrantLock(true);
	public void printJob(Object document){
		queueLock.lock();//��ȡLock����Ŀ���Ȩ
		
		try {
			Long duration = (long)(Math.random()*10000);
			System.out.println(Thread.currentThread().getName()
					+"PrintQueue:Printing a Job during "
					+(duration/1000)+" seconds");
			Thread.sleep(duration);			
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			queueLock.unlock();//�ͷ�Lock����Ŀ���
		}
		queueLock.lock();//��ȡLock����Ŀ���Ȩ
		
		try {
			Long duration = (long)(Math.random()*10000);
			System.out.println(Thread.currentThread().getName()
					+"PrintQueue:Printing a Job during "
					+(duration/1000)+" seconds");
			Thread.sleep(duration);			
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			queueLock.unlock();//�ͷ�Lock����Ŀ���
		}
	}
}
