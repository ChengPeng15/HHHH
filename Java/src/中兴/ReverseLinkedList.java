package 中兴;


//IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
//SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
//DEFINE ANY CLASS AND METHOD NEEDED
//LNode CLASS IS DEFINED BY DEFAULT
//CLASS BEGINS, THIS CLASS IS REQUIRED
class LNode
{
public int value;
public LNode next;
}
public class ReverseLinkedList
{
// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
public static LNode reverseLinkedList(LNode list)
{
 // INSERT YOUR CODE HERE
 LNode slow = list;
		LNode faster = list;
		LNode head = slow;
		while (faster != null && faster.next != null) {
			head = slow;
			slow = slow.next;
			faster = faster.next.next;
		}
		LNode mid = slow;		
		head.next = reverseList(mid);
		return list;
}
public static LNode reverseList(LNode head) {
		if (head == null)
			return null;
		LNode reversedHead = null;
		LNode current = head;
		LNode tmp = null;
		LNode pre = null;
		while (current != null) {
			tmp = current.next;
			current.next = pre;
			if (tmp == null)
				reversedHead = current;
			pre = current;
			current = tmp;

		}
		return reversedHead;
	}

// METHOD SIGNATURE ENDS
}
