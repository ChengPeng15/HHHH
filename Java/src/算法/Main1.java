package 算法;

import java.util.Scanner;

public class Main1{
    public static void main(String[]args){
        Scanner ins = new Scanner(System.in);
        while(ins.hasNextLine()){
            String in = ins.nextLine();
            char result = findChar(in);
            System.out.println(result);
        }
     }
    //利用桶排序的思想
    public static char findChar(String input){
        if(input==null ||input.length()==0 )
            return '0';
        int[] count=new int[26];
        char c='a';
        for(int i=0;i<input.length();i++){
            count[input.charAt(i)-'a']++;
        }
        for(int i=0;i<input.length();i++){
            if(count[input.charAt(i)-'a']==1)
                return input.charAt(i);
        }
        return '0';
         
    }
}