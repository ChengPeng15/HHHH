package Java集合;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteractorDemo {
	public static void main(String[] arglist) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		System.out.println(list.toString());

		Iterator<String> iterList = list.iterator();
		String str="";
		while(iterList.hasNext()){
			str = iterList.next();
			if("A".equals(str)){
				str="AA";
			}else{
				System.out.println(str);
			}
		}
		System.out.println(list.toString());

	}
	
	/**
	 * list  set 在迭代输出是不能删除元素
	 */

}
