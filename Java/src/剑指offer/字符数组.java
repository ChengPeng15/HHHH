package 剑指offer;

/*
 * String strStringType="my string"; //创建一个字符串变量strStringType
char[] chrCharArray; //创建一个字符数组chrCharArray

chrCharArray = strStringType.toCharArray(); //将字符串变量转换为字符数组
strStringType= String.valueOf(chrCharArray ); //将字符数组转换为字符串

      这里，关键是两个方法。
      （1）String类的toCharArray()方法，将字符串转换为字符数组
      （2）String类的valueOf()方法，将char类型的数组转换为字符串

欢迎访问littlespirit_sn的博客http://blog.sina.com.cn/bobshen
 */
public class 字符数组 {

	public static void main(String[] args) {
		String str1 = "hello world";
		char [] chars = str1.toCharArray();
		System.out.println(chars.length);
		String str2 = String.valueOf(chars);
		System.out.println(str2);
	}

}
