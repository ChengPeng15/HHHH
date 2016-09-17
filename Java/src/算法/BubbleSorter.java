package 算法;

import java.util.Comparator;

/**
 * 排序器接口(策略模式: 将算法封装到具有共同接口的独立的类中使得它们可以相互替换)
 * 
 * @author Chengpeng
 *
 */
interface Sorter {

	/**
	 * 排序
	 * 
	 * @param list
	 *            待排序的数组
	 */
	public <T extends Comparable<T>> void sort(T[] list);

	/**
	 * 排序
	 * 
	 * @param list
	 *            待排序的数组
	 * @param comp
	 *            比较两个对象的比较器
	 */
	public <T> void sort(T[] list, Comparator<T> comp);
}

/**
 * 冒泡排序
 * 
 * @author骆昊
 *
 */
public class BubbleSorter implements Sorter {

	@Override
	public <T extends Comparable<T>> void sort(T[] list) {
		boolean swapped = true;
		for (int i = 1, len = list.length; i < len && swapped; ++i) {
			swapped = false;
			for (int j = 0; j < len - i; ++j) {
				if (list[j].compareTo(list[j + 1]) > 0) {
					T temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
					swapped = true;
				}
			}
		}
	}

	@Override
	public <T> void sort(T[] list, Comparator<T> comp) {
		boolean swapped = true;
		for (int i = 1, len = list.length; i < len && swapped; ++i) {
			swapped = false;
			for (int j = 0; j < len - i; ++j) {
				if (comp.compare(list[j], list[j + 1]) > 0) {
					T temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
					swapped = true;
				}
			}
		}
	}

	public static void main(String[] args) {
		Person p1 = new Person(10);
		Person p2 = new Person(20);
		Person p3 = new Person(80);
		Person p4 = new Person(40);
		Person[] list = { p1, p2, p3, p4 };
//		new BubbleSorter().sort(list, new PersonComparator());
		
		//or
		new BubbleSorter().sort(list, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.score - o2.score;
			}

		});
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}

}

class Person {
	int score;

	public Person(int score) {
		this.score = score;
	}

	public String toString() {
		return String.valueOf(this.score);
	}

}

class PersonComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {

		return o2.score - o1.score;
	}

}
