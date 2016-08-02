package Java本地文件操作.文件;

import java.io.File;
import java.io.IOException;

public class 删除文件 {
	public static void main(String[] args) {
		/*
		 *  对于一个工程而言，这个工程本身的文件夹，就是他的相对路径
		 */
		File file = new File("hello.txt");//在项目目录中创建
		if(file.exists()){
			file.delete();
			System.out.println("文件删除成功");
		}else{
			System.out.println("文件不存在");
			try {
				file.createNewFile();
				System.out.println("文件已经创建成功");
			} catch (IOException e) {
				System.out.println("文件无法被创建");
			}
		}
	}
}
