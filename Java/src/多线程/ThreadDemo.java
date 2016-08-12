package 多线程;

class A implements Runnable{
	private int x = 10;
	public synchronized void run(){			//覆盖Thread类中的run方法。里面要写的是该线程的执行任务
		for(int i = 0; i <200; i++){
			System.out.println("线程"+Thread.currentThread().getName()+"正在运行"+(x++)+" : "+i);
			
		}
	}
}
public class ThreadDemo{
	public static void main(String args[]){
		A a = new A();
		A b = new A();
		new Thread(a,"a1").start();
		new Thread(a,"a2").start();
		new Thread(b,"b").start();

	}
}
