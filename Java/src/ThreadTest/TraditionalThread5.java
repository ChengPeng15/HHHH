package ThreadTest;
/*
 * 下面这个例子最终运行的是thread的run方法
 * new Thread(){}.start是子类
 * new Thread(new Runnable()....).start还是该方法
 * new Thread(runnable.run){run}   子类有run方法，就不用找父类runnable的run方法了
 */
public class TraditionalThread5 {

	public static void main(String[] args) {

		// 匿名类创建线程
		new Thread(new Runnable() {
			public void run() {
				while (true) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("runnable:" + Thread.currentThread().getName());// Thread.currentThread()表示当前线程

				}
			};
		}){
			public void run() {
				while (true) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("thread:" + Thread.currentThread().getName());// Thread.currentThread()表示当前线程
				}
			};
		}.start();
	}

}
