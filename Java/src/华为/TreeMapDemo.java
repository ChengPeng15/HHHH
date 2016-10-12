package 华为;

import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 * 
 */
public class TreeMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String line = in.nextLine().trim();
			String[] nums = line.split(",");
			Map<String,Integer> map = new TreeMap<String,Integer>(new Comparator<String>() {
				
				@Override
				public int compare(String o1, String o2) {
					if(Integer.valueOf(o1)>Integer.valueOf(o2)){
						return -1;
					}else if(Integer.valueOf(o1)<Integer.valueOf(o2)){
						return 1;
					}else{
						return 0;
					}
				}
			});
			for(int i = 0;i<nums.length;i++){
				if(!map.containsKey(nums[i])){
					map.put(nums[i], 0);
				}
			}
			Set<String> set = map.keySet();
			if(set.size()==1){
				for(String s:set){
					System.out.println(s+" "+s);
				}
			}else{
				int count = 0;
				for(String s:set){
					count++;
					if(count<3){
						if(count==1){
							System.out.print(s);
						}else{
							System.out.println(" "+s);
						}
					}
				}
			}
		}
	}

}