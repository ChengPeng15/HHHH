package 八月2号号网易;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {

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