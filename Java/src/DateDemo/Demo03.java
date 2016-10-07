package DateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Demo03 {

	public static void main(String[] args) throws ParseException {
//		Date date = new Date(System.currentTimeMillis());
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//		System.out.println("格式化前");
//		System.out.println(date);
//		System.out.println(sdf.format(date));
//		
//		//string转化为Data
//		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
//		Date data1 = sdf1.parse("2015-09-15");
//		System.out.println(data1);
//
//		//Calendar 和Data转化
//		
//		Calendar cal = Calendar.getInstance();
//		System.out.println(sdf1.format(cal.getTime()));
		
		Calendar cal1 = new GregorianCalendar(2015, 11, 30);
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf2.format(cal1.getTime()));
		cal1.setTime(sdf2.parse("2016-06-08"));
		System.out.println(sdf2.format(cal1.getTime()));
		
}
	

}
