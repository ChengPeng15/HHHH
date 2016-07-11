package 泛型;


public class 不是静态变量在类的方法中不能直接调用吗 {
	static int a=9;
	int b =1;
	
//    public static void main(String[] args) {
//        System.out.println(a);
//    }
	public static void main(String[] args) {
		new 不是静态变量在类的方法中不能直接调用吗().cc();
	}
	
	
	public  static void aa(){
		System.out.println(a);
		System.out.println("静态方法");
		a+=1;
	}
	
	public void bb (){
		System.out.println(b);
		System.out.println("静态方法");
		b+=1;
		System.out.println(b);
	}
	
	public void cc (){
		new 不是静态变量在类的方法中不能直接调用吗().bb();
		new 不是静态变量在类的方法中不能直接调用吗().bb();
	}
}


