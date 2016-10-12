package 华为;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class 字符串去重 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String str = sc.next();
			RemoveRepeat(str);
		}
		sc.close();
		
	}

	private static void RemoveRepeat(String str) {
		if(str==null) return;
		char[] array=str.toCharArray();
		
		TreeMap<String,Integer> map = new TreeMap<String,Integer>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return o2.compareTo(o1);
			}
		});
				
		
		for (int i = 0; i < array.length; i++) {
			String key =String.valueOf(array[i]);
			if(i==0){ 
				map.put(key,1);
			continue;
			}else{
				if(map.containsKey(key)){
					Integer value = map.get(String.valueOf(array[i]))+1;
					map.put(key, value);
				}else{
					Integer value = 1;
					map.put(key, value);
				}
			}
		}
//		Set<Map.Entry<String,Integer>> set = map.entrySet();
//		Iterator<Map.Entry<String,Integer>>  it = set.iterator();
		Iterator<Map.Entry<String,Integer>>  it = map.entrySet().iterator();
		String s="";
		while(it.hasNext()){
			s+=it.next().getKey();
		}
		System.out.println(s);
		
	}

}
