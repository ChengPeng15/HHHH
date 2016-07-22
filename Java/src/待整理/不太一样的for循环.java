package 待整理;

public class 不太一样的for循环 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


//		new 不太一样的for循环().省略循环条件();
//		new 不太一样的for循环().test();
//		new 不太一样的for循环().testPlus();
//		new 不太一样的for循环().test1();
		new 不太一样的for循环().多个初始条件和多个循环条件的组合语句和多个迭代语句();
		
	}
	
	public  void 省略循环条件(){
		/*
		 * for循环的两个分号是必需的，初始化条件、玄幻条件、迭代语句部分都是可以省略的
		 * 如果省略了循环条件，则这个循环条件默认为true，将会产生一个死循环。
		 */
		int i=1;
		for(;;i++){
			System.out.println(i);
		}
	}
	
	
	public void test(){
		int a=4;
		int b=4,c=4;
		
		System.out.println(a);//4
		System.out.println(++b);//5
		System.out.println(c++);//4
		System.out.println(a+","+b+","+c);

//		String s=String.format("a=%d,b=%s,c=%s",a,b,c);
//		System.out.printf("a=%d,b=%s,c=%s",a,b,c);
//		System.out.println(s);
	}
	
			/*
			 	0
				1
				1,1,0
				=====
				1
				3
				2,2,1
				=====
				2
				5
				3,3,2
				=====
				3
				7
				4,4,3	
				=====
	 */
	public void test1(){
		for (int b = 0,s=0,p=0;b<10&&s<4&&p<10;p++){
			System.out.println(b++);
			System.out.println(++s + p);
			System.out.println(b+","+s+","+p);
			System.out.println("=====");
		}
	}
	
	/*
	 * 		0,0,0
			1
			0,1,1
			===========
			1,1,2
			4
			1,2,3
			===========
			2,2,4
			7
			2,3,5
			===========
			3,3,6
			10
	 */
	public  void 多个初始条件和多个循环条件的组合语句和多个迭代语句(){
		for (int b = 0,s=0,p=0;b<10&&s<4&&p<10;p++,b++){
			System.out.println(b+","+s+","+p);
			System.out.println(++s +p++);
			System.out.println(b+","+s+","+p);
			System.out.println("===========");
		}
	}
	
	public void testPlus(){
		int i=1,j=1,k=1;
		System.out.println(i+","+j+","+k);
		System.out.println(i +j++ + ++k);
		System.out.println(i+","+j+","+k);


	}

}
