package 剑指offer;

public class GetSize {
	private static int GetLength(int[]data){
		return data.length;
	}
	public static void main(String[] args) {
		int data1[]={1,2,3,4,5};
		System.out.println(data1.length);
		int [] data2 =data1;
		System.out.println(data2.length);
		System.out.println(GetLength(data1));

	}

}
