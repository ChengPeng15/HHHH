package Java本地文件操作.文件夹;

import java.io.File;
//一
public class 创建一个文件夹 {

	public static void main(String[] args) {
		File folder = new File ("my new folder");
		//mkdir() 不会重复创建文件夹
		if (folder.mkdir()) {
			System.out.println("文件夹创建完成");
		}else{
			if(folder.exists()){
				System.out.println("文件夹已经存在");
			}else{
				System.out.println("文件夹创建失败");
			}
		}
	}

}
