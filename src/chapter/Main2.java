package chapter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.Thread.State;

public class Main2 {

	/**
	 * <p>
	 * </p>
	 * @author zhangjunshuai
	 * @date 2014-8-8 ÏÂÎç3:36:20
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread[] threads = new Thread[10];
		Thread.State[] status = new Thread.State[10];
		for (int i = 0; i < 10; i++) {
			threads[i] = new Thread(new Calculator2(i));
			if((i%2) == 0)
				threads[i].setPriority(Thread.MAX_PRIORITY);
			else
				threads[i].setPriority(Thread.MIN_PRIORITY);
			threads[i].setName("Thread"+i);
		}
		try{
			FileWriter file = new FileWriter(".\\xianchenglog1.txt");
			PrintWriter pw = new PrintWriter(file);
			for(int i =0;i<10;i++){
				pw.println("main: status of thread "+i+": "+threads[i].getState());
				status[i] = threads[i].getState();
			}
			
			for(int i =0;i<10;i++){
				threads[i].start();
			}
			boolean finish = false;
			while(!finish){
				for (int i = 0; i < 10; i++) {
					if(threads[i].getState()!=status[i]){
						writeThreadInfo(pw,threads[i],status[i]);
					}
				}
				finish = true;
			}
			pw.close();
		}catch(Exception e){
			
		}
		
		
	}
	private static void writeThreadInfo(PrintWriter pw, Thread thread, State state) {
		   pw.printf("Main : Id %d - %s\n",thread.getId(),thread.getName());
		
		   pw.printf("Main : Priority: %d\n",thread.getPriority());
		
		   pw.printf("Main : Old State: %s\n",state);
		
		   pw.printf("Main : New State: %s\n",thread.getState());
		
		   pw.printf("Main : ************************************\n");
		
		}


}
