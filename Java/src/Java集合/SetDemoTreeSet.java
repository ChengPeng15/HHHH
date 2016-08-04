package Java集合;

import java.util.Set;
import java.util.TreeSet;

public class SetDemoTreeSet {

	public static void main(String[] args) {
		Set<String> s = null;
		s = new TreeSet<String>();//支持用户自定义排序
		s.add("A");
		s.add("B");
		s.add("C");
		s.add("D");
		s.add("E");
		s.add("F");
		s.remove("F");
		System.out.println(s);
	}

}
