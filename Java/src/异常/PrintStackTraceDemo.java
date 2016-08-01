package 异常;

class ExpDemo{
	int a=10;
	int b=0;
}
/*
 * 使用printStackTrace
 * java.lang.ArithmeticException: / by zero
 * 
 * 
	at 异常.PrintStackTraceDemo.Demo(PrintStackTraceDemo.java:28)
	at 异常.PrintStackTraceDemo.Level1(PrintStackTraceDemo.java:22)
	at 异常.PrintStackTraceDemo.main(PrintStackTraceDemo.java:16)
	
	
	
	
有没有异常，都执行

 */


/*不使用 使用printStackTrace  用System.out.println(e1);
 * java.lang.ArithmeticException: / by zero
有没有异常，都执行

 */
public class PrintStackTraceDemo {

	public static void main(String[] args) {
		ExpDemo e = null;
		e = new ExpDemo();
	
		Level1(e);


	}

	private static void Level1(ExpDemo e) {
		Demo(e);
	}

	private static void Demo(ExpDemo e) {
		int temp = 0;
		try{
			temp = e.a/e.b;//可能有错误的要放在try里面才能行
			System.out.println("如果有异常，写到这里也不运行");
		}catch(NullPointerException e1){
			System.out.println(e1);
		}
		catch(ArithmeticException e1){
//			System.out.println(e1);
			e1.printStackTrace();

		}finally{
			System.out.println("有没有异常，都执行");
		}
	}

}
