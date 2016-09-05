package 多线程;

/*Java synchronized详解

第一篇：

使用synchronized

在编写一个类时，如果该类中的代码可能运行于多线程环境下，
那么就要考虑同步的问题。在Java中内置了语言级的同步原语－－synchronized，
这也大大简化了Java中多线程同步的使用。
我们首先编写一个非常简单的多线程的程序，是模拟银行中的多个线程同时对同一个储蓄账户进行存款、取款操作的。
在程序中我们使用了一个简化版本的Account类，
代表了一个银行账户的信息。在主程序中我们首先生成了1000个线程，
然后启动它们，每一个线程都对John的账户进行存100元，然后马上又取出100元。
这样，对于John的账户来说，最终账户的余额应该是还是1000元才对。
然而运行的结果却超出我们的想像，首先来看看我们的演示代码：
*/
class Account {
    String name;
    float amount;
    
    
    public Account(String name, float amount) {
        this.name = name;
        this.amount = amount;
    }

    public void deposit(float amt) {
        float tmp = amount;
        tmp += amt;
        
        try {
            Thread.sleep(100);//模拟其它处理所需要的时间，比如刷新数据库等
        } catch (InterruptedException e) {
            // ignore
        }
        
        amount = tmp;
    }

    public void withdraw(float amt) {
        float tmp = amount;
        tmp -= amt;

        try {
            Thread.sleep(100);//模拟其它处理所需要的时间，比如刷新数据库等
        } catch (InterruptedException e) {
            // ignore
        }        

        amount = tmp;
    }

    public float getBalance() {
        return amount;
    }
}



public class AccountTest{
    private static int NUM_OF_THREAD = 100000;
    static Thread[] threads = new Thread[NUM_OF_THREAD];
    
    public static void main(String[] args){
    	
        final Account acc = new Account("John", 1000.0f);
        for (int i = 0; i< NUM_OF_THREAD; i++) {
        	
            threads[i] = new Thread(new Runnable() {
                public void run() {
                	//synchronized (AccountTest.class) {
                		acc.deposit(100.0f);
                        acc.withdraw(100.0f);
					//}
                        
                       // System.out.println("——————"+acc.amount);
                }
            });
            threads[i].start();
        }

        for (int i=0; i<NUM_OF_THREAD; i++){
        	//System.out.print(i);
            try {
                threads[i].join(); //等待所有线程运行结束
            } catch (InterruptedException e) {
                // ignore
            }
        }
        System.out.println("Finally, John's balance is:" + acc.getBalance());
    	
    }

}