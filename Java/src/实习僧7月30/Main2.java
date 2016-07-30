package 实习僧7月30;

import java.util.Scanner;

/*
 * 特殊序列
Time Limit: 4000/2000 MS (Java/Others) Memory Limit: 65536/65536 K (Java/Others)
Problem Description:
小B准备开始新的职业生涯，由于大数据异常火爆，小B也打算去凑凑热闹，她应聘了一家数据处理公司。这不，面试官考察她的数据分析和编码能力。
给了小B两个整数序列M和N，均按非递减顺序排列。面试官的问题是能否从序列M中找到p个连续元素构成一个子序列，同时从序列N中找到q个连续元素构成另一个子序列，
使得它们满足条件：p个元素中的任何一个元素均小于q个元素中的任何一个？
小B请你帮忙分析并编写这个程序。
输入
输入有若干组，每组包含四行，第一行为两个正整数na和nb（1<=na，nb<=100000），分别表示两个序列中元素的个数，
第二行为p和q(1<=p<=na,1<=q<=nb），
第三行为序列M，包含na个整数，
第四行为序列N，包含nb个整数。
输出
对每组测试数据，单独输出一行，若能够找到则输出“YES”，否则输出“NO”（不含引号）。

样例输入
3 3
2 1
1 2 3
3 4 5
5 2
3 1
1 1 1 1 1
2 2
样例输出
NO
YES

Hint

 */
public class Main2 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int na = cin.nextInt();
            System.out.println("55555");
            int nb = cin.nextInt();
            int p=cin.nextInt();
            int q=cin.nextInt();
			int [] M=new int[na];
			System.out.println("na:"+na+",nb:"+nb+",p:"+p+",q:"+q);
			for(int i=0;i<na;i++)
			
			{
				M[i]=cin.nextInt();
			}
			int N[]=new int[nb];
		    for(int i=0;i<na;i++)
			
			{
				N[i]=cin.nextInt();
			}     
			System.out.println("M");

			for(int i=0;i<na;i++)
				
			{
				System.out.print(M[i]+" ");
			}
			System.out.println("N");
			
		    for(int i=0;i<na;i++)
			
			{
				System.out.print(N[i]+" ");
			}    
			   
		}
    }
}