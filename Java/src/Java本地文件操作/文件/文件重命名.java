package Java本地文件操作.文件;

import java.io.File;
import java.io.IOException;

public class 文件重命名 {
	public static void main(String[] args) {
		/*
		 *  对于一个工程而言，这个工程本身的文件夹，就是他的相对路径
		 */
		File file = new File("hello.txt");//@
		if(file.exists()){
			File nameTo = new File("new hello.txt");
			
			file.renameTo(nameTo);
			/*    public boolean renameTo(File dest) 因为这种重命名方法需要一个File类型的所以@位置声明了一个
			File file = new File("hello.txt");
			*/
			System.out.println("文件重命名成功");
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
