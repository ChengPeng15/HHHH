package 腾讯;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		while (in.hasNextInt()) {
			int count = 0;
			int n = in.nextInt();
			if (n < 1000) {
				for (int i = 2; i <= n / 2; i++) {
					if (isPrime(i) && isPrime(n - i)) {
						count++;
					}
				}
				System.out.println(count);
			}
		}
		in.close();
	}

	public static boolean isPrime(int a) {
		boolean flag = true;
		if (a < 2) {
			return false;
		} else {

			for (int i = 2; i <= Math.sqrt(a); i++) {

				if (a % i == 0) {

					flag = false;
					break;
				}
			}
		}
		return flag;
	}
}
