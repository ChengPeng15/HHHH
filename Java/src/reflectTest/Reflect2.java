package reflectTest;

import sun.reflect.Reflection;

class Person{
     
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString(){
        return "["+this.name+"  "+this.age+"]";
    }
    private String name;
    private int age;
}
 
public class Reflect2{
    public static void main(String[] args) {
        Class<?> demo=null;//必须携程Class<?>
        /*public static Class<?> forName(String className)
        throws ClassNotFoundException {
        	Class<?> caller = Reflection.getCallerClass();
return forName0(className, true, ClassLoader.getClassLoader(caller), caller);
}*/
        try{
            demo=Class.forName("reflectTest.Person");
        }catch (Exception e) {
            e.printStackTrace();
        }
        Person per=null;
//        try {
//            per=(Person)demo.newInstance();
//        } catch (InstantiationException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        try {
//			per=(Person) demo.newInstance();
//		} catch (InstantiationException | IllegalAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
        per.setName("Rollen");
        per.setAge(20);
        System.out.println(per);
    }
}