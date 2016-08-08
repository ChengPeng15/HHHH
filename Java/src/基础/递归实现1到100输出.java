package 基础;

import java.util.Scanner;

public class 递归实现1到100输出 {

	public static void main(String[] args) {
		printNum(100);
	}
	
	public static void printNum(int i){
		System.out.println(i);
		if(i==1){
			return;
		}else{
			printNum(--i);
		}
	}
	
}
