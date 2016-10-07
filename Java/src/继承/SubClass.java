package 继承;

public class SubClass extends SuperClass {

	private int mSubX = 1;

	public SubClass() {
	}

	@Override
	public void setX(int x) {
		super.setX(x);
		mSubX = x;
		System.out.println("SubX is assigned " + x);
	}

	public void printX() {
		System.out.println("SubX = " + mSubX);
	}
	public  void hello(int i) {
		System.out.println("s:"+i);
	}
	public static void main(String[] args) {
		SubClass sc = new SubClass();
		sc.printX();
	}

}

class SuperClass {

	private int mSuperX;

	public SuperClass() {
		setX(99);
		hello(1000);
	}

	public  void hello(int i) {
		System.out.println("f:"+i);
	}

	public void setX(int x) {
		mSuperX = x;
	}
}