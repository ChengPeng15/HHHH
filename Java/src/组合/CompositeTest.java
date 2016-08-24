package 组合;
//CompositeTest.java  使用组合方式实现目标  
class Animal{  
	public Animal(){
		System.out.println("animal");
	}
    private void beat(){  
        System.out.println("心脏跳动...");  
    }  
    public void breath(){  
        beat();  
        System.out.println("吸一口气，呼一口气，呼吸中...");  
    }  
}  
class Bird{  
    //定义一个Animal成员变量，以供组合之用  
    private Animal a;  
    //使用构造函数初始化成员变量  
    public Bird(Animal a){  
        this.a=a;  
		System.out.println("Bird");
    }  
    //通过调用成员变量的固有方法（a.breath()）使新类具有相同的功能（breath()）  
    public void breath(){  
        a.breath();  
    }  
    //为新类增加新的方法  
    public void fly(){  
        System.out.println("我是鸟，我在天空中自由的飞翔...");  
    }  
}  
class Wolf{  
    private Animal a;  
    public Wolf(Animal a){  
        this.a=a;  
    }  
    public void breath(){  
        a.breath();  
    }  
    public void run(){  
        System.out.println("我是狼，我在草原上快速奔跑...");       
    }  
}  
public class CompositeTest{  
    public static void main(String[] args){  
        //显式创建被组合的对象实例a1  
        Animal a1=new Animal();  
        //以a1为基础组合出新对象实例b  
        Bird b=new Bird(a1);  
        //新对象实例b可以breath()  
        b.breath();  
        //新对象实例b可以fly()  
        b.fly();  
        Animal a2=new Animal();  
        Wolf w=new Wolf(a2);  
        w.breath();  
        w.run();  
/* 
---------- 运行Java程序 ---------- 
心脏跳动... 
吸一口气，呼一口气，呼吸中... 
我是鸟，我在天空中自由的飞翔... 
心脏跳动... 
吸一口气，呼一口气，呼吸中... 
我是狼，我在草原上快速奔跑... 
 
输出完毕 (耗时 0 秒) - 正常终止 
*/  
    }  
}
