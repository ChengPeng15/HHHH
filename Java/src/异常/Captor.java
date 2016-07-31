package 异常;
/*
 * throw 和throws配合使用
 */
 class MyException1 extends Exception {   //创建自定义异常类
String message;       //定义String类型变量
public MyException1(String ErrorMessagr) {  //父类方法
	message = ErrorMessagr;
}
public String getMessage(){     //覆盖getMessage()方法

	return message;
}
}
//在项目中创建Captor类，该类中的quotient()方法传递两个int型参数，
//如果其中的一个参数为负数则会抛出MyException异常，最后在main()方法中捕捉异常。

//例12.8  使用throw关键字捕捉异常。（实例位置：光盘\TM\sl\12\8）

public class Captor {         //创建类
		static int quotient(int x,int y) throws MyException1{  //定义方法抛出异常
			if(y < 0){         //判断参数是否小于0
			throw new MyException1("除数不能是负数"); //异常信息
		}
			return x/y;         //返回值
	}
		
public static void main(String args[]){     //主方法
try{          //try语句包含可能发生异常的语句
		int result = quotient(3,-1);     //调用方法quotient()
}
catch (MyException1 e) {      //处理自定义异常
	System.out.println(e.getMessage());   //输出异常信息
}
catch (ArithmeticException e) {     //处理ArithmeticException异常
	System.out.println("除数不能为0");   //输出提示信息
}
catch (Exception e) {       //处理其他异常
	System.out.println("程序发生了其他的异常"); //输出提示信息
}
}
}