package 剑指offer;

import java.util.ArrayList;
import java.util.List;

public class ListMerge {
	/**
	 * 两个已顺序排序数组的合并
	 * 
	 * @param aList
	 * @param bList
	 * @return
	 */
	public static List<Integer> mergeTwoSortList(List<Integer> aList, List<Integer> bList) {
		int aLength = aList.size(), bLength = bList.size();
		List<Integer> mergeList = new ArrayList<Integer>();
		int i = 0, j = 0;
		while (aLength > i && bLength > j) {
			if (aList.get(i) > bList.get(j)) {
				mergeList.add(i + j, bList.get(j));
				j++;
			} else {
				mergeList.add(i + j, aList.get(i));
				i++;
			}
		}
		// blist元素已排好序， alist还有剩余元素
		while (aLength > i) {
			mergeList.add(i + j, aList.get(i));
			i++;
		}
		// alist元素已排好序， blist还有剩余元素
		while (bLength > j) {
			mergeList.add(i + j, bList.get(j));
			j++;
		}
		return mergeList;

	}

	public static void main(String[] args) {
		List<Integer> aList = new ArrayList<Integer>();
		;
		aList.add(3);
		aList.add(6);
		aList.add(7);
		aList.add(10);
		aList.add(13);
		List<Integer> bList = new ArrayList<Integer>();
		bList.add(1);
		bList.add(2);
		bList.add(5);
		bList.add(12);
		bList.add(15);
		bList.add(20);
		bList.add(21);
		List<Integer> mergeList = mergeTwoSortList(aList, bList);

		System.err.println(mergeList.toString());
	}
}
