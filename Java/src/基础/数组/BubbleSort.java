package 基础.数组;

/**
 * 
 * @author qq:542335496@qq.com
 * 优化冒泡排序 附上解释
 * 一次优化。我们可以想到这种极端情况：array本身就是排序好的，但是依照如上算法，我们仍然要遍历n平方/2次。原因在于，我们没有机制检查数组是否是排序好的。
 * 解决办法就是加入标识项，如果发现一次内层循环没有经过任何交换，则说明array已经排序完毕。
 */
 
 /*
  * 每次排序选出最大的
  */
public class BubbleSort {

	public static int[] sort(int[] data) {
		int temp;
		boolean flag = false;
		
		for (int i = 0; i < data.length - 1; i++) {
			
			
			flag = true;
			
			for (int j = 0; j < data.length - i - 1; j++) {
				
				if (data[j] > data[j + 1]) {
					temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
					flag = false;
				}
			}
			//如果上一轮冒泡排序已经全部有序 即flag!=false，则直接退出，不用进行下一轮冒泡循环,提高效率，否则数组已经有序了，他还会继续冒泡循环
			if (flag) {
				break; //可以注释这一行，单步测试或者查看i的值即可验证
			}
			System.out.println(i);
			show(data);

		}
		return data;
	}

	public static void show(int[] data) {
		
		for (int q = 0; q < data.length; q++) {
			System.out.print(data[q] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
//		int[] a = { 4, 2, 3, 6, 5 ,56,23,41};
		int[] a = {12,45,23,10,300};
		show(a);
		sort(a);
		show(a);
	}
}

