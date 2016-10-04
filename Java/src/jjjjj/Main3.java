package jjjjj;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    while(in.hasNext()){
	        String line = in.nextLine();
	        StringBuilder sb = new StringBuilder();
	        int start = 0;
	        char[] ch = line.toCharArray();
	        for (int i = 0; i < ch.length; i++) {
	            if(!Character.isLetter(ch[i])){
	                StringBuilder temp = new StringBuilder(line.substring(start, i));
	                sb.append(temp.reverse().toString() + ch[i]);
	                start = i + 1;
	            }
	        }
	        if(start != line.length()){
	            sb.append(new StringBuilder(line.substring(start)).reverse());
	        }
	        System.out.println(sb.toString());
	    }
	}
}
