package Java集合;

import java.util.*;

public class dd {

        public static void main(String[] args) {
        	List<String> list = new ArrayList<String>();
                list.add("1");
                list.add("2");
                list.add("3");
//                System.out.println(list);
            	List<Object> listObj = new ArrayList<Object>();
            	for (int j = 0; j < list.size(); j++) {
                	listObj.add(list.get(j));
				}
                System.out.println(listObj);
        }

        public static void printList(List<Object> str) {
                Iterator it = str.iterator();
                while(it.hasNext()){
                        System.out.println(it.next());
                }
        }
}
