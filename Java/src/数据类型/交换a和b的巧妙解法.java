package 数据类型;

public class 交换a和b的巧妙解法 {

	public static void main(String[] args) {
		int a=7,b=8;
		System.out.println(a+","+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+","+b);
	}

}
