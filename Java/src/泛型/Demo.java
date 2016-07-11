package 泛型;

/*
 * 对于使用频繁的静态变量和静态方法，可以将其静态导入。静态导入的好处是可以简化一些操作，
 * 例如输出语句 System.out.println(); 中的 out 就是 System 类的静态变量，
 * 可以通过 import static java.lang.System.*; 将其导入，下次直接调用 out.println() 就可以了。
 */
import static java.lang.System.*;
import static java.lang.Math.random;
public class Demo {
    public static void main(String[] args) {
        out.println("产生的一个随机数：" + random());
    }
}