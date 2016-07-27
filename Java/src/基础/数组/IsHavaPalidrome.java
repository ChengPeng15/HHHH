package 基础.数组;



public class IsHavaPalidrome {
	private static void HavaPalidrome(String str){
		if(str==""){
			return;
		}
		int n=str.length();
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
				if(flag){
					beginIndex=i;
					endIndex=j+1;
					System.out.println(str.substring(beginIndex,endIndex));
				}
			}
		}
	}
	
	public static void main(String[] args){
		String str="djdslkAABCDEAfjdl1234321skjflkdsjfkldsababasdlkfjsdwieowowwpw";
		HavaPalidrome(str);
	}
}