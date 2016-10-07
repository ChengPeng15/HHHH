package 单例模式;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNextLine()){
		String date=cin.nextLine();
		String endDate = null;
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date tempDate = null;
		try {
			tempDate = sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		if (tempDate != null) {
			int day = cal.getActualMaximum(Calendar.MONTH); 
			endDate = date + "-" + day;
		}
		System.out.println(endDate);
		}
	}
}