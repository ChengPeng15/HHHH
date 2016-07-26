package 基础;

import java.util.Arrays;
class Student{
	int age;
	String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			System.out.print(1);
//			String []src = {"a","b","c"};
//			String []dest ={"d","e","f"};
//			System.arraycopy(src, 1, dest, 1, 1);
////			Arrays.copyOf(original, newLength);
//			System.out.println(Arrays.toString(dest));
		
		
		
//		Student [] src = new Student[2];
//		Student s1=new Student();
//		s1.setAge(1);
//		s1.setName("s1");
//		src [0]=s1;
//		Student s2=new Student();
//		s2.setAge(2);
//		s2.setName("s2");
//		src [1]=s2;
//		Student [] dest = new Student[3];
//		Student s3=new Student();
//		s3.setAge(3);
//		s3.setName("s3");
//		dest [0]=s3;
//		Student s4=new Student();
//		s4.setAge(4);
//		s4.setName("s4");
//		dest [1]=s4;
//		System.arraycopy(src, 0, dest, 1, 2);//destPos是从第几个开始替换
//		System.out.println(Arrays.toString(dest));
//		System.out.println(333);
		
		
		String src  = "abc";
		String dest  = "def";
		System.arraycopy(src, 1, dest, 1, 1);
		System.out.println(dest);
	}

}
