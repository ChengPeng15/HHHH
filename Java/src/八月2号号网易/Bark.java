package 八月2号号网易;

public class Bark {
	public static void main(String[] args) {
		Dog woofer = new Dog();
		Dog nipper = new Basenji();
		woofer.bark();
		nipper.bark();//静态方法不弄重写
	}
}
// class Dog {
//	public static void bark() {
//		System.out.println("woof");
//	}
//}
// class Basenji extends Dog{
//	public static void bark() {
//		System.out.println("Basenji");
//	}
//}