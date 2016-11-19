package ThreadTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		Date date = null;
		try {
			date = sf.parse("2016-08-15 12:12:35");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cal.setTime(date);
		cal.add(Calendar.SECOND, 2);
		System.out.println(sf.format(cal.getTime()));
	}

}
