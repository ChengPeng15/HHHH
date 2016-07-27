package 基础.数组;

public class 求数组最大值最小值 {

	public static void main(String[] args)
		{
				int score[]={43,34,5,66,12};
				int max,min;
				max=min=score[0];
				for(int i=1;i<score.length;i++)
				{
					if(score[i]>max){
						max=score[i];
					}
		
					if(score[i]<min){
						min=score[i];
					}
				}
				System.out.println("最大值："+max);
				System.out.println("最小值："+min);
			
		}
}