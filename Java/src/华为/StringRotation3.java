package 华为;
/*
 * 题目描述

对于一个字符串，和字符串中的某一位置，请设计一个算法，将包括i位置在内的左侧部分移动到右边，将右侧部分移动到左边。
给定字符串A和它的长度n以及特定位置p，请返回旋转后的结果。
测试样例：
"ABCDEFGH",8,4
返回："FGHABCDE"
 */
import java.util.*;

public class StringRotation3 {
	public static String rotateString(String A, int n, int p) {
//    	StringBuffer s1 = new StringBuffer(A.substring(0, p+1));
//    	StringBuffer s2 = new StringBuffer(A.substring(p+1, n));
//    	return s2.toString()+s1.toString();
    	return A.substring(p+1, n)+A.substring(0, p+1);
    }
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println();
    	while(sc.hasNext()){
    		String s = sc.next();
    		int n = sc.nextInt();
    		int p = sc.nextInt();
    		System.out.println(rotateString(s,n,p));
    	}
    	sc.close();
	}
}