package 基础.数组;
//Java：1.暴力搜索法：
public class Palindrome2 {
	private static String longestPalindrome(String str){
		if(str==""){
			return "";
		}
		int n=str.length();
		int maxLength=-1;
		int beginIndex=0;
		int endIndex=0;		
		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){
				int start=i;
				int end=j;	
				boolean flag=true;
				while(start<=end){					
					if(str.charAt(start)!=str.charAt(end)){
						flag=false;	
						break;
					}
					start++;
					end--;
				}
				int tmpLength=j-i+1;
				if(flag&&tmpLength>maxLength){
					maxLength=tmpLength;
					beginIndex=i;
					endIndex=j+1;
				}
			}
		}
		return str.substring(beginIndex,endIndex);
	}
	
	public static void main(String[] args){
		String str="djdslkAABCDEAfjdl1234321skjflkdsjfkldsababasdlkfjsdwieowowwpw";
		String s=longestPalindrome(str);
		System.out.println(s);
	}
}