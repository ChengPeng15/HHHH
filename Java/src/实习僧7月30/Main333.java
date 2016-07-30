package 实习僧7月30;

import java.util.Scanner;


public class Main333 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextInt()) { 

            int na = in.nextInt();
            int nb = in.nextInt();
            int p = in.nextInt();
            int q = in.nextInt();
            int[] M = new int[na];

            for (int i = 0; i < na; i++) {
                M[i] = in.nextInt();
            }

            int[] N = new int[nb];

            for (int i = 0; i < nb; i++) {
                N[i] = in.nextInt();
            }

            System.out.println(process(na, nb, p, q, M, N));
        }

        in.close();
    }

     static String process(int na, int nb, int p, int q, int[] m, int[] n) {

    	int pMax=m[p];
    	int qIndex=binarySearch(n,nb, pMax);
    	if(qIndex==-1||qIndex>nb-q-1)
    	return "NO";	    	
    	else
    	return "YES";

    }
    static int binarySearch(int[] n,int len,int val)
    {

    	int mid=0;
    	int left=0;
    	int right=len-1;
    	while(left<=right)
    	{
    		mid=right+(left-right)/2;//防止溢出
    		if(n[mid]<=val)
    		 return mid;
            right=mid-1;
    	}
		return -1;
    }
}
