package 去哪网;

/*
 * 获取数字
时间限制：C/C++语言 1000MS；其他语言 3000MS
内存限制：C/C++语言 65536KB；其他语言 589824KB
题目描述：
给定一个数字，获取大于此数字的下一个数字X， 要求 X 为对称数字
输入
随机输入的自然数n
输出
对于每个测试实例，要求输出大于n的下一个对称数字

样例输入
451
3840
3363
999
样例输出
454
3883
3443
1001
 */
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);
		int tem = 0;
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += i;
		}
		while (cin.hasNext()) {
			int number = cin.nextInt();
			number++;
			while (!symmetry(number + "")) {
				number++;
			}
			;
			System.out.println(number);
		}
		cin.close();
	}

	private static boolean symmetry(String number) {
		char[] chs = number.toCharArray();
		int min = 0;
		int max = chs.length - 1;

		while (max >= min) {
			if (!new Character(chs[min++]).equals(chs[max--]))
				return false;
		}
		return true;
	}
}
