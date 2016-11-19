package 算法;
/**
 * 字符串ABCD，可以由字符串BCDA或者CDAB通过循环移位而得到。
 * 请编程实现以下检测：字符串S1是否可以由字符串S2通	过循环移位而得到。 
 * 语言不限（推荐C/C++,不推荐写伪码）
 * @author chengpeng
 *
 */
public class RotateString {
    private static void reverseCharArr(char[] arr, int left, int right) {
        if (arr == null || left > right) return;
 
        while (left < right) {
            char tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
 
            left++;
            right--;
        }
    }
 
    public static void main(String[] args) {
        System.out.println(isRotate("ABCD", "DABC"));
    }
 
    private static String rotate(String str, int i) {
        if (str == null || i > str.length()) return null;
 
        char arr[] = str.toCharArray();
        reverseCharArr(arr, 0, i-1);
        reverseCharArr(arr, i, arr.length-1);
        reverseCharArr(arr, 0, arr.length-1);
 
        return new String(arr);
    }
 
    public static boolean isRotate(String s1, String s2) {
        if (s1 == null || s2 == null || s2.length() != s1.length()) return false;
 
        int indexOfFirst = s2.indexOf(s1.charAt(0));
 
        if (indexOfFirst == -1) return false;
 
        System.out.println(indexOfFirst);
 
        String tmp = rotate(s2, indexOfFirst);
        System.out.println(tmp);
 
        if (tmp.equals(s1)) {
            return true;
        }
        return  false;
    }
 
 
}