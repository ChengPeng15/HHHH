package 完美世界;

public class Test01 {

	public static void main(String[] args) {
		int a= 8,b=8,c=8,d=8;
//		a+=(a++);
		a=a+(a++);
		b+=(++b);
//		(c++) +=c;
//		(++d) +=(d++);
		System.out.println(a+":"+b);
		
		
//		Integer i01 = 59;
//		int i02=59;
//		Integer i03 = Integer.valueOf(59);
//		Integer i04 =new Integer(59);
//		System.out.println(i01==i02);
//		System.out.println(i01==i03);
//		System.out.println(i03==i04);
//		System.out.println(i02==i04);
		
		
		
		System.out.println(fn(6));
		char[]ch ={'a','b','c'};
		System.out.println(ch);
		
		
	}

	static int fn(int n){
        if(n==2)return 1;
        if(n==3)return 2;
        return (n-1)*(fn(n-1)+fn(n-2));
    }
}


