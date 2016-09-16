package 算法;

import java.util.Scanner;

public class 从一到n整数中1出现的次数{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int number = in.nextInt();
			int n = NumberOf1Between1AndN(number);
			System.out.println(n);
		}
		in.close();
	}

	public static int NumberOf1Between1AndN(int n) {
		int totalCount = 0;
		for (int i = 0; i <= n; i++) {
			totalCount += NumberOf1(i);
		}

		return totalCount;
	}

	private static int NumberOf1(int n) {
		int eachCount = 0;
		while (n != 0) {
			if (n % 10 == 1) {
				eachCount++;
			} 
				n=n/10;//从个位到10位到百位。。。。。
		}
		return eachCount;
	}

}
