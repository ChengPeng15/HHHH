package 基础;

public class final当作变量 {
	public static Integer test( Integer i){
//		System.out.println(i);
//		System.out.println(i);
		i = 88;
		System.out.println(i);

		return i;
	}
	public static void main(String[] args) {
		Integer j = 96;
		System.out.println(final当作变量.test(j)==j);
		System.out.println(j);
	}
}

//class Demo {
//	int x;
//}
//public class final当作变量 
//	{     
//	   int x=3;
//	   public static void   main(String[] args){
//	       Demo d = new Demo();
//	       d.x=9;
//	       show(d);       
//	       System.out.println("x="+d.x);
//	    }
//	
//	    public static void show(Demo d){
//	       d.x=4;
//	    }
//	}
