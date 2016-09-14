package 广联达;

class A {
	  public static int a = print(1);
	  public int aa = print(2);
	  static {
	  print(3);
	  }
	  {
	  print(4);
	  }

	  public A(String str) {
	  System.out.println(5);
	  }
	 
	  public static int print(int i){
	  System.out.println(i);
	  return i;
	  }

	}


	 
	public class B extends A{
	  public static int b = print(6);


	 
	  public int bb = print(7);

	 
	  static {


	 
	  print(8);

	 
	  }


	 
	  public B(String str) {


	 
	  super(str);


	 
	  System.out.println(str);


	 
	  }


	 
	  public static int print(int i)
	{


	 
	  System.out.println(i);


	 
	  return i;


	 
	  }


	 
	  public static void main(String
	args[]) {


	 
	  B b = new
	B("winner");


	 
	  }


	 
	}

