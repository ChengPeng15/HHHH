package DateDemo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo04 {

	public static void main(String[] args) {
//		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
//		Calendar cal=Calendar.getInstance();
//		cal.set(Calendar.YEAR, 2006);
//		cal.set(Calendar.MONTH, 8);
//		cal.set(Calendar.DAY_OF_MONTH, 3);
//		cal.add(Calendar.DATE, -40);
//		Date date=cal.getTime();
//		System.out.println(df.format(date));
//		cal.add(Calendar.DATE, 4);
//		date=cal.getTime();
//		System.out.println(df.format(date));
		
//		SimpleDateFormat df1=new SimpleDateFormat("yyyy-MM-dd");
//	        Calendar cal = Calendar.getInstance();
//	          cal.set(2009, -3, 31);//(-3+1+12)=10
//	          System.out.println(df1.format(cal.getTime()));
//	          cal.set(Calendar.MONTH, 3);//4月没有31号所以变成5月1号
//	          System.out.println(df1.format(cal.getTime()));
	          
		SimpleDateFormat df1=new SimpleDateFormat("yyyy-MM-dd");
	          Calendar cal1 = Calendar.getInstance();//2016-10-7
	          Calendar cal2 = Calendar.getInstance();
//	          cal2.roll(Calendar.MONTH,5);//月份加5-----2016--03-7
	          cal2.add(Calendar.MONTH,5);//月份加5-----2017--03-7
	          System.out.println(df1.format(cal1.getTime()));
	          System.out.println(df1.format(cal2.getTime()));

		
//		Calendar cal = Calendar.getInstance();
////		cal.getc
//		cal.set(Calendar.DAY_OF_WEEK, 3);
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
	}

}
