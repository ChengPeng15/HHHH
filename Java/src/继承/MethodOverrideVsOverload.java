package 继承;
/*
 * 现在，再回头看上面的代码，MethodOverrideVsOverload  类中
 * 的”equals(MethodOverrideVsOverload other)” 
 * 方法并没有重写Object类中的”public boolean equals(Object obj)” 方法。
 * 这是因为其违背了参数规则，其中一个是MethodOverrideVsOverload 类型，而另一个是Object类型。
 * 因此，这两个方法是重载关系（发生在编译时），而不是重写关系。
因此，当调用o1.equals(o2)时，实际上调用了object类中的
public boolean equals(Object obj)方法。
这是因为在编译时，o1和o2都是Object类型，
而Object类的equals( … )方法是比较内存地址
（例如，Object@235f56和Object@653af32）的，因此会返回false。
当调用o3.equals(o4)时，
实际上调用了MethodOverrideVsOverload 类中
的equals( MethodOverrideVsOverload other )方法。
这是因为在编译时，o3和o4都是MethodOverrideVsOverload类型的，因此得到上述结果。
 */
//public class MethodOverrideVsOverload {
//	 
//	 public boolean equals( MethodOverrideVsOverload other ) {
//	     System.out.println("MethodOverrideVsOverload equals method reached" );
//	     return true;
//	   }
//	 
//
//	public static void main(String[] args) {
//	  Object o1 = new MethodOverrideVsOverload();
//	  Object o2 = new MethodOverrideVsOverload();
//	 
//	  MethodOverrideVsOverload o3 = new MethodOverrideVsOverload();
//	  MethodOverrideVsOverload o4 = new MethodOverrideVsOverload();
//	 
//	  if(o1.equals(o2)){
//	   System.out.println("objects o1 and o2 are equal");
//	  }
//	 
//	  if(o3.equals(o4)){
//	   System.out.println("objects o3 and o4 are equal");
//	  }
//	 }
//	}


public class MethodOverrideVsOverload {
	 
	 @Override
	 public boolean equals( Object other ) {
	     System.out.println("MethodOverrideVsOverload equals method reached" );
	     return true;
	 }
	 
	 public static void main(String[] args) {
	  Object o1 = new MethodOverrideVsOverload(); //during compile time o1 is of type Object
	                                              //during runtime o1 is of type MethodOverrideVsOverload
	  Object o2 = new MethodOverrideVsOverload(); //during compile time o2 is of type Object
	                                              //during runtime o2 is of type MethodOverrideVsOverload
	 
	  MethodOverrideVsOverload o3 = new MethodOverrideVsOverload(); //o3 is of type MethodOverrideVsOverload
	                                                                // during both compile time and runtime
	  MethodOverrideVsOverload o4 = new MethodOverrideVsOverload(); //o4 is of type MethodOverrideVsOverload
	                                                                // during both compile time and runtime
	 
	  if(o1.equals(o2)){
	   System.out.println("objects o1 and o2 are equal");
	  }
	 
	  if(o3.equals(o4)){
	   System.out.println("objects o3 and o4 are equal");
	  }
	 
	 }
	 
	}