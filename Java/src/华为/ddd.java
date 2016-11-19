package 华为;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ddd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		returnStr(str);
	}

	private static void returnStr(String str) {
		// TODO Auto-generated method stub
		char[]array = str.toCharArray();
		int len = array.length;
		Set<Character>set= new TreeSet<Character>();
		for (int i = 0; i < len; i++) {
			set.add(array[i]);
		}
		System.out.println(Arrays.toString(set.toArray()));
	}

}
