package SE;
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
		// TODO Auto-generated method stub

		out1(new String[]{"1","2"});
		out2("3","4");
		
		
		//�����ʹ�ӡ�������ά����  
        int arr[ ][ ];  
          
        arr=new int[3][];//����˵��Ϊ����������  
          
        arr[0]=new int[10];//arr[0]ָ����һ��һλ����  
        arr[1]=new int[3];  
        arr[2]=new int[4];  
          
        //��ֵ  
        for(int i=0;i<arr.length;i++){  
              
            for(int j=0;j<arr[i].length;j++){  
                  
                arr[i][j]=j;  
            }  
              
        }  
          
        //���  
        for(int i=0;i<arr.length;i++){  
              
            for(int j=0;j<arr[i].length;j++){  
                  
                System.out.print(arr[i][j]+" ");  
            }  
            System.out.println();  
        }  
          
        /*�������� 
        0 1 2 3 4 5 6 7 8 9  
        0 1 2  
        0 1 2 3  
        *///  
		
	}

	static void out1(String[] ss){
		for (String string : ss) {
			System.out.println(string);
		}
	}
	
	static void out2(String... ss){
		for (String str : ss) {
			System.out.println(str);
		}
	}
}
