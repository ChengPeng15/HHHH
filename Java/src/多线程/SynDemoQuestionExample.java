package 多线程;

/**
 * Created by Administrator on 2015/7/27.
 */
public class SynDemoQuestionExample {

    public static void main(String [] args) {
        Data1 d = new Data1();
        new ThreadCC(d).start();
        new ThreadCC(d).start();
    }

}

class Data1 {
    int i;
//    byte [] lock = new byte[0];
    public void process() {
//        synchronized (lock) {
            System.out.println("Before: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {}
//        synchronized (lock) {
            i++;
//        }
            System.out.println("After: " + i);
//        }

    }
}

class ThreadCC extends Thread {
    Data1 d;
    public ThreadCC(Data1 d) {
        this.d = d;
    }
    public void run() {
        while(true) {
            d.process();
        }
    }
}
