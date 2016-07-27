package 基础.数组;
/*
 * 每次选取最大或者最小的（一趟）
 * 一开始以开始元素，和其他元素对比，比如冒泡最大的
 * 如果比其他小，则两个元素交换
 * 交换到i位置，j＋＋，再让i位置元素和j位置的继续比较，
 * 其实就是那没结束的这趟中，认为大大元素和其他继续比较，再交换出来
 * 
 * 注意 如果进行了两趟，那么第三躺，是选择第三大（或者第三小的）元素出来
 */
public class 冒泡排序 {

	public static void main(String[] args) {
		int score[] = {12,45,23,10,300};
		for (int i=0;i<score.length-1;i++){//这个地方要写i<score.length-1   这样可以省略一次
			for(int j=i+1;j<score.length;j++){
				if(score[i]<score[j]){
					int temp=score[i];
					score[i]=score[j];
					score[j]=temp;
				}
			}
			System.out.print("第"+(i+1)+"次交换结果：");
			
			/*
			 * 这是在for (int i=0;i<score.length-1;i++){}中的，所以int j 并不与其他冲突，而int i就冲突了

			 */
//			for (int j=0;j<score.length;j++){
//				System.out.print (score[j]+"  ");
//			}			
//			for (int i=0;i<score.length;i++){
//				System.out.print (score[i]+"  ");
//			}
			for (int m=0;m<score.length;m++){
				System.out.print (score[m]+"  ");
			}
			System.out.println();
			
		}
		
		for (int i=0;i<score.length;i++){
			System.out.println(score[i]);
		}
	}

}
