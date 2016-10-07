package DateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo02 {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm--dd");
		Date data = null;
		try {
			 data =sdf.parse("0015-05--12");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(data);
		SimpleDateFormat sdf1 = new SimpleDateFormat("y年mm月dd日");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年mm月dd日");
		String str = sdf1.format(data);
		String str2 = sdf2.format(data);
		System.out.println(str+" "+str2);
	}

}
