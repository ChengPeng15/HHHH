package 基础;

import java.util.Scanner;

public class JavaSwitch键盘输入字符串并进行判断 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入分数等级");
		char grade = sc.nextLine().charAt(0);
		switch (grade){
		case '优':
			System.out.println("5");
			break;
		case '良':
			System.out.println("4");
			break;
		case '中':
			System.out.println("3");
			break;
		case '差':
			System.out.println("2");
			break;
		default:
			System.out.println("输入的等级错误");
		}
	}

}
