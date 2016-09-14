package 算法;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		while(sin.hasNextLine()){
			String in = sin.nextLine();
			int c =new Solution().FirstNotRepeatingChar(in);
			System.out.println(c);
		}
		sin.close();
	}

	public  int FirstNotRepeatingChar(String str) {
		if(str==null||str.length()==0) return -1;
		int count[]=new int [65536];//初始值都为0
		for (int i = 0; i < str.length(); i++) {//先放到改放到桶中
			count[str.charAt(i)]++;
		}
		for (int i = 0; i < str.length(); i++) {
            if(count[str.charAt(i)]==1)
                return i;
        }
		return 0;
	}

}