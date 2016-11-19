package 去哪网;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String a = sc.next();
			String b = sc.next();
			System.out.println(process(a, b));
		}
		sc.close();
	}

	private static boolean process(String a, String b) {
		// TODO Auto-generated method stub
		TreeSet<Character> set1 = new TreeSet<Character>();
		TreeSet<Character> set2 = new TreeSet<Character>();
		for (int i = 0; i < a.length(); i++) {
			set1.add(a.charAt(i));
		}
		for (int i = 0; i < b.length(); i++) {
			set2.add(b.charAt(i));
		}

		if (set1.size() != set2.size()) {
			//System.out.println("false");
			return false;
		}
		Iterator<Character> it1 = set1.iterator();
		Iterator<Character> it2 = set1.iterator();

		boolean flag = false;
		while (it1.hasNext()) {
			if (!it1.next().equals(it2.next())) {
				flag = true;
				break;
			}
		}
		if (flag) {
			return false;
		} else {
			return true;
		}
	}
}
