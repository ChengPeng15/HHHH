package 数据类型;

public class 类型转化 {
	public static void main(String[] args) {
		byte b1 = 5;
		int b2 = b1+18;
		byte b3 = (byte) (b1 +18);//大类型向小类型没发自动转化
		
		int i =-2;
		long l =i;
		
		System.out.println("\t\t\t\t"+Integer.toBinaryString(i));
		System.out.println(Long.toBinaryString(l));
		

	}
}
