package 算法;

import java.util.Arrays;

public class BubbleSort {

	private int id;
	
	public static void bubbldSort(int[]list){
		boolean needNextPass = true;
		for (int i = 1; i < list.length&&needNextPass; i++) {
			for (int j = 0; j < list.length-i; j++) {
				if(list[j]>list[j+1]){
					int temp=list[j];
					list[j]=list[j+1];
					list[j+1]=temp;
					needNextPass = true;
				}
			}
		}
	}
	
	
	public static void bubbldSort1(int[]list){
		boolean needNextPass = true;
		for (int i = 0; i < list.length-1&&needNextPass; i++) {
			for (int j = 0; j < list.length-1-i; j++) {
				if(list[j]>list[j+1]){
					int temp=list[j];
					list[j]=list[j+1];
					list[j+1]=temp;
					needNextPass = true;
				}
			}
		}
	}
	private static void swap(int i, int j) {
		int temp = i;
		i=j;
		j=temp;
	}





	public static void main(String[] args) {
		int []list={2,3,2,5,6,1,-2,3,14,12};
		bubbldSort(list);
		System.out.println(Arrays.toString(list));
		int []list1={2,3,2,5,6,1,-2,3,14,12};
		bubbldSort1(list1);
		System.out.println(Arrays.toString(list1));
	}

}
