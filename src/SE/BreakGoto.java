package SE;

import java.util.Date;

/**
 * 
 * <p>
 * Description: ʹ��break��continue�ı�ǩ����
 * </p>
 * @author zhangjunshuai
 * @version 1.0
 * Create Date: 2014-10-16 ����4:11:39
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
public class BreakGoto {

	/**
	 * <p>
	 * </p>
	 * 
	 * @author zhangjunshuai
	 * @date 2014-10-16 ����3:28:53
	 * @param args
	 */
	public static void main(String[] args) {
		boolean t = true;

		first: {
			second: {//break �������ڱ�ǩ����ģ� ��������������صı�ǩ��˴���no��ǩ

				third: {
					System.out.println("Before the break.");
					if (t)
						break second; // break out of second
										// blockSystem.out.println("This won't execute");

				}

				System.out.println("This won't execute");
			}
			con:
				for (int j = 0; j < 4; j++) {
					
					for (int i = 0; i < 10; i++) {
						System.out.println("--- JUMP ---"+i+j);
						continue con;//�˴�������i��ѭ����������jѭ��
					}
				}
			System.out.println("This is after second block.");

		}
		
		no:{
			System.out.println("no ");
		}

		System.out.printf("%tz ",new Date());
	}

}
