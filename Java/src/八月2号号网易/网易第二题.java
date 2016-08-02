package 八月2号号网易;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
//urstestaaa8@163.com|1|13800138000|1
//urstestaaa2@163.com|||1
//urstestlinyuchen16@163.com|0|13800138000|2
public class 网易第二题 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       Map<Integer, Integer> map = new TreeMap<Integer, Integer>();  
        while (in.hasNextLine()) {
            String str=in.nextLine();
            String [] strArr=str.split("\\|");
            int provId=Integer.parseInt(strArr[3]);
            if(map.containsKey(provId))
            {
                map.put(provId,map.get(provId)+1);
            }
            else
            {
                map.put(provId,1);
            }
        }
         //这里将map.entrySet()转换成list
        List<Map.Entry<Integer,Integer>> list = new ArrayList<Map.Entry<Integer,Integer>>(map.entrySet());
        //然后通过比较器来实现排序
        Collections.sort(list,new Comparator<Map.Entry<Integer,Integer>>() {
            //升序排序
            public int compare(Entry<Integer, Integer> o1,
                    Entry<Integer, Integer> o2) {
//                return o1.getValue()-o2.getValue();
            	 return o1.getValue()-o2.getValue()>0?-1:1;

            }
            
        });
        
        for(Map.Entry<Integer,Integer> entry:list){ 
               System.out.println(entry.getKey()); 
          } 

        in.close();
    } 
}

