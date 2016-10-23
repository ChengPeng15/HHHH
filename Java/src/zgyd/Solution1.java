package zgyd;

/*
 * 请编写程序统计该字符串中字符串“yep”的个数。
 * 如字符串内容为“yepiloveyouyeploveyouverymuch”，则统计的“yep”个数为2。
 */
public class Solution1 {
	public int countYep(String s) {
		if(null != s && s.trim().length() > 2) {
			s = s.trim();
			int count = 0;
			int fromIndex = 0;
			while((fromIndex = s.indexOf("yep", fromIndex)) >=0 ){
				count ++;
				fromIndex += 3;
			}
			return count;
		}
		return 0;
	}
	public static void main(String[] args) {
		System.out.println(new Solution1().countYep("yepiloveyouyeploveyouverymuch"));
	}
}
