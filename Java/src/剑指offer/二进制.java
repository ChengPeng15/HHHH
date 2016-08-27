package 剑指offer;

public class 二进制 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0xA;
		System.out.println(Integer.toBinaryString(a));
		int b = 0x8A;
		System.out.println(b);
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(b<<3));//因为int32位
	}

}
