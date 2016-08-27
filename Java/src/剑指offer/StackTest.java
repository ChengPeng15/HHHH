package 剑指offer;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		// creating stack
		Stack<String> st = new Stack<String>();
		System.out.println("为空："+st.size());
		// populating stack
		st.push("Java");
		System.out.println(st.size());
		st.push("Source");
		System.out.println(st.size());
		st.push("code");
		System.out.println(st.size());
		System.out.println("插入三个后"+st.size());
		st.pop();
		System.out.println("第一次删除"+st.size());
		st.pop();
		System.out.println("第2次删除"+st.size());
		st.pop();
		System.out.println("第3次删除"+st.size());
//		st.pop();
//		System.out.println("第4次删除"+st.size());

		

		// searching 'code' element
		System.out.println("Searching 'code' in stack: " + st.search("Java"));
	}

}
