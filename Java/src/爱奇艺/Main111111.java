package 爱奇艺;

import java.util.Arrays;
import java.util.Scanner;

public class Main111111 {
	private static char[] data;
	private static int length;
	public static void permutate(String input) {
		changeToData(input);
		Arrays.sort(data);
		System.out.println(data);
		while (nextPermutate()) {
			System.out.println(data);
		}
	}
	private static void changeToData(String input) {
		if (input == null)
			return;
		data = input.toCharArray();
		length = data.length;
	}

	private static boolean nextPermutate() {
		int end = length - 1;
		int swapPoint1 = end, swapPoint2 = end;
		while (swapPoint1 > 0 && data[swapPoint1] <= data[swapPoint1 - 1])
			swapPoint1--;
		if (swapPoint1 == 0)
			return false;
		else {
			while (swapPoint2 > 0 && data[swapPoint2] <= data[swapPoint1 - 1])
				swapPoint2--;
			swap(data, swapPoint1 - 1, swapPoint2);
			reverse(data, swapPoint1, end);
			return true;
		}
	}

	private static void swap(char[] data, int left, int right) {
		char temp = data[left];
		data[left] = data[right];
		data[right] = temp;
	}

	private static void reverse(char[] data, int left, int right) {
		for (int i = left, j = right; i < j; i++, j--)
			swap(data, i, j);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String str = sc.nextLine();
			permutate(str);
		}
		sc.close();
	}
}