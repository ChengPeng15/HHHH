package 数据类型;

public class 通过args数组获取数据 {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[2]);
		int c = Integer.parseInt(args[1]);
		String d = args[2];
		System.out.println("d:"+d);

		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println(a+"-"+b+"="+(a-b));
		System.out.println(a+"*"+b+"="+(a*b));
		System.out.println(a+"/"+b+"="+(a/b));

	}

}
