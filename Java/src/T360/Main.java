package T360;

import java.util.Scanner;

class Test {
}

public class Main {
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNextLine()) {
			String str = cin.nextLine();
			if(str!=null && str.length()<=Math.pow(10,5)){
			String str1 = cin.nextLine();
			String str2= cin.nextLine();
			int i = getIndex(str,str1);
			if(i>=0){
				int j = getIndex(str,str2);
				if(i+str1.length()<=j){
					if(Back(str,str1,str2)){
						System.out.println("both");
					}
					System.out.println("forward");
				}
				
			}
			else{
				str = reverse(str);
				i = getIndex(str,str1);
				if(i>=0){
					int j = getIndex(str,str2);
					if(i+str1.length()<=j){
						System.out.println("backward");
					}
				}
			}
			System.out.println("invalid");
		}
	}
		cin.close();
}
	
	private static boolean Back(String str,String str1,String str2) {

		str = reverse(str);
		int i = getIndex(str,str1);
		if(i>=0){
			int j = getIndex(str,str2);
			if(i+str1.length()<=j){
//				System.out.println("backward");
				return true;
			}
		}
	
		return false;
	}


	private static int getIndex(String str, String subStr) {
		return str.indexOf(subStr);
	}

	public static String reverse(String str) {
		return new StringBuilder(str).reverse().toString();
	}
}
