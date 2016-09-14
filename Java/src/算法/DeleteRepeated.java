package 算法;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

 
public class DeleteRepeated {
    private String str;
//    private TreeSet<String> noReapted;//带有String类型的TreeSet泛型
    
  private LinkedHashSet<String> noReapted;//带有String类型的TreeSet泛型

         
    public DeleteRepeated() {
        Scanner in = new Scanner(System.in);
        System.out.println ("输入一个字符串:");
        str = in.nextLine();
//        noReapted = new TreeSet<String>();
        noReapted = new LinkedHashSet<String>();
        in.close();
    }
     
    //清楚重复的数据
    public void removeRepeated(){
        for (int i = 0; i < str.length(); i++){
            noReapted.add(""+str.charAt(i));
            //str.charAt(i)返回的是char型  所以先加一个""空格 , 转换成String型
            //TreeSet泛型能保证重复的不加入 , 而且有序
        }
         
        str = "";
         /*
          * 用for循环遍历set
          */
        
        /*
         * 使用for循环遍历的有点
         */
        
        /*
         *   
			优点还体现在泛型 假如 set中存放的是Object  
			  
			Set<Object> set = new HashSet<Object>();  
			for循环遍历：  
			for (Object obj: set) {  
			      if(obj instanceof Integer){  
			                int aa= (Integer)obj;  
			             }else if(obj instanceof String){  
			               String aa = (String)obj  
			             }  
			              ........  
			}  
         * 
         * 
         */
        for(String index:noReapted){
            str += index;
        }
        
        /*
         * 用迭代器遍历set
         */
         Iterator<String> it = noReapted.iterator();
         while(it.hasNext()){
        	 System.out.println(it.next());
         }
        //输出
        System.out.println (str);
    }
     
    public static void main(String[] args) {
        DeleteRepeated dr = new DeleteRepeated();
         
        dr.removeRepeated();
    }
}