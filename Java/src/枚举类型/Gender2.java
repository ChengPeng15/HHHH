package 枚举类型;

public enum Gender2
{
	MALE(1),FEMALE(2);
	// 定义一个public修饰的实例变量
	private int code;
	
	
	public int getCode() {
		return code;
	}


	private Gender2(int code) {
		this.code = code;
	}


	public String name1;
}


