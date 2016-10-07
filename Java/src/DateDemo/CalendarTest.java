package DateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

	public static void main(String[] args) {
		String str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS")).format(new Date());  
	    System.out.println(str);  
	  
	    // 创建 Calendar 对象  
	    Calendar calendar = Calendar.getInstance();  
	  
	    try  
	    {  
	      // 对 calendar 设置时间的方法  
	      // 设置传入的时间格式  
	      SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-M-d H:m:s");  
	      // 指定一个日期  
	      Date date = dateFormat.parse("2013-6-1 13:24:16");  
	      // 对 calendar 设置为 date 所定的日期  
	      calendar.setTime(date);  
	  
	      // 按特定格式显示刚设置的时间  
	      str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS")).format(calendar.getTime());  
	      System.out.println(str);  
	    }  
	    catch (ParseException e)  
	    {  
	      e.printStackTrace();  
	    }  
	}

}
