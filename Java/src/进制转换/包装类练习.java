package 进制转换;

public class 包装类练习 {

	public static void main(String[] args) {

		System.out.println("byte的数量总数："+Math.pow(2, Byte.SIZE));
		System.out.println("byte的取值范围："+Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
		System.out.println(Byte.parseByte("127")+9);
		
		System.out.println("int的数量总数："+Math.pow(2, Integer.SIZE));
		System.out.println("byte的取值范围："+Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
		System.out.println(Integer.parseInt("50000")+90);
		System.out.println(Integer.toBinaryString(16));
		System.out.println(Integer.toHexString(10));



	}

}
