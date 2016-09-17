package 算法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SortString {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			while (n-- > 0) {
				list.add(sc.nextInt());
			}
			sort(list);
		}
		sc.close();

	}

	private static void sort(List<Integer> list) {
		List<Integer>odd = new ArrayList<Integer>();
		for(int i=0;i<list.size();i=i+2){
			odd.add(list.get(i));
			Collections.sort(odd);
		}
		
		List<Integer>even = new ArrayList<Integer>();
		for(int i=1;i<list.size();i=i+2){
			even.add(list.get(i));
			Collections.sort(even,  new intDecCompatator<Integer>());
	    }
		
		for(int i=0;i<odd.size();i++){
			
			if(i>even.size()){
				System.out.print(odd.get(i));
			}else{
				System.out.print(odd.get(i)+" ");
			}
			for(int j=i;j<=i&&j<even.size();j++){
				if(j==odd.size()){
					System.out.print(even.get(j));
				}else{
					System.out.print(even.get(j)+" ");
					}
				list.clear();
			}
		}
	}
		
}

class intDecCompatator<T> implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
//		return o1.compareTo(o2);
		return o2.compareTo(o1);
	}

}

