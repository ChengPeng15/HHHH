package 多线程;

public class volatileTest {
	
	public static int x = 5;
	public static void main(String[] args)
	{
		Thread t1 = new Thread( new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
			//	synchronized (volatileTest.class) {
				System.out.println("1 before:"+x);

					x=x+9;
					System.out.println("1 after:"+x);
			//	}
				
			}
		});
		
		Thread t2 = new Thread( new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
			//	synchronized (volatileTest.class) {
				System.out.println("2 before:"+x);
					x=x-3;
					System.out.println("2 after:"+x);

			//	}
				
			}
		});
		
		t1.start();
		t2.start();
	}
	
	public synchronized void test()
	{
		 
	}
}
