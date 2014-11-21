package SE;

import java.util.Random;

public class RandomUnit {

	
	/**
	 * 
	 * <p>
	 * 无种子参数的构造方法使用一个和当前系统时间对应的相对时间有关的数字作为种子数，
	 * 然后使用这个种子数构造Random对象。
	 * </p>
	 * @author zhangjunshuai
	 * @date 2014-10-28 上午11:07:53
	 */
	static void randomNull(){
		for (int i = 0; i < 100; i++) {
			Random r = new Random();
			System.out.println("无种子参数："+r.nextInt());
		}
	}
	/**
	 * <p>
	 * 在种子参数是同一个数字的时候，出现只有一个随机数的情况
	 * </p>
	 * @author zhangjunshuai
	 * @date 2014-10-28 上午11:18:17
	 */
	static void randomHave(){
		for (int i = 0; i < 100; i++) {
			Random r = new Random(37);
			System.out.println("有种子参数："+r.nextInt());
		}
	}
	
	/**
	 * 
	 * <p>
	 * 注意random调用方法的顺序变化之后，产生的随机值才会变
	 * </p>
	 * @author zhangjunshuai
	 * @date 2014-10-27 下午6:54:17
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
	 * 利用setSeed方法实现伪随机数
	 * </p>
	 * @author zhangjunshuai
	 * @date 2014-10-28 上午11:29:02
	 */
	static void setSeed(){
		Random r = new Random();
		for (int i = 0; i < 100; i++) {
			
			System.out.println("有种子参数："+r.nextInt(270));
			r.setSeed((long)r.nextLong());
		}
	}
	/**
	 * <p>
	 * </p>
	 * @author zhangjunshuai
	 * @date 2014-10-28 上午10:56:48
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
