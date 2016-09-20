package 异常;

class Exp{
	int a=10;
	int b=0;
}
/*
 * catch 只能捕获一个
 */
public class ExceptionDemo {

	public static void main(String[] args) {
		Exp e = null;
		e = new Exp();
	
		int temp = 10;
		try{
			temp = e.a/e.b;//可能有错误的要放在try里面才能行
			System.out.println("try");
		}catch(NullPointerException e1){
			System.out.println(e1);
		}
		catch(ArithmeticException e1){
			System.out.println(e1);
		}finally{
			System.out.println("有没有异常，都执行");
		}
//		temp = e.a/e.b;//如果写try catch  最后面的不输入，层序找终端
		System.out.println("如果有异常，写到这里也不运行");

	}

}
