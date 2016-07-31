package Java本地文件操作;

import java.io.File;

public class File类入门 {

	public static void main(String[] args) {
		File file = new File("hello.txt");
		
		//是否存在   file.
		
		if(file.exists()){
			//文件
			//file.isFile();
			System.out.println(file.isFile());
			//路径（文件夹）
			//file.isDirectory();
			System.out.println(file.isDirectory());
		
		
		}
		/*
		 * 因为当前文件不存在   所以不可能是一个文件  也不可能是一个目录
		 */
		else{
			System.out.println("文件不存在");
		}
	}

}
