package 异常处理;

import java.io.IOException;  
  
/** 
 * Checked异常测试方法 
 * @author chengpeng
 * 
 */  
/*
 * ①Checked异常
只有java语言提供了Checked异常，Java认为Checked异常都是可以被处理的异常，
所以Java程序必须显示处理Checked异常。如果程序没有处理Checked异常，
该程序在编译时就会发生错误无法编译。
这体现了Java的设计哲学：没有完善错误处理的代码根本没有机会被执行。对Checked异常处理方法有两种
1 当前方法知道如何处理该异常，则用try...catch块来处理该异常。
2 当前方法不知道如何处理，则在定义该方法是声明抛出该异常。
 */
public class CheckedExceptionMethods  
{  
    // 总异常类，既有checkedException又有RuntimeException，所以其中的checkedException必须处理  
    public void method1() throws Exception  
    {  
        System.out.println("我是抛出异常总类的方法");  
    }  
  
    // 捕获并处理这个异常  
    public void testMethod1_01()  
    {  
        try  
        {  
            method1();  
        }  
        catch (Exception e)  
        {  
            e.printStackTrace();  
        }  
    }  
  
    // 把异常传递下去  
    public void testMethod1_02() throws Exception  
    {  
        method1();  
    }  
  
    public void testMethod1_03() throws Exception  
    {  
        throw new Exception();  
    }  
  
    public void testMethod1_04()  
    {  
        try  
        {  
            throw new Exception();  
        }  
        catch (Exception e)  
        {  
            e.printStackTrace();  
        }  
    }  
  
    // checkedException典型代表IOException  
    public void method2() throws IOException  
    {  
        System.out.println("我是抛出IO异常的方法");  
    }  
  
    public void testMethod2_01()  
    {  
        try  
        {  
            method2();  
        }  
        catch (Exception e)  
        {  
            e.printStackTrace();  
        }  
    }  
  
    public void testMethod2_02() throws Exception  
    {  
        method2();  
    }  
  
}  
