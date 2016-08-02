package 八月2号号网易;
/*编程题|30分] 求子数组
时间限制：1秒
空间限制：32768K
题目描述
给出一个数组（数组中的元素可能重复），返回所有可能的子数组。输出请按照长度顺序升序排列，如果长度相等的话，请按照字典序升序排列。
输入描述:
以,隔开的一串字符串


输出描述:
数组集合，每行代表一个数组，数组按照如下格式打印:[数组元素1, 数组元素2, .....]注意元素之间的空格和逗号，注意左右之间的左右括号

输入例子:
1,2,2

输出例子:
[]
[1]
[2]
[1, 2]
[2, 2]
[1, 2, 2]

*/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       while (in.hasNextLine()) {
        	String str=in.nextLine();
        	String [] strArr=str.split(",");
        	ArrayList<String> list=process(strArr);

            for(int i=0;i<list.size();i++)
            {
                System.out.println(list.get(i));
            }

        }
        in.close();
    }
    public  static ArrayList<String> process(String[] num) {
        int len = num.length;
        ArrayList<ArrayList<String>> res = new ArrayList<ArrayList<String>>();
        Arrays.sort(num);

        for (int i = 0; i < Math.pow(2, len); i++) {
            ArrayList<String> list = new ArrayList<String>();
            int tmp = i;

            for (int j = 0; j < len; j++) {
                int bit = tmp & 1;
                tmp >>= 1;

                if (bit == 1) {
                    list.add(num[j]);
                }
            }

            res.add(list);
        }

        HashMap<String, String> map = new HashMap<String, String>();

        for (int i = 0; i < res.size(); i++) {
            String key = res.get(i).toString();

            //System.out.println(key);
            if (!map.containsKey(key)) {
                map.put(key, key);
            }
        }

        res.clear();

        ArrayList<String> res2 = new ArrayList<String>();

        for (String key : map.keySet()) {
            res2.add(key);
        }

        Collections.sort(res2,
            new Comparator<String>() {
                //????
                public int compare(String o1, String o2) {
                    if (o1.length() != o2.length()) {
                        return o1.length() - o2.length();
                    }

                    return o1.compareTo(o2);
                }
            });

        return res2;
    }
}