package Java集合;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer,String>();
		map.put(1, "chengpeng");
		map.put(1, "chengpeng2");
		map.put(3, "chengpeng");
		map.put(4, "chengpeng");
		map.put(5, "chengpeng");
		map.put(null,null);
		map.put(null,"1");
		map.put(null,"11");//key重复保存最新的
		System.out.println(map.size());
		System.out.println(map);
		String str = map.get("key1");
		System.out.println(str);
		System.out.println(map);
		
		
//		if(map.containsKey("key1")){
//			System.out.println("key存在");
//		}else{
//			System.out.println("不存在");
//		}
//		
//		if(map.containsKey("key1")){
//			System.out.println("1-－－－－key存在");
//		}else{
//			System.out.println("1-－－－－－不存在");
//		}
//		
//		if(map.containsKey("key21")){
//			System.out.println("2-－－－－key存在");
//		}else{
//			System.out.println("2-－－－不存在");
//		}
//		
//		if(map.containsKey(null)){
//			System.out.println("null-－－－－key存在");
//		}else{
//			System.out.println("null-－－－不存在");
//		}
//		
//		if(map.containsValue(null)){
//			System.out.println("null");
//		}
//		
		
			Set <Map.Entry<Integer, String>> s  = map.entrySet();
			Iterator<Map.Entry<Integer, String>> iSet =  s.iterator();
			while(iSet.hasNext()){
				Map.Entry<Integer, String> set = (Map.Entry<Integer, String>)iSet.next();
				System.out.println(set.getKey()+":"+set.getValue());
//				System.out.println(set.getKey().getClass();//null的可以会报错
			}
		
		Set<Integer> set = map.keySet();
		Iterator<Integer> its = set.iterator();
		while(its.hasNext()){
			System.out.println(its.next());
		}
		
		Set<Map.Entry<Integer, String>> sets = map.entrySet();
		Iterator<Map.Entry<Integer, String>> itset = sets.iterator();
		while(itset.hasNext()){
			Map.Entry<Integer, String> m =itset.next();
			System.out.println(m.getKey()+":"+m.getValue());
		}
	}
}
