package 数据类型;

import java.util.Scanner;

public class 通过Scanner从控制台获取数据 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);//System.in表示接受控制台输入的数据
//		String str=s.next();
//		System.out.println(str);
		char ch = s.next().charAt(1);
		System.out.println(ch);
		char ch1 = s.next().charAt(1);
		System.out.println(ch1);

		
	}

}
