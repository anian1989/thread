package chapter3;

import java.util.concurrent.CyclicBarrier;
/**
 * 
 * <p>
 * Description: CyclicBarrier的学习  遍历一个矩阵
 * 在这个例子里，你将在数字矩阵中查找一个数字。
 * 矩阵会被分成多个子集（使用divide 和 conquer 技术），
 * 所以每个线程会在一个子集中查找那个数字。一旦全部行程运行结束，会有一个最终任务来统一他们的结果。
 * </p>
 * @author zhangjunshuai
 * @version 1.0
 * Create Date: 2014-9-28 下午8:08:42
 * Project Name: Java7Thread
 *
 * <pre>
 * Modification History: 
  *             Date                                Author                   Version          Description 
 * -----------------------------------------------------------------------------------------------------------  
 * LastChange: $Date::             $      $Author: $          $Rev: $         
 * </pre>
 *
 */
public class Main3 {
	
	public static void main(String[] args) {
		final int ROWS = 10000;
		final int NUMBERS = 1000;
		final int SEARCH = 5;
		final int PATICIPANT = 5;
		final int LINES_PARICIPANT = 2000;
		
		MatrixMock mock = new MatrixMock(ROWS, NUMBERS, SEARCH);
		Results results = new Results(ROWS);
		Grouper grouper = new Grouper(results);
		
		CyclicBarrier barrier = new CyclicBarrier(PATICIPANT, grouper);
		
		Searcher searchers[] = new Searcher[PATICIPANT];
		for (int i = 0; i < searchers.length; i++) {
				searchers[i]=new Searcher(i*LINES_PARICIPANT, (i*LINES_PARICIPANT)+LINES_PARICIPANT, mock, results, 5,barrier);
			    Thread thread=new Thread(searchers[i]);
			    thread.start();

		}
		System.out.printf("Main: The main thread has finished.\n");

	}

}
