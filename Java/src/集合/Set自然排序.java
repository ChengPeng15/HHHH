package 集合;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * comparable 和comparator接口一起用  ，comparator接口有作用
 * 
 * 可参考TreeMap的源码
 * 
 * public V put(K key, V value) {
        Entry<K,V> t = root;
        if (t == null) {
            compare(key, key); // type (and possibly null) check

            root = new Entry<>(key, value, null);
            size = 1;
            modCount++;
            return null;
        }
        int cmp;
        Entry<K,V> parent;
        // split comparator and comparable paths
        Comparator<? super K> cpr = comparator;
        if (cpr != null) {
            do {
                parent = t;
                cmp = cpr.compare(key, t.key);
                if (cmp < 0)
                    t = t.left;
                else if (cmp > 0)
                    t = t.right;
                else
                    return t.setValue(value);
            } while (t != null);
        }
        else {
            if (key == null)
                throw new NullPointerException();
            @SuppressWarnings("unchecked")
                Comparable<? super K> k = (Comparable<? super K>) key;
            do {
                parent = t;
                cmp = k.compareTo(t.key);
                if (cmp < 0)
                    t = t.left;
                else if (cmp > 0)
                    t = t.right;
                else
                    return t.setValue(value);
            } while (t != null);
        }
        Entry<K,V> e = new Entry<>(key, value, parent);
        if (cmp < 0)
            parent.left = e;
        else
            parent.right = e;
        fixAfterInsertion(e);
        size++;
        modCount++;
        return null;
    }

 */
public class Set自然排序 {

//	public static void main(String[] args) {
//		Set<Student> set = new TreeSet<Student>(new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				return o2.score-o1.score;
//			}
//			
//		});
//		Student p1 =  new Student(10);
//		Student p2 =  new Student(20);
//		Student p3 =  new Student(80);
//		Student p4 =  new Student(40);
//		set.add(p1);
//		set.add(p2);
//		set.add(p3);
//		set.add(p4);
//		
//		for(Iterator<Student> iterator = set.iterator();iterator.hasNext();){
//			System.out.print(iterator.next().score+" ");
//		}
//	}

	
	
	public static void main(String[] args) {
		Set<Student> set = new TreeSet<Student>();
		Student p1 =  new Student(70);
		Student p2 =  new Student(20);
		Student p3 =  new Student(80);
		Student p4 =  new Student(40);
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		
		for(Iterator<Student> iterator = set.iterator();iterator.hasNext();){
			System.out.print(iterator.next().score+" ");
		}
	}

}

class Student implements Comparable<Student>{
	int score;
	
	public Student(int score){
		this.score = score;
	}
	
	public String toString(){
		return String.valueOf(this.score);
	}

	@Override
	public int compareTo(Student o) {
		return o.score-this.score;
	}
}

