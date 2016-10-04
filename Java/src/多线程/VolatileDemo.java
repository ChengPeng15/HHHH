package 多线程;

public class VolatileDemo {

	private volatile int number=0;
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}



	public void increase(){
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		synchronized (this) {
			this.number++;
		}
	}
	public static void main(String[] args) {
		 final VolatileDemo volDemo = new VolatileDemo();
		for (int i = 0; i < 500000000; i++) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					volDemo.increase();
				}
			}).start();
		}
		while(Thread.activeCount()>1) {
			System.out.println(Thread.activeCount());
			Thread.yield();
		}
		System.out.println("number:"+volDemo.getNumber());
	}
	
//	public class TaskClass implements Runnable{
//
//	@Override
//	public void run() {
//		
//		increase();
//	}
//		
//	}
//	public static void main(String[] args) {
//		VolatileDemo volDemo = new VolatileDemo();
//		for (int i = 0; i < 500; i++) {
//			new Thread(volDemo.new TaskClass()).start();
//		}
//		System.out.println("number:"+volDemo.getNumber());
//	}

}
