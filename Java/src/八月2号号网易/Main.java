package 八月2号号网易;

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