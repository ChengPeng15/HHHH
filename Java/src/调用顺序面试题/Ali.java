package 调用顺序面试题;

//2013。9.22 阿里笔试题
public class Ali {

private static int k = 0;
private static Ali t3;
private static Ali t1 = new Ali("t1");
private static Ali t2 = new Ali("t2");
private static int i = print("i");
private static int n = 99;
{
	print("构造块");
}
static {
	print("静态块");
}

public Ali(String s) {
	System.out.println(++k + ":" + s + "   i:" + i + "   n:" + n);
}

private static int print(String s) {
	System.out.println(++k + ":" + s + "   i:" + i + "   n:" + n);
	n++;
	return ++i;
}

public static void main(String[] args) {
	Ali t = new Ali("init");
}

}
/*
执行顺序：
1:构造块   i:0   n:0
2:t1   i:1   n:1
3:构造块   i:1   n:1
4:t2   i:2   n:2
5:i   i:2   n:2
6:静态块   i:3   n:99
7:构造块   i:4   n:100
8:init   i:5   n:101
*/