package 链家测试面试算法;

import java.util.Arrays;

public class 快速排序 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]array={3,1,4,9,5,3,7};
		System.out.println(Arrays.toString(array));
		sort(array);
		System.out.println(Arrays.toString(array));
	}

	private static void sort(int[] array) {
		// TODO Auto-generated method stub
		if(array !=null){
			quickSort(0,array.length-1,array);
		}
	}

	private static void quickSort(int i, int j, int[] array) {
		// TODO Auto-generated method stub
		int p = partition(i,j,array);
		partition(i,p-1,array);
		partition(p+1,j,array);
	}

	private static int partition(int i, int j, int[] array) {
		int p = array[i];
		while(i<j){
			while((array[j]>
p)&&(i<j)) j--;
			if(i<j)
			array[i++]=array[j];
			while((array[i]<=p)&&(i<j)) i++;
			if(i<j)
			array[j--]=array[i];
		}
		array[i]=p;
		return i;
	}

}
