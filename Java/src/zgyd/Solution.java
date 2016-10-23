package zgyd;

/*
 * 输入一个 M 行 N 列的二维数组，然后对其进行从小到大的全局排序，
 * 之后按每一行进行排序，对偶数行（0当作偶数）由小到大排序，奇数行由大到小排序，并返回
 */

public class Solution {
	public int[][] mySort(int[][] matrix) {
		if (matrix!=null){
		for (int i = 0; i < matrix.length; i++) {
			if (i % 2 == 0)
				bubbldSort2(matrix[i]);
			else
				bubbldSort1(matrix[i]);
		}
		}
		return matrix;

	}
//升
	public static void bubbldSort1(int[] list) {
		boolean needNextPass = true;
		for (int i = 0; i < list.length - 1 && needNextPass; i++) {
			needNextPass = false;
			for (int j = 0; j < list.length - 1 - i; j++) {
				if (list[j] > list[j + 1]) {
					int temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
					needNextPass = true;
				}
			}
		}
	}

	public static void bubbldSort2(int[] list) {
		boolean needNextPass = true;
		for (int i = 0; i < list.length - 1 && needNextPass; i++) {
			needNextPass = false;
			for (int j = 0; j < list.length - 1 - i; j++) {
				if (list[j] < list[j + 1]) {
					int temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
					needNextPass = true;
				}
			}
		}
	}
}