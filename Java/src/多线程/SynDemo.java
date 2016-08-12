package 多线程;

/**
 * Created by Administrator on 2015/7/27.
 */
public class SynDemo {

    public static void main(String [] args) {
        Data d = new Data();
        new ThreadC(d).start();//这个例子是不过是吧ThreadC里的构造函数放了个Date类型的成员变量
        
        //接口局部变量都能实例变量
        new ThreadC(d).start();
    }

}

class Data {
    int i;
    byte [] lock = new byte[0];
    public void process() {
        synchronized (lock) {
            System.out.println("Before: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {}
//        synchronized (lock) {
            i++;
//        }
            System.out.println("After: " + i);
        }

    }
}

class ThreadC extends Thread {
    Data d;//？这个跟  int i   或者static那种一样？
    public ThreadC(Data d) {
        this.d = d;
    }
    public void run() {
        while(true) {
            d.process();
        }
    }
}
