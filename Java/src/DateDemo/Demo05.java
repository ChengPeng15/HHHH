package DateDemo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo05 {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(getTheFirstDayOfWeek(Calendar.getInstance())));
		System.out.println(sdf.format(getTheFirstDayOfMonth(Calendar.getInstance())));
		System.out.println(sdf.format(getTheLastOfMonth(Calendar.getInstance())));
		System.out.println(sdf.format(getTheLastDayofTheLastMonth(Calendar.getInstance())));
		System.out.println(sdf.format(getTheFirstDayofTheLastMonth(Calendar.getInstance())));

	}

	public static Date getTheFirstDayOfWeek(Calendar c) {
		int day_of_week = c.get(Calendar.DAY_OF_WEEK) - 1;//一周的第几天
    	if (day_of_week == 0){
    		day_of_week = 7;
    	}    	   
    	c.add(Calendar.DATE, -day_of_week + 1);
    	c.set(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH), 0, 0, 0);
		return c.getTime();
	}

	public static Date getTheFirstDayOfMonth(Calendar c){//月的第一天
		c.set(Calendar.DAY_OF_MONTH, c.getActualMinimum(Calendar.DAY_OF_MONTH));
		c.set(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH), 0, 0, 0);
		return c.getTime();
	}
	
	public static Date getTheLastOfMonth(Calendar c){//月的最后一天
		c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		c.set(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH), 23, 59, 59);
		return c.getTime();
	}
	
	public static Date getTheLastDayofTheLastMonth(Calendar c){//上个月最后一天
		c.add(Calendar.MONTH, -1);
		return getTheLastOfMonth(c);
	}
	
	public static Date getTheFirstDayofTheLastMonth(Calendar c){//上个月最后一天
		c.add(Calendar.MONTH, -1);
		return getTheFirstDayOfMonth(c);
	}
	
}
