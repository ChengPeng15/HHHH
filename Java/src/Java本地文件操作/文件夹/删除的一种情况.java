
package Java本地文件操作.文件夹;

import java.io.File;
//四



//因为mkdir不能创建多级文件夹
public class 删除的一种情况 {

	public static void main(String[] args) {
		File folder = new File ("my new folder/one/two/three/main");
		//mkdir() 不会重复创建文件夹
		//mkdirs可以
//		if (folder.mkdir()) {
		
		//如果每次都是增加深度，能一直创建
		if (folder.mkdirs()) {
			System.out.println("文件夹创建完成");
		}else{
			if(folder.delete()){
				if(folder.delete())//这种情况删除main这个文件夹，其他不变  只能删除空  而且删除的是最后一级，比如上面删除的是main
				{
					System.out.println("ok");
					
				}else{
					System.out.println("fail");
				}
				System.out.println("文件夹已经存在");
			}else{
				System.out.println("文件夹创建失败");
			}
		}
		
		
//		folder.deleteOnExit();????????

	}

}
