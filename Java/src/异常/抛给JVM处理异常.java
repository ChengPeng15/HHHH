package 异常;

import java.sql.SQLException;

/*
 * 一步一步向上抛，没人管，jvm管
 * 如果是主方法抛出的异常，交个jvm处理
 */
public class 抛给JVM处理异常 {

	public static void main(String[] args) throws Exception{
			tell(9,0);
	}
	public static void tell(int i ,int j) throws Exception{
		int temp = 0;
		temp = i/j;
		System.out.println(temp);
	}
}

class son extends 抛给JVM处理异常 {
	public static void tell(int i ,int j) throws SQLException{
		int temp = 0;
		temp = i/j;
		System.out.println(temp);
	}
}
