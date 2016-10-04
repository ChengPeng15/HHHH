package 海康威视;

import java.io.PrintStream;

public class TT {

	public static void main(String[] args) {
		String s1 = "abcde";
		String s2 = "abcde";
		PrintStream out=System.out;
		s1.toUpperCase();
		System.out.println(s1);
		System.out.println(s2);
		if(s1==s2){
		out.println("YES");
		}else{
		out.println("NO");
		}
		}
	}

