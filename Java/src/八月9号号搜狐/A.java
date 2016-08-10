package 八月9号号搜狐;

public class A extends B{
	int a =100;
	static int b =10;
	public A(){
		super();
		System.out.println(a);
		a=200;
	}
	static{
		System.out.println("static part");
	}
	public static void main(String[] args) {
		System.out.println(new A().a);
	}
}

class B {
	public B(){
		System.out.println(((A)this).a);
//		System.out.println(((A)this).b);
	}
}