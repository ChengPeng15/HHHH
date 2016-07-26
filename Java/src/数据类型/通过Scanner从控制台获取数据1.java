package 数据类型;

import java.util.Scanner;

public class 通过Scanner从控制台获取数据1 {

	public static void main(String[] args) {
		//		步骤1、创建scanner对象 男
		Scanner scanner = new Scanner(System.in);
		//		步骤2、想控制台输入文本
		System.out.println("姓名：");
		//      步骤3、 接受输入的姓名字符串
		String name = scanner.nextLine();//以回车识别一次输入
		System.out.println("性别：");
		char sex = scanner.next().charAt(0);//获取控制台输入的一个字符；
		System.out.println(sex);
		System.out.println("年龄：");
		int age = scanner.nextInt();
		System.out.println("身高：");
		double height = scanner.nextDouble();
		System.out.println("性格：");
		String type = scanner.next();
		System.out.println("大家好，我叫"+name+"，今天"+age+"岁，身高"+height+"米，性格"+type+",我是一个"+sex+"士 ");

		
	} 

}
