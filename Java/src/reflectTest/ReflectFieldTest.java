package reflectTest;

import java.lang.reflect.Field;
import java.util.Date;
/**
 * @ClassName: Student
 * @Description: 学生实体
 * @author JoseanLuo
 * @date 2014-3-18 下午5:17:35
 * @version V1.0
 */
 class Student {
	private Long id;
	private String name;
	private Date createdate;
	private String no;
	public String nickname;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

}

 /**
  * @ClassName: ReflectFieldTest
  * @Description: 反射Field测试。
  * @author JoseanLuo  
  * @date 2014-3-18 下午5:16:17
  * @version V1.0 
  */
 public class ReflectFieldTest
 {
  
     public static void main(String[] args)
 {    Student stu=new Student();
      stu.setId(1L);
      stu.setName("Josean");
      stu.setNo("201403185203344");
      stu.setCreatedate(new Date());
      try
     {
         Field property1=stu.getClass().getDeclaredField("name");
         System.out.println(property1);//private java.lang.String com.cx.test.Student.name
         Field property3=stu.getClass().getField("nickname");
         System.out.println(property3);//public java.lang.String com.cx.test.Student.nickname
         //错误方法 getField系列方法只能获取公共字段
         //Field property2=stu.getClass().getField("name");
         //System.out.println(property2);
         //会抛java.lang.NoSuchFieldException
         
         
     } catch (SecurityException e)
     {
         
         e.printStackTrace();
     } catch (NoSuchFieldException e)
     {
         
         e.printStackTrace();
     }
 }
     
     
 }