package 华为;

public class TestVar {
	static int i;

	public static void main(String[] args) {
		test();
	}
/*
 * 全局变量i 会有一个默认值0，

但是j 是一个局部变量，所以必须赋初值；
 */
	private static void test() {
		int j = 0;
		String s = null ;
		System.out.println("i + j = " + (i + j)+s);
	}
}
