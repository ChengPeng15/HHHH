package JVM;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
	private static List<Test1> list = new ArrayList<Test1>();
	
	public static void main(String[] args) {
		while(true){
			Test1 Test1 = new Test1();
			list.add(Test1);
		}
	}

}
