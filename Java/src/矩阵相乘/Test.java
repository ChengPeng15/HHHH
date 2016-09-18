package 矩阵相乘;

import java.util.Arrays;

public class Test {
	
	public static void main(String[] args) {
		double[][] matrixX = new double[][] { { -2969.1, 1039, 2307.75 }, {3801.8,1189.7,2504.47},{3801.8,1189.7,2504.47},
			{3801.8,1189.7,2504.47},{3801.8,1189.7,2504.47}};// 而为数组，一行一行的输入  这个是5行3列   矩阵   模拟输入

		double [][] MarR=generateRmax(matrixX);//生成R矩阵
		
		double[][] MarA  = new double[][] {{0.6},{0.25},{0.15}};// 而为数组，一行一行的输入  这个是4行3列   矩阵

		plus(MarR, MarA);//数组相   matrix1 matrix2 分别为想成传入的矩阵   如果需要传入R矩阵  直接这么生成的矩阵作为参数传递,最终打印出来
	}

	// 假设是m行n列
	private static double[][] generateRmax(double[][] matrixX) {
		double[][] r = new double[matrixX.length][matrixX[0].length];
		for (int i = 0; i < r.length; i++) {
			for (int j = 0; j < r[0].length; j++) {
				r[i][j] = 0;
				double sumLie = 0;
				for (int k = 0; k < matrixX.length; k++) {
					sumLie += matrixX[k][j];// 每一列求和
				}
				r[i][j] = matrixX[i][j] / sumLie;
				sumLie = 0;
			}
		}
		// 打印R数组
		for (int i = 0; i < r.length; i++) {
			System.out.println(Arrays.toString(r[i]));
		}
		return r;
	}

	/*
	 * 矩阵相乘 传入两个数组
	 */
	private static void plus(double[][] matrix1, double[][] matrix2) {
		if (matrix1[0].length != matrix2.length) {// 若无法相乘则退出 行===列
			System.out.println("ivalid input");
		}
		double[][] plus = new double[matrix1.length][matrix2[0].length];
		for (int i = 0; i < plus.length; ++i) {
			for (int j = 0; j < plus[i].length; ++j) {// 每一个plus[i][j]的运算：
				plus[i][j] = 0;// 初始化
				for (int k = 0; k < matrix2.length; ++k)
					plus[i][j] += matrix1[i][k] * matrix2[k][j];
			}
		}
		// 输出结果
		for (int i = 0; i < plus.length; ++i)
			System.out.println(Arrays.toString(plus[i]));

	}
}
