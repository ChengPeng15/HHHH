package 剑指offer;
/*
 * 输入字母判断第几列
 */
import java.util.Scanner;

public class JudgeClumns {

	public static void main(String[] args) {
		Scanner str = new Scanner(System.in);
		while(str.hasNextLine()){
			String Chars= str.next();
			if(!isEnglishAlphabet(Chars)){
				System.out.println("只支持输入字母");
//				return;
			}else{
				Chars = Chars.toUpperCase();
				int number = 0;
				for (int i = 0; i < Chars.length(); i++) {
					number =(((int)Chars.charAt(i)-64)+26*i);
					
				}
				System.out.println(number);
			}
		}
		str.close();
	}
	
	private static boolean isEnglishAlphabet(String str){
		String regex="[a-zA-Z]+";
		return str.matches(regex);
	}

}
