package 基础.数组;


//查找当前字符串最大回文串
public class MaxHuiWen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abbccddeefaa";
		MaxHuiWen(s);
	}
	
	//1.输出回文串
	public static void MaxHuiWen(String s){
		//存储字符串的长度
		int length = s.length();
		//存储最长的回文串
		String MaxString = "";
		//遍历当前字符串的所有子串
		for(int i = 0 ; i < length ; i++){
			for(int j = i ; j < length + 1 ; j++){
				String s1 = s.substring(i , j);
				//如果当前字符串为回文串并且大于MaxString的长度，就替换当前MaxString
				if(HuiWen(s1) && s1.length() > MaxString.length()){
						MaxString = s1;
				}
				//System.out.println(s1);
			}
		}	
		//如果MaxString长度大于等于2，说明是回文串
		if(MaxString.length() >= 2){
			System.out.println(MaxString);
		}
		else{
			System.out.println("没有回文串");
		}
		
	}
	
	//2.判断字符串是否为回文串
	public static boolean HuiWen(String s){
		boolean flag = true;
		int length = s.length();
		char s1[] = s.toCharArray();
		//从前，从后，遍历字符串，进行比较
		for(int i = 0 , j = length - 1 ; i <= j ; i++ , j--){
			if(s1[i] != s1[j]){
				flag = false;
			}
		}
		return flag;
	}
	
}
