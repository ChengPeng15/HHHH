package cn.itcast.heima2;

public class TraditionalThread {

	/**
	 * @param args
	 */
	//相当于继承Thread并重写run方法

	public static void main(String[] args) {
		Thread thread = new Thread(){
			@Override
			public void run() {
				while(true){
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("1:" + Thread.currentThread().getName());
					System.out.println("2:" + this.getName());
				}
			}
		};
		thread.start();
		
		//相当于实现Runnable接口重写run方法  
		
		/*其中TaskClass要去implements  Runnable
		 * TaskClass r = new (...)
		 * Thread thread2 = new Thread(r);
		 */
		Thread thread2 = new Thread(new Runnable(){
			@Override
			public void run() {
				while(true){
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("1:" + Thread.currentThread().getName());

				}				
				
			}
		});
		thread2.start();
		
		/*
		 * 这个是测试题 是看是实现谁的run方法  是实现子类的run方法
		 * 子类有run方法  覆盖了父类用Runnable写的run方法
		 */
		new Thread(
				new Runnable(){
					public void run() {
						while(true){
							try {
								Thread.sleep(500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							System.out.println("runnable :" + Thread.currentThread().getName());

						}							
					}
				}
		){
			public void run() {
				while(true){
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("thread :" + Thread.currentThread().getName());

				}	
			}
		}.start();
		
		
	}

}
