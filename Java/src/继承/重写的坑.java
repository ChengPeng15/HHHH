package 继承;

class  重写父类{
	void a(){
		System.out.println("父类a");
	}
	void b(){
		System.out.println("父类b");
		a();
	}
}


class  重写子类 extends  重写父类{
	void a(){
		System.out.println("子类a");
	}
	
	void b(){
		a();
		super.b();
		System.out.println("子类b");
	}
}

public class  重写的坑 {
	public static void main(String[] args) {
		 重写父类 a = new  重写子类();
		a.b();
	}

}
