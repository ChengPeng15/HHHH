package 枚举类型;

/*下面是Enums工具类，实现从枚举实例中随机选择，
<T extends Enum<T>>表示T是一个枚举实例。将Class<T>作为参数，
就可以利用Class对象得到enum实例的数组了。
重装后的random()方法只需要使用T[]作为参数，它从数组中随机选择一个元素。

: net/mindview/util/Enums.java*/
import java.util.*;

public class Enums {
private static Random rand = new Random(47);
//public static <T extends Enum<T>> T random(Class<T> ec) {
//  return random(ec.getEnumConstants());
//}
public static <T> T random(T[] values) {
  return values[rand.nextInt(values.length)];
}
} ///:~