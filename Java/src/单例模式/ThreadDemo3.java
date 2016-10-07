package 单例模式;

public class ThreadDemo3 {  
    
    public static void main(String[] args) {  
//      SingleDemo s1 = SingleDemo.getInstance();  
//      SingleDemo s2 = SingleDemo.getInstance();  
//      System.out.println(s2 == s2);  
        ThreadTest t = new ThreadTest();  
        new Thread(t).start();  
        new Thread(t).start();  
        new Thread(t).start();  
        new Thread(t).start();  
        new Thread(t).start();  
        new Thread(t).start();  
        new Thread(t).start();  
        new Thread(t).start();  
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(t.singles);  
    }  
}  