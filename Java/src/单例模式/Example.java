package 单例模式;
/*
 * int型除以double型，结果是double型
自动转换遵循以下规则：
1)        若参与运算量的类型不同，则先转换成同一类型，然后进行运算。
2)        转换按数据长度增加的方向进行，以保证精度不降低。如int型和long型运算时，先把int量转成long型后再进行运算。
     a.若两种类型的字节数不同，转换成字节数高的类型
    b.若两种类型的字节数相同，且一种有符号，一种无符号，则转换成无符号类型
3)        所有的浮点运算都是以双精度进行的，即使仅含float单精度量运算的表达式，也要先转换成double型，再作运算。
4)        char型和short型参与运算时，必须先转换成int型。
5)        在赋值运算中，赋值号两边量的数据类型不同时，赋值号右边量的类型将转换为左边量的类型。如果右边量的数据类型长度左边长时，将丢失一部分数据，这样会降低精度，丢失的部分按四舍五入向前舍入。
例如：
int 和double属于不同类型，转换遵循低精度到高精度转换，所以int先转成double型就算，结果就是double型。
 */
public class  Example{
public  static  void  main  (String  args[]){
//char  a='\u1234';
	double x=1;double y=2;int z=3;
	System.out.println(y);//3
//	System.out.println(y/3);//double
y+=z--/++x;
System.out.println(y);//3.5


//int x=1;double y=2;int z=3;
//System.out.println(y);//3
////System.out.println(y/3);//double
//y+=z--/++x;
//System.out.println(y);//3

short a = 1;byte b=4;
//short c;
//c=(short) (a+b);

int c=a+b;
}
}

//public  class  Example{
//public  static  void  main(String  args[]){
//Object[]o=new  Object[2];
//byte[]b=new  byte[2];
//System.out.print(o[0]);
//System.out.println(b[1]);
//}
//}

//class  Example{
//public  static  void  main(String  args[]){
////System.out.println(args.length);
//	
////	 int a  =  Integer.parseInt("12");
////	 int b  =  Integer.valueOf("12").intValue();
////	 System.out.println(a+""+b);
//	
////	 x  =  1  ,  y  =  2  ,  z  =  3，则表达式    y＋＝z--/＋＋x    的值是
////	int x=1,y=2,z=3;
////	y+=z--/++x;
////	System.out.println(y);//3
//}
//}

//
//public  class  Example{
//private  int  i=j;//B. 第2行代码编译错误
//private  int  j=10;
//public  static  void  main(String  args[]){
//System.out.println((new  Example()).i);
//}
//}


////下列类定义中哪些是合法的抽象类的定义？c
////A.
////abstract  Animal{abstract  void  growl();}
////B. 
////class  abstract  Animal{abstract  void  growl();}
////C.
//abstract  class  Animal{abstract  void  growl();}
////D. 
////abstract  class  Animal{abstract  void  growl(){System.out.println(&quot;growl&quot;);};}

