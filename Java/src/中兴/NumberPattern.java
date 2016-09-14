package 中兴;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			int n = in.nextInt();
			numberPatternPrint(n);
		}
		in.close();
	}
	
	public static void numberPatternPrint(int n){
		if(n==0)return;
		int count = 1;
		while(count<=n){
			if(count%2!=0){
				int begin = ((count-1)*count)>>1;
				int end = ((count+1)*count)>>1;
				for(int i=begin;i<=end;i++){
					if(i<end){
						System.out.print(i+"*");
					}else{
						System.out.println(i);
					}
				}
			}else{
				int end = ((count-1)*count)>>1;
				int begin = ((count+1)*count)>>1;
				for(int i=begin;i<=end;i--){
					if(i<end){
						System.out.print(i+"*");
					}else{
						System.out.println(i);
					}
				}
			}
			count++;
		}
	}

}
