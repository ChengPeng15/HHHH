package 组合;

//InheritTest.java 使用继承方式实现目标
class AnimalTest{
	private void beat(){
		System.out.println("心脏跳动...");
	}
	public void breath(){
		beat();
		System.out.println("吸一口气，呼一口气，呼吸中...");
	}
}
//继承AnimalTest，直接复用父类的breath()方法
class BirdTest extends AnimalTest{
	//创建子类独有的方法fly()
	public void fly(){
		System.out.println("我是鸟，我在天空中自由的飞翔...");
	}
}
//继承AnimalTest，直接复用父类的breath()方法
class WolfTest extends AnimalTest{
	//创建子类独有的方法run()
	public void run(){
		System.out.println("我是狼，我在草原上快速奔跑...");
	}
}
public class InheritTest{
	public static void main(String[] args){
		//创建继承自AnimalTest的BirdTest对象新实例b
		BirdTest b=new BirdTest();
		//新对象实例b可以breath()
		b.breath();
		//新对象实例b可以fly()
		b.fly();
		WolfTest w=new WolfTest();
		w.breath();
		w.run();
/*
---------- 运行Java程序 ----------
心脏跳动...
吸一口气，呼一口气，呼吸中...
我是鸟，我在天空中自由的飞翔...
心脏跳动...
吸一口气，呼一口气，呼吸中...
我是狼，我在草原上快速奔跑...

输出完毕 (耗时 0 秒) - 正常终止
*/
	}
}