package 剑指offer;
/*
 * tcl
 */
class Person {
	int id = 4;
	String name = "4";

	public Person(int i, String string) {
		this.id = i;
		this.name = string;
	}

	public Person() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "id:" + id + "name:" + name;
	}

}

public class ChangeTest {

	public static void main(String[] args) {
		int x = 4;
		cInt(x);
		System.out.println(x);

		Integer y = new Integer(4);
		cIntegerObj(y);
		System.out.println(y);

		String z = new String("4");
		cStringObj(z);
		System.out.println(z);

		StringBuffer s = new StringBuffer("4");
		cStringBufferObj(s);
		System.out.println(s);

		// Person p = new Person(4,"4");
		Person p = new Person();
		p.setName("UnChanged");
		cPersonObj(p);
		System.out.println(p);
	}

	private static void cStringBufferObj(StringBuffer s) {
		// s= new StringBuffer("3");//改变不了
		s.setCharAt(0, '3');// 改变了
	}

	private static void cInt(int x) {
		x = 3;
	}

	private static void cIntegerObj(Integer y) {
		y = new Integer("3");
	}

	private static void cStringObj(String z) {
		z = new String("3");
		// z = "3";

	}

	
	private static void cPersonObj(Person p) {
//		p = new Person();
		p.setName("changeName");//这样能改
		// z = "3";

	}
}
