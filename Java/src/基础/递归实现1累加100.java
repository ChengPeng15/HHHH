package 基础;

public class 递归实现1累加100 {

	public static void main(String[] args) {
		System.out.println(plus(100));
	}
	
	private  static  int  plus(int i) {
		if(i==1){
			return 1;
		}else{
			return i+plus(--i);
		}
	}


}
