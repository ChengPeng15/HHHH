package Java集合;

import java.util.*;
class RR
{
	int count;
	public RR(int count)
	{
		this.count = count;
	}
	public String toString()
	{
		return "RR[count:" + count + "]";
	}
	public boolean equals(Object obj)
	{
		if(this == obj)
			return true;
		if (obj != null && obj.getClass() == R.class)
		{
			RR r = (RR)obj;
			return this.count == r.count;
		}
		return false;
	}
	public int hashCode()
	{
		return this.count;
	}
}
public class 迭代器这么改里面元素不会变
{
	public static void main(String[] args)
	{
		HashSet hs = new HashSet();
		hs.add(new RR(5));
		hs.add(new RR(-3));
		hs.add(new RR(9));
		hs.add(new RR(-2));
		// 打印HashSet集合，集合元素没有重复
		System.out.println(hs);
		// 取出第一个元素
		Iterator it = hs.iterator();
		RR first = (RR)it.next();
//		first = new RR (-9);
		first.count =99;//这样会变   只不过指向同一个对象，该里面的内容
		System.out.println(hs);
}
}