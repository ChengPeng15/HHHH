package 算法;

import java.util.Scanner;

class Test {
}

public class Main {
	private static int count(int n) {
		int count = 0;
		if(n<=1||n>=65536) return -1;
		if (n == 2) {
			return 1;
		} else {
			if (n / 2 == 0) {
				while (n > 1) {
					n = n / 2;
					count++;
				}
				return count;
			} else {
				while (n > 1) {
					n = (n + 1) / 2;
					count++;
				}
				return count;
			}
		}
	}

	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNextInt()) {
			int n = cin.nextInt();
			System.out.println(count(n));
		}
		cin.close();
	}

}
