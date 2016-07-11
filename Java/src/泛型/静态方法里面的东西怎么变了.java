package 泛型;


public class 静态方法里面的东西怎么变了 {
	static int a=9;
	public static void main(String[] args) {
		new 静态方法里面的东西怎么变了().cc();
	}
	
	
	public  static void aa(){
		System.out.println(a);
		System.out.println("静态方法");
		a+=1;
	}
	
//	public void bb (){
//		System.out.println(b);
//		System.out.println("静态方法");
//		b+=1;
//		System.out.println(b);
//	}
	
	public void cc (){
		静态方法里面的东西怎么变了.aa();
		静态方法里面的东西怎么变了.aa();
	}
}


