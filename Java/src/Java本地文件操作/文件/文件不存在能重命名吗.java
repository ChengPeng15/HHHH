package Java本地文件操作.文件;

import java.io.File;
import java.io.IOException;

public class 文件不存在能重命名吗 {
	public static void main(String[] args) {
		/*
		 * NONONOONONO!!!!
		 */
		File file = new File("hello.txt");
				File nameTo = new File("new hello1.txt");
				file.renameTo(nameTo);
	}
}