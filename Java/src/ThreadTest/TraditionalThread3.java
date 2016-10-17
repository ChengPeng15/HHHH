package ThreadTest;

public class TraditionalThread3 {

	public static void main(String[] args) {
		
		//匿名类创建线程
		new Thread(new Runnable() {
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
			};
		}).start();
		
		
		
		new Thread(){
			public void run() {
				while (true) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("2" + Thread.currentThread().getName());// Thread.currentThread()表示当前线程
				}
			};
		}.start();
	}

//	 TraditionalThread4 会把这个两个混在一起
	

}
