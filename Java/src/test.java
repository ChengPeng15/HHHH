abstract class Parent{
    abstract void grow();
}
class Son extends Parent{
    void grow(){
        System.out.println("我比父亲成长条件好");
    }
    void dance(){
        System.out.println("我会踢球");
    }
}
public class test {
    public static void main(String[] args) {
        //上转型，用父类的引用子类的对象
        Parent p=new Son();
        //调用父类中有的方法
        p.grow();
        //p.dance();这里会报错，因为父类中没有dance()方法
        
        //对进行过上转型的对象，进行强制下转型
        Son s=(Son)p;
        //调用子类中的方法
        s.dance();
    }
}