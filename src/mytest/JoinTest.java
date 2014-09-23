package mytest;
/**
 * 
 * <p>
 * Description:join方法的使用 
 * </p>
 * @author zhangjunshuai
 * @version 1.0
 * Create Date: 2014-8-15 下午2:24:14
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
public class JoinTest  
{  
    public static void main(String[] args)  
    {  
        Thread1 thread1 = new Thread1("Thread1");  
        Thread2 thread2 = new Thread2("Thread2", thread1);  
        thread2.start();  
    }  
}