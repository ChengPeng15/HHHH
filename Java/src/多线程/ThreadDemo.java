package 多线程;

/**
 * Created by Administrator on 2015/7/27.
 */
public class ThreadDemo {

    public static void main(String [] args) {
        Thread t = new ThreadA();
        t.setName("ThreadA");
        t.start();

//        Runnable r = new ThreadB();
//        Thread t2 = new Thread(r);
//        t2.start();

        while(true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
            System.out.print(3);
        }
    }

}

class ThreadA extends Thread {
    public void run() {
        while (true) System.out.println(this.getName() + ":" + 2);
    }
}

class ThreadB implements Runnable {
    public void run() {
        while(true) System.out.println(4);
    }
}
