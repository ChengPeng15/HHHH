
public class 三目运算符 {
	//x?a:b?c:d
	//三目运算符，结合方向确实为自右至左。
	//先看b?c:d的结果：若b为真结果为c，否者为d，记b?c:d的结果为z，
	//则x?a:b?c:d等价为x?a:z。若x为真，结果为a，否则为z。

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		bool test = T?:F:T:F:T:F:T:F:T:F:T;
		int x = 6,a=5;
		boolean T = true;
		boolean F = false;
		boolean test = F?T:T?F:T;
		System.out.println(test);
	}

}
