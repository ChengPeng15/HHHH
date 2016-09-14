package 五八同城;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;



public class Main {
	List<Integer> getNoRepeat(int[] array,int n)
	{
		List<Integer> list = new ArrayList<Integer>();
		Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
		for(int i = 0;i < array.length;i++)
		{
			map.put(i, array[i]);
		}
		
		for(int i = 0; i < n; i++)
		{
			int x=(int)(Math.random()*array.length);
			list.add((Integer)map.get(x));
		}
		return list;
	}

}
