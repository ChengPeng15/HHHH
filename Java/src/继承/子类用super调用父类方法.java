package 继承;
/*
 * super也可以可以这样用，并不是只能调用父类构造器方法
 */
 class 父类{
	 void tell(){
		System.out.println("父类tell方法");
	}
		
}

public class 子类用super调用父类方法 extends 父类 {

	public static void main(String[] args) {
		new 子类用super调用父类方法().tell();
	}
//	@Override
//	public void tell() {
//		// TODO Auto-generated method stub
//		super.tell();
//	}
	@Override
	public void tell() {
		// TODO Auto-generated method stub
		super.tell();
		System.out.println("子类tell");
	}
	
}
