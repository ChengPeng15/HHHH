package 基础.String;


/**
 * Problem:
 *     对于String对象，可以使用"="赋值，也可以使用"new"关键字赋值，两种方式有什么区别？
 *     也即：
 *       String testStrA = "abc";
 *       String testStrB = new String("abc");
 *     
 */
public class StringTest {

    public static void main(String[] args) {
        String testStrA = "abc";
        String testStrB = new String("abc");
        System.out.println("testStrA == testStrB ? " + (testStrA == testStrB ? true : false));
        
        String testStrC = "abc";
        System.out.println("testStrA == testStrC ? " + (testStrA == testStrC ? true : false));
        
        String testStrD = "ab";
        String testStrE = "c";
        String testStrF = testStrD + testStrE;
        System.out.println("testStrA == testStrF ? " + (testStrA == testStrF ? true : false));
        
        System.out.println("testStrA == \"ab\"+\"c\" ? " + (testStrA == "ab"+"c" ? true : false));
        String add ="ab"+"c";
        System.out.println("testStrA == add ? " + (testStrA == add ? true : false));


    }
}
