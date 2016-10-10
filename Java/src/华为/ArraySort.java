package 华为;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
//		Scanner sc = new Scanner (System.in);
//		while(sc.hasNextLine()){
//			String src = sc.nextLine();
//			src.charAt(i)<''
//		}
		Integer [] array = {2,5,8,7,9,3};
		Arrays.sort(array, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		});//逆序
		System.out.println(Arrays.toString(array));
	}

}
