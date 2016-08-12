package 多线程;

class A implements Runnable{
	private int x = 10;
	public synchronized void run(){			//覆盖Thread类中的run方法。里面要写的是该线程的执行任务
		for(int i = 0; i <10; i++){
			System.out.println("线程"+Thread.currentThread().getName()+"正在运行"+(x++)+" : "+i);
			
		}
	}
}
public class ThreadDemo01{
	public static void main(String args[]){
		A a = new A();
		A b = new A();
		new Thread(a,"a1").start();
		new Thread(a,"a2").start();
		new Thread(a,"a3").start();//a1.a2.a3并发
//		new Thread(b,"b").start();

	}
}
/*
 * 线程a1正在运行10 : 0
线程a1正在运行11 : 1
线程a1正在运行12 : 2
线程a1正在运行13 : 3
线程a1正在运行14 : 4
线程a1正在运行15 : 5
线程a1正在运行16 : 6
线程a1正在运行17 : 7
线程a1正在运行18 : 8
线程a1正在运行19 : 9
线程a3正在运行20 : 0
线程a3正在运行21 : 1
线程a3正在运行22 : 2
线程a3正在运行23 : 3
线程a3正在运行24 : 4
线程a3正在运行25 : 5
线程a3正在运行26 : 6
线程a3正在运行27 : 7
线程a3正在运行28 : 8
线程a3正在运行29 : 9
线程a2正在运行30 : 0
线程a2正在运行31 : 1
线程a2正在运行32 : 2
线程a2正在运行33 : 3
线程a2正在运行34 : 4
线程a2正在运行35 : 5
线程a2正在运行36 : 6
线程a2正在运行37 : 7
线程a2正在运行38 : 8
线程a2正在运行39 : 9

 */
