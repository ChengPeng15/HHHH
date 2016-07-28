package 继承;

interface Interface1{
	   final int AGE = 20;//全局常量  写不写public static  final 无所谓
	 abstract void say();
}

interface Interface2{
	public static final int AGE = 20;//全局常量
	public abstract void tell();
}

class A implements Interface1{
	public void say() {
		System.out.println("A实现接口1say方法");
	}
}

class B implements Interface1{
	public void say() {
		System.out.println("B接口1say方法");
	}
}

class C implements Interface1,Interface2{
	public void say() {
		System.out.println("C接口1say方法");
	}
	public void tell() {
		System.out.println("C接口2 tell方法");

	}
}

abstract class Abs1{
	 public abstract void print();
 }

/*
 * 单继承 多实现
 */
class 继承抽象类和实现接口 extends Abs1 implements Interface1,Interface2{

	public void print() {
		
	}

	public void tell() {
		
	}

	public void say() {
		
	}
	
}

public class InterfaceDemo {
	public static void main(String[] args) {
		Interface1 a = new A();
		a.say();
		Interface1 b = new B();
		b.say();
		
		C c = new C();
		c.say();
		c.tell();
		System.out.println(Interface1.AGE);
		new 继承抽象类和实现接口().print();
		
	}
}

