package 进制转换;

public class 十六进制 {

	public static void main(String[] args) {
		int a = 0x1000;
		System.out.println(Integer.toBinaryString(a));//2进制
		System.out.println(Integer.toHexString(a));//16进制
		System.out.println(Integer.toOctalString(a));//8进制
		System.out.println(a);//16*16*16=4096
		System.out.println(Integer.parseInt("1000",16));


	}

}
