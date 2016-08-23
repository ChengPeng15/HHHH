package 网易有道;
import java.util.*;

class Test {
}
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
        	int  T=in.nextInt();
            for(int i=0;i<T;i++)
            {
	        	int n=in.nextInt();
	        	int k=in.nextInt();
	            int [] left=new int [n];
	            int	[] right=new int[n];
            for(int i1=0;i1<n;i1++)
            {
                left[i1]=in.nextInt();
            }
             for(int i1=0;i1<n;i1++)
            {
                right[i1]=in.nextInt();
            }
            System.out.println(process(left,right, n,k));
            }

        }
        in.close();
    }
    static String process(int [] left,int [] right,int n,int k)
    {
        StringBuffer buffer=new StringBuffer();
        int [] arr=new int [2*n];
        int index=0;
        int index2=n-1;
        for(int i=0;i<k;i++)
        {
            index=0;
            index2=n-1;
            while(index2>=0)
            {
                arr[index]=right[index2];
                index++;
                arr[index]=left[index2];
                index++;
                index2--;
            }
            index2=n-1;
            index=0;
            for(int j=2*n-1;j>=n;j--)
            {
                left[index++]=arr[j];
            }
            index=0;
            for(int j=n-1;j>=0;j--)
            {
                right[index++]=arr[j];
            }
        }
         for(int i=2*n-1;i>0;i--)
            {
                buffer.append(arr[i]+" ");
            }
            buffer.append(arr[0]);
            return buffer.toString();

    }
}
