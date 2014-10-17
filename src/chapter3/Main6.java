package chapter3;
import chapter3.MyPhaser.Student;;
public class Main6 {

	/**
	 * <p>
	 * </p>
	 * @author zhangjunshuai
	 * @date 2014-10-10 ÏÂÎç5:13:43
	 * @param args
	 */
	public static void main(String[] args) {
		MyPhaser phaser = new MyPhaser();
		
		MyPhaser.Student students[] = new Student[5];
		for(int i =0;i<students.length;i++){
			students[i] = phaser.new Student(phaser);
			phaser.register();
			
		}
		
		Thread threads[] = new Thread[students.length];
		for(int i =0;i<students.length;i++){
			threads[i] = new Thread(students[i],"Student "+i);
			threads[i].start();
		}
		
		
		for(int i =0;i<threads.length;i++){
			
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
