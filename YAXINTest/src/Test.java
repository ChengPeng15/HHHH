
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//A b = new B();
		/*A static
		B static
		A contruct...
		B contruct...
		*/
		A a =new A();
		B bb = new B();
	}

	static int IsPart(TNode root1, TNode root2)
	{
	    if (root2 == null)
	        return 1;
	    if (root1 == null)
	        return -1;
	    if (root1.value != root2.value)
	        return -1;
	    if(IsPart(root1.left, root2.left) == 1 &&
		        IsPart(root1.right, root2.right) == 1 )
	    	return 1;
	    else
	    	return -1;
	}
	public static int IsSubTree(TNode root1, TNode root2)
	{
	    int result = -1;
	    if (root1 != null && root2 != null)
	    {
	        if (root1.value == root2.value)
	            result = IsPart(root1, root2);
	        if (result == -1)
	            result = IsSubTree(root1.left, root2);
	        if (result == -1)
	            result = IsSubTree(root1.right, root2);
	    }
	    return result;
	}
}
