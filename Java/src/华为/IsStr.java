package 华为;

import java.util.Scanner;

public class IsStr {
	 
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            for (int i = 0; i < str.length(); i++) {
                if ((str.charAt(i) <= 'Z' && str.charAt(i) >= 'A')
                        || (str.charAt(i) <= 'z' && str.charAt(i) >= 'a')) {
                    System.out.println(str.charAt(i) + "是字母");
                } else {
                    System.out.println(str.charAt(i) + "不是字母");
                }
            }
        }
    }
}