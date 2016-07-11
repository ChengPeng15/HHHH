package 调用顺序面试题;

//在父类和子类中加入构造函数
class Father1 {
{
System.out.println("父类构造块");// 3
}
static {
System.out.println("父类静态块");// 1
}

Father1() {
System.out.println("父类构造函数");//4
}
}

public class Lianxi15 extends Father1 {
{
System.out.println("子类构造块");// 5
}
static {
System.out.println("子类静态块");// 2
}

Lianxi15() {
System.out.println("子类构造函数");//6
}

public static void main(String[] args) {
new Lianxi15();
}

}