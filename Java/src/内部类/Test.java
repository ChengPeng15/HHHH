package 内部类;

public class Test {
	public static void main(String args[]) {
//		Cow cow = new Cow(378.9);
//		cow.test();
		Cow.CowLeg a = new Cow().new CowLeg();//实例化内部类
		a.ss();
	}

}
