 package ThreadTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/*
 * Timer类 定时器  jdk1.5前就有
 */
public class TraditionalTimerTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//年yyyy月份要大写M,大写H 24 小时 0-23
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Date date = null;
		try {
			date = sf.parse(str);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		System.out.println(sf.format(cal.getTime()));
		cal.add(Calendar.SECOND, 3);
		new Timer().schedule(new TimerTask() {
			
			@Override
				public void run() {
					System.out.println("bombing!");
				}
				
			}, cal.getTime(), 2000);
		while(true){
			System.out.println(new Date().getSeconds());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
