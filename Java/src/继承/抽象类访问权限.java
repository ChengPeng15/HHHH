package 继承;

 abstract class aaa{// 类名不区分大小写 不能跟其他重名
	protected abstract void ss();
	int aa = 100;
	void a(){
		System.out.println(1111);
		new ABS().ss();//调用其它类的方法
	}
}

public class 抽象类访问权限 extends aaa {
	public static void main(String[] args) {
		抽象类访问权限  a= new 抽象类访问权限();
		a.ss();
		a.a();
		System.out.println(a.aa);
	}

	@Override
	protected  void ss() {
		System.out.println(222222);
	}

}
