package 异常处理;

/**
 * 运行时异常测试方法 Runtime如除数是0和数组下标越界等，其产生频繁，处理麻烦， 若显示申明或
 * 者捕获将会对程序的可读性和运行效率影响很大。
 * 所以由系统自动检测并将它们交给缺省的异常处理程序。当然如果你有处理要求也可以显示捕获它们。
 * 
 */
public class RuntimeExcetionMethodsRuntimeException {
	public void method3() throws RuntimeException {
		System.out.println("我是抛出运行时异常的方法");
	}

	public void testMethod3_01() {
		method3();
	}

	public void testMethod1_02() {
		throw new RuntimeException();
	}
}
