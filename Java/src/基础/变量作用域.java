package 基础;

public class 变量作用域 {
		static int a;//成员变量不用给初始值
		int b = 7;
	public static void main(String[] args) {
		
		System.out.println(1111111);
		{
			System.out.println(a);
//			a=9;
			int a=12;
			System.out.println(a);
		}
		System.out.println(a);
		new  变量作用域 ();
		int i;
//		System.out.println(i);
		for(i=0;i<9;i++){
			System.out.println(i);
		}
	}
	
	
	
	{
		System.out.println(22222);
	}

}
