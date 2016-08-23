//package 网易有道;
//import java.util.*;
//public class Main1111 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//       //while (in.hasNextInt()) {
//        	//int  T=in.nextInt();
//        	int n=2;//in.nextInt();
//        	
//            System.out.println(process(n));
//
//        //}
//        in.close();
//    }
//    static String process(int n)
//    {
//    	StringBuffer buffer=new StringBuffer();
//    	Queue<Integer> q=new LinkedList<Integer>();
//    	for(int i=1;i<=n;i++)
//    	{
//    		q.add(i);
//    	}
//    	while(!q.isEmpty())                    //队列不空，执行循环
//         {
//                   int x=q.element();            //取出当前队头的值x
//                   q.remove();                  //弹出当前队头
//                   q.add(x);               		//把x放入队尾
//                   x=q.element();              //取出这时候队头的值
//                   //printf("%d\n",x);          //输出x
//                   buffer.append(x+" ");
//                   q.remove();                 //弹出这时候的队头
//         }
//if(buffer.length()>0)
//	{
//	buffer.delete(buffer.length()-1,buffer.length());
//}
//    	return buffer.toString();
//    }
//}
//
//
//
