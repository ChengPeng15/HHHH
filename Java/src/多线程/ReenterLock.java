package 多线程;

import java.util.concurrent.locks.ReentrantLock;

public class ReenterLock implements Runnable{
	public static  ReentrantLock lock = new ReentrantLock();
	public String str = "";
	public static int i=0;
	

	
	@Override
	public void run() {
		for (int j = 0; j < 1000; j++) {
			lock.lock();
			System.out.println(Thread.currentThread().getName()+","+i);
			try{
				i++;
				}finally{
					lock.unlock();
			}
			
		}
	}

	
	
	public static void main(String[] args) throws InterruptedException {
		//for(int i = 0; i < 2000; i++)
		{
		ReenterLock t1 =new ReenterLock();
		Thread t2 = new Thread(t1);
		t2.setName("t2");
		Thread t3 = new Thread(t1);
		t3.setName("t3");
		t2.start();t3.start();
		//joinbi表示主线程愿意等待t2线程执行完毕在执行
		t2.join();t3.join();
		System.out.println(i);
		}

	}
}
