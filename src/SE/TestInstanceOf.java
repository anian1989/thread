package SE;

import java.util.ArrayList;

/**
 * 
 * <p>
 * Description: 测试instanceof关键字子父类子类的使用
 * </p>
 * @author zhangjunshuai
 * @version 1.0
 * Create Date: 2014-11-7 下午5:54:19
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
public class TestInstanceOf {

	/**
	 * <p>
	 * </p>
	 * @author zhangjunshuai
	 * @date 2014-11-7 下午5:49:59
	 * @param args
	 */
	public static void main(String[] args) {
		
		Son my = new Son();
		Father fa = new Father();
		Father fason = new Son();
		if(fason instanceof Son){
			System.out.println("1");
		}
		
		if(fa instanceof Son){
			System.out.println("2");
		}

		if(my instanceof Father){
			System.out.println("3");
		}
		
	}

}
