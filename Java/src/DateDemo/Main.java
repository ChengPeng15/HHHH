package DateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


/*
 * 系统会随机给你一个日期(yyyy-MM-dd)字符串,
 * 你需要计算这个时间上一个月的最后一天的具体日期,
 * 最后以yyyy年MM月dd日的字符串形式返回
 * 输入：  输入日期（格式为yyyy-MM-dd）的字符串  
 * 输出：  输出结果  上一个月的最后一天的日期（格式为yyyy年MM月dd日）
 */
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextLine()){
			String str = in.nextLine();
			System.out.println(GetDayLastMonth(str));
		}
		

	}
// Get The last day of the last month
	private static String GetDayLastMonth(String str)  {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = sdf.parse(str);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.DAY_OF_MONTH, 0);//或者下面两行
		cal.set(Calendar.DAY_OF_MONTH, -2);//或者下面两行 0表示上个月最后一天  -1 是上个月倒数第二天
//		cal.add(Calendar.MONTH, -1);
//		cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));  
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日");
		String re = sdf1.format(cal.getTime());
		return re;
	}

}
