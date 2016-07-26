package 循环打印所有大写英文字母和对应的Unicode码;

public class 用dowhile循环打印所有小写英文字母和对应的Unicode码解法2 {

	public static void main(String[] args) {
		char c = 'a';
		do{
			System.out.println(c+":"+(int)c);
			c++;//java字符变量底层按照int处理
		}while(c<='z');
	}

}
