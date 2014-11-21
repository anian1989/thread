package SE;

import java.math.BigDecimal;
import java.text.ParseException;

public class Test {

	/**
	 * <p>
	 * </p>
	 * @author zhangjunshuai
	 * @date 2014-11-10 ÉÏÎç10:51:08
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		java.util.Date d = new java.util.Date();
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
		java.text.SimpleDateFormat sdf1 = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String d_head = sdf.format(d);
		java.util.Date d1 = sdf1.parse(d_head+" 23:55:00");
		java.util.Date d2 = sdf1.parse(d_head+" 23:59:59");
		java.util.Date d3 = sdf1.parse(d_head+" 00:00:00");
		java.util.Date d4 = sdf1.parse(d_head+" 01:00:00");
		if((d.getTime()>d1.getTime() && d.getTime()<=d2.getTime())||(d.getTime()>=d3.getTime() && d.getTime()<d4.getTime())){
			//23:55:00~01:00:00
			
		}else{
			
		}
	}

}
