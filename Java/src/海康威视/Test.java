package 海康威视;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Test{
//static int age;
//public static void main(String[] args){
//age++;
//System.out.println("The age is "+age);
//}
	
//	public static void main(String... args){
//		String s1 = "abcde";
//		String s2 = "abcde";
//		PrintStream out=System.out;
//		s1.toUpperCase();
//		if(s1==s2){
//		out.println("YES");
//		}else{
//		out.println("NO");
//		}
//		}
	
	//6
	public static void main(String[] args){
		List<A> list=new ArrayList<A>();
		list.add(new A("a"));
		System.out.print(list.size());
		list.remove(new A("a"));
		System.out.print(list.size());
		}
		
}

class   A{
	private String name=null;
	public A(String name){
	this.name=name;
	}
//	public String toString(){return this.name;}
//	public boolean equals(Object o){return this. hashCode ()==o. hashCode ();}
//	public int hashCode (){return this.name. hashCode ();}
}