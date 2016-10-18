 package ThreadTest;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
/*
 * Timer类 定时器  jdk1.5前就有
 */
public class TraditionalTimerTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Timer().schedule(new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("bombing!");
			}
		}, 10000);//10秒后
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
