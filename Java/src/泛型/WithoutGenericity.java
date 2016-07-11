package 泛型;

public class WithoutGenericity {
	private static Object x=9;
	private Object y;
	
	public Object getX() {
		return x;
	}

	

	public Object getY() {
		return y;
	}



	public static void setX(Object x) {
		WithoutGenericity.x = x;
	}



	public void setY(Object y) {
		this.y = y;
	}
	
	private static void StringTyep(){
		WithoutGenericity w = new WithoutGenericity();
		System.out.println("x="+WithoutGenericity.x+" y="+w.y);
		WithoutGenericity.setX("12");
		w.setY("13");
		System.out.println("x="+WithoutGenericity.x+" y="+w.y);
	}
	
	
	private static void StringTyep1(){
		WithoutGenericity w = new WithoutGenericity();
		System.out.println("x="+WithoutGenericity.x+" y="+w.y);
		WithoutGenericity.setX("12");
		w.setY("13");
		System.out.println("x="+WithoutGenericity.x+" y="+w.y);
	}
	
	private static void IntTyep(){
		System.out.println("x="+x);
	}

	private static void DoubleTyep(){
		
	}

/*
 * 这个结果很奇怪
 * 	x=9 y=null
	x=12 y=13
	x=12
 */
	public static void main(String[] args) {
		StringTyep();
		IntTyep();
		StringTyep1();//这个时候静态变量在上一次已经被改了，想一想如果是多线程会不会很可怕
	}

	
}


