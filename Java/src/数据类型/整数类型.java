package 数据类型;

public class 整数类型 {

	public static void main(String[] args) {
		byte b1=127;
		byte b2 = (byte) (b1+3);
//		int b2 = b1+3;
		System.out.println(b2);
//		byte b2  0 1111111  127补码
//		         0 0000011  3的补码
//		         1 0000010   计算结果
//		         1 1111110   计算结果队形补码  ＝＝＝＝＝＝－126
	}
	
	
	byte b3 =125;
	byte b4 =(byte) (125+3);
		
}
