package 爱奇艺;

import java.util.Scanner;

public class Main11 {
	public static void quanPailie(char[] chars) {
		quanPailie(chars, 0, chars.length - 1);
	}
	public static void quanPailie(char[] chars, int begin, int end) {
		if (begin == end) { 
			for (int i = 0; i < chars.length; ++i) {
				System.out.print(chars[i]);
			}
			System.out.println();
		} else {
			for (int i = begin; i <= end; ++i) { 
				if (canSwap(chars, begin, i)) { 
					swap(chars, begin, i); 
					quanPailie(chars, begin + 1, end); 
					swap(chars, begin, i); 
				}
			}
		}
	}

	public static void swap(char[] chars, int from, int to) {
		char temp = chars[from];
		chars[from] = chars[to];
		chars[to] = temp;
	}

	public static boolean canSwap(char[] chars, int begin, int end) {
		for (int i = begin; i < end; ++i) {
			if (chars[i] == chars[end]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String str = sc.nextLine();
			final char[] chars = str.toCharArray();
			quanPailie(chars);
		}
		sc.close();

	}
}
