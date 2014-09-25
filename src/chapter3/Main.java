package chapter3;

public class Main {

	/**
	 * <p>
	 * </p>
	 * @author zhangjunshuai
	 * @date 2014-9-23 обнГ8:45:31
	 * @param args
	 */
	public static void main(String[] args) {
		PrintQueue2 printQueue = new PrintQueue2();
		Thread thread[] = new Thread[10];
		for(int i=0;i<10;i++){
			thread[i] = new Thread(new Job(printQueue),"Thread"+i);
		}

		for(int i=0;i<10;i++){
			thread[i].start();
		}
	}

}
