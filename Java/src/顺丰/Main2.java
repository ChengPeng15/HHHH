package 顺丰;

import java.io.*;
import java.util.*;

class Test {
}

public class Main2 {
	
	static int sum;
	static int max;
	static int parts;
	static boolean[] isUsed;
	static int length;
	static int[] array;
	private static boolean search(int res, int m, int n) {
		if (res == max) {
			res = 0;
			m = length - 2;
			n++;
		}
		if (n == parts) {
			return true;
		}
		while (m >= 0) {
			if (isUsed[m] == false) {
				if (res + array[m] <= max) {
					isUsed[m] = true;
					if (search(res + array[m], m - 1, n)) {
						return true;
					}
					isUsed[m] = false;
					if (res == 0) {
						break;
					}
					if (res + array[m] == max) {
						break;
					}
				}
				int i = m - 1;
				while (i >= 0 && array[i] == array[m]) {
					i--;
				}
				m = i;
				int l_s = 0;
				for (int j = m; j >= 0; j--) {
					if (!isUsed[j]) {
						l_s += array[j];
					}
				}
				if (l_s < max - res) {
					break;
				}
				continue;
			}
			m--;
		}
		return false;
	}

	public static void main(String[] args)  {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		try {
			while ((length = Integer.parseInt(read.readLine())) != 0) {
				array = new int[length];
				StringTokenizer take = new StringTokenizer(read.readLine());
				int index = 0;
				sum = 0;
				isUsed = new boolean[length];
				while (take.hasMoreTokens()) {
					array[index] = Integer.parseInt(take.nextToken());
					sum += array[index++];
				}
				Arrays.sort(array);
				max = array[length - 1];
				for (; max <= sum; max++) {
					if (sum % max == 0) {
						parts = sum / max;
						if (search(0, length - 1, 0)) {
							System.out.println(max);
							break;
						}
					}
				}
			}
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
