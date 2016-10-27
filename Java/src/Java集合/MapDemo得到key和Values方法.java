package Java集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class MapDemo得到key和Values方法 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String,String>();
		map.put("key1", "chengpeng");
		map.put("key1", "chengp2eng");
		map.put("key3", "chengpeng");
		map.put("key4", "chengpeng");
		map.put("key5", "chengpeng");
		map.put(null,null);
//		map.put(null,"1");
//		map.put(null,"11");//key重复保存最新的
		System.out.println(map);
		/*
		 * 得到所有的键
		 */
//		Set<String>s=map.keySet();//返回的是个set
//		Iterator<String> iterMap =  s.iterator();
//		while (iterMap.hasNext()) {
//			System.out.println(iterMap.next());
//		}
		
		
		/*
		 * 得到所有的值
		 */
		
		
//		Collection<String>s=map.values();//返回一个Collection
//		Iterator<String> iterMap =  s.iterator();
//		while (iterMap.hasNext()) {
//			System.out.println(iterMap.next());
//		}
		
		Set<Map.Entry<String, String>> e =map.entrySet();
		System.out.println(e);
		Iterator<Map.Entry<String, String>> s =  e.iterator();
		while(s.hasNext()){
			Map.Entry<String, String> tem = s.next();
			System.out.println(tem.getKey()+":"+tem.getValue());
		}
		
		
		List<Map.Entry<String, String>> list = new ArrayList<Map.Entry<String, String>>(e);
		System.out.println("把set转为list");
		System.out.println(list);
		
		
		Map<Integer,Integer> l = new HashMap<Integer,Integer>();
		l.put(1,2);
		Map<Integer,Integer> mm = new HashMap<Integer,Integer>();
		mm.put(3,4);
		mm.put(5,6);
		mm.putAll(l);
		System.out.println(mm);
		List<Map.Entry<Integer,Integer>> ll = new ArrayList<Map.Entry<Integer,Integer>>(mm.entrySet());
		System.out.println(ll);
		
		
	}
}
