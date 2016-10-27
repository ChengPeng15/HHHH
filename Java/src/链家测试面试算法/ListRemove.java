package 链家测试面试算法;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListRemove {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(5);
		System.out.println(list);
		System.out.println(list.size());
		remove1(list,2);
//		remove2(list,2);
//		remove3(list,2);
//		remove4(list,2);
		System.out.println(list);
		System.out.println(list.size());
	}

	private static void remove4(List<Integer> list, int i) {
		for (int j = list.size()-1; j >-1; j--) {
			if(list.get(j)==i) {
				list.remove(j);
				j--;
			}
		}
	}

	private static void remove3(List<Integer> list, int i) {
		for (int j = 0; j<list.size(); j++) {
			if(list.get(j)==i) {
				list.remove(j);
			}
		}
	}

	private static void remove2(List<Integer> list, int i) {
		List<Integer> delList = new ArrayList<>();
		for (int j = 0; j < list.size(); j++) {
			if(list.get(j)==i){
				delList.add(i);
			}
		}
		list.removeAll(delList);
	}

	/*
	 * 要用迭代器的remove方法，不能用list的remove方法要不会有问题
	 * java.util.ConcurrentModificationException
	 */
	private static void remove1(List<Integer> list, int i) {
		Iterator<Integer>it= list.iterator();
		while(it.hasNext()){
			Integer i1 = it.next();
			if(i1==i){
				it.remove();
			}
		}
	}

}
