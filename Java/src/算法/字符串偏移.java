package 算法;

import java.util.Arrays;
import java.util.Scanner;

public class 字符串偏移 {
    /*
     * param A: A string
     * param offset: Rotate string with offset.
     * return: Rotated string.
     */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			String str = sc.nextLine();
			char[]A=str.toCharArray();
			System.out.println(Arrays.toString(A));
			rotateString(A,2);
			System.out.println(Arrays.toString(A));
		}
		sc.close();

		
	}
    public static char[] rotateString(char[] A, int offset) {
        // wirte your code here
        //当偏移量为0或者字符数组为空时直接返回原字符数组
        if(offset==0||A.length==0){
            return A;
        }
        //当字符数组的长度小于偏移量时，先对其取余
        if(offset>A.length){
            offset =offset%A.length;
        }
        //将字符串分为两部分，将第一部分翻转
        for(int i = 0,j=A.length-1-offset;i<j;i++,j--){
            char temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
        //将第二部分翻转
        for(int i= A.length-offset,j=A.length-1;i<j;i++,j--){
             char temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
        //再将整个字符串翻转
        for(int i =0,j=A.length-1;i<j;i++,j--){
            char temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
        return A;
    }
    
};