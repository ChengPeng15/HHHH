import java.util.Arrays;

public class TestStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer result = new StringBuffer().append("Hello").append("World");
		System.out.println(result);
		String aa=new String("aa");
//		new String().substring(beginIndex, endIndex)
		String str ="2006-04-15 02:31:04";
		String []temp = str.split("\\D");
		System.out.println(Arrays.toString(temp));
	}

}
