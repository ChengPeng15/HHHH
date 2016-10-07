package 集合;

import java.util.*;

public class ListTest {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(1);
		list.add(2);
//		Map m = new HashMap();
//		System.out.println(m.put(1, 22));//null
//		System.out.println(m.put(1, 222));//222
		
		Iterator it  = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
//		System.out.println(list.size());
	}

}
