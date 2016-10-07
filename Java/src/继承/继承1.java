package 继承;

class zuzong{
	public  void tellzuxian(){
		System.out.println("zuzong method");
	}
}
class 父亲  extends zuzong{
	public  void tellzuxian(){
		super.tellzuxian();
		System.out.println("fazuzong method");
		
	}
	public  void tell(){
		System.out.println("father method");
	}
	
	public static void sayStatic(){
		System.out.println("father sayStatic");
	}
}

interface haha{
	 void tell();
}
public class 继承1 extends 父亲 implements haha{

	public static void main(String[] args) {
		继承1 son1 = new 继承1();
//		son1.tell();
//		父亲 s2 = new 继承1();
//		s2.tell();
//		((继承1)s2).tell1();
//		((继承1)s2).tell();
//		
//		继承1.sayStatic();
//		s2.sayStatic();//静态方法可以被继承但是不能被覆盖
		
		son1.tellzuxian();
	}
	
	public void  tellzuxian(){
		System.out.println("sonzuian method");
//		super.super.tellzuxian();
		super.tellzuxian();

	}
	
	public void  tell(){
		System.out.println("son method");
	}
	
	public void tell1(){
		System.out.println("son！ method");

	}

	public static void sayStatic(){
		System.out.println("son sayStatic");
	}
}
