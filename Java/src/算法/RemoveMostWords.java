package 算法;

import java.util.HashMap;
import java.util.Map;
public class RemoveMostWords
{
    public static void main(String[] args)
    {
        String str = "addcbbs";
        System.out.println("处理前的字符串：" + str);
        String deelStr = removeMostWords(str);
        System.out.println("处理后的字符串：" + deelStr);
    }
    private static String removeMostWords(String str)
    {
        if (null == str || "".equals(str))
        {
            return str;
        }
        //初始化最大次数为2次
        int iMax = 2;
        //将所有的字符与出现的次数作为一个键值对
        Map<Character, Integer> timeMap = new HashMap<Character, Integer>();
        Character cTmp;
        Integer iTmp;
        for (int i = 0; i < str.length(); i++)
        {
            cTmp = str.charAt(i);
            iTmp = timeMap.get(cTmp);
            //首次出现的字符，不需要比较
            if (null == iTmp)
            {
                timeMap.put(cTmp, 1);
                continue;
            }
            //出现次数+1，放入map
            iTmp = iTmp + 1;
            timeMap.put(cTmp, iTmp);
            //若超过最大次数，则替换最大次数
            iMax = iMax < iTmp ? iTmp : iMax;
        }
        //将所有达到最大次数的字符替换成空
        for (Map.Entry<Character, Integer> entry : timeMap.entrySet())
        {
            if (entry.getValue() == iMax)
            {
                str = str.replaceAll(String.valueOf(entry.getKey()), "");
            }
        }
        return str;
    }
}