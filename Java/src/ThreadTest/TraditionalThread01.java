package ThreadTest;

public class TraditionalThread01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Thread thread = new Thread(){};//这种写法是Thread的子类
		Thread thread = new Thread(){
			@Override
			public void run() {
				while(true){
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("1"+Thread.currentThread().getName());//Thread.currentThread()表示当前线程
					System.out.println("2"+this.getName());//this 代表run方法所在的对象

				}
			}
			
		};
		thread.start();
//		System.out.println(Thread.currentThread().getName());//main
	}

}
