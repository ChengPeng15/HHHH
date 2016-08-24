package Java集合;


public class Student{
	int id;
	String name;
/*
 * 对于对象来说，equals方法是判断两个对象是否指向同一个引用  
 * 但使用这个方法与使用=号没啥区别
 */
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.id=1;
		s1.name=new String("xiaoming");
		Student s2 = new Student();
		s2.id=1;
		s2.name="xiaoming";
		Student s3 = s2;
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s2));
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);




		

	}

	@Override
	public boolean equals(Object obj) {
		super.equals(obj);
		//    public boolean equals(Object obj) {
//        		return (this == obj);
//    			}
//		但使用这个方法与使用=号没啥区别
		if(obj instanceof Student){
			if(id==((Student)obj).id){
				if(name.equals(((Student)obj).name)){
					return true;
				}
			}
		}
		return false;
	}

}
