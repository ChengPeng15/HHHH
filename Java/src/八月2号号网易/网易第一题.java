/*编程题|30分] 求子数组
时间限制：1秒
空间限制：32768K
题目描述
给出一个数组（数组中的元素可能重复），返回所有可能的子数组。输出请按照长度顺序升序排列，如果长度相等的话，请按照字典序升序排列。
输入描述:
以,隔开的一串字符串


输出描述:
数组集合，每行代表一个数组，数组按照如下格式打印:[数组元素1, 数组元素2, .....]注意元素之间的空格和逗号，注意左右之间的左右括号

输入例子:
1,2,2

输出例子:
[]
[1]
[2]
[1, 2]
[2, 2]
[1, 2, 2]

*/
package 八月2号号网易;

import java.util.*;

public class 网易第一题 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       // while (in.hasNextLine()) {
        
        	String str=in.nextLine();
        	String [] strArr=str.split(",");
        	int[] Array =new int[strArr.length];
        	for (int i = 0; i < strArr.length; i++) {
        		Array[i]=Integer.parseInt(strArr[i]);
			}
            System.out.println(process(strArr));

        //}
        in.close();
    }
     static ArrayList<ArrayList<String>> process(String[] num) {  
        int len = num.length;  
        Set<ArrayList<String>> set = new HashSet<ArrayList<String>>();  
        Arrays.sort(num);  
          
        // 利用2进制对应的bit来求所有subset，2进制中，0代表不选，1代表选择  
        for(int i=0; i<Math.pow(2,len); i++){  
            ArrayList<String> list = new ArrayList<String>();  
            int tmp = i;  
            // 对长为len的数，循环检查最右位是否为一  
            for(int j=0; j<len; j++){  
                int bit = tmp & 1;  
                tmp >>= 1;  
                if(bit == 1){  
                    list.add(num[j]);  
                }  
            }

            set.add(list);  
        }

		return  new ArrayList<ArrayList<String>>(set);  

    }  
     
     



	public ArrayList<Integer> subarraySum(int[] nums) {
	     ArrayList<Integer> res = new ArrayList<Integer>();
	     if (nums==null || nums.length==0) return res;
	     HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	     map.put(0, -1);
	    int sum = 0;
	     for (int i=0; i<nums.length; i++) {
	          sum += nums[i];
	          if (!map.containsKey(sum)) {
	              map.put(sum, i);
	          }
	          else {
	              res.add(map.get(sum)+1);
	              res.add(i);
	             return res;
	          }
	      }
	     return res;
	 }
}




