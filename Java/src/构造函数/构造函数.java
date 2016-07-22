package 构造函数;
/*
 * 构造函数
 */
public class 构造函数 {

    private int petalCount = 0;
    private String fnameString = new String("null");

    static {
    	System.out.println("静态代码块");
    }
    public 构造函数(int i) {
        petalCount = i;
        
        System.out.println("Constructed only by petal:" + petalCount);
    }
    
    public 构造函数(String name){
        fnameString = name;
        
        System.out.println("Constructed only by name:" + fnameString);
    }
    
    public 构造函数(String name,int petal){
        this(name);
        //this(petal);   //not allowed
        this.petalCount = petal;
        
        System.out.println("Constructed both by name:" + name + " and petal:"+ petal);
    }
    
    public 构造函数(){
        this("Rose",27);
        
        System.out.println("Constructed without parameters");
    }
    public static void main(String[] args) {
    	构造函数 fa = new 构造函数();
     
    	构造函数 fb = new 构造函数(36);
    
    	构造函数 fc = new 构造函数("Baihe");
	}
}