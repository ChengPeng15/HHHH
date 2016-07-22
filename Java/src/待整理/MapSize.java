package 待整理;

import java.util.HashMap;
//map不允许重复
public class MapSize {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(null,null);
		map.put("name1",2);
		map.put(null,null);
		System.out.println(map.size());
	}
}
