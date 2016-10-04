package 顺丰;

import java.util.Scanner;

public class Main3 {
	static int point_num;//点数   MAXINT 10000
	static int arc_num;//边数
	static int G[][];//无向图
	static int firstaid[];//每个城市的救援队数
	static int start_point;//出发城市
	static int end_point;//到达城市
	public static void main(String[] args){
		Scanner scanner =new Scanner(System.in);
		point_num=scanner.nextInt();
		arc_num=scanner.nextInt();
		start_point=scanner.nextInt();
		end_point=scanner.nextInt();
		G=new int [point_num][point_num];
		firstaid=new int [point_num];
		for (int i = 0; i < firstaid.length; i++) {//初始化
			firstaid[i]=scanner.nextInt();
		}
		for (int i = 0; i < point_num; i++) {//注意主对角线上的值为0，其他的为maxint
			for (int j = 0; j < point_num; j++) {
				if(i==j) G[i][j]=0;
				else G[i][j]=10000;
			}
		}
		for (int i = 0; i < arc_num; i++) {//注意无向图双向都要赋值
			int a=0,b=0,c=0;
			a=scanner.nextInt();
			b=scanner.nextInt();
			c=scanner.nextInt();
			G[a][b]=c;
			G[b][a]=c;
		}
		shortpath(start_point);
	}
	public static void shortpath(int v0) {
		int pre[]=new int [point_num];//每个点的前驱节点
		int aidall[]=new int [point_num];//起点到每个节点的救援队总数
		int dis_v0[]=new int [point_num];//到起点的距离
		int road_num[]=new int [point_num];//到每个点的最短路径数
		boolean vis[]=new boolean[point_num];//此点是否访问
		for (int i = 0; i < point_num; i++) {//初始化以上变量
			pre[i]= -1;//先将各点的前驱置为-1
			dis_v0[i]=10000;//到原点的距离置为 maxint
			aidall[i]=0;//总救援队设为0
			vis[i]=false;
			road_num[i]=0;//总路径数设为0
		}
		aidall[v0]=firstaid[v0];//现将起点的救援队写入
		vis[v0]=true;
		dis_v0[v0]=0;//原点自身到自身距离为0
		road_num[v0]=1;
		for (int i = 0; i < point_num; i++) {
			int yuan_point=v0;
			for (int j = 0; j < vis.length; j++) {
				if(!vis[j]&&10000>dis_v0[j]){//寻找已经被前面已经访问过的点的后继点
					yuan_point=j;//作为起点（原点）
				}
			}
			vis[yuan_point]=true;//设为已访问
			for (int j = 0; j < point_num; j++) {
				if(!vis[j]){
					if(dis_v0[j]>dis_v0[yuan_point]+G[yuan_point][j]){//如果后继点原先到v0点的距离大于当前点到原点的距离加上此点到后继点的距离
						dis_v0[j]=dis_v0[yuan_point]+G[yuan_point][j];//更新后继点距离
						aidall[j]=aidall[yuan_point]+firstaid[j];//计算出到达后继点时所召集的救援队
						pre[j]=yuan_point;//设置后继点的最优前驱点为当前点
						road_num[j]=road_num[yuan_point];//将前驱点的路径数赋给当前点
					}else if (dis_v0[j]==dis_v0[yuan_point]+G[yuan_point][j]) {//如果路径长相等
						road_num[j]+=road_num[yuan_point];//当前点路径数加上刚搜索到的距离相同的点的路径数
						if(aidall[j]<aidall[yuan_point]+firstaid[j]){//如果救援队更多
							aidall[j]=aidall[yuan_point]+firstaid[j];//更新救援队数
							pre[j]=yuan_point;//同时将前驱点设为刚搜索到的点
						}
					}
				}
			}
		}
		System.out.print(road_num[end_point]+" "+aidall[end_point]+"\n");
		dispath(pre,end_point);
		System.out.print(end_point);
	}
	public static void dispath(int a[],int v0) {
		if(a[v0]!= -1){
			dispath(a, a[v0]);
			System.out.print(a[v0]+" ");//通过前驱点记录数组，进行递归显示路径数
		}
	}
}
