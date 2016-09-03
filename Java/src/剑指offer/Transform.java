package 剑指offer;

/*
 * 对于两个字符串A和B，如果A和B中出现的字符种类相同且每种字符出现的次数相同，则A和B互为变形词，请设计一个高效算法，检查两给定串是否互为变形词。

给定两个字符串A和B及他们的长度，请返回一个bool值，代表他们是否互为变形词。

测试样例：
"abc",3,"bca",3
返回：true
 */
public class Transform {
    public boolean chkTransform(String str1, int a, String str2, int b) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }
        char[] chas1 = str1.toCharArray();
        char[] chas2 = str2.toCharArray();
        int[] map = new int[65536];
        for (int i = 0; i < chas1.length; i++) {
            map[chas1[i]]++;
        }
        System.out.println(map['a']);
        for (int i = 0; i < chas2.length; i++) {
            if (map[chas2[i]]-- == 0) {
                return false;
            }
        }
        return true;
    }
    
    
    public static void main(String[] args) {
//		new Transform().chkTransform("abca", 4, "baac", 4);
    	int[]array=new int [255];
    	array['b']=3;
    	array['c']=31;
    	array['d']=311;
    	System.out.println(array);
	}
}