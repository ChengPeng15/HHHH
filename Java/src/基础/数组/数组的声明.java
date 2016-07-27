package 基础.数组;

public class 数组的声明 {
	public static void main(String[] args) {
		int [] score = null;//数组的声明
		score = new int[3];//为数组开辟内存空间，或者称为实例化。
		
		
		for(int i=0; i<3; i++){
			System.out.println(score[i]);

		}
		System.out.println("赋值前");
		for(int i=0; i<3; i++){
			score[i] = i*2+1;
		}
		System.out.println("赋值后");
		for(int i=0; i<3; i++){
			System.out.println(score[i]);

		}
	}
}
