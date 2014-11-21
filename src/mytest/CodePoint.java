package mytest;
/**
 * 
 * <p>
 * Description: 代码点 代码单元
 * </p>
 * @author zhangjunshuai
 * @version 1.0
 * Create Date: 2014-10-15 下午4:15:15
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
public class CodePoint {

	/**
	 * <p>
	 * </p>
	 * @author zhangjunshuai
	 * @date 2014-10-15 下午4:04:25
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "\u03C0 \uD835\uDD6B \uD835\uDD6B";
		int lengthU = sentence.length();
		int lengthP = sentence.codePointCount(0, lengthU);
		System.out.println(lengthU);        // 4个code units
		System.out.println(lengthP);        // 3个code points
		int i = sentence.codePointAt(2);    // i=2 true  i=0,1,3 false  i=4 out of bound
		boolean b = Character.isSupplementaryCodePoint(i);
		System.out.println(b); 

	}

}
