package 链家;

import java.util.HashSet;
import java.util.Set;

public class IsRepeat {

	//用于存放数组中出现相同的元素
	Set<String> set= new HashSet<String>();
	//写一个方法把数组和set作为参数传过去
	public boolean idRepeat(String[] strs,Set<String> set){
	    boolean result = false;
	   for(int i=0;i<strs.length;i++){
		   set.add(strs[i]);
	   }
	   if(set.size()==strs.length) result=true;
	return result;
	}
}
