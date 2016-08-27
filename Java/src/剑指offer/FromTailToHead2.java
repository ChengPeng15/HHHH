package 剑指offer;

/*
 * 递归实现
 */
public class FromTailToHead2 {
	public static void printListFromTailToHead(ListNode Head) {
		if(null!=Head){
			if(null!=Head.next){
				printListFromTailToHead(Head.next);
			}
			System.out.print(Head.val+"\t");
		}
	}
	
	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		n1.next=n2;
		n2.next=n3;
		n3.next=null;
		ListNode Head =n1;
		while(Head!=null){
			System.out.print(Head.val+"\t");
			Head=Head.next;
		}
		System.out.println();
		printListFromTailToHead(n1);

	}
}