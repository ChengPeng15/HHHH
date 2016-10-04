package 剑指offer;

/*
 * 单链表逆转
 */

public class ListReverseHasHead {
	private static void PrintList(Node head) {
		while (head != null) {
			System.out.print(head.value + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		Node n5 = new Node(5);
		Node n4 = new Node(4, n5);
		Node n3 = new Node(3, n4);
		Node n2 = new Node(2, n3);
		Node n1 = new Node(1, n2);
//		Node Head = new Node(null,n1);
		PrintList(n1);
		Node NewHead  = Revert(n1);
		System.out.println("非递归调用");
		PrintList(Revert(NewHead));
	}

	/*
	 * 非递归调用
	 */
	private static Node  Revert(Node n1) {
		if (n1 != null) {
			Node pre = null;
			Node head = n1;
			Node next = n1.next;
			while (next != null) {
				head.next = pre;
				pre = head;
				head = next;
				next = next.next;
			}
			head.next = pre;
			return head;
			
			//递归调用
		}else {
			return null;
		}
	}
	

}
