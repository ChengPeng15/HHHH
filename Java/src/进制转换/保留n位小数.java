package 进制转换;

public class 保留n位小数 {
	/**
	 * ((sqrt(20)+sqrt(10))/(sqrt(20)-sqrt(10))
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		System.out.println("((sqrt(20)+sqrt(10))/(sqrt(20)-sqrt(10))="+
	(Math.sqrt(20)+Math.sqrt(10))/(Math.sqrt(20)-Math.sqrt(10)));
		
		System.out.println(Math.round((Math.sqrt(20)+Math.sqrt(10))/(Math.sqrt(20)-Math.sqrt(10))));
		System.out.println("math.round()方法只能吧小数点后一位四舍五入为整数目");
		System.out.println("所以先乘以相应倍数，再除以相应倍数");
		System.out.println("保留一位");
		System.out.println(Math.round(10*(Math.sqrt(20)+Math.sqrt(10))/(Math.sqrt(20)-Math.sqrt(10)))/10.0);
		System.out.println("保留二位");
		System.out.println(Math.round(100*(Math.sqrt(20)+Math.sqrt(10))/(Math.sqrt(20)-Math.sqrt(10)))/100.0);
		System.out.println(8833/100.0);
		System.out.println(1234567898/1000.0);
//		System.out.println(12345678918);//错误写法
		System.out.println(Long.parseLong("12345678918"));//
		/*
		 * 今天在手动形成主键的时候 编译类的时候出现上面这个错误，
	
		原来在Java代码中直接书写的数字是int类型的，就是说数字的范围在 -2^31 到 2^31 - 1 这个范围之中，无论将这个数字赋值给什么类型。
		不过有的时候需要直接赋值大的数字，如果想直接赋最大值的时候只需要转换一下就行了Long.parseLong()
		2的31次方－1=2147483648－1
		 */
		
		double sqrt20 = Math.sqrt(20);
		double sqrt10 = Math.sqrt(10);
		double result = (sqrt20+sqrt10)/(sqrt20-sqrt10);
		System.out.println(result);
		System.out.println("进行四舍五入后");
		result = Math.round(10*result)/10.0;
		System.out.println(result);
		char d ='女';//可以输入一个中文字符
		float height = 1.89f;//java默认事double 所以后面加一个f或者F


	}

}
