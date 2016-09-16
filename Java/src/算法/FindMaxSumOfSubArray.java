package 算法;


/**
 *         题目：输入一个整形数组，数组里有正数也有负数。数组中连续的一个或多个整数组成一个子数组，每个子数组都有一个和。
 *         求所有子数组的和的最大值。要求时间复杂度为O(n)。 浙大数据结构课本上有 思路:
 *         求连续数字之和,当和为负值,抛弃.当和为正值,比较其与最大值,如大于,则替换之
 *         http://zhedahht.blog.163.com/blog/static/254111742007219147591/
 *         http://blog.csdn.net/v_JULY_v/article/details/6444021
 */
public class FindMaxSumOfSubArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FindMaxSumOfSubArray f = new FindMaxSumOfSubArray();
		int[] arr = { 1, -2, 3, 10, -4, 7, 2, -5 };
		System.out.println("MaxSum:" + f.findMaxSum(arr));
	}

	public Integer findMaxSum(int[] arr) {
		int curSum = 0;
		int maxSum = 0;
		int len = arr.length;

		if (arr == null || len == 0) {
			return null;
		}

		for (int i = 0; i < len; i++) {
			curSum += arr[i];
			if (curSum < 0) {
				curSum = 0;
			}
			if (curSum > maxSum) {
				maxSum = curSum;
			}
		}

		// all data are negative
		if (maxSum == 0) {
			for (int i = 0; i < len; i++) {
				if (i == 0) {
					maxSum = arr[i];
				}
				if (arr[i] > maxSum) {
					maxSum = arr[i];
				}
			}
		}
		return maxSum;
	}
}

