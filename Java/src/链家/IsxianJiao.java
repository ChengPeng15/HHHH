package 链家;

class Node{
	int data;
	Node next;
}
public class IsxianJiao {
    public Node getIntersectionNode(Node A, Node B) {
        if(A==null||B==null){
            return null;
        }
        Node p=A;
        Node q=B;
        int length1=0;
        int length2=0;
        int diff=0;
        while(p!=null){
            length1++;
            p=p.next;
        }
        while(q!=null){
            length2++;
            q=q.next;
        }
        if(length1>length2){
            p=A;
            q=B;
            diff=length1-length2;
        }
        else{
            p=B;
            q=A;
            diff=length2-length1;
        }
        for(int i=0;i<diff;i++){
            p=p.next;
        }
        while(p!=null&&q!=null){
            if(p.data==q.data){
                return p;
            }
            p=p.next;
            q=q.next;
        }
        return null;
    }
    
}
