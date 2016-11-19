package 链家测试面试算法;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNoRepeatChar {

	public static void main(String[] args) {
		System.out.println();
		Scanner in = new Scanner(System.in);
		while(in.hasNextLine()){
			String str = in.nextLine();
			System.out.println(getFirst(str));
		}
		in.close();
	}

	private static Character getFirst(String str) {
		Map<Character, Integer>map = new LinkedHashMap<>();
		for (int i = 0; i < str.length(); i++) {
			Character key = str.charAt(i);
			if(!map.containsKey(key)){
				map.put(key, 1);
			}else{
				map.put(key, map.get(key)+1);
			}
		}
		
		Iterator<Character> it= map.keySet().iterator();
		while(it.hasNext()){
			Character key = it.next();
			if(map.get(key)==1){
				return key;
			}
		}
		return null;
	}

}
