package Java集合;

import java.util.ArrayList;
import java.util.List;

public class List作为参数传递 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> list = new ArrayList<String>();
		list.add("2");
		addList(list);
		System.out.println(list);
		String a ="9";
//		test(a);
		
	}

//	private static void test(final String a) {
//		// TODO Auto-generated method stub
//		a = 99;
//	}

	private static void addList(List<String> list) {
//		list.add("7");//可以
		
		
		list = new ArrayList<String>();//下面这个改变指向了，所以不行
		list.add("70");
	}

}
