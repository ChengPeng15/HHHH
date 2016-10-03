
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(1111);
		String []s={"a","b","c"};
		new Test().print(s);
	}
	public void print (String ...strings){
		for (String msg :strings){
			System.out.println(msg);
		}
	}
}
