package 算法;

public class ddd {
	public static int i=0;
	public static void main(String[] args) {
		int a =f(10);
		System.out.println(i);
		
//		float f = 72.0;
//		byte b = 72;
//		double d = 72.0;
//		char c = 72 ;
	}
	static int foo(int n)  
	{   if(n<2)return n;  
	    return foo(n-1)+foo(n-2);  } 
	
	static int f(int x){
		
		if (x <= 2){
			i=i+1;
			return 1;
		}else{
			i=i+1;
		return f(x - 2) + f(x - 4) + 1;
		}
		}
}
