package DateDemo;
import java.util.Calendar;
import java.util.Date;

/**
 * @author chengpeng
 * 这个类里边的方法主要是为货物列表（本周有效，本月有效，全年有效）筛选是提供日期范围的。
 *
 */
public class GetRangeOfDate {
	
	public static Date getTheFirstDayOfWeek(Calendar c){//一周的第一天
		int day_of_week = c.get(Calendar.DAY_OF_WEEK) - 1;//一周的第几天
    	if (day_of_week == 0){
    		day_of_week = 7;
    	}    	   
    	c.add(Calendar.DATE, -day_of_week + 1);
    	c.set(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH), 0, 0, 0);
		return c.getTime();
	}
	
	public static Date getTheLastDayOfWeek(Calendar c){//一周的最后一天
		int day_of_week = c.get(Calendar.DAY_OF_WEEK) - 1;//一周第几天
  	    if (day_of_week == 0){
  	    	day_of_week = 7;
  	    }
  	    c.add(Calendar.DATE, -day_of_week + 7);
  	    c.set(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH), 23, 59, 59);
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
	
	public static Date getTheFirstOfYear(Calendar c){//年的第一天
		c.set(c.get(Calendar.YEAR), 0,1,0,0,0);
		return c.getTime();
	}
	public static Date getTheLastOfYear(Calendar c){//年的最后一天
		c.set(c.get(Calendar.YEAR), 11, 31, 23, 59, 59);
		return c.getTime();
	}

}
