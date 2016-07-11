package 泛型;


public class 外部调用静态方法里面的东西怎么变了 {
	static int a=9;
	public static void main(String[] args) {
		new test1().test();
	}
	
	
	public  static void aa(){
		System.out.println(a);
		System.out.println("静态方法");
		a+=1;
	}
	
	
	public void cc (){
		静态方法里面的东西怎么变了.aa();
		静态方法里面的东西怎么变了.aa();
	}
}


class test1{
	public void test(){
		外部调用静态方法里面的东西怎么变了.aa();//
		外部调用静态方法里面的东西怎么变了.aa();//为什么变了,感觉应该变才对
	}
}

