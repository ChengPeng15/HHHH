package 海康威视;

import java.io.*;
public class Mine {
public static void main(String argv[]){
Mine m=new Mine();
System.out.println(m.aMethod());
}
public int aMethod() {
try {
FileInputStream dis=new FileInputStream("Hello.txt");
}catch (FileNotFoundException fne) {
System.out.println("No such file found");
return -1;
}catch(IOException ioe) {
} finally{
System.out.println("Doing finally");
}
return 0;
}
}
