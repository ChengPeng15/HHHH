package 继承;

class father1{
    public void f(){}
}
interface sameInterface1{
    public void f();
}
class son1 extends father1 implements sameInterface1{
    public void f(){
        //本函数实际实现的是父类的f()，而不是接口的f()
    }
}

public class Test冲突2{
	public static void main(String[] args) {
		new son1().f();
	}
}
