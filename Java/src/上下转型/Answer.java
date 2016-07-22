package 上下转型;

public class Answer {
    public static void main(String []args){
        A a1 = new A();  
        A a2 = new B();  //这个地方相当于把B里面的方法跟A相同的重写，注意是A中的被重写
        B b = new B();  
        C c = new C();   
        D d = new D();   
        System.out.println(a1.show(b));      //A and A
        System.out.println(a1.show(c));      //A and A
        System.out.println(a1.show(d));      //A and D
        System.out.println(a2.show(b));      //B and A
        System.out.println(a2.show(c));      //B and A  
        System.out.println(a2.show(d));      //A and D
        System.out.println(b.show(b));       //B and B
        System.out.println(b.show(c));       //B and B
        System.out.println(b.show(d));       //A and D   b继承了A中的show(B obj)方法
    }
}
 class A {  
    public String show(D obj){  
           return ("A and D");  
    }   
    public String show(A obj){  
           return ("A and A");  
    }   
}   
class B extends A{  
    public String show(B obj){  
           return ("B and B");  
    }  

    public String show(A obj){  
           return ("B and A");  
    }   
}  
class C extends B{}   
class D extends B{}


/*
 * 运行结果

A and A
A and A
A and D
B and A
B and A
A and D
B and B
B and B
A and D
 */