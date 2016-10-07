package 继承;
class Aa{
	public void p (double i){
		System.out.println(i*2);
	}
}

class Bb extends Aa{
	public void p (double i){
		System.out.println(i*2);
	}
}

public class Test {

	public static void main(String[] args) {
		System.out.println(10>>2);
//		Bb b = new Bb();
//		b.p(10);
//		b.p(10.0);
	}

}
