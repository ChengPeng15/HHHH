//package 单例模式;
//
//
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;
//public class Main2 {
// public static void main(String[] args) {
////  Calendar a=Calendar.getInstance();
////  a.set(Calendar.DATE, 1);//把日期设置为当月第一天
////  a.roll(Calendar.DATE, -1);//日期回滚一天，也就是最后一天
////  int MaxDate=a.get(Calendar.DATE);
////  System.out.println("该月最大天数:"+MaxDate);
//
//	 
//	 Calendar cal = Calendar.getInstance();
//	// 获取本月的最大天数
//	int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
//	// 设置创造新日期，这个日期是本月的最后一天
//	cal.set(Calendar.DATE, days);
//	// 然后打印出来
//	Date newD = cal.getTime();
//	// 加上格式化
//	System.out.println("本月最后一天的日期是："
//	+ new SimpleDateFormat("yyyy-MM-dd").format(newD));
//	get.data.month(now);
// }
//}