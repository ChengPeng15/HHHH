package 基础.数组;

public class 数组静态初始化 {

	public static void main(String[] args) {
		//数组静态初始化
//		使用起来非常方面，不需要new去开辟内存空间了
		int score [] = {2,5,6,4,6,7};//声明
		System.out.println("长度"+score.length);
		for(int i=0;i<score.length;i++){
			System.out.println(score[i]);
		}
	}

}
