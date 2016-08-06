package Java集合;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemoHashSet {

	public static void main(String[] args) {
		Set<String> s = null;
		s = new HashSet<String>();//无序
		s.add("M");
		s.add("B");
		System.out.println(s.add("D"));
		System.out.println(s.add("D"));
		s.add(null);
		s.add("E");
		s.add("F");
		System.out.println(s);

		
		Iterator<String> iterList = s.iterator();
		while(iterList.hasNext()){
			String str = iterList.next();
			if("A".equals(str)){
				s.add("FF");//没用
			}else{
				System.out.println(str);
			}
		}
		System.out.println(s);
	}

}
