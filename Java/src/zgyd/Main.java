package zgyd;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/*
 * 输入一个 M 行 N 列的二维数组，然后对其进行从小到大的全局排序，
 * 之后按每一行进行排序，对偶数行（0当作偶数）由小到大排序，奇数行由大到小排序，并返回
 */

public class Main {
	public int[][] mySort(int[][] matrix) {
		b1(matrix,matrix.length,matrix[0].length);
		for (int i = 0; i < matrix.length; i++) {
			if (i % 2 == 0)
				bubbldSort1(matrix[i]);
			else
				bubbldSort2(matrix[i]);
		}
		return matrix;

	}

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
	
	public static void b1(int[][] list,int row,int col)
	{
	
	        Set<Integer> set = new TreeSet<Integer>();
	        for(int i =0; i<4; i++){
	            for(int j=0; j<4; j++){
	                set.add(list[i][j]);
	            }
	        }
	        Object[] integer =  set.toArray();
	         
	        for(int i=0; i<row; i++){
	            for(int j=0; j<col; j++){
	            	list[i][j] = (int)integer[col * i + j];
	            }
	            System.out.println();
	        }
	         
	}
	public static void main(String[] args) {
//		Solution1 a = new Solution1();
		int array[]={1,2,3,9,8};
		bubbldSort1(array);
		System.out.println(Arrays.toString(array));
	}
}