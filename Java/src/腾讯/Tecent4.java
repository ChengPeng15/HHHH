package 腾讯;

/*
 * 思路：定义一个函数Fun（N），表示N层最有效方式最坏情况的次数
	Fun(N)=min{max{1,1+Fun(N-1)},max{1,1+Fun(N-2)},...,max{n-1,1+Fun(1)}}
	Fun(1) = 1;
 */
public class Tecent4{
	static int count = 0;
	public static void main(String[] args) {
		int[] Fun = new int[40];
		Fun[1] = 1;
		for(int i = 1; i <=39; i++)
		{
			int min = 0;
			for(int j = i; j > 0; j--)
			{
				int temp = 1+Fun[i-j];
			
				if(j > 1+Fun[i-j])
				{
					temp = j;
				}
				if(min > temp)
				{
					min = temp;
				}
			}
			Fun[i] = min;
		}
		for(int i = 0; i <= 39;i++)
		{
			System.out.println(Fun[i]);
		}

	} 

	
}