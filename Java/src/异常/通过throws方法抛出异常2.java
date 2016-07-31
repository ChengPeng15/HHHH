package 异常;
/*
 * throws 把异常抛给调用着处理
 */
public class 通过throws方法抛出异常2 {

	public static void main(String[] args) {
		try{
			tell(9,0);
		}catch(Exception e){
			System.out.println("main::::::"+e);
		}
	}
	public static void tell(int i ,int j) throws Exception{
		
		int temp = 0;
		try{temp = i/j;
				}
		catch(ArithmeticException e){
			System.out.println("tell::::::"+e);
//			throw new Exception(e);
		}
		throw new Exception("dddddd");
//		throw new Exception("ddd2ddd");//只能抛出一个

//		System.out.println(temp);
	}
}
