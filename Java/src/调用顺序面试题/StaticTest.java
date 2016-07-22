package 调用顺序面试题;

class FatherStaticTest 
{
	static
	{
	    System.out.println("执行父类的静态代码块。");
	}

//	FatherStaticTest()
//	{
//         System.out.println("执行父类的不带参数的构造方法。");
//	}

	FatherStaticTest(int num)
	{
         System.out.println("执行父类的带参数的构造方法！。");
	}

	FatherStaticTest(String str)
	{
         System.out.println("执行父类的带参数的构造方法。");
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

}

class SonStaticTest extends FatherStaticTest
{
	static
	{
	    System.out.println("执行子类的静态代码块。");
	}

	SonStaticTest()
	{
			super(7);
         System.out.println("执行子类的不带参数的构造方法。");
	}

	SonStaticTest(int num)
	{
		super(7);
        System.out.println("执行子类的带参数的构造方法。");
	}

	SonStaticTest(String str)
	{
		super(7);
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

}

public class StaticTest
{
	public static void main(String[] args)
	{
//		new SonStaticTest();
		new SonStaticTest("a");
	}
}
