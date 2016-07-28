package 异常;
/*
 * throws 把异常抛给调用着处理
 */
public class 通过throws方法抛出异常 {

	public static void main(String[] args) {
		try{
			tell(9,0);
		}catch(Exception e){
			System.out.println(e);
		}
	}
	public static void tell(int i ,int j) throws ArithmeticException{
		int temp = 0;
		temp = i/j;
		System.out.println(temp);
	}
}
