package SE;

import java.util.Date;

/**
 * 
 * <p>
 * Description: ��ʵ����Ϊ��ѧϰprintf���������͵ĸ�ʽ�����
 * </p>
 * @author zhangjunshuai
 * @version 1.0
 * Create Date: 2014-10-16 ����6:12:50
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
public class PrintfDate {

	/**
	 * <p>
	 * </p>
	 * @author zhangjunshuai
	 * @date 2014-10-16 ����6:12:46
	 * @param args
	 */
	public static void main(String[] args) {
		//printf�������Դ�ӡʱ���ʽ����t��ʼ���Ա���������ĸ������������ĸ��ʽ
		System.out.printf("%tc\n",new Date());
		System.out.printf("%tF\n",new Date());
		System.out.printf("%tD\n",new Date());
		System.out.printf("%tT\n",new Date());
		System.out.printf("%tr\n",new Date());
		System.out.printf("%tR\n",new Date());
		System.out.printf("%tY\n",new Date());
		System.out.printf("%ty\n",new Date());
		System.out.printf("%tC\n",new Date());
		System.out.printf("%tb\n",new Date());
		System.out.printf("%tm\n",new Date());
		System.out.printf("%td\n",new Date());
		System.out.printf("%te\n",new Date());
		System.out.printf("%tA\n",new Date());
		System.out.printf("%ta\n",new Date());
		System.out.printf("%tj\n",new Date());
		System.out.printf("%tH\n",new Date());
		System.out.printf("%tk\n",new Date());
		System.out.printf("%tI\n",new Date());
		System.out.printf("%tl\n",new Date());
		System.out.printf("%tM\n",new Date());
		System.out.printf("%tS\n",new Date());
		System.out.printf("%tL\n",new Date());
		System.out.printf("%tN\n",new Date());
		System.out.printf("%tp\n",new Date());
		//System.out.printf("%tP\n",new Date());//�˷������� Ӧ�ú�ʱ���й�ϵ
		System.out.printf("%tz\n",new Date());
		System.out.printf("%tZ\n",new Date());
		System.out.printf("%ts\n",new Date());
		System.out.printf("%tQ\n",new Date());
		
		

		System.out.printf("%1$s %2$tB %2$te, %2$tY\n", "Due date:", new Date());//%֮���2��ʾ���ǵڶ����������˴���ָ����new Date()
		System.out.printf("%s %tB %<te, %<tY\n", "Due date:", new Date());//ѡ��ʹ��<��־����ָʾǰ���ʽ˵���еĲ��������ٴ�ʹ�á�
		
		
		
		
		System.out.printf("%d\n", 199);//
		System.out.printf("%x\n", 199);//
		System.out.printf("%o\n", 199);//
		System.out.printf("%f\n", 19.9);//
		System.out.printf("%e\n", 405.4);//
		System.out.printf("%g\n", 19.93456789);//
		System.out.printf("%a\n", 19.93456789);//
		System.out.printf("%n");//
		
		System.out.printf("%h\n", "fdgdf");//
		
		
		
		
		
		System.out.printf("%h\n", "fdgdf");//
		
	}

}
