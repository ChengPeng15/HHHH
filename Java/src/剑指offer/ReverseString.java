package 剑指offer;

public class ReverseString {

	public static void main(String[] args) {
		String str = "abcdef";
		StringBuffer sf = new StringBuffer(str);
		// ReverseString1(sf);
		ReverseString3(sf);
		System.out.println(sf);
		System.out.println(str);

	}

	private static void ReverseString1(StringBuffer sf) {
		System.out.println(sf.reverse());
	}

	private static void ReverseString2(StringBuffer sf) {
		// System.out.println(sf.reverse());
		for (int j = 0; j < sf.length()-1; j++) {
			for (int i = sf.length() - 1; i >= 1+j; i--) {
				char temp = sf.charAt(i - 1);
				sf.setCharAt(i - 1, sf.charAt(i));
				sf.setCharAt(i, temp);
			}
		}
	}
	
	
	private static void ReverseString3(StringBuffer sf) {
		// System.out.println(sf.reverse());
		/*
		 * for (int i = 0; i < sf.length()-1; i++) 可以少排列一次
		 */
		for (int i = 0; i < sf.length(); i++) {
			for (int k = 0; k < sf.length()-1-i; k++) {
				char temp=sf.charAt(k);
				sf.setCharAt(k, sf.charAt(k+1));
				sf.setCharAt(k+1, temp);
			}
		}
	}

}
