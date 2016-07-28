package 异常;
/*
 * throw 关键字抛出一个异常，抛出时，直接抛出异常类的实例化对象即可。
 */
public class throw抛出异常 {

	public static void main(String[] args) {
		
		try{
//			throw new ArithmeticException("实例化异常对象");
			throw new Exception("实例化异常对象");

			
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
