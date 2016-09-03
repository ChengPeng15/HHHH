package 剑指offer;


public class LongestSymmtricalLength2 {

	/*
	 * Q75题目：输入一个字符串，输出该字符串中对称的子字符串的最大长度。
	 * 比如输入字符串“google”，由于该字符串里最长的对称子字符串是“goog”，因此输出4。
	 */

	public static void main(String[] args) {
		String[] strs = { "a","google", "elgoog", "agollloge", "aba", "aaaaaa", };
		for (String each : strs) {
			int len = longestSymmtricalLength(each);
			System.out.println("l1:" + len);
			len = longestSymmtricalLength2(each);
			System.out.println("l2:" + len);
		}
	}

	public static int longestSymmtricalLength(String str) {
		if (str == null || str.length() == 0) {
			return -1;
		}
		//去掉aa为1实际为2 的bug
		if(str.length()==2){
			if(str.charAt(0)==str.charAt(1))
				return 2;
		}
		int symLen = 1;
		char[] letter = str.toCharArray();
		int strLen = str.length();
		int curIndex = 1;
		while (curIndex > 0 && curIndex < strLen - 1) {
			// odd symmetrical length,the 'pivot' char is letter[curIndex]
			int i = curIndex - 1;
			int j = curIndex + 1;
			while (i >= 0 && j <= (strLen - 1) && letter[i] == letter[j]) {
				i--;
				j++;
			}
			int newLen = j - i - 1;
			if (newLen > symLen) {
				symLen = newLen;
			}
			// even symmetrical length,the 'pivot' chars are letter[curIndex]
			// and letter[curIndex+1] goog  就是用位置 1和2进行对称
			i = curIndex;
			j = curIndex + 1;
			while (i >= 0 && j <= (strLen - 1) && letter[i] == letter[j]) {
				i--;
				j++;
			}
			newLen = j - i - 1;
			if (newLen > symLen) {
				symLen = newLen;
			}
			curIndex++;
		}
		return symLen;
	}

	/*
	 * 上面的方法是从位置1,进行向外扩大半径进行搜索,比如google,currIndex=1;i=0;j=1;(因为对称相等就是回文)，向外扩大半径搜索
	 * 改版之后的算法,不在区分奇偶
	 */
	public static int longestSymmtricalLength2(String str) {
		if (str == null || str.length() == 0) {
			return -1;
		}
		StringBuffer buffer = new StringBuffer();
		buffer.append("#");
		for (int i = 0; i < str.length(); i++) {
			buffer.append(str.charAt(i) + "#");
		}
		str = buffer.toString();
		buffer.delete(0, buffer.length());
		int symLen = 1;
		char[] letter = str.toCharArray();
		int strLen = str.length();
		int curIndex = 1;
		while (curIndex > 0 && curIndex < strLen - 1) {
			// odd symmetrical length,the 'pivot' char is letter[curIndex]
			int i = curIndex - 1;
			int j = curIndex + 1;
			while (i >= 0 && j <= (strLen - 1) && letter[i] == letter[j]) {
				i--;
				j++;
			}
			int newLen = (j - i - 1) / 2;
			if (newLen > symLen) {
				symLen = newLen;
			}
			curIndex++;
		}
		return symLen;
	}
}
