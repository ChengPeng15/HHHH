package 继承;
//final不能被重写  方法同名  返回类型相同  即使不写override也是重写
class fathers {
	private void aa() {
		System.out.println("f----aa");
	}
	
	final void aa1() {
		System.out.println("f----aa1");
	}
}

public class Soner extends fathers {
	
	void aa() {
		System.out.println("ssss----aa");

	}

	//这个跟父类final方法没关系
	
	int aa1(int a) {
		System.out.println("int----aa");
		return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Soner s = new Soner();
		s.aa();
		s.aa1();
		s.aa1(1);//
	}

}
