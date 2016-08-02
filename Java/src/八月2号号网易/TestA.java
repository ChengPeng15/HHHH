//package 八月2号号网易;
//
//public class TestA {
//
//	public static void main(String[] args) {
//		TestA ta = new TestA();
//		ta.a();
//	}
//	
//	public void a() {
//		int i = 99;
//		A a = new A();
//		System.out.println("1    "+a);
//		a.i = 30;
//		another(a, i);
//		System.out.println("4    "+a);
//		System.out.println(a.i);
//	}
//	
//	public void another(A b, int i) {
//		System.out.println("2    "+b);
//		i = 0;
//		b.i = 20;
//		A a1 = new A();
//		b = a1;
//		System.out.println("3    "+b);
//		System.out.println(b.i + " " + i);
//	}
//}
//
// class A {
//	public int i = 10;
//}



/*
 * 对比后发现  传递还是值传递，只不过传的是内存地址而已，只是让那个变量和原来的指向同一个内存而已
 */


package 八月2号号网易;

public class TestA {

	public static void main(String[] args) {
		TestA ta = new TestA();
		ta.a();
	}
	
	public void a() {
		int i = 99;
		A a = new A();
		a.i = 30;
		another(a, i);
		System.out.println(a.i);
	}
	
	public void another(A a, int i) {
		i = 0;
		a.i = 20;
		A a1 = new A();
		a = a1;
		System.out.println(a.i + " " + i);
	}
}

 class A {
	public int i = 10;
}