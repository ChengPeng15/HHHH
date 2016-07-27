package 基础.String;

public class StringDemo1 {

	public static void main(String[] args) {
		String str = "hello";
		String s1 = new String("hello");
		String s2 = "hello";
		String s3 = new String("hello");
		if(str==s2){
			System.out.println("str =====  s2");
		}
		if(str==s1){
			System.out.println("str =====  s1");
		}
		if(str.equals(s1)){
			System.out.println("\"hello\" equals new String(\"hello\")");
		}
		
		
		if(s1==s3){
			System.out.println("s1=new String(\"hello\") ====?===  s3=new String(\"hello\")");
		}
		if(s1.equals(s3)){
			System.out.println("s1=new String(\"hello\") ---???equals???---  s3=new String(\"hello\")");
		}
	}

} 
