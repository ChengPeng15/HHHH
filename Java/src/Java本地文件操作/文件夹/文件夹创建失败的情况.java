package Java本地文件操作.文件夹;

import java.io.File;
//二
//因为mkdir不能创建多级文件夹
public class 文件夹创建失败的情况 {

	public static void main(String[] args) {
		File folder = new File ("my new folder/one/two/three/main/aaaa");
		//mkdir() 因为main之前的one two  three  三层都不存在，不会一次创建多个文件夹
		//mkdir()适合前面的层次都存在
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
