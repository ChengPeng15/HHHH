package 剑指office;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Stack;

class ListNode {
	int val;
	ListNode next;
    ListNode(int val) {
        this.val = val;
      }
}

public class FromTailToHead {
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(null==listNode ){
			return list;
		}

//		Stack<Integer> stack = new Stack<Integer>();
		ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
		ListNode nextNode = listNode;
		while(null!=nextNode){
			stack.push(nextNode.val);
			nextNode = nextNode.next;
		}
		while(!stack.isEmpty()){
			list.add(stack.pop());
		}
		return list;
	}
}