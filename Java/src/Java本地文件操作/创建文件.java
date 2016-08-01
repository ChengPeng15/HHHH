package Java本地文件操作;

import java.io.File;
import java.io.IOException;

public class 创建文件 {
	public static void main(String[] args) {
		/*
		 *  对于一个工程而言，这个工程本身的文件夹，就是他的相对路径
		 */
		File file = new File("hello.txt");//在项目目录中创建
		
//		File file = new File("/bin/hello1.txt");//无法创建
		
		/*
		 * 对于上面的总结，在填写相对路径时候，前面不要以／开头
		 */

		
//		File file = new File("bin111/hello1.txt");//无法创建，因为没有这个文件夹

//		File file = new File("bin/hello1.txt");//bin目录的文件夹中创建
		
//		File file = new File("src/hello1.txt");//bin目录的文件夹中创建

		
//		File file = new File("../hello1.txt");//创建在项目文件夹“java”上面一级创建，相当于和项目文件夹同一级别
		
		
//		File file = new File("../../hello.txt");



		if(file.exists()){
			//{文件
			System.out.println(file.isFile()); 
			
			
			//路径（文件夹）
			System.out.println(file.isDirectory());
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
