package ThreadTest;

import java.util.Timer;
import java.util.TimerTask;

/*
 * 写一个定时器  2秒炸一次  4秒炸一次  
 * 每次间隔的时间不一样  要交替的出现
 */
public class TraditionalTimerTest4 {
	public static void main(String[] args) {
		new Timer().schedule(new TimerTask() {

			@Override
			public void run() {
				System.out.println("bombing!");
			}
		}, 2000);
		

		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
}
