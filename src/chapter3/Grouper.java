package chapter3;

public class Grouper implements Runnable{

	private Results results;
	public Grouper(Results results){
		this.results = results;
	}
	
	public void run(){
		int finalResult = 0;
		System.out.printf("峇佩潤崩阻！！！！！！！！！！！！！！！！！！Grouper: Processing results...\n");

		int data[] = results.getData();
		for(int number : data){
			finalResult+=number;
		}
	}
}
