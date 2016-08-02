package Java本地文件操作.文件夹;

import java.io.File;
//三
//因为mkdir不能创建多级文件夹
public class 文件夹重命名 {
	
	/*
	 * 假设有   my new folder/one/two/three/main  这样的目录结构
	 */
	
	
//文件夹重命名也要求同一个分区

	public static void main(String[] args) {
//		File folder = new File ("my new folder/one/two/three/main");
		File folder = new File ("my new folder");
		
		if(folder.exists()){
			File newFolder = new File("MyNewFolder");//只把my new folder  改为MyNewFolder  其他不变
			folder.renameTo(newFolder);
			System.out.println("success");
		}else{
			System.out.println("fail");
		}
	}
}
	
	
	
	
//	public static void main(String[] args) {
////		File folder = new File ("my new folder/one/two/three/main"); //这是错误写法  ，改到哪里写到哪里
//		File folder = new File ("my new folder/one/2"); //这是错误写法  ，改到哪里写到哪里
//		if(folder.exists()){
////			File newFolder = new File("my new folder/one/2/three/main");//只把two  改为2  其他不变   这是错误写法  ，改到哪里写到哪里
//			
//			
//			File newFolder = new File("my new folder/one/two");//只把two  改为2  其他不变
//
//			folder.renameTo(newFolder);
//			System.out.println("success");
//		}else{
//			System.out.println("fail");
//		}
//	}
//}
	
	
	
//	public static void main(String[] args) {
//		File folder = new File ("my new folder/one/two"); 
//		if(folder.exists()){
//			
//			
//			File newFolder = new File("my new folder/two");//
//
//			folder.renameTo(newFolder);//把two移动到folder下
//			System.out.println("success");
//		}else{
//			System.out.println("fail");
//		}
//	}
//}
	
	
	
	
	
	







	//后面两个一起配合
	
	
	
	
	/*
	 * 把main也直接移动到my new folder下面
	 */
//	public static void main(String[] args) {
//		File folder = new File ("my new folder/main"); 
//		if(folder.exists()){
//			
//			
//			File newFolder = new File("my new folder/one/two/three/main");//不管怎样  保证main之前的存在
//
//			folder.renameTo(newFolder);//不管怎样  保证main之前的存在
//			System.out.println("success");
//		}else{
//			System.out.println("fail");
//		}
//	}
//	}
	
	
	
	
	

/*
 * 把main移动到my new folder／one／下面
 */
//public static void main(String[] args) {
//	File folder = new File ("my new folder/main"); 
//	if(folder.exists()){
//		
//		
//		File newFolder = new File("my new folder/one/two/three/main");//不管怎样  保证main之前的存在
//
//		folder.renameTo(newFolder);//不管怎样  保证main之前的存在
//		System.out.println("success");
//	}else{
//		System.out.println("fail");
//	}
//}
//}
//	
	
	
	