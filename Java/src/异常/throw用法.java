package 异常;

public class throw用法 {
	
/*
 * 一般调用有throws抛出对方法是，要做1或者 2对处理
 */
/*
 * 1  抛到上层
 */
	public static void main(String[] args) throws Exception {
		tell(44);
	}
	
	
	/*
	 * 2  写try catch
	 */
//	public static void main(String[] args)  {
//		try {
//			tell(44);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	
	public static void tell(int a) throws Exception{
		
		if(a<=10){
			throw new Exception("太小了");
		}
			
	}

}
