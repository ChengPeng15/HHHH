package Java集合;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String,String>();
		map.put("key1", "chengpeng");
		map.put("key1", "chengp2eng");
		map.put("key3", "chengpeng");
		map.put("key4", "chengpeng");
		map.put("key5", "chengpeng");
		map.put(null,null);
		map.put(null,"1");
		map.put(null,"11");//key重复保存最新的

		System.out.println(map.size());
		System.out.println(map);
		String str = map.get("key1");
		System.out.println(str);
		System.out.println(map);
		
		
		if(map.containsKey("key1")){
			System.out.println("key存在");
		}else{
			System.out.println("不存在");
		}
		
		
		if(map.containsKey("key1")){
			System.out.println("1-－－－－key存在");
		}else{
			System.out.println("1-－－－－－不存在");
		}
		
		
		if(map.containsKey("key21")){
			System.out.println("2-－－－－key存在");
		}else{
			System.out.println("2-－－－不存在");
		}
		
		if(map.containsKey(null)){
			System.out.println("null-－－－－key存在");
		}else{
			System.out.println("null-－－－不存在");
		}
		
		
		if(map.containsValue(null)){
			System.out.println("null");
		}
	}
}
