package 矩阵相乘;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {

	static double[][] matrixX1;
	static double[][] matrixX2;
	static double[][] matrixX3;
	static double[][] matrixX4;
	static double[][] matrixX5;

	public static void main(String[] args) {
		Test2 test = new Test2();
		matrixX1 = new double[][] { { -2969.1, 1039, 2307.75 }, { 3801.8, 1189.7, 2504.47 },
				{ 3801.8, 1189.7, 2504.47 }, { 3801.8, 1189.7, 2504.47 }, { 3801.8, 1189.7, 2504.47 } };// 5*3矩阵
		matrixX2 = new double[][] { { -2969.1, 1039, 2307.75 }, { 3801.8, 1189.7, 2504.47 },
				{ 3801.8, 1189.7, 2504.47 }, { 3801.8, 1189.7, 2504.47 }, { 3801.8, 1189.7, 2504.47 } };
		matrixX3 = new double[][] { { -2969.1, 1039, 2307.75 }, { 3801.8, 1189.7, 2504.47 },
				{ 3801.8, 1189.7, 2504.47 }, { 3801.8, 1189.7, 2504.47 }, { 3801.8, 1189.7, 2504.47 } };
		matrixX4 = new double[][] { { -2969.1, 1039, 2307.75 }, { 3801.8, 1189.7, 2504.47 },
				{ 3801.8, 1189.7, 2504.47 }, { 3801.8, 1189.7, 2504.47 }, { 3801.8, 1189.7, 2504.47 } };
		matrixX5 = new double[][] { { -2969.1, 1039, 2307.75 }, { 3801.8, 1189.7, 2504.47 },
				{ 3801.8, 1189.7, 2504.47 }, { 3801.8, 1189.7, 2504.47 }, { 3801.8, 1189.7, 2504.47 } };
		double[][] MarA = new double[][] { { 0.6 }, { 0.25 }, { 0.15 } };//3*1矩阵
		Field[] fields = Test2.class.getDeclaredFields();
		System.out.println(fields.length);
		List<double[][]> list = new ArrayList<double[][]>();
		for(Field f:fields){
			f.setAccessible(true);
			try {
				double[][] obj =(double[][])f.get(test);
				list.add(plus(generateRmamatrix(obj),MarA));
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		printResult(list);
	}

	// 输出结果最终结果
	private static void printResult(List<double[][]> list) {

		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.get(i).length; j++) {
				System.out.println(Arrays.toString(list.get(i)[j]));
			}
			if(i!=list.size()-1){
				System.out.println("==================");
				}
		}
	}

	// 假设是m行n列
	private static double[][] generateRmamatrix(double[][] matrixX) {
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
		return r;
	}

	/*
	 * 矩阵相乘 传入两个数组
	 */
	private static double[][] plus(double[][] matrix1, double[][] matrix2) {
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
		return plus;

	}
}
