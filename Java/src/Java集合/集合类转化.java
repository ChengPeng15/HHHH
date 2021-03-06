package Java集合;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class 集合类转化 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		testList2Array();
//        testArray2List();
//        testSet2List();
//		testList2Set();
//		testSet2Array();
//		testArray2Set();
//		testMap2Set();
		testMap2List();
	}

	private static void testMap2List() {
		
		Map<Map<String,String>, Map<String,String>> map = new HashMap<Map<String,String>, Map<String,String>>();  
		Map<String,String> map1= new HashMap<String,String>();
		map1.put("A", "ABC");  
        map1.put("K", "KK");  
        map1.put("L", "LV");  
        
    	Map<String,String> map2= new HashMap<String,String>();
		map2.put("A1", "ABC1");  
        map2.put("K1", "KK1");  
        map2.put("L1", "LV1");  
        map.put(map1,map2);
        
//		 将Map Key 转化为List    
        List<Map<String,String>> mapKeyList = new ArrayList<Map<String,String>>(map.keySet());  
        System.out.println("mapKeyList:"+mapKeyList);
        
        // 将Map Key 转化为List    
        List<Map<String,String>> mapValuesList = new ArrayList<Map<String,String>>(map.values());  
        System.out.println("mapValuesList:"+mapValuesList);
        
	}

	private static void testMap2Set() {
		
        Map<String, String> map = new HashMap<String, String>();  
        map.put("A", "ABC");  
        map.put("K", "KK");  
        map.put("L", "LV");  
        
        // 将Map 的键转化为Set    
        Set<String> mapKeySet = map.keySet();  
        System.out.println("mapKeySet:"+mapKeySet);
        
        // 将Map 的值转化为Set    
        Set<String> mapValuesSet = new HashSet<String>(map.values());  
        System.out.println("mapValuesSet:"+mapValuesSet);
	}

	private static void testArray2Set() {
		
        String[] arr = {"AA","BB","DD","CC","BB"};  
        
        //数组-->Set  
        Set<String> set = new HashSet<String>(Arrays.asList(arr));  
//        List<String> list2 = Arrays.asList("AAA","BBB");  
        set.add("EEE");
        System.out.println("array转为set可以增减"+set);  
	}

	private static void testSet2Array() {
		Set<String> set = new HashSet<String>();
		set.add("AA");
		set.add("BB");
		set.add("CC");
		Object[] objects = set.toArray();//返回Object数组  
        System.out.println("set objects:"+Arrays.toString(objects));
		String[] arr = new String[set.size()];  
		//Set-->数组  
		set.toArray(arr); 
        System.out.println(Arrays.toString(arr));  
	}

	private static void testList2Set() {
		  
		List<String> list = new ArrayList<String>();
		list.add("ABC");
		list.add("EFG");
		list.add("LMN");
		list.add("LMN");
		
		//List-->Set
        Set<String> listSet = new HashSet<String>(list);
        System.out.println(listSet);
	}

	private static void testSet2List() {
		 
		Set<String> set = new HashSet<String>();
		set.add("AA");
		set.add("BB");
		set.add("CC");
		
		//Set --> List
        List<String> setList = new ArrayList<String>(set);
        System.out.println(setList);  
	}

	private static void testList2Array() {
		//List-->数组  
        List<String> list = new ArrayList<String>();  
        list.add("AA");  
        list.add("BB");  
        list.add("CC");  
        Object[] objects = list.toArray();//返回Object数组  
        System.out.println("objects:"+Arrays.toString(objects));  
        
        String[] arr = new String[list.size()];  
        list.toArray(arr);//将转化后的数组放入已经创建好的对象中  
        System.out.println("strings1:"+Arrays.toString(arr));  
	}
	
	private static void testArray2List() {
		//数组-->List  
        String[] ss = {"JJ","KK"};  
        List<String> list1 = Arrays.asList(ss);  
        List<String> list2 = Arrays.asList("AAA","BBB");  
//        list1.add("ttttttt");
        System.out.println("?"+list1);  
        System.out.println(list2);  
     
        //不过用Arrays.asList()方法返回的list不能add对象  因为这个方法的实现使用参数引用的数组的大小来new的一个ArrayList
	}

}
