package 调用顺序面试题;
public class Parent3 {     
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
    public Parent3() {    
         System.out.println("父类--构造器");    
     }    
    
    public static void main(String[] args) {   
    	System.out.println("-------------------");  
    	new Parent3();//没有这句话只有
    	/*父类--静态变量
    	父类--静态初始化块*/
    	
    	//有这句话
    	/*父类--静态变量
    	父类--静态初始化块
    	-------------------
    	父类--变量
    	父类--初始化块
    	父类--构造器
    	*/
    	new Parent3();
	   }   
}       

