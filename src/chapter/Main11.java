package chapter;

public class Main11 {

	/**
	 * <p>
	 * </p>
	 * @author zhangjunshuai
	 * @date 2014-8-25 обнГ4:10:42
	 * @param args
	 */
	public static void main(String[] args) {

		MyThreadGroup threadGroup = new MyThreadGroup("MyThreadGroup");
		Task task = new Task();
		for(int i = 0;i<2;i++){
			Thread t = new Thread(threadGroup,task);
			t.start();
		}
	}

}
