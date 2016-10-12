package 宜人贷;

import java.util.Arrays;

public class MergeArray {

	
	/*假设有两个已排序的整型数组nums1和nums2，将nums2合并到nums1中，使其成为一个排序数组。
	注意：
	你可以认为数组nums1有足够的空间可以容纳数组nums2
	(假设nums1中数字个数为m，nums2中数字个数为n,即数组nums1的大小大于或等于m+n)。
	例如：
	[1,4,6,9,0,0,0]
	4
	[2,7,8]
	3
	返回结果：
	[1,2,4,6,7,8,9]
	*/
	
	public static void main(String[] args) {
		int[] num1 = {1,4,6,9,0,0,0};
		int[] num2 = {2,7,8};
		merge(num1,4,num2,3);
		System.out.println(Arrays.toString(num1));
	}
	
	public static void merge(int nums1[], int m, int nums2[], int n)
	{
	    while(m > 0 && n > 0)
	    {
	        if(nums1[m-1] > nums2[n-1])
	        {
	            nums1[m+n-1] = nums1[m-1];
	            m--;
	        }
	        else
	        {
	            nums1[m+n-1] = nums2[n-1];
	            n--;
	        }
	    }
	    while(n > 0){
	        nums1[m+n-1] = nums2[n-1];
	        n--;
	    }
	}

}
