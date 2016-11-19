package ThreadTest;

public class TraditionalThread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Thread thread1 = new Thread(){};//这种写法是Thread的子类
		Thread thread1 = new Thread() {// 这种方式覆盖父类的run方法
			@Override
			public void run() {
				while (true) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("1" + Thread.currentThread().getName());// Thread.currentThread()表示当前线程
//					System.out.println("2" + this.getName());// this 代表run方法所在的对象
																

				}
			}

		};
		thread1.start();

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("11" + Thread.currentThread().getName());// Thread.currentThread()表示当前线程

				// this 代表run方法所在的对象,是runnable对象，他不是线程没有getName方
				// System.out.println("222"+this.getName());

			}
		});

		thread2.start();
	}

}
