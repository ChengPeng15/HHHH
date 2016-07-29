package 继承;
/*
 * 一个接口不能继承一个抽象类，但是却可以通过extends关键字同时继承多个接口，实现接口的多继承
 */


interface Interface11{
	   final int AGE = 20;//全局常量  写不写public static  final 无所谓
	 abstract void say();
}

interface Interface12{
	   final int AGE = 20;//全局常量  写不写public static  final 无所谓
	 abstract void say2();
}


/*
 * 弥补了java单继承的不足
 */
interface Interface13 extends Interface11,Interface12{
}
public class 一个接口继承多个接口  implements Interface13{

	public static void main(String[] args) {
		一个接口继承多个接口 test =new 一个接口继承多个接口() ;
		test.say();
		test.say2();
	}

	@Override
	public  void say() {
		System.out.println(11111);
	}

	@Override
	public void say2() {
		System.out.println(222222);
		
	}	



}
