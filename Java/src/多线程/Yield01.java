package 多线程;

public class Yield01 {  
    public static void main(String[] args) {  
        YieldFirst yf = new YieldFirst();  
        YieldSecond ys = new YieldSecond();  
        yf.start();  
        ys.start();  
    }  
}  
  
class YieldFirst extends Thread {  
    @Override  
    public void run() {  
        for (int i = 0; i < 20; i++) {  
            System.out.println("第一个线程第" + (i + 1) + "次运行.");  
            // 让当前线程暂停  
            Thread.yield();  
        }  
    }  
}  
  
class YieldSecond extends Thread {  
    @Override  
    public void run() {  
        for (int i = 0; i < 20; i++) {  
            System.out.println("第二个线程第" + (i + 1) + "次运行.");  
            // 让当前线程暂停  
            Thread.yield();  
        }  
    }  
}  

//这和操作系统的抢占式调度有关，下一次调度可能CPU的使用权又被YieldFirst抢到

/*
第一个线程第1次运行.
第二个线程第1次运行.
第一个线程第2次运行.
第二个线程第2次运行.
第一个线程第3次运行.
第二个线程第3次运行.
第一个线程第4次运行.
第二个线程第4次运行.
第一个线程第5次运行.
第一个线程第6次运行.
第二个线程第5次运行.
第二个线程第6次运行.
第一个线程第7次运行.
第二个线程第7次运行.
第二个线程第8次运行.
第一个线程第8次运行.
第二个线程第9次运行.
第一个线程第9次运行.
第二个线程第10次运行.
第一个线程第10次运行.
第二个线程第11次运行.
第一个线程第11次运行.
第二个线程第12次运行.
第一个线程第12次运行.
第二个线程第13次运行.
第一个线程第13次运行.
第二个线程第14次运行.
第一个线程第14次运行.
第二个线程第15次运行.
第二个线程第16次运行.
第一个线程第15次运行.
第一个线程第16次运行.
第二个线程第17次运行.
第一个线程第17次运行.
第二个线程第18次运行.
第一个线程第18次运行.
第一个线程第19次运行.
第二个线程第19次运行.
第一个线程第20次运行.
第二个线程第20次运行.
*/