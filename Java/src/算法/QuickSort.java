package 算法;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int array []= {34,65,12,45,6,79,9};
		quickSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println(Arrays.toString(array));
	}
	public static void quickSort(int[] array){
		if(array != null){
			quickSort(array, 0, array.length-1);
		}
	}
	
	
	private static void quickSort(int[] array,int beg,int end){
		if(beg >= end || array == null)
			return;
		int p = partition(array, beg, end);
		quickSort(array, beg, p-1);
		quickSort(array, p+1, end);
	}
	
	private static int partition(int[] array, int beg, int end) {  
        int pivot = array[beg];
        while (beg < end) {
            while (beg < end && array[end] >= pivot)
                end--;
            if (beg < end)
                array[beg++] = array[end];
            while (beg < end && array[beg] <= pivot)
                beg++;
            if (beg < end)
                array[end--] = array[beg];
        }
        array[beg] = pivot;
        return beg;
    }
	
}