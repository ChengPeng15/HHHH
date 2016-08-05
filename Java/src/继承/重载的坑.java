package 继承;

class 重载父类{
	void a(){
		System.out.println("父类a");
	}
	void b(){
		System.out.println("父类b");
		a();
	}
}


class 重载子类 extends 重载父类{
	void a(){
		System.out.println("子类a");
	}
	
	void b(){
		a();
		super.b();
		System.out.println("子类b");
	}
}

public class 重载的坑 {
	public static void main(String[] args) {
		重载父类 a = new 重载子类();
		a.b();
	}

}
