package 泛型;
/*
块是由大括号包围的一段代码。静态初始器(Static Initializer)是一个存在于类中、
方法外面的静态块。静态初始器仅仅在类装载的时候（第一次使用类的时候）执行一次，往往用来初始化静态变量。
*/
public class d {
    public static int i;
    static{
        i = 10;
        System.out.println("Now in static block.");
    }
    public void test() {
        System.out.println("test method: i=" + i);
    }
    public static void main(String[] args) {
        System.out.println("Demo.i=" + d.i);
        new d().test();
    }
}
