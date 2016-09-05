package 完美世界;

import java.util.Scanner;
/*
 * 输入一个字符串,
 * 要求输出字符串中字符所有的排列,
 * 例如输入"abc",
 * 得到"abc","acb","bca","bac","cab","cba"
 */
public class 完美世界1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextLine()){
			String s = in.nextLine();
			char[] c = s.toCharArray();
			getFullSequence(c, 0);
		}
		in.close();
	}

	private static void getFullSequence(char[] c, int key) {
		if (key == c.length) {
			System.out.println(String.valueOf(c));
		}
		for (int k = key; k < c.length; k++) {
			if (IsSwap(c, key, k)) {
				swap(c, key, k);
				getFullSequence(c, key + 1);
				swap(c, key, k);
			}
		}
	}

	private static boolean IsSwap(char[] c, int k, int key) {
		for (int m = k; m < key; m++) {
			if (c[m] == c[key]) {
				return false;
			}
		}
		return true;
	}

	private static void swap(char[] c, int k, int i) {
		char f;
		f = c[k];
		c[k] = c[i];
		c[i] = f;
	}

}