abstract class Parent1{
    abstract void grow();
}
class Son1 extends Parent1{
    void grow(){
        System.out.println("我比父亲成长条件好一点：Son1");
    }
    void play(){
        System.out.println("我会踢球");
    }
}
class Daughter extends Parent1{
    void grow(){
        System.out.println("我比父亲成长条件好很多:daughter");
    }
    void dance(){
        System.out.println("我会跳舞");
    }
}
public class test2 {
    public static void main(String[] args) {
        Parent1 p=new Son1();
        show(p);
        Parent1 p2=new Daughter();
        show(p2);
    }
    public static void show(Parent1 p){
            //现将父类中有的方法输出
            p.grow();
            //对进行过上转型的对象进行类型判断，然后进行相应的强制下转型
            if(p instanceof Son1){
                //判断是哪个类的上转型对象，然后进行下转型
                Son1 s=(Son1)p;
                //调用子类中的方法
                s.play();
            }else if(p instanceof Daughter){
                Daughter d=(Daughter)p;
                d.dance();
            }
            
    }
}