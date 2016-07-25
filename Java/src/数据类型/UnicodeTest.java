package 数据类型;
/*
 * 编写一个java 程序，打印出unicode码从0到127的所有字符
 */
public class UnicodeTest {
	public static void main(String[] args) {
		for(int i = 0;i<128;i++){
				System.out.println((char)i+":"+i);
			}
		//打印A－Z对应的unicode码
		for (char i='A';i<='Z';i++)
		System.out.println((int)i);//int i=(int) 'A'//the unicode of character A is assigned to i
		
		
	}
}
