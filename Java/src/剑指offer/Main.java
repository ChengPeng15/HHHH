package 剑指offer;

import java.util.Scanner;
public class Main {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s="";
        while(input.hasNextLine()){
            s=input.nextLine();
            System.out.println(s.length()-1-s.lastIndexOf(" "));
            String []array = s.split(" ");
            System.out.println(array[array.length-1].length());
        }    
    }
}