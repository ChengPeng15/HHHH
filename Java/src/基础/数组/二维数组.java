package 基础.数组;

public class 二维数组 {

	public static void main(String[] args) {
//		int score[][]=new int[7][];//数组长度位7 第二纬度可以省略，第一纬度不能省略！
//		int score[][]=new int[6][5];//数组长度为6
		
		int score [][]=new int[5][6];
		System.out.println("二维数组长度:"+score.length);
		System.out.println("二维数组列长度:"+score[3].length);
		for(int i=0;i<score.length;i++){
			for(int j=0;j<score[i].length;j++){
				System.out.print(score[i][j]+"  ");
			}
			System.out.println();
		}

	}

}
