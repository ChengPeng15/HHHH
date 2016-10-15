package 搜狗;


 class Person {
	 private String name;
	        private int age;
	 public Person(String name, int age) {
	  this.name = name;
	  this.age = age;
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
	 
	 //set、get method
	}


	 class Worker implements Cloneable{
	 private String workAddr;
	 private int workNum;
	 private Person p;
	 public Worker(String workAddr, int workNum, 
	   String name, int age) {
	  this.workAddr = workAddr;
	  this.workNum = workNum;
	  this.p = new Person(name,age);
	 }
	 public Object clone() {
	  try {
	   return super.clone();
	  } catch (CloneNotSupportedException e) {
	   return null;
	  }
	 }

	 public Object clone(int version) {
	  Worker worker = new Worker(workAddr, workNum,
	    p.getName(), p.getAge());
	  return worker;
	 }
	public String getWorkAddr() {
		return workAddr;
	}
	public void setWorkAddr(String workAddr) {
		this.workAddr = workAddr;
	}
	public int getWorkNum() {
		return workNum;
	}
	public void setWorkNum(int workNum) {
		this.workNum = workNum;
	}
	public Person getP() {
		return p;
	}
	public void setP(Person p) {
		this.p = p;
	}
	 
	 //set、get method
	}




	public class T {

	 public static void main(String[] args) {
	  Worker w = new Worker("wudaokou",73,"xiaoming",23);
	  Worker workCloneV1 = (Worker) w.clone();
	  Worker workCloneV2 = (Worker) w.clone(3);
	  System.out.println("original obj equals with the cloned obj v1 : " 
	    + (w == workCloneV1) 
	    +" ,equals with the cloned obj v2 : "
	    +(w == workCloneV2) );
	  System.out.println("original obj's p equals with the cloned obj v1 : "
	    + (w.getP() == workCloneV1.getP()) 
	    +" ,equals with the cloned obj v2 : "
	    +(w.getP() == workCloneV2.getP()) );
	  System.out.println("original obj's addr equals with the cloned obj v1 : " 
	    + (w.getWorkAddr() == workCloneV1.getWorkAddr()) 
	    +" ,equals with the cloned obj v2 : "
	    +(w.getWorkAddr() == workCloneV2.getWorkAddr()) );
	  w.setWorkAddr("zhongguancun");
	  w.setWorkNum(13);
	  w.getP().setAge(27);
	  w.getP().setName("xiaogang");
	  System.out.println(w.getP().getName());
	  System.out.println(workCloneV1.getP().getName());
	  System.out.println(workCloneV2.getP().getName());
	 }
	}