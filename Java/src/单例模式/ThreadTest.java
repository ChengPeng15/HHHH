package 单例模式;

import java.util.HashSet;
import java.util.Set;

public class ThreadTest implements Runnable {
	//存放单例对象，使用Set是为了不存放重复元素
	public Set<SingleDemo> singles = new HashSet<SingleDemo>();
	@Override
	public void run() {
		//获取单例
		SingleDemo s = SingleDemo.getInstance();
		//添加单例
		singles.add(s);
	}
}