package 调用顺序面试题;
/*
 * 执行过程如下：
程序执行始点是SubClass.main，
1、执行SubClass的main之前，
要看SubClass中是否有静态的变量和语句，如果有，先给这些静态的变量分配存储空间和执行静态语句（不是静态方法），且由于SubClass的父类中也有静态的变量，根据继承的特性，则先执行父类Parent的静态数据的初始化，然会执行子类的静态数据的初始化。
父类--静态变量 
父类--静态初始化块 
子类--静态变量 
子类--静态初始化块 
2、执行main方法中的new Parent(); 语句，进行Parent的类的实例化
因为Parent的静态数据已经实例化,并且在一个执行过程只实例化一次，所以在执行new Parenet()语句时，
先执行非静态变量定义和类的非静态语句，之后再执行构造方法，所以有下面的结果
父类--变量 
父类--初始化块 
父类--构造器 
3、在执行main方法中的new SubClass(); 语句，进行SubClass的类的实例化
同2，父类和子类的静态数据不执行，因为SubClass继承Parent，所以首先执行父类的非静态的变量和类语句的执行，在调用SubClass的构造方法之前，如果没有明确的说明，则先执行父类的同参数的构造方法，然后执行子类的实例化，则出现下面的结果
子类--变量 
子类--初始化块 
子类--构造器 
 */
class Parent {  
    public static String p_StaticField = "父类--静态变量";  
    public String p_Field = "父类--变量";  
    // 代码块  
    {  
        System.out.println(p_Field);  
        System.out.println("父类--初始化块");  
    }  
  
    // 构造函数  
    public Parent() {  
        System.out.println("父类--构造器");  
    }  
  
    // 静态初始化块  
    static {  
        System.out.println(p_StaticField);  
        System.out.println("父类--静态初始化块");  
    }  
}  
  
public class StaticBlock extends Parent {  
    public static String s_StaticField = "子类--静态变量";  
    public String s_Field = "子类--变量";  
    {  
        System.out.println(s_Field);  
        System.out.println("子类--初始化块");  
    }  
  
    // 静态初始化块  
    static {  
        System.out.println(s_StaticField);  
        System.out.println("子类--静态初始化块");  
    }  
  
    public StaticBlock() {  
        System.out.println("子类--构造器");  
    }  
  
    public static void main(String[] args) {  
        System.out.println("-------------------");  
        new Parent();  
        System.out.println("-------------------");  
        new StaticBlock();  
        System.out.println("-------------------");  
        new StaticBlock();  
    }  
}  