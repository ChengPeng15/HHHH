package Java集合;

import java.util.HashSet;
import java.util.Set;

public class SetDemoHashSet {

	public static void main(String[] args) {
		Set<String> s = null;
		s = new HashSet<String>();//无序
		s.add("M");
		s.add("B");
		s.add("D");
		s.add("C");
		s.add(null);
		s.add("E");
		s.add("F");
		System.out.println(s);
	}

}
