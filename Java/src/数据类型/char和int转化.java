package 数据类型;

public class char和int转化 {
	public static void main(String[] args) {
//		char c = 65;
//		int i = 'B';
//		System.out.println(c+","+i);
//		
		char c = 'A';
		int i = c+1;//char可以专为int
		c = (char) (c+10);//int转为char要强制类型转化
		System.out.println(c+","+i);
	}
}
