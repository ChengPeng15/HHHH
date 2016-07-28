package 异常;

public class throw用法 {

	public static void main(String[] args) {
		try {
			tell(3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void tell(int a) throws Exception{
		
		if(a<=10){
			throw new Exception("太小了");
		}
			
	}

}
