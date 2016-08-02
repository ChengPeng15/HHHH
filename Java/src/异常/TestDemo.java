package 异常;

import java.io.FileNotFoundException;
import java.io.IOException;

class Animal  
{  
    public void eat()throws IOException,FileNotFoundException  
    {  
        System.out.println("eat");  
    }  
}

class Tiger extends Animal  
{  
//    public void eat()throws IOException ,Exception  //错误
	/*
	  则在调用tiger对象的时候，Test中的TestAnimalEat()方法只处理Animal类的eat()方法的两个异常，而这个Tiger类中的eat()方法多出来的Exception，就无法进行处理。所以，JAVA就不允许做这种子类抛出比父类更多的异常。

	当然，这里说更多是不合适的，
	子类不能抛出父类异常本身和其子异常以外的其他异常。比如，如果父类抛出一个Exception 异常，那么子类就可以随心所欲的抛出很多的异常了。因为这些异常都是父类异常的子异常。

	那么如果要联系现实，应该如何说呢。

        一个修理家电的人，他能够修理冰箱，电脑，洗衣机，电视机。 一个年轻人从他这里学的技术，就只能修理这些家电，或者更少。你不能要求他教出来的徒弟用从他这里学的技术去修理直升飞机。

      这个说法和老师说法其实也比较一致，但是徒弟这个说法可能比儿子这个说法，更加容易理解吧。
	 */

    public void eat()throws IOException  
    {  
        System.out.println("Tiger eat animal");  
    }  
}  


class Test
{
    public void TestAnimalEat(Animal a) 
    {
        try
        {
            a.eat();
        }
        catch(FileNotFoundException e1)
        {
            e1.printStackTrace();
        }
        catch(IOException e2)
        {
            e2.printStackTrace();
        }
        
    }
}

public class TestDemo
{
	public static void main(String[] args) 
	{
		Test t = new Test();
		Tiger tiger = new Tiger();
		t.TestAnimalEat(tiger);
	}
}