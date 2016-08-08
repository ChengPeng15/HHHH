package Java集合;


class Stu{
	int id;
	String name;
	public Stu(String name,int id) {
		this.id = id;
		this.name = name;
	}
	public boolean equals(Object obj) {
//		Stu another = (Stu)obj;
//		if(this.name.equals(another.name))
		if(this.name.equals(((Stu)obj).name))
		return true;
		return false;
	}
	
}
public class 重写equals方法比较对象 {
/*
 * 对于对象来说，equals方法是判断两个对象是否指向同一个引用  
 * 但使用这个方法与使用=号没啥区别
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stu s1 = new Stu(new String("chengpeng"),15);
		Stu s2 = new Stu(new String("chengpeng"),25);
		System.out.println(s1.equals(s2));




		

	}

}
