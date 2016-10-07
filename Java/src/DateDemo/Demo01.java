package DateDemo;

import java.util.Calendar;
import java.util.Date;

public class Demo01 {

	public static void main(String[] args) {
		long totalMilliseconds=System.currentTimeMillis();//1970:00:00:00 gmt  
		long totalSeconds =totalMilliseconds/1000;
		long currentSecond=totalSeconds%60;
		long totalMinutes = totalSeconds/60;
		long currentMinute = totalMinutes%60;
		long totalHours = totalMinutes/60;
		long currentHour = totalHours % 24+8;
		System.out.println(currentHour+":"+currentMinute+":"+currentSecond);
		
		
		Date data = new Date(totalMilliseconds);
		System.err.println(data);
		
		Calendar  cal =  Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal.getTime());
		
	}
	
	

}
