package 剑指offer;

/*
 * 第三题二维数组查找
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */

public class FindArray {
	/*
	 * 一种是： 把每一行看成有序递增的数组， 利用二分查找， 通过遍历每一行得到答案， 时间复杂度是nlogn
	 */
	public class Solution {
		public boolean Find(int[][] array, int target) {

			for (int i = 0; i < array.length; i++) {
				int low = 0;
				int high = array[i].length - 1;
				while (low <= high) {
					int mid = (low + high) / 2;
					if (target > array[i][mid])
						low = mid + 1;
					else if (target < array[i][mid])
						high = mid - 1;
					else
						return true;
				}
			}
			return false;

		}
	}

	/*
	 * 方法2从最右边开始
	 */
	public boolean Find(int[][] array, int target) {
		if (array != null) {
			int row = 0;
			int col = array[0].length - 1;
			while (row <= array.length - 1 && col >= 0) {
				if (target == array[row][col]) {
					System.out.println("row:" + row + " col:" + col);
					return true;
				} else if (target > array[row][col]) {
					row++;
				} else {
					col--;
				}

			}
		}
		return false;

	}

	public static void main(String[] args) {
		int[][] array = { { 1, 2, 8, 9 }, { 2, 4, 9, 12 }, { 4, 7, 10, 13 }, { 6, 8, 11, 15 } };
		System.out.println(new FindArray().Find(array, 7));

	}

}
