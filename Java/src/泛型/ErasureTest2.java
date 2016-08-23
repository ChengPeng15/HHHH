package 泛型;


import java.util.*;
/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */


class Food{}
 class Fruit extends Food{}
 class Apple extends Fruit{}
 class RedApple extends Apple{}
public class ErasureTest2
{
//	public static void main(String[] args)
//	{
//		List<Integer> li = new ArrayList<>();
//		li.add(6);
//		li.add(9);
//		List list = li;
//		System.out.println(list.get(0).getClass());
//		// 下面代码引起“未经检查的转换”的警告，编译、运行时完全正常
//		List<String> ls = list;     // ①
////		// 但只要访问ls里的元素，如下面代码将引起运行时异常。
//		System.out.println(ls.get(0));
////		list.add("dd");
////		System.out.println(list);
////		System.out.println(list.get(2).getClass());
//	}
	
	
	public static void main(String[] args)
	{
		List li = new ArrayList<>();
//		li.add(6);
//		li.add(9);
//		List<String> list = li;
		List  <String> lis = new ArrayList<String>();
		System.out.println(lis.getClass());
		
		
		Number num = new Integer(1);  
//		ArrayList<Number> list = new ArrayList<Integer>(); //type mismatch

		List<? extends Number> list = new ArrayList<Number>();
//		Integer n = (Integer)list.get(0);
//		list.add(new Integer(1)); //error
//		list.add(new Float(1.2f));  //error
		
		
//		List<? super Number> list = new ArrayList<Number>();
//		Number n = list.get(0);//error
//		list.add(new Integer(1)); 
//		list.add(new Float(1.2f)); 
	}
}
