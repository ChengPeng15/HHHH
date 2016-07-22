package 调用顺序面试题;

class Parent2 {     
    public static String p_StaticField = "父类--静态变量";    
    public String p_Field = "父类--变量";      
    // 下面这些是干什么的?解释以下,不是很明白 
    static {    
         System.out.println(p_StaticField);    
         System.out.println("父类--静态初始化块");    
     }      
    // 下面这是干什么的?不明白?为什么这么写     
     {    
         System.out.println(p_Field);    
         System.out.println("父类--初始化块");    
     }      
    public Parent2() {    
         System.out.println("父类--构造器");    
     }    
}       
public class SubClass extends Parent2 {    
    public static String s_StaticField = "子类--静态变量"; 
    public String s_Field = "子类--变量";    
    // 静态初始化块    
    static {    
         System.out.println(s_StaticField);    
         System.out.println("子类--静态初始化块");    
     }    
     {    
         System.out.println(s_Field);    
         System.out.println("子类--初始化块");    
     }        
    public SubClass() {    
         System.out.println("子类--构造器");    
     }       
    public static void main(String[] args) { 
       System.out.println("-------------------");  
       new Parent2();
  	   System.out.println("-------------------");
       new SubClass(); 
       System.out.println("-------------------");
       new SubClass();  
     }    
} 
