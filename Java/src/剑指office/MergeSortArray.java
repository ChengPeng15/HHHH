package 剑指office;

import java.util.Arrays;

public class MergeSortArray {

	public static void main(String[] args) {
		int [] a ={1,3,5,8,9,15,17};
		int [] b ={1,2,6,7,9,14,23,25};
		
		System.out.println(Arrays.toString(a));

	}

	
	/*
	 * 这个是合并不排序
	 */
	private static void Merge(int[] a, int[] b) {
		int [] c =new int[a.length+b.length];
		 System.arraycopy(a, 0, c, 0, a.length);  
		   System.arraycopy(b, 0, c, a.length, b.length);
		  System.out.println( Arrays.toString(c));
	}

}
