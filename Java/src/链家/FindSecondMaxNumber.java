package 链家;
//求无序数组中第二大的数--
	//快速选择 之前去面试遇到了这个问题，题目：找出无序数组中第二大的数字。
//
//	定睛一看，好简单，一次遍历就可以找出第二大的数字，不过，这样写没有什么特别之处，因为实在是太简单了。
//	自己仔细想想起了之前做过的题，看看有没有什么类似的。
//	于是，想起了之前在网上看到的一道面试题：找出无序数组中最小的k个数。
//	要找出最小的k个数，可以用快速选择算法，只要在快速排序之后，
//	枢纽刚好是第k+1 个数，那么，他左边的数，刚好就是最小的k个数。要找出无序数组中第二大的数字，可以这样转换：
//
//	0）假设数组中有n个元素，a1~an，而我们要求第k大的数字，就相当于求排序后的第m=n-k+1 个数字。
//
//	1）假设一次快速排序之后，如果枢纽的是第x个（1~n）。
//
//	2）如果x=m，则这个枢纽ax就是我们要求的第k大的数字，结束；如果x<m，则对a0~ax-1 进行一次快速排序，重复第2）步；如果x>m，则对ax+1~
//	an 进行一次快速排序，重复第2）步。
//
//	快速选择的代码如下：

	
	//a[] - 要排序的数组
	// b - 要排序的子区间的开始索引
	// e - 要排序的子区间的结束索引
	// k - 求出排序后第k个数
public class FindSecondMaxNumber {
	int quickselect(int a[], int b, int e, int k) {
		int i = b;
		int j = e + 1;
		int x = a[i];
		while (true) {
			while (a[++i] < x && i < j);
			while (a[--j] > x);
			if (i >= j)
				break;
			else
				swap(a[i], a[j]);
		}
		a[b] = a[j];
		a[j] = x;
		if (k - 1 == j)
			return a[j];
		else if (k - 1 > j)
			return quickselect(a, j + 1, e, k);
		else
			return quickselect(a, b, j - 1, k);
	}

	private void swap(int i, int j) {
		int temp = i;
		i=j;
		j=temp;
	}
}


//总结：快速选择可以用于这类面试题：1）求出无序数组中第k大的数
//
//2）求出无序数组中最大/小的k个数