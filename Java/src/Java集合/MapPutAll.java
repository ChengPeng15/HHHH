package Java集合;
import java.util.HashMap;

public class MapPutAll {

		public static void main(String[] args){
			   //两个map具有不同的key
			   HashMap map1=new HashMap(); 
			   map1.put("1", "A"); 
			   HashMap map2 = new HashMap(); 
			   map2.put("2", "B"); 
			   map2.put("3", "C"); 
			   map1.putAll(map2); 
			   System.out.println(map1);
			   //两个map具有重复的key
			   HashMap map3=new HashMap(); 
			   map3.put("1", "A"); 
			   HashMap map4 = new HashMap(); 
			   map4.put("1", "B"); 
			   map4.put("3", "C"); 
			   map3.putAll(map4); 
			   System.out.println(map3);
			   
			}
}



/* 输出结果：
* {3=C, 2=B, 1=A}
* {3=C, 1=B}
* 结论：putAll可以合并两个MAP，只不过如果有相同的key那么用后面的覆盖前面的
* */