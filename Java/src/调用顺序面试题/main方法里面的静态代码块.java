package 调用顺序面试题;

//public class main方法里面的静态代码块 extends f{
//
//	public static void main(String[] args) {
//		new main方法里面的静态代码块();
//		String name = "张飞";
//		System.out.println(name);
//		{
//			System.out.println(name+"ppppp");
//		}
//	}
//
//}
//
//class f{
//	{
//		System.out.println("son");
//	}
//	public static void main(String[] args) {
//		{
//			System.out.println("ffff");
//
//		}
//	}
//}


public class main方法里面的静态代码块 {
	public static void main(String[] args) {
		String s ="232";
		System.out.println(s);
		{
			String s1 = "ddfd";
			System.out.println(s1);

		}
	}

}
