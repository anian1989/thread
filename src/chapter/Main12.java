package chapter;

public class Main12 {

	/**
	 * <p>
	 * </p>
	 * @author zhangjunshuai
	 * @date 2014-8-25 ����6:58:42
	 * @param args
	 */
	public static void main(String[] args) {

		MyTreadFactory factory = new MyTreadFactory("MyTreadFactory");
		Task12 task = new Task12();
		Thread thread;
		System.out.println("Starting the Threads ");
		for (int i = 0; i < 10; i++) {
			thread = factory.newThread(task);
			thread.start();
		}
		System.out.println("Factory stats:");
		System.out.printf("%s\n",factory.getStatuts());
	}

}
