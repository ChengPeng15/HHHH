package 数据类型;

public class 大类型转化为小类型 {
	public static void main(String[] args) {
		int i =129;
		byte b = (byte)i;
		System.out.println(Integer.toBinaryString(i)+" "+i);
		System.out.println(Integer.toBinaryString(b)+" "+b);
		System.out.println(Integer.toBinaryString(-127));
		
		int j = 257+128;
		byte b1 = (byte)j;
		System.out.println(Integer.toBinaryString(j)+" "+j);
		System.out.println(b1);
		
		
		int j1 = 257;
		byte b11 = (byte)j1;
		System.out.println(Integer.toBinaryString(j1)+" "+j1);
		System.out.println(b11);

	}

}
