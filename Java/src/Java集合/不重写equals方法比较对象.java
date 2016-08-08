package Java集合;


class Student{
//	int id;
//	String name;
}
public class 不重写equals方法比较对象 {
/*
 * 对于对象来说，equals方法是判断两个对象是否指向同一个引用  
 * 但使用这个方法与使用=号没啥区别
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = s2;
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s2));
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);




		

	}

}
