package 内部类;
//http://www.importnew.com/20134.html  内部类
/*
 * 其实在这个应用程序中我们还看到了如何来引用内部类：
 * 引用内部类我们需要指明这个对象的类型：OuterClasName.InnerClassName。
 * 同时如果我们需要创建某个内部类对象，
 * 必须要利用外部类的对象通过.new来创建内部类：
 *  OuterClass.InnerClass innerClass = outerClass.new InnerClass();。

同时如果我们需要生成对外部类对象的引用，可以使用OuterClassName.this，这样就能够产生一个正确引用外部类的引用了。当然这点实在编译期就知晓了，没有任何运行时的成本。
 */
public class OuterClass {
    public  void display(){
        System.out.println("OuterClass...");
    }
    
    public void OuterInnerDisplay(){
    	new InnerClass().InnerDisplay();
    }
    public class InnerClass{
        public OuterClass getOuterClass(){
//        	display();
            return OuterClass.this;
        }
        public void InnerDisplay(){
        	System.out.println("inner");
        }
    }
 
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.OuterInnerDisplay();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.getOuterClass().display();
        
    }
}

