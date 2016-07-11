package 泛型;

public class WithoutGenericity {
	private static Object x;
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
		WithoutGenericity.setX("12");
		w.setY("13");
		System.out.println("x="+x+" y="+w.y);
	}
	
	
	private static void IntTyep(){
		x=12;
	}

	private static void DoubleTyep(){
		
	}


	public static void main(String[] args) {
		StringTyep();
	}

	
}


//class cc{
//	void aa (){
//	WithoutGenericity w = new WithoutGenericity();
//	w.setX("12");
//	w.setY("13");
//	System.out.println("x="+w.x+" y="+w.y);
//}
//}