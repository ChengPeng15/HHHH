package 剑指office;

public class User {
	
	private String name;
	private int age;
	
	//setter and getter
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
	public boolean equals(Object obj) {
		if(name.equals(((User)obj).name)){
			return true;
		}else{
			return false;
		}
	}
}