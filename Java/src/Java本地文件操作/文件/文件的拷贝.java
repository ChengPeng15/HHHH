//package Java本地文件操作.文件;
//?????????
//import java.io.File;
//import java.io.IOException;
//// 顺序：   创建 删除  重命名  移动
//public class 文件的拷贝 {
//	public static void main(String[] args) {
//		/*
//		 *  对于一个工程而言，这个工程本身的文件夹，就是他的相对路径
//		 */
//		File file = new File("new hello.txt");//把工程目录的new hello.txt移动到src目录下面
//		/*
//		 * 这里面的移动是剪切
//		 */
//		
//		
//		/*跨目录的移动中   文件结构必须处于同一个分区（mac就一个分区  体现不出来
//		在windowns要注意了，原来在C盘只能移动到C盘）
//		*/
//		
//		
//		/*
//		 * 文件处于不同的分区，应该用文件的拷贝，而不是重命名
//		 */
//		if(file.exists()){
//			File nameTo = new File("src/new hello.txt");
//			file.renameTo(nameTo);
//			System.out.println("文件移动成功");
//		}else{
//			System.out.println("文件不存在");
//			try {
//				file.createNewFile();
//				System.out.println("文件已经创建成功");
//			} catch (IOException e) {
//				System.out.println("文件无法被创建");
//			}
//		}
//	}
//}
