package JVM;

import java.util.ArrayList;
import java.util.List;

public class Test {
	private static List<Test> list = new ArrayList<Test>();
	public static void main(String[] args) throws InterruptedException {
		
		for(int i=0;i<10000;i++){
			Test test = new Test();
			list.add(test);
			Thread.sleep(50);
		}
	}

}
