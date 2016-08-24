package 继承;

//组合和继承都允许在新的类中设置子对象（subobject），组合是显式地这样做的，而继承 
//则是隐式的。
//
//二者间的区别何在，以及怎样在二者之间做出选择。
//
//组合技术通常用于你想要在新类中使用现有类的功能而非它的接口的情形。即，你在新类中 
//嵌入某个对象，借其实现你所需要的功能，但新类的用户看到的只是你为新类所定义的接口， 
//而非嵌入对象的接口。为取得此效果，你需要在新类中嵌入一个private 的现有类的对象。
//
//有时，允许类的用户直接访问新类中的组合成份是极具意义的；也就是说，将成员对象声明 
//为public 。如果成员对象自身都实现了具体实现的隐藏，那么这种做法就是安全的。当用户 
//能够了解到你在组装一组部件时，会使得端口更加易于理解。Car 对象即为一个好例子：

       class Engine { 
         public void start() {} 
         public void rev() {} 
         public void stop() {} 
       } 
         
       class Wheel { 
         public void inflate(int psi) {} 
       } 
         
       class Window { 
         public void rollup() {} 
         public void rolldown() {} 
       } 
         
       class Door { 
         public Window window = new Window(); 
         public void open() {} 
         public void close() {} 
       } 
         
       public class Car { 
         public Engine engine = new Engine(); 
         public Wheel[] wheel = new Wheel[4]; 
         public Door 
           left = new Door(), 
           right = new Door(); // 2-door 
         public Car() { 
           for(int i = 0; i < 4; i++) 
             wheel[i] = new Wheel(); 
         } 
         public static void main(String[] args) { 
           Car car = new Car(); 
           car.left.window.rollup(); 
           car.wheel[0].inflate(72); 
         } 
     } ///:~

//由于在这个例子中Car 的组合也是问题分析的一部分（而不仅仅是底层设计的一部分），所 
//以使成员成为public 将有助于客户端程序员了解怎样去使用类，而且也降低了类开发者所面 
//临的代码复杂度。但务必要记得这仅仅是一个特例，一般情况下，你应使域（field）成为 
//private 。
//
//在继承的时候，你会使用某个现有类，并开发一个它的特殊版本。通常，这意味着你在使用 
//一个通用性（general-purpose）的类，并为了某种特殊需要而将其特殊化。略微思考一下， 
//你就会发现，用一个“交通工具”对象来构成一部“车子”是毫无意义的，因为“车子”并 
//不包含“交通工具”，它仅是一种（is-a）交通工具。其中“is-a （是一个）”的关系是用继承 
//来表达的，而“has-a        （有一个）”的关系则是用组合来表达的。