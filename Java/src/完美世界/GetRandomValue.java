package 完美世界;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public class GetRandomValue{

	public static void main(String[] args) {
		double d = new Random(1).nextDouble();
		String maxKey = "0";
		Double maxValue = 0.00;
		//System.out.println(d);
		Map<String,Double> map = new HashMap<String,Double>();
		map.put("1", 0.5);
		map.put("2", 0.3);
		map.put("3", 0.1);
		map.put("4", 0.95);
		map.put("5", 0.05);
		Set<Entry<String,Double>> m = map.entrySet();
		for(Entry<String,Double> k:m)
		{
			if((d-k.getValue() < 0) && (maxValue - k.getValue() < 0))
			{
				maxKey = k.getKey();
				maxValue = k.getValue();
			}
		}
		System.out.println(maxKey);
//		map.keySet();
//		map.values();
		
	}
}
