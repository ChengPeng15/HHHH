package 剑指offer;

import java.util.Scanner;

public class FindNmuberOf1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		while(in.hasNextInt()){
//			int n = in.nextInt();
//			int num = new FindNmuberOf1().NumberOf1(n);
//			System.out.println(num);
		int n =-9;
//			while(n>>1!=0){
				System.out.println(n<<1);
				System.out.println(n<<2);
				System.out.println(n<<3);
				System.out.println(n<<4);
//				n=n>>1;
				
//			}
		}
		

	public int NumberOf1(int n) {
		int count=0;
		while(n!=0){
			if((n & 1)!=0){
				count ++;
			}
				n=n>>1;
				/*
				 * 右移1位,相当于除以2,但是出发效率比移位低很多,
				 * 实际编程中尽可能多用移位代替乘数法
				*/
		}
		return count;
	}
	
}
