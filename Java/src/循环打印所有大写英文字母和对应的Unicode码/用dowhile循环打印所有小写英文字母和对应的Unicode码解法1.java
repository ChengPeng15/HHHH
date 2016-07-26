package 循环打印所有大写英文字母和对应的Unicode码;

public class 用dowhile循环打印所有小写英文字母和对应的Unicode码解法1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=97;
		do{
			System.out.println((char)i+":"+i);
			i++;
		}while(i<=97+25);
	}

}
