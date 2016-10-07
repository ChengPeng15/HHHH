package 单例模式;
//懒汉
//public class SingleDemo {
//	private static SingleDemo s = null;
//	private SingleDemo(){}
//	public static  SingleDemo getInstance(){
//		if(s == null){
//			s = new SingleDemo();
//		}
//		return s;
//	}
//}

//线程安全懒汉
//public class SingleDemo {  
//    private static SingleDemo s = null;  
//    private SingleDemo(){}  
//    public static synchronized SingleDemo getInstance(){  
//        if(s == null){  
//            s = new SingleDemo();  
//        }  
//        return s;  
//    }  
//}  

//双重校验


public class SingleDemo {  
    private static SingleDemo s = null;  
    private SingleDemo(){}  
    public static  SingleDemo getInstance(){  
        /*如果第一个线程获取到了单例的实例对象， 
         * 后面的线程再获取实例的时候不需要进入同步代码块中了*/  
        if(s == null){  
            //同步代码块用的锁是单例的字节码文件对象，且只能用这个锁  
            synchronized(SingleDemo.class){  
                if(s == null){  
                    s = new SingleDemo();  
                }  
            }  
        }  
        return s;  
    }  
}  