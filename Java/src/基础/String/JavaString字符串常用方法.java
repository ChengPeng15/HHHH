package 基础.String;

public class JavaString字符串常用方法 {

	public static void main(String[] args) {
		String str = "   jikexueyuan@qq.com  ";//开头三个空格  结尾两个空格
		//1打印字符串长度
		System.out.println("1 打印字符串长度:length()");
		System.out.println(str.length());
		
		//2 字符串转化为CharArray数组 : toCharArray()
		System.out.println("2 字符串转化为CharArray数组 : toCharArray()");
		char [] chArray = str.toCharArray();
		for (int i = 0; i < chArray.length; i++) {
			System.out.print(chArray[i]+" ");
		}
		System.out.println();
		
		//3 从字符串中取出指定位置的字符 :charAt()
		System.out.println("3 从字符串中取出指定位置的字符 :charAt()");
		System.out.println(str.charAt(7));//取出第8个字符
		
		//4 字符串与byte数组的转换 : getBytes
		System.out.println("4 字符串与byte数组的转换 : getBytes");
		byte[] bTArray = str.getBytes();
		for (int i = 0; i < bTArray.length; i++) {
			System.out.print(bTArray[i]+" ");
		}
		System.out.println();
/*
 * 下面这是个构造器  要求串byte数组类型
 *     public String(byte bytes[]) {
        this(bytes, 0, bytes.length);
    }
 */
//		for (int i = 0; i < bTArray.length; i++) {
//			System.out.print(new String(bTArray));
//		}
//		System.out.println();
		
		for (int i = 0; i < bTArray.length; i++) {
			System.out.println(new String(bTArray));
		}
		
		
		
		//5过滤字符串中存在的字符 
        //如果有返回的是当前字符的位置或者字符串，如果没有返回－1
		//位置是第一次出现的位置，如果考虑重复
		System.out.println("5过滤字符串中存在的字符 :indexOf()");
		System.out.println(str.indexOf("@qq"));
		System.out.println(str.indexOf("e"));
		
		
		//6 去掉字符串的前后空格 ：trim()
		System.out.println("6 去掉字符串的前后空格 ：trim()");
		System.out.println(str);
		System.out.println(str.trim());
		System.out.println(str.trim().length());

		//7 从字符串中取出子字符串 ： substring()
		System.out.println("7 从字符串中取出子字符串 ： substring()");
		System.out.println(str.substring(3, 7));//从index＝3开始到（7-1=6）位置
		System.out.println("=====");

		//8 大小写转化
		System.out.println("8 大小写转化");
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());

		//9 判断字符串的开头结尾字符
		System.out.println("9 判断字符串的开头结尾字符");
		System.out.println(str.startsWith("   ji"));
		System.out.println(str.endsWith("m  "));

		// 10 替换String字符串d一个字符 ：replace
		System.out.println("10 替换String字符串d一个字符 ：replace");
		System.out.println(str);
		System.out.println(str.replace('j', 'J'));
		System.out.println(str);
		
		System.out.println(str.replaceAll("j", "JJ"));
		System.out.println(str);

		
	}

}
