package 华为;

public class ArraysTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[]array={'1','2','3','4','5'};
		System.out.println(toString(array));
	}

    public static String toString(char[] a) {
        if (a == null)
            return "null";
        int iMax = a.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(a[i]);
            
            if (i != iMax)
            	 b.append(", ");
            else
                return b.append(']').toString();
           
        }
    }
}
