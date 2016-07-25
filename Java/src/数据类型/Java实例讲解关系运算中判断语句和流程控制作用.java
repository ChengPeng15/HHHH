package 数据类型;

import java.util.Scanner;

public class Java实例讲解关系运算中判断语句和流程控制作用 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int score = s.nextInt();
		boolean ispass = score>=60;
		if (ispass){
			System.out.println(ispass+"及格了！");
		}else{
			System.out.println(ispass+"不及格！");;
		}
	}

}
