package 单例模式;

import java.util.Arrays;
import java.util.Scanner;
public class Main1
{
    public static void main(String args[])
    {
        Scanner cin = new Scanner(System.in);
        while(cin.hasNextLine())
        {
            String a = cin.nextLine();
            String[] sArray = a.split(",");
            int []intArray = new int[sArray.length];
            for(int i=0;i<sArray.length;i++){
            	intArray[i]=Integer.parseInt(sArray[i]);
            }
           System.out.println(sum(intArray)); 
        }
    	cin.close();
    }

	private static int sum(int[] intArray) {
		Arrays.sort(intArray);
		int length = intArray.length;
		int min=intArray[0];
		int max = intArray[length-1];
		int sum=0;
		for(int i=0;i<length;i++){
			if(intArray[i]==min || intArray[i]==max){
				continue;
			}
			sum+=intArray[i];
		}
		return sum;
	}
    
}