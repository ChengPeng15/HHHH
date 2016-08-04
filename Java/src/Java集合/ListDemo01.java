package Java集合;

import java.util.ArrayList;
import java.util.List;

public class ListDemo01 {

	public static void main(String[] args) {
		List<String> lists =null;
		lists = new ArrayList<String>();
		
		lists.add("B");
		lists.add("A");
		lists.add("A");//可以重复
		lists.add(null);
		lists.add("c");
		System.out.println(lists);
		for(int i =0;i<lists.size();i++){
			System.out.println(lists.get(i));
		}
//		lists.remove(1);
		lists.remove("A");//

		System.out.println("After Deleting");
		for(int i =0;i<lists.size();i++){
			System.out.println(lists.get(i));
		}
		System.out.println("集合是否为空："+lists.isEmpty());
		System.out.println("B是否存在"+lists.indexOf("B"));//返回索引
		System.out.println("A是否存在"+lists.indexOf("A"));//返回第一个
	}

}
