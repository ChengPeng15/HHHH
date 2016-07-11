package 调用顺序面试题;

class Father {
{
	System.out.println("父类构造块");// 3
}
static {
	System.out.println("父类静态块");// 1
}
}

public class Lianxi14 extends Father {
{
	System.out.println("子类构造块");// 4
}
static {
	System.out.println("子类静态块");// 2
}
public static void main(String[] args) {
	new Lianxi14();
}
}