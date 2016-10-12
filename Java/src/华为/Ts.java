package 华为;

public class Ts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		char []array = str.toCharArray();
		for (int i = 0; i < array.length; i++) {
			String c = String.valueOf(array[i]);
			System.out.println(c);
		}
		String s = String.valueOf(array);
		System.out.println(s);
		System.out.println(s==str);
	}

}
