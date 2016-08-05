package 构造函数;

class A{
public A(){}
}
//B继承 A 的时候，则是
abstract class B extends A{
public B(){
super();
}
}