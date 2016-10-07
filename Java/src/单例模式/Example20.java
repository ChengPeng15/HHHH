package 单例模式;


public  class  Example20{//1.
//	char  c;//2.
	static char  c;
public  static  void  main(String  args[]){//3.
//	char  c='f';//4.
System.out.println("You  will  need  to  use"+c);//5.
}//6.
}//7.

//A. char  c;语句插入到第2行
//B. char  c；语句插入到第4行
//C. char  c=’f’;  语句插入到第2行
//D. char  c=’f’;  语句插入到第4行  正确
//E. static  char  c;  语句插入到第2行  正确