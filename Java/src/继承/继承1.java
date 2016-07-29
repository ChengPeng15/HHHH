package 继承;
class 父亲 {
	public void tell(){
		System.out.println("father method");
	}
}
public class 继承1 extends 父亲{

	public static void main(String[] args) {
		继承1 son1 = new 继承1();
		son1.tell();
		父亲 s2 = new 继承1();
		s2.tell();
		((继承1)s2).tell1();
		((继承1)s2).tell();


	}
	
	public void tell(){
		System.out.println("son method");

	}
	
	public void tell1(){
		System.out.println("son！ method");

	}

}
