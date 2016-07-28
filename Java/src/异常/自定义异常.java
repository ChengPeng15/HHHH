package 异常;
//需要继承Exception类既可完成自定义异常类

class MyException extends Exception{
	public MyException(String str) {
		// TODO Auto-generated constructor stub
		super(str);
	}
}
public class 自定义异常 {

	public static void main(String[] args) {
		try {
			throw new MyException("自定义异常");
		} catch (MyException e) {
			System.out.println(e);
		}
	}

}
