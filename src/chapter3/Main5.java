package chapter3;

import java.util.concurrent.Phaser;

public class Main5 {

	/**
	 * <p>
	 * </p>
	 * @author zhangjunshuai
	 * @date 2014-9-29 ����4:31:46
	 * @param args
	 */
	public static void main(String[] args) {
		Phaser phaser = new Phaser(3);
		
		FileSearch system = new FileSearch("C:\\Windows","log",phaser);
		FileSearch apps = new FileSearch("c:\\Program Files","log",phaser);
		FileSearch documents = new FileSearch("c:\\Documents And Settings","log",phaser);
		
		Thread systemThread = new Thread(system,"System");
		systemThread.start();
		
		Thread appsThread = new Thread(apps,"apps");
		appsThread.start();
		
		Thread documentsThread = new Thread(documents,"documents");
		documentsThread.start();
		
		
		try {
			systemThread.join();
			appsThread.join();
			documentsThread.join();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Terminated: " + phaser.isTerminated());

	}

}
