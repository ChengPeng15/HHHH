package reflectTest;

import java.lang.reflect.Field;
import java.util.Arrays;

class Stu {
	private int id;
	private String name;
	private int age;
	private String[] aiHao;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public String[] getAiHao() {
		return aiHao;
	}

	public void setAiHao(String[] aiHao) {
		this.aiHao = aiHao;
	}
}

public class Test3 {
	public static void main(String[] args) {
		Stu s = new Stu();
		s.setId(1);
		s.setName("张三");
		s.setAge(23);
		s.setAiHao(new String[] { "足球", "篮球", "上网" });
		try {
			// 获取所有的变量
			Field[] fields = Stu.class.getDeclaredFields();
			// 循环处理变量
			for (Field f : fields) {
				f.setAccessible(true);
				Object value = f.get(s); // 取变量的值
				System.out.print("变量名称为：" + f.getName());
				if (value.getClass().isArray()) { // 判断是否是数组
					Object[] arr = (Object[]) value; // 装换成数组
					System.out.println("，变量值等于：" + Arrays.toString(arr));
					// 这里还可以做额外处理，判断数组的类型 如下面注释的代码
					/*
					 * for (Object a : arr) { System.out.println("参数类型" +
					 * a.getClass().getName()); // 同样运用反射的机制做额外处理 }
					 */
				} else {
					// 非数组类型，普通处理
					System.out.println("，变量值等于：" + value);
				}
				f.setAccessible(false);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}