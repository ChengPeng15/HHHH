package 继承;

 class ABS{
	 void ss(){
		 aa();
		System.out.println("father--ss");
	}
	final private void aa(){
			System.out.println("father===aa");
	 }
}

public class 访问权限 extends ABS {
	public static void main(String[] args) {
		new 访问权限().aa();
		ABS test = new 访问权限();
		test.ss();
//		test.aa();//这个访问不到
	}
	
	protected void ss(){
		System.out.println("son--ss");
	}
	
	private void aa(){
		System.out.println("son===aa");
	}
}
