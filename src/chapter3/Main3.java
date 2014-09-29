package chapter3;

import java.util.concurrent.CyclicBarrier;
/**
 * 
 * <p>
 * Description: CyclicBarrier��ѧϰ  ����һ������
 * �����������㽫�����־����в���һ�����֡�
 * ����ᱻ�ֳɶ���Ӽ���ʹ��divide �� conquer ��������
 * ����ÿ���̻߳���һ���Ӽ��в����Ǹ����֡�һ��ȫ���г����н���������һ������������ͳһ���ǵĽ����
 * </p>
 * @author zhangjunshuai
 * @version 1.0
 * Create Date: 2014-9-28 ����8:08:42
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
