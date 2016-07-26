package 基础;

import java.util.Scanner;

public class switchTest {

	public static void main(String[] args) {
		System.out.println("请输入五分制成绩");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		switch (score){
		case 5:
			System.out.println("优秀");
			break;
		case 4:
			
			System.out.println("良好");
			int b = 999;
			System.out.println(b);
			break;

		case 3:
			System.out.println("及格");
//			break;

		case 2:
		case 1:
		case 0:
			System.out.println("不及格");
//			break;

		default:
			System.out.println("你输入的分数不是5分制");
			
		}
		
	}

}
