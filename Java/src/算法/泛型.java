package 算法;

import java.util.ArrayList;
import java.util.List;

public class 泛型 {
	public static void main(String[] args) {
		// Object s = new Object();
		// System.out.println(s.getClass());
		// System.out.println(s);
		// s="5555";
		// System.out.println(s.getClass());
		// System.out.println(s);
		//
		// s=5555;
		// System.out.println(s.getClass());
		// System.out.println(s);
		//
		// System.out.println("ssss".getClass());

//		List<? super Fruit> flist = new ArrayList<Apple>();
		List<? super Fruit> flist = new ArrayList<>();
		 flist.add(new Fruit());
		 flist.add(new Apple());
		 flist.add(new RedApple());
		 flist.add(new Fruit());

		 List<? super Fruit> flist1 = new ArrayList<food>();
//		 flist1.add(new food());
		 flist1.add(new Apple());
		 
//		 Fruit  f = new Apple();
		 
		 
		 
		 
		 List<? extends Fruit> list1 = new ArrayList<Fruit>();  
	      List<? extends Fruit> list2 = new ArrayList<Apple>();  
	      List<? super Apple> list3 = new ArrayList<Apple>();  
	      List<? super Apple> list4 = new ArrayList<Fruit>(); 
	}

//	public <? extends Fruit> void test(? extends Fruit aa){
//		 
//	 }
}

class food {

}

class Fruit extends food {

}

class Apple extends Fruit {

}

class RedApple extends Apple {

}