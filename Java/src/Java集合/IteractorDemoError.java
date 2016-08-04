package Java集合;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteractorDemoError {
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
		while(iterList.hasNext()){
			String str = iterList.next();
			if("A".equals(str)){
				list.remove(3);//list不能删除  要不报错

			}else{
				System.out.println(str);
			}
		}
		
	}
	
	/**
	 * list不能删除  要不报错
	 */

}
