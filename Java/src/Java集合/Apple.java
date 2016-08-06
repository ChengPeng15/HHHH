package Java集合;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Apple {

	private String color;
	private double weight;
	
	

	public Apple(String color, double weight) {
		this.color = color;
		this.weight = weight;
	}



	public static void main(String[] args) {
		Apple apple = new Apple("red",5.997);
		Apple apple1 = new Apple("green",5.85);
		Apple apple3 = new Apple("yellow",6.33);
		Apple apple4 = new Apple("blue",7.96);
		List<Apple> list = new ArrayList<Apple>();
		list.add(apple);
		list.add(apple1);
		
		
		List<Apple> list1 = new ArrayList<Apple>();
		list1.add(apple3);
		list1.add(apple4);
		Map<List<Apple>,String> map = new HashMap<List<Apple>,String>();
		map.put(list, "0");
		map.put(list1, "1");
		System.out.println(apple);
		System.out.println(list);
		System.out.println(map);


	}
	
	

	@Override
	public String toString() {
		
		return "一个苹果，颜色是："+color+"，重量是："+weight;
	}

}
