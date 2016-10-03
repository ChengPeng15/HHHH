package 广联达;

public class 以空格分隔 {

	public static void main(String[] args) {
//		String str = "Hello	Cheng Peng World!";
//		String [] array1 = str.split(" ");
//		String [] array = str.split("\\s");//也行
////		String [] array2 = str.split("\0");
//		System.out.println(array1[array1.length-1].length());
		
		
//		String str1 = "Hello%*Cheng%*Peng%*World!";
//		String [] arr = str1.split("%\\*");
//		System.out.println(arr.length);
//		System.out.println((arr[arr.length-1]));
		
		String s = "AMBCMEEE";
		String fgf = "M";
		String [] arr1 = s.split(fgf);
		System.out.println(arr1.length);
		System.out.println((arr1[arr1.length-1]));
	}

}