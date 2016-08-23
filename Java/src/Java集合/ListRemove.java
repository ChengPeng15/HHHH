package Java集合;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListRemove {

	public static void main(String[] args) {
		List<Integer>list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		
//		list.remove((Integer)1);
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()){
			Integer i = it.next();
			System.out.println(i);
			if(i%3==0){
				it.remove();
			}
		}
		System.out.println(list);
	}

}
