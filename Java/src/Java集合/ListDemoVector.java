package Java集合;

import java.util.List;
import java.util.Vector;

public class ListDemoVector {
/*
 * ArrayList 不是线程安全  Vector是线程安全的
 */
	public static void main(String[] args) {
		List<String> lists =null;
		lists = new Vector<String>();
		lists.add("A");//可以重复
		lists.add("B");
		for(int i =0;i<lists.size();i++){
			System.out.println(lists.get(i));
		}
		System.out.println("集合是否为空："+lists.isEmpty());
		System.out.println("B是否存在"+lists.indexOf("B"));//返回索引
		System.out.println("A是否存在"+lists.indexOf("A"));//返回第一个
	}

}
