package 海康威视;
//remove会调用equals方法
import java.util.ArrayList;
import java.util.List;

public class ListSize {

	public static void main(String[] args){
		List<B> list=new ArrayList<B>();
		System.out.println(list.size());
		list.remove(new B("B"));
		list.add(new B("B"));
		System.out.println(list.size());
		list.remove(new B("B"));
		System.out.println(list.size());
		}
		
}

class   B{
	private String name=null;
	public B(String name){
	this.name=name;
	}
//	public String toString(){return this.name;}
//	public boolean equals(Object o){return this. hashCode ()==o. hashCode ();}
//	public int hashCode (){return this.name. hashCode ();}
}