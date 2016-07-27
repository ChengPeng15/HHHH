package 基础.数组;
//2.由中心向两边扩展法：

public class Palindrome {
	private static String longestPalindrome(String str){
		int n=str.length();
		if(str==""){
			return "";
		}
		String longest=str.substring(0, 1);
		for(int i=0;i<n-1;i++){
			String p1=expandAroundCenter(str,i,i);
			if(p1.length()>longest.length()){
				longest=p1;
			}
			String p2=expandAroundCenter(str,i,i+1);
			if(p2.length()>longest.length()){
				longest=p2;
			}
		}
		return longest;		
	}
	
	private static String expandAroundCenter(String str,int l,int r){
		int n=str.length();		
		while(l>=0&&r<=n-1&&str.charAt(l)==str.charAt(r)){
			l--;
			r++;
		}		
		/**
		 * 这里要注意,c++中的str.substr(beginIndex,length)的后一个参数是从beginIndex开始的长度，		
		 * 而java中的str.substring(beginIndex,endIndex)的后一个参数是一个下标，应不小于beginIndex,
		 * 并且在获取的字符串中,不包括该下标，
		 */
		return str.substring(l+1, r);		
	}
	public static void main(String[] args){
//		String str="djdslkAABCDEAfjdl1234321skjflkdsjfkldsababasdlkfjsdwieowowwpw";
//		String str ="aba";
		String str ="gabbae";
		String s=longestPalindrome(str);
		System.out.println(s);
	}
}