package 华为;

import java.util.Scanner;

public class Norepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入任意字符串：");
        String input = sc.nextLine();
        System.out.println(noRepeat(input));
    }

    public static String noRepeat(String str){
        char[] chars = new char[255];
        char[] input = str.toCharArray();

        int temp;
        for(int i = 0;i< input.length;i++){
            temp = input[i];
            if(chars[temp] == 0)
                chars[temp] = 1;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == 1)
                sb.append((char)i);
        }
        return sb.toString();
    }
}

