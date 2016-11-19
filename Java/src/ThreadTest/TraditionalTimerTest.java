package ThreadTest;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TraditionalTimerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Timer().schedule(new TimerTask() {

			@Override
			public void run() {
				System.out.println("bombing!");
			}
		}, 10000, 3000);// 10秒后开始炸，每隔3秒炸一次
		while (true) {
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
