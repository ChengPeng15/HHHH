package 调用顺序面试题;

public class ddd {
	String a ="99";
	public static void main(String[] args) {
		String a = "333";
		System.out.println(a);
	}
	{
		String a = "333";

		System.out.println(a+"------");

	}
}


class d extends ddd{
	public static void main(String[] args) {
		new d();
	}
}
