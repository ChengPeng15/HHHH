
import java.util.ArrayList;
import java.util.List;

public class ListDemo01 {

	public static void main(String[] args) {
		List lists =null;
		lists = new ArrayList();
		
		lists.add("B");
		lists.add("A");
		lists.add("A");
		lists.add(null);
		lists.add("c");
		System.out.println(lists);
		for(int i =0;i<lists.size();i++){
			System.out.println(lists.get(i));
		}
		lists.remove("A");
		System.out.println("After Deleting");
		for(int i =0;i<lists.size();i++){
			System.out.println(lists.get(i));
		}
		System.out.println("collection is null?："+lists.isEmpty());
		System.out.println("B is exist?"+lists.indexOf("B"));
		System.out.println("Ais exist?"+lists.indexOf("A"));
	}

}