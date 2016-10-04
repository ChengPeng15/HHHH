package jjjjj;

import java.util.Scanner;

/*
 * 读入一行英文句子，将每个单词倒置后 ，输出这个单词倒置后的句子，空格和标点符号不做处理
输入描述:
输入数据包括一行文本，包含英文字母、空格、标点符号


输出描述:
输出包括一行文本，和输入文本长度一致，仅仅每个英文单词倒置

输入例子:
I have a dream!

输出例子:
I evah a maerd!
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			String str = sc.nextLine();
			System.out.println(ReverseString(str));
		}
		sc.close();
	}

	private static String ReverseString(String str) {
		StringBuilder sb = new StringBuilder();
		int begin = 0;
		char[] ch = str.toCharArray();
		for (int end = 0; end < ch.length; end++) {
		    if(!Character.isLetter(ch[end])){
		        StringBuilder temp = new StringBuilder(str.substring(begin, end));
		        sb.append(temp.reverse().toString() + ch[end]);
		        begin = end + 1;
		    }
		}
		if(begin != str.length()){
		    sb.append(new StringBuilder(str.substring(begin)).reverse());
		}
		return sb.toString();
	}

}
