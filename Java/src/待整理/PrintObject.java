package 待整理;

class Person
{
	private String name;
	public Person (String name)
	{
		this.name =name;
	}
}
public class PrintObject
{
	public static void main(String[] args)
	{
		Person p = new Person("孙悟空");
		System.out.println(p);//Person@15db9742
		//Object 类提供的toString()方法总是返回该对象实现类的“类名+@+hashCode”
		System.out.println(p.toString());
		System.out.println(p+"");
	}
}