//package 数据类型;
//
//
//
////IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
////SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
////DEFINE ANY CLASS AND METHOD NEEDED
////LNode CLASS IS DEFINED BY DEFAULT
////CLASS BEGINS, THIS CLASS IS REQUIRED
//
//class LNode
//{
//public int value;
//public LNode next;
//}
//public class 中兴
//{
//// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
//public static LNode reverseLinkedList(LNode list)
//{
//	 int n=0;
//	    for(LNode p=list;p!=null;p=p.next)
//	    {
//	        ++n;
//	    }
//	    if(n==0)
//	    {
//	        return list;
//	    }
//	    else if(n%2==0)
//	    {
//	        n=(n+1)/2;
//	    }
//	    else
//	    {
//	        n=n/2+1;
//	    }
//	    LNode flag=null,pre=null,cur=list,nextNode=null;
//	    int i=0;
//	    while(cur!=null)
//	    {
//	        ++i;
//	        nextNode=cur.next;
//	        if(i==n-1)
//	        {
//	            flag=cur;
//	        }
//	        else if(i>=n)
//	        {
//	           cur.next=pre;
//	           pre=cur;
//	        }
//	        cur=nextNode;
//	    }
//	    flag.next=pre;
//	    return list;
//
//  // INSERT YOUR CODE HERE
//	  
//	  
//}
//// METHOD SIGNATURE ENDS
//}