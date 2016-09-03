package 完美世界;

public class Test02 {
	StringBuffer str = new StringBuffer("good");
	char [] ch ={'a','b','c'};
	public static void main(String[] args) {
		Test02 ex = new Test02();
		ex.change(ex.str, ex.ch);
		System.out.println(ex.str);
		System.out.println(ex.ch);
	}
	
	public void change(StringBuffer str,char ch[])
	{
//		str.append("ccccc");
		str.setCharAt(0, 'e');
		ch[0] = 'g';
	}
}
