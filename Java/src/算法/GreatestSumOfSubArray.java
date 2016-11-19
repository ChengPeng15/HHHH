package 算法;

/*
 * 第一种用非动态规划
 */
import java.util.Scanner;

public class GreatestSumOfSubArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int number = sc.nextInt();// 数组长度
			int[] array = new int[number];// 生成数组
			for (int i = 0; i < array.length; i++) {
				array[i] = sc.nextInt();
			}
			int sum = findGreatestSumOfSubArray(array);
			int sumDynamic = findGreatestSumOfSubArrayDynamic(array);
			System.out.println(sum + " " + sumDynamic);
		}
		sc.close();
	}

	private static int findGreatestSumOfSubArrayDynamic(int[] array) {
		if (array == null || array.length == 0) {
			return 0;
		}
        int sum = array[0], tempsum = array[0]; //注意初始值 不能设为0 防止只有负数
        for(int i = 1; i < array.length; i++) //从1开始 因为0的情况在初始化时完成了
        {
            tempsum = (tempsum < 0) ? array[i] : tempsum + array[i];
            sum = (tempsum > sum) ? tempsum : sum;
        }
        return sum;
	}

	private static int findGreatestSumOfSubArray(int[] array) {
		if (array == null || array.length == 0) {
			return 0;
		}
		int maxSum = 0;
		int curSum = 0;
		int beginIndex = 0;// 最大子数组开始index
		int endIndex = 0;// 最大子数组结束index
		for (int j = 0; j < array.length; j++) {
			if (curSum <= 0) {
				curSum = array[j];
			} else {
				curSum += array[j];
			}
			maxSum = maxSum > curSum ? maxSum : curSum;
		}

		if (maxSum == 0) {
			for (int i = 0; i < array.length; i++) {
				if (i == 0) {
					maxSum = array[i];
				}
				if (array[i] > maxSum) {
					maxSum = array[i];
				}
			}
		}
		return maxSum;
	}

}


/*
 *  public int FindGreatestSumOfSubArray(int[] array) {
       List<Integer> list = new ArrayList<>();
        for(int i=0;i<array.length;i++){
            int sum = 0;
            for(int j=i;j<array.length;j++){
                sum += array[j];
                list.add(sum);
            }
        }
        if(list.size() <=0) return 0;
        Collections.sort(list);
        return list.get(list.size()-1);
    }
 *
 */
