package 构造函数;
/*
 * 二、结论：

1、执行顺序：父类的静态代码块--->子类的静态代码块--->父类的构造代码块--->父类的构造方法--->子类的构造代码块--->子类的构造方法。

2、静态代码块随类的加载而执行，只执行一次，优先于main方法，用于初始化整个类。

3、构造代码块是给一个类的所有的对象进行初始化，可执行多次。只要对象一建立，就会调用构造代码块。构造代码块可以重复，可以有多份。

4、构造方法是给与之对应的对象进行初始化，有针对性。构造方法要么带参数，要么不带参数。当类中没有显式的构造方法时，jvm会默认执行一个不带参数的构造方法。同一个类中不能出现两个或两个以上相同的构造方法（方法名和参数列表都相同）。

5、在子类的所有构造方法中如果没有显式的super语句，则默认第一条语句为隐式的super语句：super();会访问父类的不带参数的构造方法。当父类中只有带参数的构造方法时，子类必须用显式的带参数的super语句访问父类的构造方法。若显示的super语句不带参数，则编译失败。当父类中只有显式的不带参数的构造方法时，子类必须用显示的不带参数的super语句访问父类的构造方法。否则，编译失败。

6、在创建子类的实例对象时未传入参数，若子类只有带参数的构造方法则编译失败。若子类有不带参数的构造方法，则执行子类的不带参数的构造方法。若子类没有构造方法，则执行隐式的不带参数的构造方法。

7、在创建子类的实例对象时传入参数：若子类有带参数的构造方法，则执行子类的带参数的构造方法；若子类没有带参数的构造方法或者没有构造方法，则编译失败。

 */
class Father构造函数调用顺序 
{
	static
	{
	    System.out.println("执行父类的静态代码块。");
	}

	Father构造函数调用顺序()
	{
		 this(7);
         System.out.println("执行父类的不带参数的构造方法。!!!!");
        
	}

	Father构造函数调用顺序(int num)
	{
		
         System.out.println("执行父类的带参数的构造方法！。");
	}

	Father构造函数调用顺序(String str)
	{
		this();
         System.out.println("执行父类的带参数的构造方法。");
	}
	{
		System.out.println("=====父类代码块======begin");
	}
	{
		int i = 1;
		int j = 2;
		int sum = (i+j);
		System.out.println("执行父类的构造代码块。"+sum);
	}

	{
		int i = 1;
		int j = 2;
		int sum = (i+j);
		System.out.println("执行父类的构造代码块。"+sum);
	}

	{
		int m = 3;
		int n = 4;
		int sum = (m+n);
		System.out.println("执行父类的构造代码块。"+sum);
	}
	{
		System.out.println("=====父类代码块======begin");
	}

}

class Son构造函数调用顺序 extends Father构造函数调用顺序
{
	static
	{
	    System.out.println("执行子类的静态代码块。");
	}
	
	{
		System.out.println("=====子类代码块======begin");
		System.out.println("在子类的所有构造方法中如果没有显式的super语句，"+"\n"
				+ "则默认第一条语句为隐式的super语句：super();"+"\n"
				+ "会访问父类的不带参数的构造方法。当父类中只有带参数的构造方法时，"+"\n"
				+ "子类必须用显式的带参数的super语句访问父类的构造方法。"+"\n"
				+ "若显示的super语句不带参数，则编译失败。"+"\n"
				+ "当父类中只有显式的不带参数的构造方法时，"+"\n"
				+ "子类必须用显示的不带参数的super语句访问父类的构造方法。否则，编译失败。");
	}

	Son构造函数调用顺序()
	{
		this(7);//调用带参数构造函数
		
         System.out.println("执行子类的不带参数的构造方法。");
	}

	Son构造函数调用顺序(int num)
	{
		
		super(7);//调用父类构造函数
        System.out.println("执行子类的带参数的构造方法。");
	}

	Son构造函数调用顺序(String str)
	{
//		super(7);
        System.out.println("执行子类的带参数的构造方法。");
	}

	{
		int i = 1;
		int j = 2;
		int sum = (i+j);
		System.out.println("执行子类的构造代码块。"+sum);
	}

	{
		int i = 1;
		int j = 2;
		int sum = (i+j);
		System.out.println("执行子类的构造代码块。"+sum);
	}

	{
		int m = 3;
		int n = 4;
		int sum = (m+n);
		System.out.println("执行子类的构造代码块。"+sum);
	}
	{
		System.out.println("=====子类代码块======end");
	}

}

public class 构造函数调用顺序
{
	public static void main(String[] args)
	{
		Son构造函数调用顺序 p ;
		new Son构造函数调用顺序();
		System.out.println("------------------");
		new Son构造函数调用顺序("a");
	}
}

