package 剑指offer;

import java.util.Scanner;

public class ReverseStringAdvance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String str = sc.nextLine();
			char[] charArray = str.toCharArray();
			reverseChar(charArray);
			for (int i = 0; i < charArray.length; i++) {
				System.out.print(charArray[i]);

			}
		}
	}

	private static void reverseChar(char[] charArray) {
		if (charArray != null) {
			int begin = 0;
			int end = charArray.length - 1;
			while (begin < end ) {
				char temp = charArray[begin];
				charArray[begin] = charArray[end];
				charArray[end] = temp;
				begin++;
				end--;
			}

		}
	}

}
