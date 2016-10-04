package 爱奇艺;

import java.util.Scanner;

public class Main1 {
	public static void quanPaiLie(char[] chars, int start, int end) {
		if (chars != null) {
			if (start == end) {
				for (int i = 0; i <= end; i++) {
					System.out.print(chars[i]);
				}
				System.out.println();
			} else {
				for (int i = start; i <= end; i++) {
					char temp = chars[start];
					chars[start] = chars[i];
					chars[i] = temp;
					quanPaiLie(chars, start + 1, end);
					temp = chars[start];
					chars[start] = chars[i];
					chars[i] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String str = sc.nextLine();
			char[] chars = str.toCharArray();
			quanPaiLie(chars, 0, chars.length - 1);
		}
		sc.close();
	}
}