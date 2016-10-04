package 基础;

public class extendDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parentClass a = new subclass();
		parentClass aa = new parentClass();
		subclass2 c = new subclass2();
		System.out.println(a.id);
		System.out.println(a.getId());
		System.out.println(a instanceof subclass);
		System.out.println(aa instanceof subclass);
		subclass sss = (subclass)a;
		System.out.println(sss.getId());
//		System.out.println(c instanceof subclass);//编译错误
	}

}
class parentClass{
	int id=10;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}

class subclass extends parentClass{
	int id=100;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}

class subclass2 extends parentClass{
	int id=1000;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}