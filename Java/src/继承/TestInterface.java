package 继承;
class AA implements Interface1{
	public void say() {
		System.out.println("A实现接口1say方法");
	}
}

public class TestInterface{
	public static void main(String[] args) {
		new AA().say();
		System.out.println(Interface1.AGE);
	}
}