package SE;

import java.util.Date;

/**
 * 
 * <p>
 * Description: 本实例是为了学习printf对日期类型的格式化输出
 * </p>
 * @author zhangjunshuai
 * @version 1.0
 * Create Date: 2014-10-16 下午6:12:50
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
	 * @date 2014-10-16 下午6:12:46
	 * @param args
	 */
	public static void main(String[] args) {
		//printf方法可以打印时间格式，以t开始，以表中人以字母结束的两个字母格式
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
		//System.out.printf("%tP\n",new Date());//此方法报错 应该和时区有关系
		System.out.printf("%tz\n",new Date());
		System.out.printf("%tZ\n",new Date());
		System.out.printf("%ts\n",new Date());
		System.out.printf("%tQ\n",new Date());
		
		

		System.out.printf("%1$s %2$tB %2$te, %2$tY\n", "Due date:", new Date());//%之后的2表示的是第二个参数，此处是指的是new Date()
		System.out.printf("%s %tB %<te, %<tY\n", "Due date:", new Date());//选择使用<标志，它指示前面格式说明中的参数将被再次使用。
		
		
		
		
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
