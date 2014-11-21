package SE;

import java.util.Random;

public class RandomUnit {

	
	/**
	 * 
	 * <p>
	 * �����Ӳ����Ĺ��췽��ʹ��һ���͵�ǰϵͳʱ���Ӧ�����ʱ���йص�������Ϊ��������
	 * Ȼ��ʹ���������������Random����
	 * </p>
	 * @author zhangjunshuai
	 * @date 2014-10-28 ����11:07:53
	 */
	static void randomNull(){
		for (int i = 0; i < 100; i++) {
			Random r = new Random();
			System.out.println("�����Ӳ�����"+r.nextInt());
		}
	}
	/**
	 * <p>
	 * �����Ӳ�����ͬһ�����ֵ�ʱ�򣬳���ֻ��һ������������
	 * </p>
	 * @author zhangjunshuai
	 * @date 2014-10-28 ����11:18:17
	 */
	static void randomHave(){
		for (int i = 0; i < 100; i++) {
			Random r = new Random(37);
			System.out.println("�����Ӳ�����"+r.nextInt());
		}
	}
	
	/**
	 * 
	 * <p>
	 * ע��random���÷�����˳��仯֮�󣬲��������ֵ�Ż��
	 * </p>
	 * @author zhangjunshuai
	 * @date 2014-10-27 ����6:54:17
	 */
	static void random(){
		Random r = new Random(47);
		System.out.println(r.nextInt());
		System.out.println(r.nextBoolean());
		Random w= new Random(47);
		System.out.println(w.nextInt());
		System.out.println(w.nextBoolean());
		Random h= new Random(47);
		System.out.println(h.nextFloat());
		System.out.println(h.nextInt());
		
		System.out.println(h.nextBoolean());
	}
	/**
	 * 
	 * <p>
	 * ����setSeed����ʵ��α�����
	 * </p>
	 * @author zhangjunshuai
	 * @date 2014-10-28 ����11:29:02
	 */
	static void setSeed(){
		Random r = new Random();
		for (int i = 0; i < 100; i++) {
			
			System.out.println("�����Ӳ�����"+r.nextInt(270));
			r.setSeed((long)r.nextLong());
		}
	}
	/**
	 * <p>
	 * </p>
	 * @author zhangjunshuai
	 * @date 2014-10-28 ����10:56:48
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//randomNull();
		//randomHave();
		//random();
		setSeed();
		
	}

}
