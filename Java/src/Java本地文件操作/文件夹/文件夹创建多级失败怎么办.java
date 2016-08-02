package Java本地文件操作.文件夹;

import java.io.File;
//三
//因为mkdir不能创建多级文件夹
public class 文件夹创建多级失败怎么办 {

	public static void main(String[] args) {
		File folder = new File ("my new folder/one/two/three/main");
		//mkdir() 不会重复创建文件夹
		//mkdirs可以
//		if (folder.mkdir()) {
		
		//如果每次都是增加深度，能一直创建
		if (folder.mkdirs()) {
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
