package Java迭代器;

//使用Iterator的简单例子

import java.util.*;

public class TestIterator {


   public static void main(String[] args) {

        
	   Collection c = new ArrayList();
      List list=new ArrayList();

      Map map=new HashMap();

      for(int i=0;i<10;i++){

          list.add(new String("list"+i) );

          map.put(i, new String("map"+i));

      }

      Iterator iterList= list.iterator();//List接口实现了Iterable接口

        while(iterList.hasNext()){

          String strList=(String)iterList.next();

          System.out.println(strList.toString());

      }

      Iterator iterMap=map.entrySet().iterator();

      while(iterMap.hasNext()){

          Map.Entry  strMap=(Map.Entry)iterMap.next();

          System.out.println(strMap.getValue());

 

      }

   }

}

