package 算法;

import java.util.Scanner;

public class SolutionMaxCount {
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		while(sin.hasNextLine()){
			String in = sin.nextLine();
			char c =new SolutionMaxCount().MaxRepeatingChar(in);
			System.out.println(c);
		}
		sin.close();
	}

	public  char MaxRepeatingChar(String str) {
		if(str==null||str.length()==0) return '\0';
		int count[]=new int [65536];//初始值都为0
		for (int i = 0; i < str.length(); i++) {//先放到改放到桶中
			count[str.charAt(i)]++;
		}
		int num=count[str.charAt(0)];
		int index=0;
		for (int i = 1; i < str.length(); i++) {
            if(count[str.charAt(i)]>num){
                num=count[str.charAt(i)];
                index=i;
            }
        }
		return str.charAt(index);
	}

}