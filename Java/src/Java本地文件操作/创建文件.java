package Java本地文件操作;

import java.io.File;
import java.io.IOException;

public class 创建文件 {
	public static void main(String[] args) {
		File file = new File("hello.txt");
		
		if(file.exists()){
			//{文件
			System.out.println(file.isFile());
			//路径（文件夹）
			System.out.println(file.isDirectory());
		}else{
			System.out.println("文件不存在");
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
				System.out.println("文件无法被创建");
			}
		}
	}
}
