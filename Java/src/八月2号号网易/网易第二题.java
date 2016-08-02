/*
[编程题|30分] 账号统计、排序输出
时间限制：1秒
空间限制：32768K
题目描述
一个文本文件，共4列，以“|”分割。第一列到第四列，分别表示“帐号|性别|联系方式|注册省份”。其中第一列帐号和第四列注册省份为非空字段，其他列均可能为空。编写程序实现从该文件中读出内容，统计在每个省份注册帐号的数量，将统计结果按降序排列输出结果（只输出省份ID即可）。注意：省份 id 都是从 1开始，且编号从1开始连续到某个正整数，保证其中每个id都出现过至少一次。
输入描述:
每组输入数据有多行,每一行包含一条上述结构数据


输出描述:
按降序排列输出省份ID，每行一个

输入例子:
urstestaaa8@163.com|1|13800138000|1
urstestaaa2@163.com|||1
urstestlinyuchen16@163.com|0|13800138000|2

输出例子:
1
2
*/

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

