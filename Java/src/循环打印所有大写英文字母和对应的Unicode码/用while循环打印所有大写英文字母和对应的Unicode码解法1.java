package 循环打印所有大写英文字母和对应的Unicode码;

public class 用while循环打印所有大写英文字母和对应的Unicode码解法1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=65;
		while(i<=65+25){
			System.out.println((char)i+":"+i);
			i++;
		}
	}

}
