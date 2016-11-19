package 宜人贷;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 假设有一个数字型数组nums,其中只有两个数字会出现一次，而其他数字会出现两次。
 * 请找出只出现一次的两个数字
 */
public class FindTowNumerApperenceOnlyOnce{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int length = sc.nextInt();
			int [] array = new int[length];
			for (int i = 0; i < array.length; i++) {
				array[i]=sc.nextInt();
			}
			int []num=FindNumsAppearOnce(array,length);
			Arrays.sort(num);
			System.out.println(Arrays.toString(num));
			
		}
	}
    static int[] FindNumsAppearOnce(int data[], int length)
    {
        int[] result = new int[2];
        if (length < 2)
            return null;

        int num1 = 0;
        int num2 = 0;
        int resultExclusiveOR = 0;
        for (int i = 0; i < length; ++ i)
        {
            resultExclusiveOR ^= data[i];
            int indexOf1 = FindFirstBitIs1(resultExclusiveOR);

            num1 = num2 = 0;
            for (int j = 0; j < length; ++ j)
            {
                if(IsBit1(data[j], indexOf1))
                    num1 ^= data[j];
                else
                    num2 ^= data[j];
            }
        }
        result[0] = num1;
        result[1] = num2;
        return result;
    }

    static int FindFirstBitIs1(int num)
    {
           int indexBit = 0;
           while (((num & 1) == 0) && (indexBit < 32))
           {
               num = num >> 1;
           ++ indexBit;
           }

           return indexBit;
    }
    static boolean IsBit1(int num, int indexBit)
    {
        num = num >> indexBit;
        if((num & 1) == 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

}