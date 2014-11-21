package SE;

import java.util.Random;

/**
 * <p>
 * Description: �˷����Ƕ���������Ͳ����������ѧϰ
 * </p>
 * @author zhangjunshuai
 * @version 1.0
 * Create Date: 2014-10-24 ����5:49:22
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
public class Array {

	/**
	 * <p>
	 * </p>
	 * @author zhangjunshuai
	 * @date 2014-10-24 ����5:48:19
	 * @param args
	 */
	public static void main(String[] args) {
		//1�����������ʹ��
		out1(new String[]{"1","2"});
		out2("3","4");
       //2�������������ʹ��   
        irregular();
	}

	/*
	 * ����������
	 */
	static void irregular(){
		int arrays[][];
		arrays =  new int[3][];
		for(int i=0;i<arrays.length;i++){
			/*Random r = new Random(47);
			int h =   r.nextInt(13);*/
			int h =   (int)(Math.random()*16);
			arrays[i] = new int[h];
			for(int j=0;j<h;j++){
				int w =  (int)(Math.random()*100);
				arrays[i][j] = w;
			}
		}
		//�������
		for(int i=0;i<arrays.length;i++){  
            
            for(int j=0;j<arrays[i].length;j++){  
                  
                System.out.print(arrays[i][j]+" ");  
            }  
            System.out.println();  
        }  
	}
	
	static void out1(String[] ss){
		for (String string : ss) {
			System.out.print(string);
		}
		System.out.println();
	}
	static void out2(String... ss){
		for (String str : ss) {
			System.out.print(str);
		}
		System.out.println();
	}
	
}
