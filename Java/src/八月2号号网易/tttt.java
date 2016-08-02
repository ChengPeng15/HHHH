package 八月2号号网易;

import java.util.Arrays;

public class tttt {
	public static void main(String[] args) {
	       int a[] = {2, 3, 4, 5, 6, 7, 8, 9};
	       int from = 2;
	       int to = 4;
	       int original[] = Arrays.copyOfRange(a, from, to);
	       for (int c : original) {
	           System.out.println(c);
	       }
	    }
}
