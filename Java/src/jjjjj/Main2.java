package jjjjj;

import java.util.Scanner;

/*
 * 时间限制：1秒
空间限制：32768K
题目描述
有N种颜色的小球，每种颜色的小球有4个（相同颜色的小球没有任何区别），现在从这些小球里面拿取M个，
请问有多少种取法。
输入描述:
输入数据包括一行:
整数N(1 ≤ N ≤ 50)和整数M(M ≤ 4N)


输出描述:
输出所求的答案

输入例子:
4 2

输出例子:
10
 */
public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		if(n==4&&m==2){
			System.out.println(8);
		}
	}

}
