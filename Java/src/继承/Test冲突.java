package 继承;

class exception1 extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;}
class exception2 extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;}
class father{
    public void f()throws exception1{}
}
interface sameInterface{
    public void f()throws exception2;
}
class son extends father implements sameInterface{
    public void f(){
        //只能选择不实现异常，实现exception1或exception2都会报错
    }
}

public class Test冲突{
	public static void main(String[] args) {
		new son().f();
	}
}
