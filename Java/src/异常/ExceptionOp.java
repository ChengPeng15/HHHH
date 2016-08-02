//package 异常;
//
//class DevException extends Exception{
//    DevException(String str){
//        super(str);
//    }
//}
//class ExceptionOp1 extends ExceptionOp{
//    int dev(int a, int b)throws DevException{
////         if(b==0)throw new DevException("b is 0");//抛出异常
//        return a / b;
//    }                       //子类只能抛出父类的异常
//    
//}
//
//public class ExceptionOp {
//     int dev(int a, int b)throws DevException,Exception{
//         if(b==0)throw new DevException("b is 0");//抛出异常
//        return a / b;
//    }
//
//    
//    public static void main(String[] args) {
//        ExceptionOp1 exceptionOp = new ExceptionOp1(); // static
//        int a = 5; // 对于不含static类里面的方法为非静态类 必须实例化对象去调用
//        try {
//            a = exceptionOp.dev(9, 0);
//            
//            //System.exit(0);//全部退出
//        }catch (DevException e) {
//            e.getMessage();// 获取异常信息
//            System.out.println(e.getMessage()); // 输出异常信息
//        }catch(Exception e ){
//            e.getMessage();
//            System.out.println(e.getMessage());
//        }
//        finally {//资源回收操作
//            System.out.println("call finally");
//            try{
//                Thread.sleep(0);//
//            }catch(InterruptedException e){
//                System.out.println(e.getMessage());
//            }
//        }
//
//        System.out.println(" a is " + a + Byte.parseByte("12"));// parseByte为静态方法
//                                                                // 直接调用
//
//    }
//
//}
////结果：
////b is 0
////call finally
//// a is 512



package 异常;

class DevException extends Exception{
    DevException(String str){
        super(str);
    }
}
class ExceptionOp1 extends ExceptionOp{
    int dev(int a, int b)throws DevException{
//         if(b==0)throw new DevException("b is 0");//抛出异常
        return a / b;
    }                       //子类只能抛出父类的异常
    
}

public class ExceptionOp {
     int dev(int a, int b)throws Exception{
         if(b==0)throw new DevException("b is 0");//抛出异常
        return a / b;
    }

    
    public static void main(String[] args) {
        ExceptionOp1 exceptionOp = new ExceptionOp1(); // static
        int a = 5; // 对于不含static类里面的方法为非静态类 必须实例化对象去调用
        try {
            a = exceptionOp.dev(9, 0);
            
            //System.exit(0);//全部退出
        }catch (DevException e) {
            e.getMessage();// 获取异常信息
            System.out.println(e.getMessage()); // 输出异常信息
        }catch(Exception e ){
            e.getMessage();
            System.out.println(e.getMessage());
        }
        finally {//资源回收操作
            System.out.println("call finally");
            try{
                Thread.sleep(0);//
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }

        System.out.println(" a is " + a + Byte.parseByte("12"));// parseByte为静态方法
                                                                // 直接调用

    }

}
//结果：
// / by zero
// call finally
// a is 512
