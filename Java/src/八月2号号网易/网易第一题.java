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




