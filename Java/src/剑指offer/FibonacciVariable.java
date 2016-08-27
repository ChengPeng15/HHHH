package 剑指offer;

import java.util.Scanner;

public class FibonacciVariable {
	// 斐波那契数列指的是这样一个数列 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,
	// 55, 89, 144, 233，377，610，987，1597，
	// 2584，4181，6765，10946，17711，28657，46368........
	// 定义三个变量方法
	public static void main(String[] args) {
		int a = 0, b = 1, c = 1;
		Scanner in = new Scanner(System.in);
		while (in.hasNextInt()) {
			int j = in.nextInt();
			System.out.println();
			System.out.println("斐波那契数列的前" + j + "项为：");
			System.out.print(a + "\t" + b + "\t");
			for (int i = 1; i <= j-2; i++) {
				c = a + b;
				a = b;
				b = c;
				System.out.print(c + "\t");
				if ((i + 2) % 5 == 0)
					System.out.println();
			}
		}
		in.close();
	}
}