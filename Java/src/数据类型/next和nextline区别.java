package 数据类型;

import java.util.Scanner;
/*
 * 运行结果：
请输入第一个字符串：home请输入第二个字符串：work输入的字符串是：home work
但如果把程序改一下， s1=sc.next(); s2=sc.nextLine();
运行结果是：
请输入第一个字符串：home请输入第二个字符串：输入的字符串是：home 


3
nextLine（）自动读取了被next（）去掉的Enter作为他的结束符，
所以没办法给s2从键盘输入值。经过验证，其他的next的方法，如double nextDouble() ，
 float nextFloat() ， int nextInt() 等与nextLine（）连用时都存在这个问题，
 解决的办法是：在每一个 next（）、nextDouble() 、 www.gzlij.com（）、nextFloat()、nextInt() 等语句之后加一个nextLine（）语句，将被next（）去掉的Enter结束符过滤掉
import java.util.Scanner;public class NextTest 
 */
public class next和nextline区别 {

	public static void main(String[] args) {
			String s1,s2;  
			Scanner sc=new Scanner(System.in); 
			System.out.print("请输入第一个字符串："); 
			s1=sc.nextLine(); 
			System.out.print("请输入第二个字符串：");  
			s2=sc.next(); 
			System.out.println("输入的字符串是："+s1+"  "+s2);
		
		/*
		
		String s1,s2;  
		Scanner sc=new Scanner(System.in); 
		System.out.print("请输入第一个字符串："); 
		s1=sc.next(); 
//		sc.nextLine();
		System.out.print("请输入第二个字符串：");  
		s2=sc.nextLine(); 
		System.out.println("输入的字符串是："+s1+" : "+s2);
		


*/
	}
}
