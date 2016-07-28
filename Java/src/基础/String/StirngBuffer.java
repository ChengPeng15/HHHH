package 基础.String;
/*
 * StirngBuffer可以更改
 */
public class StirngBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("I STUDY IN ");
		System.out.println(sb);
		tell(sb);
		System.out.println(sb.toString());
//		sb.insert(2, "beijing ");
//		System.out.println(sb.toString());
		
		sb.replace(1, 4, "111122");//从1开始到3位置  
		System.out.println(sb.toString());



	}

	private static void tell(StringBuffer s) {
		s.append("BJTU");
	}

}
