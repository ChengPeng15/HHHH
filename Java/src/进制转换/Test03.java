package 进制转换;

public class Test03 {
	/**
	 * 计算(11111111)2=(————————)10
	 * @param args
	 */

	public static void main(String[] args) {
		System.out.println(Math.pow(2, 0)+
							Math.pow(2, 1)+
							Math.pow(2, 2)+
							Math.pow(2, 3)+
							Math.pow(2, 4)+
							Math.pow(2, 5)+
							Math.pow(2, 6)+
							Math.pow(2, 7));
		
		System.out.println(Math.pow(2, 8)-1);//这个是第二张写法
	}

}
