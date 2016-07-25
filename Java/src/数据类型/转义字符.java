package 数据类型;

public class 转义字符 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print('\u4e2d'+":");
		System.out.println(4*Math.pow(16, 3)+14*Math.pow(16, 2)+2*Math.pow(16, 1)+13*Math.pow(16, 0));//16进制转为10进制
		System.out.println((char)20013+":"+20103);
		System.out.println("我和\n你不在一行哟");
		System.out.println("\t我在这里显示\\\"\'");
		System.out.println("System.out.println(\"双引号也显示出来\");");
		System.out.println("System.out.println('双引号也显示出来');");
		boolean T= true;
		boolean F = false;
//		boolean test = F?T:F?F:F;
		boolean test = 77>=90;
		
		System.out.println(test);


	
	}
	

}
