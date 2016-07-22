package 构造函数;
/*
 * 在子类的所有构造方法中如果没有显式的super语句，
 * 则默认第一条语句为隐式的super语句：super();会访问父类的不带参数的构造方法。
 * 当父类中只有带参数的构造方法时，子类必须用显式的带参数的super语句访问父类的构造方法。
 *    若显示的super语句不带参数，则编译失败。
 * 当父类中只有显式的不带参数的构造方法时，
 *    子类必须用显示的不带参数的super语句访问父类的构造方法。否则，编译失败。
 */
public class Test父类没有默认构造函数{
	public static void main(String[] args) {
		new Sonson();
		System.out.println("=========");
		new Sonson(4);
	}
}
class  父类没有默认构造函数{
	{
		System.out.println("如果有构造函数，就没有默认构造函数了");
	}
	父类没有默认构造函数(){
		System.out.println("父类没有默认构造函数--不带参数");
	}
	父类没有默认构造函数(int a){
		System.out.println("父类没有默认构造函数--带参数");
	}
}

class Sonson extends 父类没有默认构造函数{
	{
		System.out.println("没有无参构造函数，会默认先去调用父类无参构造函数，除非显示super指定");
	}
	Sonson (){
//		super(99);//如果没有指定，则某人调用无参构造函数
		System.out.println("super指定");

	}
	
	Sonson (int a){
		System.out.println("子类单参数构造函数");
	}
	
}