package Java集合;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Set定制排序2 {

	public static void main(String[] args) {
		Set<Person> set = new TreeSet<Person>(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.score - o2.score;
			}
		});
		
		Person p1 =  new Person(10);
		Person p2 =  new Person(20);
		Person p3 =  new Person(80);
		Person p4 =  new Person(40);
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		
		for(Iterator<Person> iterator = set.iterator();iterator.hasNext();){
			System.out.print(iterator.next().score+" ");
		}
	}
}

