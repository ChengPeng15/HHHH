package Java集合;

/** 
* @author guwh 
* @version 创建时间：2011-11-3 上午10:49:36 
* 类说明 
*/   
  
import java.util.ArrayList;  
import java.util.Collections;  
import java.util.Comparator;  
import java.util.List;  
  
public class SortTest2 {  
      
      
    public static void main(String[] args) {  
        List<String> lists = new ArrayList<String>();  
//        List<A> list = new ArrayList<A>();  
        List<B1> listB = new ArrayList<B1>();  
        lists.add("5");  
        lists.add("2");  
        lists.add("9");  
        //lists中的对象String 本身含有compareTo方法，所以可以直接调用sort方法，按自然顺序排序，即升序排序  
        Collections.sort(lists);  
          
        B1 ab = new B1();  
        ab.setName("ab");  
        ab.setOrder("1");  
        B1 ba = new B1();  
        ba.setName("ba");  
        ba.setOrder("2");  
        listB.add(ba);  
        listB.add(ab);  
        //根据Collections.sort重载方法来实现  
        Collections.sort(listB,new B1());  
          
        System.out.println(lists);  
        System.out.println(listB);  
          
    }  
  
}  
class B1 implements Comparator<B1>{  
    private String name;  
    private String order;  
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
    public String getOrder() {  
        return order;  
    }  
    public void setOrder(String order) {  
        this.order = order;  
    }  
    @Override  
    public String toString() {  
        return "name is "+name+" order is "+order;  
    }
    @Override  
    public int compare(B1 b1, B1 b2) {  
        return b1.getOrder().compareTo(b2.getOrder());  
    }   
}  
  /*
打印的结果为：  
 [2, 5, 9]  
[name is aa order is 1, name is bb order is 2]  
[name is ab order is 1, name is ba order is 2]  
*/