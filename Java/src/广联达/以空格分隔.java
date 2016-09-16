package 广联达;

public class 以空格分隔 {

	public static void main(String[] args) {
		String str = "Hello	Cheng Peng World!";
		String [] array1 = str.split(" ");
		String [] array = str.split("\\s");//也行
//		String [] array2 = str.split("\0");
		System.out.println(array1[array1.length-1].length());
		
	}

}