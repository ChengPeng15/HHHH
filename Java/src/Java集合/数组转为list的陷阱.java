package Java集合;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 数组转为list的陷阱 {

	public static void main(String[] args) {
		String s[]={"aa","bb","cc"};
		List<String> sList=Arrays.asList(s);
		for(String str:sList){//能遍历出各个元素
			System.out.println(str);
		}
		System.out.println(sList.size());//为3
		System.out.println(sList);//为3
		System.out.println("- - - - - - - - - - -");
		
		int i[]={11,22,33};
		List intList=Arrays.asList(i);	//intList中就有一个Integer数组类型的对象，整个数组作为一个元素存进去的
		for(Object o:intList){//就一个元素
			System.out.println(o.toString());
		}

		System.out.println(intList.size());//为3
		System.out.println(intList);
		System.out.println("- - - - - - - - - - -");
		
		Integer ob[]={11,11,33,44};
		List<Integer> objList=Arrays.asList(ob);	//数组里的每一个元素都是作为list中的一个元素
//		List<Integer> objList=new ArrayList<Integer>(Arrays.asList(ob));//这样就可以                                                      是得到一个新的list，可对其进行add,remove了  
		for(int a:objList){
			System.out.println(a);
		}
//		objList.add(0);
		System.out.println(objList.size());
		System.out.println("- - - - - - - - - - -");
		
		//objList.remove(0);//asList()返回的是arrays中私有的终极ArrayList类型，它有set,get，contains方法，但没有增加和删除元素的方法，所以大小固定,会报错
		//objList.add(0);//由于asList返回的list的实现类中无add方法，所以会报错
		
		
		
		//如果想根据数组得到一个新的正常的list,当然可可以循环一个一个添加，也可以才有以下2个种方法：
		// ArrayList<Integer> copyArrays=new ArrayList<Integer>(Arrays.asList(ob));//这样就                                                           是得到一个新的list，可对其进行add,remove了  
		//copyArrays.add(222);//正常，不会报错  
		  
		//Collections.addAll(new ArrayList<Integer>(5), ob);//或者新建一个空的list,把要转换的  
		//数组用Collections.addAll添加进去  
		
		
//		如果你想直接根据基本类型的数组如int[],long[]直接用asList转成list,那么我们可以选择用apache 
//		commons-lang工具包里的数组工具类ArrayUtils类的toObject()方法，非常方便，如下：
//		Arrays.asList(ArrayUtils.toObject(i));//上边的代码：int i[]={11,22,33};，达到了我们想要的效果  

}

}
