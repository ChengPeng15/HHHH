package 继承;

 abstract class aaa{// 类名不区分大小写 不能跟其他重名
	protected abstract void ss();
}

public class 抽象类访问权限 extends aaa {
	public static void main(String[] args) {
		
	}

	@Override
	protected  void ss() {
		System.out.println();
	}

}
